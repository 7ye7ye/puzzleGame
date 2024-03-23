package ui;
import  javax.swing.*;
public class RegisterJFrame extends JFrame{
    //表示注册界面

    public RegisterJFrame(){
        this.setSize(488,500);
        //设置界面标题
        this.setTitle("注册");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //让界面显示出来，放在最后
        this.setVisible(true);
    }
}
