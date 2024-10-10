import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class shoppingcart_3035_kika extends JFrame {
    private JComboBox<String> itemDropdown;
    private JTextArea cartArea;
    private JButton addButton, checkoutButton;
    private JLabel totalLabel;
    private double totalAmt = 0.0;

    private String[] items = {"laptop - $1000", "book - $30", "Headphones - $100"};
    private double[] prices = {1000.0 , 30.0, 100.0};

    private String[] images = {"laptop.png", "book.png", "headphones.png"};
    private ArrayList<String> cartItems = new ArrayList<>();

    public shoppingcart_3035_kika() {
        setTitle("Shopping Cart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(173, 216, 230));

        JPanel leftPanel = new JPanel(new FlowLayout());
        leftPanel.setBackground(new Color(173, 216, 230));
        itemDropdown = new JComboBox<>(items);
        itemDropdown.setPreferredSize(new Dimension(150, 30));

        addButton = new JButton("Add To Cart");
        addButton.setBackground(new Color(60, 179, 113));
        addButton.setForeground(Color.white);

        leftPanel.add(new JLabel("Select an item:"));
        leftPanel.add(itemDropdown);
        leftPanel.add(addButton);


        JPanel imagePanel = new JPanel();
        JLabel imageLabel = new JLabel(new ImageIcon(images[0]));
        imagePanel.add(imageLabel);
        imagePanel.setBackground(new Color(173, 216, 230));

        itemDropdown.addActionListener(e -> {
            int selectedIndex = itemDropdown.getSelectedIndex();
            imageLabel.setIcon(new ImageIcon(images[selectedIndex]));
        });

        topPanel.add(leftPanel, BorderLayout.WEST);
        topPanel.add(imagePanel, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);


        JPanel middlePanel = new JPanel(new BorderLayout());
        cartArea = new JTextArea(10, 40);
        cartArea.setEditable(false);
        cartArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        cartArea.setBackground(new Color(255, 250, 240));
        middlePanel.add(new JScrollPane(cartArea), BorderLayout.CENTER);
        add(middlePanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        totalLabel = new JLabel("Total Amount: $0.00");
        totalLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        totalLabel.setForeground(new Color(0, 128, 0));

        checkoutButton = new JButton("CheckOut");
        checkoutButton.setBackground(new Color(60, 179, 113));
        checkoutButton.setForeground(Color.white);

        bottomPanel.add(totalLabel);
        bottomPanel.add(checkoutButton);
        add(bottomPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> {
            int selectedidx = itemDropdown.getSelectedIndex();
            String selecteditem = items[selectedidx];
            double selectedprice = prices[selectedidx];

            cartItems.add(selecteditem);
            totalAmt += selectedprice;
            cartArea.append(selecteditem + "\n");
            totalLabel.setText(String.format("Total: $%.2f", totalAmt));
        });


        checkoutButton.addActionListener(e -> {
            if (cartItems.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No items in your cart.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Check Out complete! \n Total Amount: $" + totalAmt);
                cartItems.clear();
                cartArea.setText("");
                totalAmt = 0.0;
                totalLabel.setText(String.format("Total Amount: $%.2f", totalAmt));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new shoppingcart_3035_kika();
    }
}
