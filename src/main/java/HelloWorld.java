import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {

    private final JPanel panel1;
    private final JLabel lblHelloWorld;

    public HelloWorld() {
        panel1 = new JPanel(new GridLayout(2, 4));
        lblHelloWorld = new JLabel("O Luis esteve aqui");

        panel1.add(lblHelloWorld);
        setContentPane(panel1);
        setPreferredSize(new Dimension(300, 300));

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}

