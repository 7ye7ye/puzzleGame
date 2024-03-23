package ui;
import javax.swing.*;
public class LoginJFrame extends JFrame{
    //表示登录界面，写所有与登录相关的代码

    public LoginJFrame(){
        //创建登录界面，同时设置一些信息
        this.setSize(488,430);

        //设置界面标题
        this.setTitle("登录");

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
