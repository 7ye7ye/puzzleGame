package ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Random;

public class GameJFrame extends JFrame {

    //创建一个二维数组用来管理数据
    //加载图片时按照二维数组中的数据进行加载
    int[][] data=new int[4][4];

    //规定GameJFrame为游戏主界面
    public GameJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initDate();

        //初始化图片
        initImage();

        //让界面显示出来，放在最后
        this.setVisible(true);
    }

    private void initDate() {
        //创建一维数组
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int index=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
/*
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
 */
        for (int i = 0; i < arr.length ; i++) {
            data[i/4][i%4]=arr[i];
        }
/*
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(date[i][j]+" ");
            }
            System.out.println();
        }

 */
    }

    //初始化图片
    private void initImage() {
        //路径分为两种：1.绝对路径：一定从盘符开始；2.相对路径：相对当前项目而言
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                //获取当前要加载图片的序号
                int num=data[i][j];
                //创建一个图片ImageIcon的对象
                ImageIcon icon=new ImageIcon("puzzlegame\\image\\nikki\\"+num+".png");
                //创建一个JLabel的对象（管理容器）
                JLabel jLable=new JLabel(icon);
                //指定图片位置
                jLable.setBounds(160*j+38,160*i+39,160,160);
                //给图片添加边框
                jLable.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                //this.add(jLable1);
                this.getContentPane().add(jLable);
            }
        }

    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar=new JMenuBar();

        //创建菜单上面的两个选项对象（功能，关于我们）
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem reLoginItem=new JMenuItem("重新登录");
        JMenuItem changeItem=new JMenuItem("更换图片");
        JMenuItem accountItem=new JMenuItem("公众号");

        //将每个选项下的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(changeItem);
        aboutJMenu.add(accountItem);

        //将选项添加到菜单
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面添加菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(730,760);
        ;
        //设置界面标题
        this.setTitle("耶の拼图 v1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //取消居中放置
        this.setLayout(null);

        //设置关闭模式
        this.setDefaultCloseOperation(3);
    }
}
