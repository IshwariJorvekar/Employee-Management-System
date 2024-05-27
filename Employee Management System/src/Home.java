import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

	JButton view, add, update, remove;
	Home()
	{
		setLayout(null);
		setSize(1120,630);
		setLocation(100,100);
		setVisible(true);
		
		/*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons.icons/home.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,1120,630);
		add(image); */
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setBounds(620,20,400,40);
		heading.setFont(new Font("Raleway", Font.BOLD,25));
		//image.add(heading);
		add(heading);
	
		add = new JButton("Add Employee");
		add.setBounds(650,80,150,40);
		add.addActionListener(this);
		//image.add(add);
		add(add);
		
		view = new JButton("View Employee");
		view.setBounds(820,80,150,40);
		add.addActionListener(this);
		//image.add(view);
		add(view);
		
		update = new JButton("Update Employee");
		update.setBounds(650,140,150,40);
		add.addActionListener(this);
		//image.add(update);
		add(update);
		
		remove = new JButton("Remove Employee");
		remove.setBounds(820,140,150,40);
		remove.addActionListener(this);
		//image.add(remove);
		add(remove);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try {
			if(ae.getSource() == add)
			{
				setVisible(false);
				new AddEmployee();
			}
			else if(ae.getSource() == view)
			{
				setVisible(false);
				//new ViewEmployee();
			}
			else if(ae.getSource() == update)
			{
				setVisible(false);
				//new UpdateEmployee();
			}
			else
			{
				setVisible(false);
				//new RemoveEmployee();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		new Home();
	}
}
