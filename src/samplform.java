//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class samplform implements ActionListener {
//    private JButton button;
//    private JPanel panel;
//    private JButton button1;
//    private JPanel panel1;
//
//
//    JTextField textField;
//    JLabel label;
//    JTextField textField1;
//
//    JLabel label1;
//    JLabel label2;
//    JLabel label3;
//
//
//
//    samplform() {
//        JFrame frame = new JFrame("second app");
//        button = new JButton("add");
//        button1 = new JButton("sub");
//
//
//
//        textField = new JTextField();
//        label = new JLabel("first number");
//        textField1 = new JTextField();
//
//        label1 = new JLabel("second number");
//label2=new JLabel(" ");
//        label3=new JLabel(" ");
//
//
//        frame.setLayout(null);
//        frame.setSize(500, 500);
//        frame.add(button);
//        frame.add(button1);
//
//        frame.add(textField);
//        frame.add(label);
//        frame.add(textField1);
//        frame.add(label1);
//
//        frame.add(label2);
//        frame.add(label3);
//
//        button.addActionListener(this);
//        button1.addActionListener(this);
//        button.setBounds(120, 270, 70, 70);
//        button1.setBounds(220, 270, 70, 70);
//
//
//        textField.setBounds(120, 100, 90, 30);
//        textField1.setBounds(220, 100, 90, 30);
//
//        label.setBounds(120, 200, 90, 30);
//        label1.setBounds(220, 200, 90, 30);
//        label2.setBounds(150, 250, 90, 30);
//        label3.setBounds(150, 350, 90, 30);
//
//
//        frame.setVisible(true);
//
//    }
//    @Override
//    public void actionPerformed(ActionEvent ae)
//    {
//        if(ae.getSource()==button){
//       int a=Integer.parseInt(textField.getText());
//       int b=Integer.parseInt(textField1.getText());
//       int c =a+b;
//       label2.setText("SUM IS "+c);
//    }
//    public static void main(String[] args) {
//        new samplform();
//
//    }
//}
//
