import java.awt.* ;
import javax.swing.*;
public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("contentPane과JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setBackground(Color.ORANGE);

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("ignore"));
        setVisible(true);
        setSize(300,150);
    }
    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
