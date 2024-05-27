import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstPage extends JFrame implements ActionListener
{
	
	FirstPage()
	{
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setBounds(80,30,1200,60);
		heading.setFont(new Font("serif", Font.PLAIN,60));
		heading.setForeground(Color.red);
		add(heading);
		
		/*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons.icons/front.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(50,100,1050,500);
		add(image); */
		
		JButton clickhere = new JButton("Click here to Continue");
		clickhere.setBounds(400,400,300,70);
		clickhere.setBackground(Color.BLACK);
		clickhere.setForeground(Color.WHITE);
		clickhere.addActionListener(this);
		//image.add(clickhere);
		add(clickhere);
		
		setSize(1170,650);
		setLocation(100,50);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new Login();
	}
	
	public static void main(String args[])
	{
		new FirstPage();
	}

}
