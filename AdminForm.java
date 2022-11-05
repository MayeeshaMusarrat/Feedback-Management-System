package adminPackage;
import javax.swing.JFrame;
import javax.swing.JPanel;

import LoginRegisterPackage.LoginForm;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AdminForm extends JFrame {

	private JPanel contentPane;
	JFrame adminFrame;
	public static String ID;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
		adminSideDecorPanel.setBounds(0, 0, 351, 626);
		getContentPane().add(adminSideDecorPanel);
		
		JTabbedPane adminPane = new JTabbedPane(JTabbedPane.TOP);
		adminPane.setBounds(350, -30, 766, 667);
		getContentPane().add(adminPane);
		Image adminImg = new ImageIcon(this.getClass().getResource("/adminIcon.png")).getImage();
		
		JPanel adminProfilePanel = new JPanel();
		adminProfilePanel.setBackground(new Color(255, 255, 255));
		adminPane.addTab("New tab", null, adminProfilePanel, null);
		adminProfilePanel.setLayout(null);
		
		JPanel studentWelcomePanel_1 = new JPanel();
		studentWelcomePanel_1.setLayout(null);
		studentWelcomePanel_1.setBorder(null);
		studentWelcomePanel_1.setBackground(new Color(51, 181, 165));
		studentWelcomePanel_1.setBounds(0, 55, 768, 141);
		adminProfilePanel.add(studentWelcomePanel_1);
		
		JLabel lblWelcomeToAdmin = new JLabel("Welcome to Admin Module");
		lblWelcomeToAdmin.setForeground(Color.WHITE);
		lblWelcomeToAdmin.setFont(new Font("Dialog", Font.BOLD, 16));
		lblWelcomeToAdmin.setBounds(24, 37, 273, 23);
		studentWelcomePanel_1.add(lblWelcomeToAdmin);
		
		JLabel lblId = new JLabel("ID "+ID);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Dialog", Font.BOLD, 16));
		lblId.setBounds(24, 80, 273, 23);
		studentWelcomePanel_1.add(lblId);
		
		JLabel lblNewLabel_2 = new JLabel("MIST CSE Feedback System");
		lblNewLabel_2.setForeground(new Color(163, 163, 163));
		lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(24, 22, 192, 23);
		adminProfilePanel.add(lblNewLabel_2);
		
		JLabel adminIcon = new JLabel("");
		adminIcon.setBounds(213, 254, 317, 301);
		adminProfilePanel.add(adminIcon);
		adminIcon.setIcon(new ImageIcon("C:\\Users\\MAYESHA\\Downloads\\adminIcon.png"));
		
		JPanel adminAddDelStaffPanel = new JPanel();
		adminAddDelStaffPanel.setLayout(null);
		adminAddDelStaffPanel.setBackground(Color.WHITE);
		adminPane.addTab("New tab", null, adminAddDelStaffPanel, null);
		
		JPanel studentWelcomePanel = new JPanel();
		studentWelcomePanel.setLayout(null);
		studentWelcomePanel.setBorder(null);
		studentWelcomePanel.setBackground(new Color(51, 181, 165));
		studentWelcomePanel.setBounds(0, 0, 751, 103);
		adminAddDelStaffPanel.add(studentWelcomePanel);
		
		JLabel lblAddStaffsBy = new JLabel("Add staffs by filling up necessary information");
		lblAddStaffsBy.setForeground(Color.WHITE);
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
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(383, 406, 312, 19);
		adminAddDelStaffPanel.add(textField_3);
		
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
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(383, 304, 312, 19);
		adminAddDelStaffPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(383, 200, 312, 19);
		adminAddDelStaffPanel.add(textField_5);
		
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
		adminAddressFeedbackPanel.setLayout(null);
		adminAddressFeedbackPanel.setBackground(Color.WHITE);
		adminPane.addTab("New tab", null, adminAddressFeedbackPanel, null);
		
		JPanel panel = new JPanel();
		panel.setBounds(71, 165, 184, 142);
		adminAddressFeedbackPanel.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(390, 165, 184, 142);
		adminAddressFeedbackPanel.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(238, 371, 184, 142);
		adminAddressFeedbackPanel.add(panel_1_1);
		
		JPanel adminAddOptionPanel = new JPanel();
		adminPane.addTab("New tab", null, adminAddOptionPanel, null);
		
		
		JButton adminLogoutButton = new JButton("Logout");
		adminLogoutButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"Confirm Logout?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION)
				{
					LoginForm window = new LoginForm();
					window.Loginregister.setVisible(true);
					dispose();
				}
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
		
		JButton adminProfileButton = new JButton("Profile");
		adminProfileButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminProfileButton.setBackground(new Color(53,68,98));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				adminProfileButton.setBackground(new Color(35,45,65));
			}
		});
		adminProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPane.setSelectedIndex(0);
			}
		});
		adminProfileButton.setForeground(new Color(206, 209, 217));
		adminProfileButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminProfileButton.setFocusPainted(false);
		adminProfileButton.setBorder(null);
		adminProfileButton.setBackground(new Color(35, 45, 65));
		adminProfileButton.setBounds(0, 176, 353, 44);
		adminSideDecorPanel.add(adminProfileButton);
		
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
		adminLogoutButton.setForeground(new Color(206, 209, 217));
		adminLogoutButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminLogoutButton.setFocusPainted(false);
		adminLogoutButton.setBorder(null);
		adminLogoutButton.setBackground(new Color(35, 45, 65));
		adminLogoutButton.setBounds(0, 532, 353, 44);
		adminSideDecorPanel.add(adminLogoutButton);
		
		JButton adminAddressFeedback = new JButton("Address Feedbacks");
		adminAddressFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPane.setSelectedIndex(3);
			}
		});
		adminAddressFeedback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminAddressFeedback.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				adminAddressFeedback.setBackground(new Color(35,45,65));
			}
		});
		adminAddressFeedback.setForeground(new Color(206, 209, 217));
		adminAddressFeedback.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminAddressFeedback.setFocusPainted(false);
		adminAddressFeedback.setBorder(null);
		adminAddressFeedback.setBackground(new Color(35, 45, 65));
		adminAddressFeedback.setBounds(0, 304, 353, 44);
		adminSideDecorPanel.add(adminAddressFeedback);
		
		JLabel adminDashboardLabel = new JLabel("D A S H B O A R D");
		adminDashboardLabel.setForeground(new Color(206, 209, 217));
		adminDashboardLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		adminDashboardLabel.setBounds(82, 74, 178, 19);
		adminSideDecorPanel.add(adminDashboardLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(206, 209, 217));
		separator.setBounds(32, 130, 279, 2);
		adminSideDecorPanel.add(separator);
		
		JButton adminViewStudentButton = new JButton("View Student");
		adminViewStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPane.setSelectedIndex(2);
			}
		});
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
		adminViewStudentButton.setBounds(0, 262, 353, 44);
		adminSideDecorPanel.add(adminViewStudentButton);
		
		JButton adminAddFeedbackButton = new JButton("Add Feedback Options");
		adminAddFeedbackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPane.setSelectedIndex(4);
			}
		});
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
		adminAddFeedbackButton.setBounds(0, 348, 353, 44);
		adminSideDecorPanel.add(adminAddFeedbackButton);
		
	}
}
