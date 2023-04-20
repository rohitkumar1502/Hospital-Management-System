import javax.swing.*;
import java.awt.*;
class HomePage{
    protected static Object java;

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
        JMenu patients = new JMenu("Patients");
        JMenuItem i1 = new JMenuItem("New Registration");
        JMenuItem i2 = new JMenuItem("Patients Details");
        patients.add(i1);
        patients.add(i2);
        menubar.add(patients);


        JMenu doctor = new JMenu("Doctor");
        JMenuItem i11 = new JMenuItem("New Registration");
        JMenuItem i22 = new JMenuItem("Doctor Details");
        doctor.add(i11);
        doctor.add(i22);
        menubar.add(doctor);

        JMenu channel = new JMenu("Channel");
        JMenuItem i111 = new JMenuItem("New Channel");
        JMenuItem i222 = new JMenuItem("History");
        channel.add(i111);
        channel.add(i222);
        menubar.add(channel);
        JMenu receipt = new JMenu("Receipt");
        JMenuItem i1111 = new JMenuItem("New Receipt");
        JMenuItem i2222 = new JMenuItem("History");
        receipt.add(i1111);
        receipt.add(i2222);
        menubar.add(receipt);


        frameHome.setJMenuBar(menubar);

        frameHome.setVisible(true);


        

    }

    public void setVisible(boolean b) {
    }
}