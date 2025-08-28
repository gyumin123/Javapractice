import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout sample ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();


        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("calculate"));
        c.setLayout(new FlowLayout(FlowLayout.LEFT,30, 40));

        setVisible(true);
        setSize(400,200);
    }
    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}