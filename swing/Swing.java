
import java.awt.event.*;

import javax.swing.*;
public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame");
        // Label
        JLabel l1 = new JLabel("Label1");
        l1.setBounds(50, 10, 100, 30); // Updated bounds for visibility
        JTextField inp = new JTextField("Input");
        inp.setBounds(50, 50, 200, 30); // Updated bounds
        JTextArea ta = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(ta); // JScrollPane for scrolling
        scrollPane.setBounds(0, 100, 300, 150); // Set bounds for the scroll pane
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 200); // Set the panel bounds
        panel.add(l1);
        panel.add(inp);
        panel.add(scrollPane);
        JCheckBox ch=new JCheckBox("CheckBox");
        ch.setBounds(50,300,100,50);
        JRadioButton r1=new JRadioButton("R!");
        JRadioButton r2=new JRadioButton("R3");
        ButtonGroup group=new ButtonGroup();
        group.add(r2);
        group.add(r1);
        r1.setBounds(50,350,100,50);
        r2.setBounds(150,350,100,50);
        String[] data={"ol1","ol2","ol3"};
        JList<String> jl=new JList<>(data);
        jl.setBounds(50,400,100,50);
        JComboBox<String> cb=new JComboBox<>(data);
        cb.setBounds(50, 600, 100, 50);
        f.add(r2);
        f.add(r1);
        f.add(ch);
        f.add(jl);
        f.add(cb);
        JButton btn=new JButton("Button");
        JButton btn2=new JButton("Button");
        btn2.setBounds(100,450,100,50);
        btn2.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e){
                l1.setText("Action is working");
            }
        });
        btn.setBounds(0,450,100,50);
        btn.addActionListener(e->System.out.println("hello world"));
        f.add(panel);
        f.add(btn);
        f.add(btn2);
        f.setSize(400, 700);
        f.setLayout(null); // Null layout for the frame
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
