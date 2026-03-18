import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAllComponentsDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Full Demo");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        frame.setLayout(new BorderLayout());

 
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

    
        JPanel topPanel = new JPanel(new FlowLayout());

        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        topPanel.add(label);
        topPanel.add(textField);
        topPanel.add(button);

        frame.add(topPanel, BorderLayout.NORTH);

        
        JPanel centerPanel = new JPanel(new GridLayout(2, 2));

       
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

       
        JCheckBox checkBox = new JCheckBox("Accept Terms");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JPanel radioPanel = new JPanel();
        radioPanel.add(male);
        radioPanel.add(female);

        String[] countries = {"India", "USA", "UK"};
        JComboBox<String> comboBox = new JComboBox<>(countries);

        centerPanel.add(scrollPane);
        centerPanel.add(checkBox);
        centerPanel.add(radioPanel);
        centerPanel.add(comboBox);

        frame.add(centerPanel, BorderLayout.CENTER);

        String[] items = {"Item1", "Item2", "Item3"};
        JList<String> list = new JList<>(items);
        frame.add(new JScrollPane(list), BorderLayout.EAST);

        String[][] data = {
                {"1", "Alice"},
                {"2", "Bob"}
        };
        String[] columns = {"ID", "Name"};

        JTable table = new JTable(data, columns);
        frame.add(new JScrollPane(table), BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String gender = male.isSelected() ? "Male" :
                                female.isSelected() ? "Female" : "Not selected";

                String country = (String) comboBox.getSelectedItem();
                boolean accepted = checkBox.isSelected();

                textArea.append("Name: " + name + "\n");
                textArea.append("Gender: " + gender + "\n");
                textArea.append("Country: " + country + "\n");
                textArea.append("Accepted: " + accepted + "\n\n");
            }
        });

        frame.setVisible(true);
    }
}