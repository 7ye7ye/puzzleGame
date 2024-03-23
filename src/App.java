import ui.GameJFrame;
import ui.LoginJFrame;
import ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        //表示程序的启动入口
        //想要开启哪个界面，就创建谁的对象
        //new LoginJFrame();

        new GameJFrame();

        //new RegisterJFrame();
    }
}
