import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class appletdemo extends Applet implements ActionListener{

    TextField f1=new TextField(10);
    TextField f2=new TextField(10);
    TextField f3=new TextField(10);
    Label l1=new Label("First NUMBER");
    Label l2=new Label("Second NUMBER");
    Label l3=new Label("Third NUMBER");
    Button b=new Button("Add");

    public void init() {
        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(f3);
        add(b);

        b.addActionListener(this);
    
        
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            int n1=Integer.parseInt(f1.getText());
            int n2=Integer.parseInt(f2.getText());
            f3.setText(" "+(n1+n2));
        }
    }
}
