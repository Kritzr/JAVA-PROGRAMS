import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class Gmail_3035_kika {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Create your Google Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 800);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        panel.setBackground(new Color(240, 248, 255));
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;

        // Title Label
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 4;
        JLabel titleLabel = new JLabel("Create Your Google Account", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 102, 204));
        panel.add(titleLabel, gbc);
        gbc.gridwidth = 1;


        gbc.gridx = 0; gbc.gridy = 1;
        JTextField firstNameField = createStyledTextField("First name");
        panel.add(firstNameField, gbc);

        gbc.gridx = 1;
        JTextField lastNameField = createStyledTextField("Last name");
        lastNameField.setPreferredSize(new Dimension(150, 30));
        panel.add(lastNameField, gbc);


        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        JTextField usernameField = createStyledTextField("Username");
        panel.add(usernameField, gbc);

        gbc.gridx = 2; gbc.gridy = 2; gbc.gridwidth = 1;
        panel.add(new JLabel("@gmail.com"), gbc);


        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Password"), gbc);
        JPasswordField passwordField = createStyledPasswordField("Password");
        panel.add(passwordField, gbc);

        gbc.gridx = 1;
        panel.add(new JLabel("Confirm"), gbc);
        JPasswordField confirmPasswordField = createStyledPasswordField("Confirm");
        panel.add(confirmPasswordField, gbc);


        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        JLabel passwordHint = new JLabel("Use 8 or more characters with letters, numbers & symbols");
        passwordHint.setFont(new Font("Arial", Font.PLAIN, 10));
        passwordHint.setForeground(Color.DARK_GRAY);
        panel.add(passwordHint, gbc);
        gbc.gridwidth = 1;


        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(new JLabel("Phone number"), gbc);
        gbc.gridx = 0; gbc.gridy = 6;
        JPanel phonePanel = new JPanel(new BorderLayout());
        phonePanel.setBackground(new Color(240, 248, 255));
        JComboBox<String> countryCodeCombo = new JComboBox<>(new String[]{"+91", "+1", "+44"});
        JTextField phoneField = createStyledTextField("Phone number");
        phonePanel.add(countryCodeCombo, BorderLayout.WEST);
        phonePanel.add(phoneField, BorderLayout.CENTER);
        panel.add(phonePanel, gbc);


        gbc.gridx = 0; gbc.gridy = 7; gbc.gridwidth = 2;
        JTextField recoveryEmailField = createStyledTextField("Recovery email address");
        panel.add(recoveryEmailField, gbc);


        gbc.gridx = 0; gbc.gridy = 8; gbc.gridwidth = 2;
        JLabel birthdayLabel = new JLabel("Your Birthday");
        panel.add(birthdayLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 9; gbc.gridwidth = 2;
        JPanel birthdayPanel = new JPanel(new GridLayout(1, 3));
        birthdayPanel.setBackground(new Color(240, 248, 255));
        String[] months = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JComboBox<String> monthCombo = new JComboBox<>(months);
        JTextField dayField = createStyledTextField("Day");
        JTextField yearField = createStyledTextField("Year");
        birthdayPanel.add(monthCombo);
        birthdayPanel.add(dayField);
        birthdayPanel.add(yearField);
        panel.add(birthdayPanel, gbc);


        gbc.gridx = 0; gbc.gridy = 10; gbc.gridwidth = 2;
        JLabel genderLabel = new JLabel("Gender");
        panel.add(genderLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 11; gbc.gridwidth = 2;
        String[] genders = {"Gender", "Male", "Female", "Other"};
        JComboBox<String> genderCombo = new JComboBox<>(genders);
        panel.add(genderCombo, gbc);


        gbc.gridx = 0; gbc.gridy = 12; gbc.gridwidth = 2;
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(240, 248, 255));
        JButton createAccountButton = new JButton("Create Account");
        styleButton(createAccountButton, new Color(0, 102, 204), Color.WHITE);
        JButton resetButton = new JButton("Reset");
        styleButton(resetButton, Color.LIGHT_GRAY, Color.BLACK);
        JButton cancelButton = new JButton("Cancel");
        styleButton(cancelButton, Color.LIGHT_GRAY, Color.BLACK);

        buttonPanel.add(createAccountButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(cancelButton);
        panel.add(buttonPanel, gbc);


        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText().trim();
                String lastName = lastNameField.getText().trim();
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();
                String confirmPassword = new String(confirmPasswordField.getPassword()).trim();
                String phoneNumber = phoneField.getText().trim();
                String recoveryEmail = recoveryEmailField.getText().trim();
                String day = dayField.getText().trim();
                String year = yearField.getText().trim();
                String gender = (String) genderCombo.getSelectedItem();

                StringBuilder errorMessage = new StringBuilder("Please correct the following errors:\n");

                if (firstName.isEmpty() || firstName.equals("First name")) {
                    errorMessage.append("- First name cannot be empty\n");
                }
                if (lastName.isEmpty() || lastName.equals("Last name")) {
                    errorMessage.append("- Last name cannot be empty\n");
                }
                if (username.isEmpty() || username.equals("Username")) {
                    errorMessage.append("- Username cannot be empty\n");
                }
                if (password.isEmpty() || password.equals("Password")) {
                    errorMessage.append("- Password cannot be empty\n");
                } else if (password.length() < 8) {
                    errorMessage.append("- Password must be at least 8 characters\n");
                }
                if (!password.equals(confirmPassword)) {
                    errorMessage.append("- Passwords do not match\n");
                }
                if (phoneNumber.isEmpty() || phoneNumber.equals("Phone number")) {
                    errorMessage.append("- Phone number cannot be empty\n");
                }
                if (recoveryEmail.isEmpty() || recoveryEmail.equals("Recovery email address")) {
                    errorMessage.append("- Recovery email cannot be empty\n");
                }
                if (day.isEmpty() || !isInteger(day) || Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) {
                    errorMessage.append("- Please enter a valid day\n");
                }
                if (year.isEmpty() || !isInteger(year) || Integer.parseInt(year) < 1900 || Integer.parseInt(year) > 2100) {
                    errorMessage.append("- Please enter a valid year\n");
                }
                if (gender.equals("Gender")) {
                    errorMessage.append("- Please select your gender\n");
                }

                if (errorMessage.length() > 36) { // Initial error message length
                    JOptionPane.showMessageDialog(frame, errorMessage.toString(), "Input Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static JTextField createStyledTextField(String placeholder) {
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setBorder(new LineBorder(new Color(173, 216, 230), 2));
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);
        textField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });
        return textField;
    }

    private static JPasswordField createStyledPasswordField(String placeholder) {
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setBorder(new LineBorder(new Color(173, 216, 230), 2));
        passwordField.setForeground(Color.GRAY);
        passwordField.setText(placeholder);
        passwordField.setEchoChar((char) 0);
        passwordField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals(placeholder)) {
                    passwordField.setText("");
                    passwordField.setForeground(Color.BLACK);
                    passwordField.setEchoChar('•');
                }
            }
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                    passwordField.setForeground(Color.GRAY);
                    passwordField.setText(placeholder);
                    passwordField.setEchoChar((char) 0);
                }
            }
        });
        return passwordField;
    }

    private static void styleButton(JButton button, Color bgColor, Color fgColor) {
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        button.setFocusPainted(false);
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
