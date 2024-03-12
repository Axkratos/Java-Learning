import javax.swing.*;
public class Program {
    public Program(){
        JFrame f=new JFrame("Hello");
        JLabel l=new JLabel("k xa",JLabel.CENTER);
        f.add(l);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
    }
    
    public static void main(String [] args){
        Program p = new Program();
    }
}