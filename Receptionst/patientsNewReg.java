import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;


public class patientsNewReg {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(570,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,70);
        frame.setTitle("Patient Registration");
        Container c = frame.getContentPane();
        c.setLayout(null);
       // coloring background
        c.setBackground(Color.getHSBColor(234, 143, 234));

        JLabel labe0 = new JLabel("New Reg. form for Patients");
        labe0.setBounds(100,40,200,30);
        labe0.setLocation(180,100);
        c.add(labe0);

        // Adding Labels
        JLabel label = new JLabel("Frist Name:");
        label.setBounds(100,40,200,30);
        label.setLocation(150,150);
        c.add(label);


        JLabel label1 = new JLabel("Last name:");
        label1.setBounds(100,120,200,30);
        label1.setLocation(150,190);
        c.add(label1);


        JLabel label2 = new JLabel("Patient no:");
        label2.setBounds(100,300,200,30);
        label2.setLocation(150,230);
        c.add(label2);


        JLabel label3 = new JLabel("Address:");
        label3.setBounds(100,420,200,30);
        label3.setLocation(150,270);
        c.add(label3);


        JLabel label4 = new JLabel("Phone No:");
        label4.setBounds(100,420,200,30);
        label4.setLocation(150,350);
        c.add(label4);

        JLabel label5 = new JLabel("Age:");
        label5.setBounds(100,420,200,30);
        label5.setLocation(150,390);
        c.add(label5);


        JLabel label6 = new JLabel("Disease:");
        label6.setBounds(100,420,200,30);
        label6.setLocation(150,310);
        c.add(label6);



        //Creating Fields
        JTextField t1 = new JTextField();
        t1.setBounds(190,50,150,30);
        t1.setLocation(230,150);
        c.add(t1);


        JTextField pass1 = new JTextField();
        pass1.setBounds(190,100,150,30);
        pass1.setLocation(230,190);
        c.add(pass1);


        JTextField pass2= new JTextField();
        pass2.setBounds(190,100,150,30);
        pass2.setLocation(230,230);
        c.add(pass2);


        JTextField pass3 = new JTextField();
        pass3.setBounds(210,100,150,30);
        pass3.setLocation(230,270);
        c.add(pass3);


        JTextField pass4 = new JTextField();
        pass4.setBounds(210,100,150,30);
        pass4.setLocation(230,310);
        c.add(pass4);

        JTextField pass5 = new JTextField();
        pass5.setBounds(210,100,150,30);
        pass5.setLocation(230,350);
        c.add(pass5);

        JTextField pass6 = new JTextField();
        pass6.setBounds(210,100,150,30);
        pass6.setLocation(230,390);
        c.add(pass6);


        //Creating Button
        JButton btn = new JButton("Save");
        btn.setSize(150,30);
        btn.setLocation(130,500);
        c.add(btn);

        JButton btn1 = new JButton("Cancle");
        btn1.setSize(150,30);
        btn1.setLocation(290,500);
        c.add(btn1);

    }
}