import javax.swing.*;
import java.awt.event.*;

public class Demo {

    public Demo(){
        JFrame f = new JFrame("Login");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setLayout(null);

        JLabel u = new JLabel("Enter Username");
        JLabel p = new JLabel("Enter Password");
        u.setBounds(20, 40, 100, 20); // Adjusted bounds to make the label visible
        p.setBounds(20, 70, 100, 20); // Adjusted bounds to make the label visible
        f.add(u);
        f.add(p);

        JTextField tu = new JTextField("Username");
        tu.setBounds(130, 40, 100, 20);
        f.add(tu);

        JTextField tp = new JTextField("Password");
        tp.setBounds(130, 70, 100, 20);
        f.add(tp);

        f.setVisible(true);

        JButton b=new JButton("Login");
        b.setBounds(130,90,120,20);
        f.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    b.setText("Register");
            };
        });    
    
    }

    public static void main(String[] args ){
        Demo d = new Demo();
    }
}
