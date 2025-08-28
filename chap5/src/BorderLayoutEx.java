import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("B layout sample ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new BorderLayout(30,20));
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);
        c.add(new JButton("calculate"), BorderLayout.CENTER);


        setVisible(true);
        setSize(300,200);
    }
    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}