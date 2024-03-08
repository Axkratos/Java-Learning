import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class actiond {
    public actiond(){
        JFrame f=new JFrame();
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p=new JPanel();
        f.add(p);

        // JTextField k=new JTextField();
        // k.setBounds(80,40,100,100);
        // f.add(k);
        // JTextArea a=new JTextArea();
        JButton b1=new JButton("Close");
        f.add(b1);
        b1.setBounds(150,300,100,30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        JButton b2=new JButton("Black");
        f.add(b2);
        b2.setBounds(250,300,80,30);
        b2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            f.getContentPane().setBackground(Color.black);
            }
        
        });
    }
        public static void main(String [] args){
           actiond acd=new actiond();
        }

    
}
