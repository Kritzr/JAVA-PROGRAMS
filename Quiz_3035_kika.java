import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz_3035_kika extends JFrame {
    // Instance variables
    private JButton submitButton;
    private JRadioButton[] options1, options3;
    private JCheckBox[] options2;
    private ButtonGroup group1, group3;
    private JTextField textField;
    private JTextArea textArea;

    // Constructor
    public Quiz_3035_kika() {
        setTitle("Java Swing Quiz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLayout(new GridBagLayout()); // flexible component positioning

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Question 1: Radio Button (Swing package)
        JPanel questionPanel1 = new JPanel();
        questionPanel1.setBorder(BorderFactory.createTitledBorder("Question 1"));
        questionPanel1.setLayout(new GridBagLayout());

        questionPanel1.add(new JLabel("1. Which package is used for Swing components?"), gbc);
        group1 = new ButtonGroup();
        options1 = new JRadioButton[]{
                new JRadioButton("java.awt"),
                new JRadioButton("javax.swing"),
                new JRadioButton("javafx"),
                new JRadioButton("java.util")
        };

        for (int i = 0; i < options1.length; i++) {
            gbc.gridy++;
            group1.add(options1[i]);
            questionPanel1.add(options1[i], gbc);
        }

        gbc.gridy++;
        add(questionPanel1, gbc);

        // Question 2: Checkbox (Layout Managers)
        gbc.gridx = 0;
        gbc.gridy++;

        JPanel questionPanel2 = new JPanel();
        questionPanel2.setBorder(BorderFactory.createTitledBorder("Question 2"));
        questionPanel2.setLayout(new GridBagLayout());

        questionPanel2.add(new JLabel("2. Which of the following are layout managers?"), gbc);
        options2 = new JCheckBox[]{
                new JCheckBox("Borderlayout"),
                new JCheckBox("Flowlayout"),
                new JCheckBox("Gridlayout"),
                new JCheckBox("Button Group"),
        };

        for (JCheckBox option : options2) {
            gbc.gridy++;
            option.setSelected(false);
            questionPanel2.add(option, gbc);
        }

        gbc.gridy++;
        add(questionPanel2, gbc);

        // Question 3: Text Field (Short answer)
        gbc.gridx = 0;
        gbc.gridy++;

        JPanel questionPanel3 = new JPanel();
        questionPanel3.setBorder(BorderFactory.createTitledBorder("Question 3"));
        questionPanel3.setLayout(new GridBagLayout());

        questionPanel3.add(new JLabel("3. What is the full form of AWT?"), gbc);
        gbc.gridy++;
        textField = new JTextField(20);
        questionPanel3.add(textField, gbc);

        gbc.gridy++;
        add(questionPanel3, gbc);

        // Question 4: Text Area (Long answer)
        gbc.gridx = 0;
        gbc.gridy++;

        JPanel questionPanel4 = new JPanel();
        questionPanel4.setBorder(BorderFactory.createTitledBorder("Question 4"));
        questionPanel4.setLayout(new GridBagLayout());

        questionPanel4.add(new JLabel("4. Explain the difference between Swing and AWT."), gbc);
        gbc.gridy++;
        textArea = new JTextArea(4, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        questionPanel4.add(scrollPane, gbc);

        gbc.gridy++;
        add(questionPanel4, gbc);

        // Question 5: Radio Button (Additional)
        gbc.gridx = 0;
        gbc.gridy++;

        JPanel questionPanel5 = new JPanel();
        questionPanel5.setBorder(BorderFactory.createTitledBorder("Question 5"));
        questionPanel5.setLayout(new GridBagLayout());

        questionPanel5.add(new JLabel("5. Which one of these is not a Swing component?"), gbc);
        group3 = new ButtonGroup();
        options3 = new JRadioButton[]{
                new JRadioButton("JButton"),
                new JRadioButton("JFrame"),
                new JRadioButton("JSlider"),
                new JRadioButton("JProcessor")
        };

        for (int i = 0; i < options3.length; i++) {
            gbc.gridy++;
            group3.add(options3[i]);
            questionPanel5.add(options3[i], gbc);
        }

        gbc.gridy++;
        add(questionPanel5, gbc);

        // Submit Button
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 4;
        submitButton = new JButton("Submit");
        add(submitButton, gbc);

        submitButton.addActionListener(e -> {
            int score = 0;

            // Scoring for Radio Button Questions
            if (options1[1].isSelected()) score++; // Correct answer for Q1
            if (options3[3].isSelected()) score++; // Correct answer for Q5

            // Scoring for Checkbox Question (Q2)
            if (options2[0].isSelected()) score++;
            if (options2[1].isSelected()) score++;
            if (options2[2].isSelected()) score++;

            // Check if the text field is not empty for Q3
            String answer3 = textField.getText().trim();
            if (!answer3.isEmpty()) score++; // You can add more detailed validation here

            // Check if the text area has some content for Q4
            String answer4 = textArea.getText().trim();
            if (!answer4.isEmpty()) score++; // You can add more detailed validation here

            // Display the total score
            JOptionPane.showMessageDialog(null, "Your score is: " + score + "/" + 8);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz_3035_kika();
    }
}
