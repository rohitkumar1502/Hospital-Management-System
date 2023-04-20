import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import javax.swing.*;



public class  LogInform extends  JFrame{
    LogInform(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,70);
        frame.setTitle("Login User");
    
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.getHSBColor(234, 143, 234));
        JLabel label = new JLabel("Username:");
        label.setBounds(100,40,200,30);
        label.setLocation(150,150);

        c.add(label);
       JLabel label1 = new JLabel("Password:");
       label1.setBounds(100,120,200,30);
       label1.setLocation(150,190);

       c.add(label1);

        JTextField t1 = new JTextField();
        t1.setBounds(190,50,80,30);
        t1.setLocation(230,150);
        c.add(t1);

       
        JPasswordField pass1 = new JPasswordField();
        pass1.setBounds(190,100,80,30);
        pass1.setLocation(230,190);
        c.add(pass1);
        String[] values={"Doctor", "Receptionst","Pharmacist"};

        JComboBox c1 = new JComboBox(values);
        c1.setBounds(170, 230, 120, 30);
        c1.setEditable(true);
        c1.setSelectedItem("Receptionst");
        c.add(c1);
        


        //Creating Button
        JButton btn = new JButton("Login");
        btn.setSize(120,30);
        btn.setLocation(170,300);
        c.add(btn);
        
        // btn.addActionListener((ActionListener) new ActionListener() 
        // {
        //     public void actionPerformed(ActionEvent e) {
        //         this.setVisible(false);
        //         new HomePage().setVisible(true); 
               
        //     }

            

        //     private void setVisible(boolean c1) {
                
            
        //     }
           
        // });
        

    }

    public static void main(String[] args) {
       
        LogInform frame = new LogInform();
        
       

    }
}