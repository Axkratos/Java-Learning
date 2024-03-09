import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class actiond implements ActionListener{

    JFrame f=new JFrame();
    JPanel p=new JPanel();
    JButton b1=new JButton("Close");
    JButton b2=new JButton("Black");
    public actiond(){
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        f.add(p);

        // JTextField k=new JTextField();
        // k.setBounds(80,40,100,100);
        // f.add(k);
        // JTextArea a=new JTextArea();
        
        f.add(b1);
        b1.setBounds(150,300,100,30);
        b1.addActionListener(this);

        
        f.add(b2);
        b2.setBounds(250,300,80,30);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            System.exit(0);
        }
        else{
            f.getContentPane().setBackground(Color.black);
        }
    }
        public static void main(String [] args){
           actiond acd=new actiond();
        }

    
}
