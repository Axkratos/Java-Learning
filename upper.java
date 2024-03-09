import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class upper implements ActionListener{


    JTextField f1=new JTextField();
        JTextField f2=new JTextField();
    public upper(){
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

        JButton b=new JButton("Convert");
        b.setBounds(180,250,100,30);
        b.addActionListener(this);
        f.add(b);

        
        f.add(f2);
        f.add(f1);
        f1.setBounds(180,150,80,30);
        f2.setBounds(180,200,80,30);
    }
        public void actionPerformed(ActionEvent e){
           String b= f1.getText().toUpperCase();
           f1.setText(b);
           String c= f2.getText().toUpperCase();
           f2.setText(c);
           

        }

    public static void main(String [] args){
        upper u=new upper();
    }
}
