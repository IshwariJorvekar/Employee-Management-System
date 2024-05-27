import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame implements ActionListener{
	
	JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
	JDateChooser dcdob;
	JComboBox cbeducation;
	JLabel lblempID;
	JButton add,back;
	
	Random ran = new Random();
	int number = ran.nextInt(999999);
	
	AddEmployee()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		/*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons.icons/add_employee.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1100, 630, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,1120,630);
		add(image); */
		
		JLabel heading = new JLabel("Add Employee Detail");
		heading.setBounds(320,30,500,50);
		heading.setFont(new Font("serif", Font.BOLD,25));
		//image.add(heading);
		add(heading);
		
		JLabel labelname = new JLabel("Name");
		labelname.setBounds(50,150,150,30);
		labelname.setFont(new Font("Serif", Font.PLAIN, 20));
		//image.add(labelname);
		add(labelname);
		
		tfname = new JTextField();
		tfname.setBounds(200,150,150,30);
		//image.add(tfname);
		add(tfname);
		
		JLabel labelfname = new JLabel("Father's Name");
		labelfname.setBounds(400,150,150,30);
		labelfname.setFont(new Font("serif", Font.PLAIN, 20));
		//image.add(labelfname);
		add(labelfname);
		
		tffname = new JTextField();
		tffname.setBounds(600,150,150,30);
		//image.add(tffname);
		add(tffname);
		
		JLabel labeldob = new JLabel("Date of Birth");
		labeldob.setBounds(50,200,150,30);
		labeldob.setFont(new Font("serif", Font.PLAIN, 20));
		//image.add(labeldob);
		add(labeldob);
		
		dcdob = new JDateChooser();
		dcdob.setBounds(200,200,150,30);
		//image.add(dcdob);
		add(dcdob);
		
		JLabel labelSalary = new JLabel("Salary");
		labelSalary.setBounds(400,200,150,30);	
		labelfname.setFont(new Font("serif", Font.PLAIN, 20));
		add(labelSalary);
		
		tfsalary = new JTextField();
		tfsalary.setBounds(600,200,150,30);
		add(tfsalary);
		
		JLabel labelAddress = new JLabel("Address");
		labelAddress.setBounds(50,250,150,30);
		labelAddress.setFont(new Font("serif",Font.PLAIN,20));
		add(labelAddress);
		
		tfaddress= new JTextField();
		tfaddress.setBounds(200,250,150,30);
		add(tfaddress);
		
		JLabel labelPhone = new JLabel("Phone no.");
		labelPhone.setBounds(400,250,150,30);
		labelPhone.setFont(new Font("serif",Font.PLAIN,20));
		add(labelPhone);
		
		tfphone= new JTextField();
		tfphone.setBounds(600,250,150,30);
		add(tfphone);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(50,300,150,30);
		labelEmail.setFont(new Font("serif",Font.PLAIN,20));
		add(labelEmail);
		
		tfemail= new JTextField();
		tfemail.setBounds(200,300,150,30);
		add(tfemail);
		
		JLabel labeleducation = new JLabel("Highest EDucation");
		labeleducation.setBounds(400,300,150,30);
		labeleducation.setFont(new Font("serif", Font.PLAIN,20));
		add(labeleducation);
		
		String courses[]= {"BA", "BBA", "BCA", "B.COM", "BSC", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "Phd"};
		cbeducation = new JComboBox(courses);
		cbeducation.setBackground(Color.WHITE);
		cbeducation.setBounds(600,300,150,30);
		add(cbeducation);
		
		JLabel labelDesignation = new JLabel("Designation");
		labelDesignation.setBounds(50,350,150,30);
		labelDesignation.setFont(new Font("serif",Font.PLAIN,20));
		add(labelDesignation);
		
		tfdesignation= new JTextField();
		tfdesignation.setBounds(200,350,150,30);
		add(tfdesignation);
		
		JLabel labelaadhar = new JLabel("Aadhar no.");
		labelaadhar.setBounds(400,350,150,30);
		labelaadhar.setFont(new Font("serif",Font.PLAIN,20));
		add(labelaadhar);
		
		tfaadhar= new JTextField();
		tfaadhar.setBounds(600,350,150,30);
		add(tfaadhar);
		
		JLabel labelEmpID = new JLabel("Employee ID");
		labelEmpID.setBounds(50,400,150,30);
		labelEmpID.setFont(new Font("serif",Font.PLAIN,20));
		add(labelEmpID);
		
		lblempID = new JLabel(""+number);
		lblempID.setBounds(200,400,150,30);
		lblempID.setFont(new Font("serif", Font.PLAIN,20));
		add(lblempID);
		
		add = new JButton("Add Details");
		add.setBounds(250,540,150,40);
		add.addActionListener(this);
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		add(add);
		
		back = new JButton("Back");
		back.setBounds(450,540,150,40);
		back.addActionListener(this);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		add(back);
		
		
		setSize(900,700);
		setLocation(300,50);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== add)
		{
			String name = tfname.getText();
			String fname = tffname.getText();
			String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
			String salary = tfsalary.getText();
			String address = tfaddress.getText();
			String phone = tfphone.getText();
			String email = tfemail.getText();
			String education = (String) cbeducation.getSelectedItem();
			String designation = tfdesignation.getText();
			String aadhar = tfaadhar.getText();
			String empID = lblempID.getText();
			
			try {
				Conn conn = new Conn();
				String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empID+"')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Details added successfully");
				setVisible(false);
				new Home();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			setVisible(false);
			new Home();
		}
	}
	
	public static void main(String args[])
	{
		new AddEmployee();
	}

}
