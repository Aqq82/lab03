import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.nio.charset.Charset;

public class MainClass extends JFrame{


    public static void main(String[] args) {
        UsersSet.CreateUsers();
        MainClass okno = new MainClass();
        okno.MainWindow();
    }

    void MainWindow(){
        JFrame frame = new JFrame("MainWindow");
        frame.setBounds(100, 100, 400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("User:");
        frame.add(l1);

        JTextField t1 = new JTextField("");
        frame.add(t1);

        JLabel l2 = new JLabel("Password:");
        frame.add(l2);

        JPasswordField p1 = new JPasswordField("");
        frame.add(p1);

        JButton b1 = new JButton("Login");
        b1.setMnemonic(KeyEvent.VK_L);
        b1.setToolTipText("Zaloguj sie");
        frame.add(b1);

        JButton b2 = new JButton("Cancel");
        b2.setMnemonic('C');
        b2.setToolTipText("Wyczysc pola logowania");
        frame.add(b2);

        b1.addActionListener(e -> {
            String password = "";
            char[] pass = p1.getPassword();
            for(int i=0;i<pass.length;i++){
                password +=pass[i];
            }

            String username = t1.getText();

            if(UsersSet.CheckData(username, password)){
                frame.getContentPane().setBackground(Color.GREEN);
            }
            else frame.getContentPane().setBackground(Color.RED);
        });

        b2.addActionListener(e -> {
            t1.setText("");
            p1.setText("");
        });

        frame.setLayout(new GridLayout(3, 2));
        frame.setVisible(true);
    }
}
