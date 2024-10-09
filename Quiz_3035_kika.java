import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quiz_3035_kika extends JFrame{
    private JButton submitButton;
    private JRadioButton[] options1;
    private JCheckBox[] options2;
    private ButtonGroup group1;

    public Quiz_3035_kika() {
        setTitle("JAVA SWING QUIZ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1;

        add(new JLabel("1. Which package is used for Swing components?"), gbc);

        options1 = new JRadioButton[]{
                new JRadioButton("java.awt"),
                new JRadioButton("javax.swing"),
                new JRadioButton("javafx"),
                new JRadioButton("java.util")
        };

        group1 = new ButtonGroup();
        for (int i = 0; i < options1.length; i++) {
            gbc.gridy++;
            group1.add(options1[i]);
            add(options1[i], gbc);
        }


        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("2. Which of the following are layout managers?"), gbc);
        options2 = new JCheckBox[]{
                new JCheckBox("Border Layout"),
                new JCheckBox("Flow Layout"),
                new JCheckBox("Grid Layout"),
                new JCheckBox("Button Group"),
                new JCheckBox("Frame Layout")
        };

        for (JCheckBox option : options2) {
            gbc.gridy++;
            add(option, gbc);
        }
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 4;
        submitButton = new JButton("Submit");
        add(submitButton, gbc);
        submitButton.addActionListener(e -> {
            int score = 0;
            if (options1[1].isSelected()) score++;

            if (options2[0].isSelected()) score++;
            if (options2[1].isSelected()) score++;
            if (options2[2].isSelected()) score++;
            if (options2[4].isSelected()) score++;

            JOptionPane.showMessageDialog(null, "Your score is " + score + "/" + 5);


        });
        setVisible(true);
    }
    public static void main (String[] args){
        new Quiz_3035_kika();



    }

}
