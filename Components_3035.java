import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Components_3035 extends JFrame {

    private JTextField name;
    private JTextArea project;
    private JList<String> skills;
    private JComboBox<String> experience;
    private JCheckBox uG, pG;
    private JRadioButton pT, fT;
    private JButton submit;

    public Components_3035() {
        // Initialize components
        name = new JTextField(15);  // Increased width for better input
        project = new JTextArea(5, 20);  // Adjusted size to fit layout
        JScrollPane obj = new JScrollPane(project);  // Add scroll pane for the text area
        String[] skill_str = {"Java", "Go", "Python", "C++"};  // Added more skills
        String[] exp_str = {"1", "2", "3", "5+"};  // Expanded experience options
        skills = new JList<>(skill_str);
        experience = new JComboBox<>(exp_str);
        uG = new JCheckBox("Undergraduate");
        pG = new JCheckBox("Postgraduate");
        pT = new JRadioButton("Part Time");
        fT = new JRadioButton("Full Time");
        ButtonGroup bg = new ButtonGroup();
        bg.add(pT);
        bg.add(fT);
        submit = new JButton("Submit");

        // Set up layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Padding around components
        gbc.anchor = GridBagConstraints.WEST;  // Align components to the left

        // Name Label and TextField
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        add(name, gbc);

        // Projects Label and TextArea
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;  // Align top-left for text area
        add(new JLabel("Projects:"), gbc);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.BOTH;  // Fill both vertically and horizontally
        add(obj, gbc);  // Add scroll pane instead of plain text area

        // Skills Label and List
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;  // Reset fill
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Skills:"), gbc);
        gbc.gridx = 1;
        add(new JScrollPane(skills), gbc);  // Add scroll pane around the skills list

        // Experience Label and ComboBox
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Experience (years):"), gbc);
        gbc.gridx = 1;
        add(experience, gbc);

        // Education Label and CheckBoxes
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Education:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        add(uG, gbc);
        gbc.gridx = 2;
        add(pG, gbc);
        gbc.gridwidth = 1;

        // Working Type Label and RadioButtons
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Working Type:"), gbc);
        gbc.gridx = 1;
        add(pT, gbc);
        gbc.gridx = 2;
        add(fT, gbc);

        // Submit Button
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;  // Center the submit button
        add(submit, gbc);

        // Add action listener for the submit button
        submit.addActionListener(new Listener());

        // Frame settings
        setSize(500, 500);  // Adjusted window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String names = name.getText();
            String projects = project.getText();
            String skill_str = (String) skills.getSelectedValue();
            String exp_str = (String) experience.getSelectedItem();
            String edu = "";
            if (uG.isSelected()) {
                edu = "Undergraduate";
            }

            if (pG.isSelected()) {
                edu += " Postgraduate";
            }

            String wt = "";
            if (pT.isSelected()) {
                wt = "Part Time";
            } else {
                wt = "Full Time";
            }

            String message = String.format("Name: %s\nProject: %s\nSkills: %s\nExperience: %s\nEducation: %s\nWorking Type: %s",
                    names, projects, skill_str, exp_str, edu, wt);

            JOptionPane.showMessageDialog(null, message, "Personal Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Components_3035();
    }
}
