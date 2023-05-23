import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CalificareProprietar { // incepe clasa
    public static void main(String[] args) { // incepe codul
        JFrame frame = new JFrame("Calificare Proprietar Prime Imobiliare");
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.white);
        frame.setForeground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Creating a custom JPanel to draw the image
        JPanel imagePanel = new JPanel() {
            private BufferedImage image;

            // Loading the image in the constructor
            {
                try {
                    image = ImageIO.read(new File("C:\\Users\\wolfr\\Desktop\\Prime imobiliare\\311831807_100703736172683_3090795973821061407_n.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // Drawing the image in the panel
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Adding the image panel to the content pane
        frame.setContentPane(imagePanel);

        frame.setVisible(true);

        // Creating three buttons
        JButton button1 = new JButton("Apartament");
        JButton button2 = new JButton("Casă / Vilă");
        JButton button3 = new JButton("Spațiu");

        // Creating a panel to hold the buttons and center them
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10); // add some padding
        panel.add(button1, constraints);
        constraints.gridx = 1;
        panel.add(button2, constraints);
        constraints.gridx = 2;
        panel.add(button3, constraints);

        // Adding the panel to the center of the content pane
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
        // Creating a label with the text "My Window"
        JLabel label = new JLabel("Calificare Proprietar", SwingConstants.CENTER);

        // Setting the font and color of the label
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.magenta);

        // Adding the label to the top of the content pane
        frame.add(label, BorderLayout.NORTH);

        frame.setVisible(true);

    } // se termina codul
} // se termina clasa
