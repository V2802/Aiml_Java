package Account_Data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Registration_Data {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Data window = new Registration_Data();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration_Data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 0, 255));
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(1031, 0, 55, 644);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, -16, 644);
		comboBox.setBackground(Color.MAGENTA);
		frame.getContentPane().add(comboBox);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 644, 1086, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 35));
		lblNewLabel.setBounds(359, 39, 208, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 155, 110, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 270, 98, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_3.setBounds(10, 381, 110, 36);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(193, 155, 236, 47);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(193, 270, 123, 47);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(359, 270, 123, 47);
		frame.getContentPane().add(r2);
		
		JComboBox co = new JComboBox();
		co.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		co.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "ECE", "EEE", "CIVIL", "IT", "MECH"}));
		co.setBounds(196, 381, 148, 35);
		frame.getContentPane().add(co);
		
		JLabel lblNewLabel_4 = new JLabel("PROGRAMMING LANGUAGES");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel_4.setBounds(10, 475, 336, 47);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox cb1 = new JCheckBox("JAVA");
		cb1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		cb1.setBounds(397, 475, 123, 41);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("PYTHON");
		cb2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		cb2.setBounds(554, 475, 123, 41);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("C");
		cb3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		cb3.setBounds(707, 475, 123, 41);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g = "Female";
				}
				else if(r2.isSelected())
				{
					g = "Male";
				}
				else
				{
					g = "Invalid";
				}
				String b=(String) co.getSelectedItem();
				String p1;
				if(cb1.isSelected());
				{
					Pl=Pl+" C++";
				}
				else
				{
					Pl=Pl+ "Java";
				}
				else
				{
					Pl=Pl+"Python";
				}
				try {
					Connection con = DriverManager.getConnetion("jdbc:mysql://localhost:3306/aiml","root","mrec");
					String q = "insert into registration values('"++"','"+g+"','"+b+"','"+Pl+"')";""
					statment sta=con.createStatment();
					sta.execute(q)
					con.close();
				} catch (SQLException e1) {
					// TOOO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		btnNewButton_1.setBounds(330, 559, 128, 47);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 1102, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
