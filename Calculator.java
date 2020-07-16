

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    static Label l1 = new Label("Number 1");
    static Label l2 = new Label("Number 2");
    static Label ans = new Label("Answer");
    static Label msg = new Label();
    static JTextField t1 = new JTextField();
    static JTextField t2 = new JTextField();
    static JTextField t3 = new JTextField();
    static JButton add = new JButton("Addition");
    static JButton sub = new JButton("Subtraction");
    static JButton mul = new JButton("Multiplication");
    static JButton div = new JButton("Division");



    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,500,500);
        frame.setResizable(false);

        Container c = frame.getContentPane();
        c.setLayout(null);

        l1.setBounds(50,40,120,25);
        l2.setBounds(50,80,120,25);
        ans.setBounds(50,120,120,25);
        msg.setBounds(50,165,120,25);
        l1.setFont(new Font("Arial", Font.BOLD,16));
        l2.setFont(new Font("Arial", Font.BOLD,16));
        ans.setFont(new Font("Arial", Font.BOLD,16));
        msg.setFont(new Font("Arial", Font.BOLD,12));
        t1.setBounds(200,40,120,30);
        t2.setBounds(200,80,120,30);
        t3.setBounds(200,120,120,30);
        t1.setFont(new Font("Arial", Font.BOLD,16));
        t2.setFont(new Font("Arial", Font.BOLD,16));
        t3.setFont(new Font("Arial", Font.BOLD,16));
        add.setBounds(50,200,135,30);
        sub.setBounds(50,240,135,30);
        mul.setBounds(50,280,135,30);
        div.setBounds(50,320,135,30);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addition(actionEvent);
            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                subtraction(actionEvent);
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                multiplication(actionEvent);
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                division(actionEvent);
            }
        });


        c.add(l1);
        c.add(l2);
        c.add(ans);
        c.add(msg);
        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(add);
        c.add(sub);
        c.add(mul);
        c.add(div);

    }

    static public void addition(ActionEvent event){
            String s1 = t1.getText();
            String s2 = t2.getText();
            try {
                float num1 = Float.parseFloat(s1);
                float num2 = Float.parseFloat(s2);
                float total = num1 + num2;
                String s = Float.toString(total);
                t3.setText(s);
            }catch(Exception e) {
//                msg.setText("Invalid Input!!!");
                JOptionPane.showMessageDialog(null, "Invalid Input!!!", "Warning",JOptionPane.WARNING_MESSAGE);
            }
    }

    static public void subtraction(ActionEvent event){
        String s1 = t1.getText();
        String s2 = t2.getText();
        try {
            float num1 = Float.parseFloat(s1);
            float num2 = Float.parseFloat(s2);
            float total = num1 - num2;
            String s = Float.toString(total);
            t3.setText(s);
        }
        catch (Exception e){
//            msg.setText("Invalid Input!!!");
            JOptionPane.showMessageDialog(null, "Invalid Input!!!", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    static public void multiplication(ActionEvent event){
        String s1 = t1.getText();
        String s2 = t2.getText();
        try {
            float num1 = Float.parseFloat(s1);
            float num2 = Float.parseFloat(s2);
            float total = num1 * num2;
            String s = Float.toString(total);
            t3.setText(s);
        }
        catch (Exception e){
//            msg.setText("Invalid Input!!!");
            JOptionPane.showMessageDialog(null, "Invalid Input!!!", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    static public void division(ActionEvent event){
        String s1 = t1.getText();
        String s2 = t2.getText();
        try {
            float num1 = Float.parseFloat(s1);
            float num2 = Float.parseFloat(s2);
            float total = num1 / num2;
            String s = Float.toString(total);
            t3.setText(s);
        }
        catch (Exception e){
//            msg.setText("Invalid Input!!!");
            JOptionPane.showMessageDialog(null, "Invalid Input!!!", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
}
