package adminPackage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LoginRegisterPackage.LoginForm;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class AdminForm extends JFrame {

	private JPanel contentPane;
	JFrame adminFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Create the frame.
	 */
	public AdminForm() 
	{
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1098, 663);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		
		JPanel adminSideDecorPanel = new JPanel();
		adminSideDecorPanel.setLayout(null);
		adminSideDecorPanel.setBorder(null);
		adminSideDecorPanel.setBackground(new Color(35, 45, 65));
		adminSideDecorPanel.setBounds(0, 0, 353, 626);
		getContentPane().add(adminSideDecorPanel);
		
		JTabbedPane adminPane = new JTabbedPane(JTabbedPane.TOP);
		adminPane.setBounds(350, -30, 766, 667);
		getContentPane().add(adminPane);
		
		JPanel adminProfilePanel = new JPanel();
		adminPane.addTab("New tab", null, adminProfilePanel, null);
		adminProfilePanel.setLayout(null);
		
		JPanel adminAddDelStaffPanel = new JPanel();
		adminAddDelStaffPanel.setBackground(new Color(255, 255, 255));
		adminPane.addTab("New tab", null, adminAddDelStaffPanel, null);
		adminAddDelStaffPanel.setLayout(null);
		
		JPanel studentWelcomePanel = new JPanel();
		studentWelcomePanel.setLayout(null);
		studentWelcomePanel.setBorder(null);
		studentWelcomePanel.setBackground(new Color(51, 181, 165));
		studentWelcomePanel.setBounds(0, 0, 751, 103);
		adminAddDelStaffPanel.add(studentWelcomePanel);
		
		JLabel lblAddStaffsBy = new JLabel("Add staffs by filling up necessary information");
		lblAddStaffsBy.setForeground(new Color(255, 255, 255));
		lblAddStaffsBy.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAddStaffsBy.setBounds(25, 42, 321, 23);
		studentWelcomePanel.add(lblAddStaffsBy);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(40, 200, 312, 19);
		adminAddDelStaffPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(40, 406, 312, 19);
		adminAddDelStaffPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(40, 304, 312, 19);
		adminAddDelStaffPanel.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 177, 100, 13);
		adminAddDelStaffPanel.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name ");
		lblLastName.setForeground(Color.GRAY);
		lblLastName.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblLastName.setBounds(383, 229, 100, 13);
		adminAddDelStaffPanel.add(lblLastName);
		
		JLabel lblStudentId_1 = new JLabel("STAFF ID");
		lblStudentId_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblStudentId_1.setBounds(40, 281, 100, 13);
		adminAddDelStaffPanel.add(lblStudentId_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(383, 406, 312, 19);
		adminAddDelStaffPanel.add(textField_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 181, 165));
		btnNewButton.setBounds(178, 499, 174, 38);
		adminAddDelStaffPanel.add(btnNewButton);
		
		JLabel lblStaffPassword = new JLabel("STAFF PASSWORD");
		lblStaffPassword.setFont(new Font("Dialog", Font.BOLD, 12));
		lblStaffPassword.setBounds(383, 281, 174, 13);
		adminAddDelStaffPanel.add(lblStaffPassword);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(383, 304, 312, 19);
		adminAddDelStaffPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(383, 200, 312, 19);
		adminAddDelStaffPanel.add(textField_6);
		
		JLabel lblFirstName = new JLabel("First Name ");
		lblFirstName.setForeground(Color.GRAY);
		lblFirstName.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFirstName.setBounds(40, 229, 100, 13);
		adminAddDelStaffPanel.add(lblFirstName);
		
		JLabel lblPhoneNumber = new JLabel("EMAIL ADDRESS");
		lblPhoneNumber.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPhoneNumber.setBounds(40, 383, 139, 13);
		adminAddDelStaffPanel.add(lblPhoneNumber);
		
		JLabel lblPhoneNumber_2 = new JLabel("PHONE NUMBER");
		lblPhoneNumber_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPhoneNumber_2.setBounds(384, 383, 139, 13);
		adminAddDelStaffPanel.add(lblPhoneNumber_2);
		
		JLabel lblMustBeAt = new JLabel("Must be at least 8 characters");
		lblMustBeAt.setForeground(Color.GRAY);
		lblMustBeAt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMustBeAt.setBounds(383, 333, 190, 13);
		adminAddDelStaffPanel.add(lblMustBeAt);
		
		JButton btnClearForm = new JButton("Clear Form");
		btnClearForm.setForeground(Color.WHITE);
		btnClearForm.setFont(new Font("Dialog", Font.BOLD, 15));
		btnClearForm.setFocusPainted(false);
		btnClearForm.setBorder(null);
		btnClearForm.setBackground(new Color(51, 181, 165));
		btnClearForm.setBounds(383, 499, 174, 38);
		adminAddDelStaffPanel.add(btnClearForm);
		
		JPanel adminViewStudentPanel = new JPanel();
		adminPane.addTab("New tab", null, adminViewStudentPanel, null);
		
		JPanel adminAddressFeedbackPanel = new JPanel();
		adminPane.addTab("New tab", null, adminAddressFeedbackPanel, null);
		
		JPanel adminAddOptionPanel = new JPanel();
		adminPane.addTab("New tab", null, adminAddOptionPanel, null);
		
		
		JButton adminLogoutButton = new JButton("Logout");
		adminLogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Confirm Logout?");
				LoginForm window = new LoginForm();
				window.Loginregister.setVisible(true);
				dispose();
			}
		});
		adminLogoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminLogoutButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				adminLogoutButton.setBackground(new Color(35,45,65));
			}
		});
		adminLogoutButton.setForeground(new Color(206, 209, 217));
		adminLogoutButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminLogoutButton.setFocusPainted(false);
		adminLogoutButton.setBorder(null);
		adminLogoutButton.setBackground(new Color(35, 45, 65));
		adminLogoutButton.setBounds(0, 532, 353, 44);
		adminSideDecorPanel.add(adminLogoutButton);
		
		JButton adminAddDeleteStaffButton = new JButton("Add/Delete Staff");
		adminAddDeleteStaffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPane.setSelectedIndex(1);
			}
		});

		adminAddDeleteStaffButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminAddDeleteStaffButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				adminAddDeleteStaffButton.setBackground(new Color(35,45,65));
			}
		});
		adminAddDeleteStaffButton.setForeground(new Color(206, 209, 217));
		adminAddDeleteStaffButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminAddDeleteStaffButton.setFocusPainted(false);
		adminAddDeleteStaffButton.setBorder(null);
		adminAddDeleteStaffButton.setBackground(new Color(35, 45, 65));
		adminAddDeleteStaffButton.setBounds(0, 219, 353, 44);
		adminSideDecorPanel.add(adminAddDeleteStaffButton);
		
		JButton adminViewFeedback = new JButton("Address Feedbacks");
		adminViewFeedback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminViewFeedback.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				adminViewFeedback.setBackground(new Color(35,45,65));
			}
		});
		adminViewFeedback.setForeground(new Color(206, 209, 217));
		adminViewFeedback.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminViewFeedback.setFocusPainted(false);
		adminViewFeedback.setBorder(null);
		adminViewFeedback.setBackground(new Color(35, 45, 65));
		adminViewFeedback.setBounds(0, 320, 353, 44);
		adminSideDecorPanel.add(adminViewFeedback);
		
		JLabel adminDashboardLabel = new JLabel("D A S H B O A R D");
		adminDashboardLabel.setForeground(new Color(206, 209, 217));
		adminDashboardLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		adminDashboardLabel.setBounds(82, 74, 178, 19);
		adminSideDecorPanel.add(adminDashboardLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(206, 209, 217));
		separator.setBounds(32, 130, 279, 2);
		adminSideDecorPanel.add(separator);
		
		JButton adminProfileButton = new JButton("Profile");
		adminProfileButton.setForeground(new Color(206, 209, 217));
		adminProfileButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminProfileButton.setFocusPainted(false);
		adminProfileButton.setBorder(null);
		adminProfileButton.setBackground(new Color(35, 45, 65));
		adminProfileButton.setBounds(0, 176, 353, 44);
		adminSideDecorPanel.add(adminProfileButton);
		
		JButton adminViewStudentButton = new JButton("View Student");
		adminViewStudentButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminViewStudentButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				adminViewStudentButton.setBackground(new Color(35,45,65));
			}
		});
		adminViewStudentButton.setForeground(new Color(206, 209, 217));
		adminViewStudentButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminViewStudentButton.setFocusPainted(false);
		adminViewStudentButton.setBorder(null);
		adminViewStudentButton.setBackground(new Color(35, 45, 65));
		adminViewStudentButton.setBounds(0, 272, 353, 44);
		adminSideDecorPanel.add(adminViewStudentButton);
		
		JButton adminAddFeedbackButton = new JButton("Add Feedback Options");
		adminAddFeedbackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminAddFeedbackButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				adminAddFeedbackButton.setBackground(new Color(35,45,65));
			}
		});
		adminAddFeedbackButton.setForeground(new Color(206, 209, 217));
		adminAddFeedbackButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminAddFeedbackButton.setFocusPainted(false);
		adminAddFeedbackButton.setBorder(null);
		adminAddFeedbackButton.setBackground(new Color(35, 45, 65));
		adminAddFeedbackButton.setBounds(0, 374, 353, 44);
		adminSideDecorPanel.add(adminAddFeedbackButton);
		
	}
}
