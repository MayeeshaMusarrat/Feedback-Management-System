package LoginRegisterPackage;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adminPackage.Admin;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AdminRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	public AdminRegister() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 210, 195));
		panel.setBounds(0, 0, 382, 567);
		contentPane.add(panel);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(50, 426, 266, 2);
		panel.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.WHITE);
		separator_2_1.setBounds(85, 453, 198, 2);
		panel.add(separator_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("MIST CSE Feedback Management System");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Quicksand Medium", Font.BOLD, 15));
		lblNewLabel_2.setBounds(39, 65, 313, 24);
		panel.add(lblNewLabel_2);
		
		JLabel picLabel_1 = new JLabel("");
		picLabel_1.setBounds(64, 90, 256, 338);
		panel.add(picLabel_1);
		JLabel picLabel = new JLabel("");
		picLabel.setBounds(77, 90, 256, 338);
		panel.add(picLabel);
		Image feedbackImg = new ImageIcon(this.getClass().getResource("/feedbackIcon.png")).getImage();
		picLabel.setIcon(new ImageIcon(feedbackImg));
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(404, 142, 341, 1);
		contentPane.add(separator_4);
		
		textField = new JTextField();
		textField.setText("Enter admin ID");
		textField.setForeground(new Color(182, 186, 197));
		textField.setFont(new Font("Dialog", Font.PLAIN, 10));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(35, 45, 65));
		textField.setBounds(404, 113, 354, 19);
		contentPane.add(textField);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(new Color(245, 245, 245));
		separator_5.setBounds(404, 253, 341, 1);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(new Color(245, 245, 245));
		separator_6.setBounds(404, 366, 341, 1);
		contentPane.add(separator_6);
		
		JLabel registerLabel = new JLabel("Register");
		registerLabel.setForeground(new Color(182, 186, 197));
		registerLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		registerLabel.setBounds(407, 29, 45, 13);
		contentPane.add(registerLabel);
		
		JLabel adminIDLabel = new JLabel("ADMIN ID");
		adminIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adminIDLabel.setForeground(new Color(182, 186, 197));
		adminIDLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		adminIDLabel.setBackground(Color.WHITE);
		adminIDLabel.setBounds(404, 77, 63, 13);
		contentPane.add(adminIDLabel);
		
		JLabel adminPwdLabel = new JLabel("ADMIN PASSWORD");
		adminPwdLabel.setForeground(new Color(182, 186, 197));
		adminPwdLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		adminPwdLabel.setBounds(404, 191, 145, 13);
		contentPane.add(adminPwdLabel);
		
		passwordField = new JPasswordField();
		passwordField.setText("password");
		passwordField.setForeground(new Color(182, 186, 197));
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(35, 45, 65));
		passwordField.setBounds(404, 224, 341, 19);
		contentPane.add(passwordField);
		
		JLabel confirmPwdLabel = new JLabel("CONFIRM ADMIN PASSWORD");
		confirmPwdLabel.setForeground(new Color(182, 186, 197));
		confirmPwdLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		confirmPwdLabel.setBounds(404, 303, 196, 13);
		contentPane.add(confirmPwdLabel);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setText("password");
		passwordField_1.setForeground(new Color(182, 186, 197));
		passwordField_1.setBorder(null);
		passwordField_1.setBackground(new Color(35, 45, 65));
		passwordField_1.setBounds(404, 337, 341, 19);
		contentPane.add(passwordField_1);
		
		JButton registerButton = new JButton("Register");
		registerButton.setForeground(new Color(35, 45, 65));
		registerButton.setFont(new Font("Dialog", Font.BOLD, 13));
		registerButton.setFocusPainted(false);
		registerButton.setBorder(null);
		registerButton.setBackground(new Color(95, 210, 195));
		registerButton.setBounds(404, 420, 127, 41);
		contentPane.add(registerButton);
		
		JLabel goBack = new JLabel("");
		goBack.setVerticalAlignment(SwingConstants.BOTTOM);
		goBack.setBounds(750, 438, 24, 16);
		contentPane.add(goBack);
		Admin admin_class = new Admin();
	}
}
