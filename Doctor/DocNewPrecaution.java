import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;


public class DocNewPrecaution {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(570,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,70);
        frame.setTitle("Precaution");
        Container c = frame.getContentPane();
        c.setLayout(null);
       // coloring background
        c.setBackground(Color.getHSBColor(234, 143, 234));

        JLabel labe0 = new JLabel("Precaution");
        labe0.setBounds(100,40,200,30);
        labe0.setLocation(180,100);
        c.add(labe0);

        // Adding Labels
        JLabel label = new JLabel("Patient Name:");
        label.setBounds(100,40,200,30);
        label.setLocation(150,150);
        c.add(label);


        JLabel label1 = new JLabel("Patient Age:");
        label1.setBounds(100,120,200,30);
        label1.setLocation(150,190);
        c.add(label1);


        JLabel label2 = new JLabel("List of Iteam 1:");
        label2.setBounds(100,300,200,30);
        label2.setLocation(150,230);
        c.add(label2);


        JLabel label3 = new JLabel("List of Iteam 2:");
        label3.setBounds(100,420,200,30);
        label3.setLocation(150,270);
        c.add(label3);


        JLabel label4 = new JLabel("List of Iteam 3:");
        label4.setBounds(100,420,200,30);
        label4.setLocation(150,350);
        c.add(label4);

        JLabel label5 = new JLabel("List of Iteam 5:");
        label5.setBounds(100,420,200,30);
        label5.setLocation(150,390);
        c.add(label5);

        JLabel label6 = new JLabel("List of Iteam 3");
        label6.setBounds(100,420,200,30);
        label6.setLocation(150,310);
        c.add(label6);


        //Creating Fields
        JTextField t1 = new JTextField();
        t1.setBounds(190,50,150,30);
        t1.setLocation(250,150);
        c.add(t1);


        JPasswordField pass1 = new JPasswordField();
        pass1.setBounds(190,100,150,30);
        pass1.setLocation(250,190);
        c.add(pass1);


        JPasswordField pass2 = new JPasswordField();
        pass2.setBounds(190,100,150,30);
        pass2.setLocation(250,230);
        c.add(pass2);


        JPasswordField pass3 = new JPasswordField();
        pass3.setBounds(210,100,150,30);
        pass3.setLocation(250,270);
        c.add(pass3);


        JPasswordField pass4 = new JPasswordField();
        pass4.setBounds(210,100,150,30);
        pass4.setLocation(250,310);
        c.add(pass4);

        JPasswordField pass5 = new JPasswordField();
        pass5.setBounds(210,100,150,30);
        pass5.setLocation(250,350);
        c.add(pass5);

        JPasswordField
         pass6 = new JPasswordField();
        pass6.setBounds(210,100,150,30);
        pass6.setLocation(250,390);
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
