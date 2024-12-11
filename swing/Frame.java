// import javax.swing.*;

// public class Frame {
//     public static void main(String[] args) {
//         JFrame f = new JFrame("Demo");
//         JLabel lab = new JLabel("This is the demo of Java APP");
//         lab.setBounds(10, 10, 200, 20); // Adjusted width to fit the text
//         f.add(lab);
//         JTextField inp1 = new JTextField();
//         inp1.setBounds(10, 40, 150, 20); // Adjusted position and size
//         f.add(inp1);

//         String[][] data = {
//             {"Rohith", "19", "Student"},
//             {"Devil", "25", "Hunter"},
//             {"Devil", "25", "Hunter"},
//             {"Devil", "25", "Hunter"},
//             {"Devil", "25", "Hunter"}
//         };
//         String[] col = {"Name", "Age", "Position"};

//         // Create the JTable
//         JTable t = new JTable(data, col);

//         // Add the table to a JScrollPane
//         JScrollPane sp = new JScrollPane(t);
//         sp.setBounds(10, 80, 360, 50); // Set bounds for the scroll pane
//         f.add(sp);

//         // Frame properties
//         f.setLayout(null); // Use null layout
//         f.setSize(400, 400); // Set frame size
//         f.setVisible(true); // Make the frame visible
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on exit
//     }
// }
// Package declaration


// Importing required Swing and other packages
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// /**
//  * This class demonstrates the usage of Swing components in Java along with OOP concepts.
//  * It includes constructors, methods, data types, arrays, control flow, and more.
//  */
// public class Frame extends JFrame {

//     // Data members (variables)
//     private JTextField nameField;
//     private JTextField ageField;
//     private JLabel resultLabel;
//     private JButton submitButton;

//     // Constructor (demonstrating constructors)
//     public Frame() {
//         // Set frame title
//         setTitle("Swing Example");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Set layout manager
//         setLayout(new FlowLayout());

//         // Create Swing components
//         nameField = new JTextField(20);
//         ageField = new JTextField(20);
//         resultLabel = new JLabel("Result will be displayed here");
//         submitButton = new JButton("Submit");

//         // Add components to the frame
//         add(new JLabel("Enter Name:"));
//         add(nameField);
//         add(new JLabel("Enter Age:"));
//         add(ageField);
//         add(submitButton);
//         add(resultLabel);

//         // Button click event handling (demonstrating control flow)
//         submitButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Retrieve input values
//                 String name = nameField.getText();
//                 String ageText = ageField.getText();

//                 try {
//                     // Convert age to an integer
//                     int age = Integer.parseInt(ageText);

//                     // Checking eligibility using control flow
//                     if (age >= 18) {
//                         resultLabel.setText(name + " is eligible to vote.");
//                     } else {
//                         resultLabel.setText(name + " is not eligible to vote.");
//                     }

//                     // Method to calculate square (demonstrating methods)
//                     int squareOfAge = calculateSquare(age);
//                     resultLabel.setText(resultLabel.getText() + " Square of age is: " + squareOfAge);
//                 } catch (NumberFormatException ex) {
//                     // Handle invalid input
//                     resultLabel.setText("Invalid age. Please enter a number.");
//                 }
//             }
//         });
//     }

//     // Method to calculate square of a number
//     public int calculateSquare(int number) {
//         return number * number;
//     }

//     public static void main(String[] args) {
//         // Create and display the Swing frame
//         Frame frame = new Frame();
//         frame.setVisible(true);
//     }
// }
// Package declaration
// package myjavaprogram;

// Importing required Swing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class demonstrates the usage of Swing components to create a simple GUI.
 * It uses JLabel, JTextField, JButton, JPanel, etc.
 */
public class Frame extends JFrame {

    // Constructor to set up the Swing components
    public Frame() {
        // Set the title of the window
        setTitle("Swing Example");
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JPanel());
        tabbedPane.addTab("Tab 2", new JPanel());
        add(tabbedPane);
        
        // Set the layout of the window (using FlowLayout)
        setLayout(new FlowLayout());

        // Create Swing components
        JLabel label = new JLabel("Enter your name:"); // JLabel to display text
        JTextField textField = new JTextField(20); // JTextField for user input
        JButton button = new JButton("Submit"); // JButton for action
        JLabel resultLabel = new JLabel(""); // JLabel to display result after clicking button

        // Add the components to the JFrame
        add(label);
        add(textField);
        add(button);
        add(resultLabel);
        JRadioButton radioButton1 = new JRadioButton("Option 1");
JRadioButton radioButton2 = new JRadioButton("Option 2");
ButtonGroup group = new ButtonGroup();
group.add(radioButton1);
group.add(radioButton2);
add(radioButton1);
add(radioButton2);
String[] options = {"Option 1", "Option 2", "Option 3"};
JComboBox<String> comboBox = new JComboBox<>(options);
add(comboBox);

String[] items = {"Item 1", "Item 2", "Item 3"};
JList<String> list = new JList<>(items);
// add(new JScrollPane(list)); // Adding JScrollPane to allow scrolling

        // Action listener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from JTextField
                String name = textField.getText();
                resultLabel.setText("Hello, " + name + "!"); // Display greeting message
            }
        });

        // Set the frame size and visibility
        setSize(300, 200);  // Set the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        setVisible(true); // Make the frame visible
    }

    // Main method to run the Swing application
    public static void main(String[] args) {
        // Run the Swing application
        new Frame(); // Create an instance of Fram
    }
}
