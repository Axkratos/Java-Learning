import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample implements MouseListener, MouseMotionListener {
    int x, y = 0;

    public MouseEventExample() {
        JFrame f = new JFrame("Move mouse");
        JPanel p = new JPanel();
        f.add(p);
        p.setLayout(null); // Set the layout manager to null
        p.setBounds(0, 0, 400, 400); // Set the size and position of the panel
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.addMouseListener(this);
        p.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the panel");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Unused method, required by MouseListener
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Unused method, required by MouseListener
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Unused method, required by MouseMotionListener
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse moved to: (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        MouseEventExample mee = new MouseEventExample();
    }
}
