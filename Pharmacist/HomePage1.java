import javax.swing.*;
import java.awt.*;

class HomePage1 {
    public static void main(String[] args) {
        JFrame frameHome = new JFrame();
        frameHome.setVisible(true);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHome.setBounds(100,70, 1300,700);
        frameHome.setTitle("Receptionst");
        ImageIcon Receptionst = new ImageIcon("img.png");
        frameHome.setIconImage(Receptionst.getImage());
        Container HomeContainer = frameHome.getContentPane();
        HomeContainer.setBackground(Color.getHSBColor(234, 143, 234));
        HomeContainer.setLayout(null);
        ImageIcon icon = new ImageIcon("name.png");
        JLabel label = new JLabel(icon);
        label.setBounds(75,10,icon.getIconWidth(),icon.getIconHeight());
        ImageIcon icon1= new ImageIcon("clipart3916192.png");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(400,300,icon1.getIconWidth(),icon1.getIconHeight());

        HomeContainer.add(label);
        HomeContainer.add(label1);
        JMenuBar menubar = new JMenuBar();
       

        JMenu receipt = new JMenu("Receipt");
        JMenuItem i1111 = new JMenuItem("New Receipt");
        JMenuItem i2222 = new JMenuItem("History");
        receipt.add(i1111);
        receipt.add(i2222);
        menubar.add(receipt);


        frameHome.setJMenuBar(menubar);

        frameHome.setVisible(true);


        

    }
    // public void actionPerformed(ActionEvent e) {    
    //     if(e.getSource()==)    
    //     ta.cut();    
    //     if(e.getSource()==paste)    
    //     ta.paste();    
         
          
    //     } 
    //     public static void main(String[] args) {    
    //         new HomePage1();    
    //     }  
}