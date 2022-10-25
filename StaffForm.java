package staffPackage;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LoginRegisterPackage.LoginForm;
import studentPackage.Student;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class StaffForm extends JFrame {

	private JPanel contentPane;
	private JTextField studentFirstNameTextfield;
	private JTextField studentLastNameTextfield;
	private JTextField studentIDTextfield;
	private JTextField studentLevelTextfield;
	private JTextField studentPhoneTextfield;
	private JTextField studentPwdTextfield;
	private JTextField studentEmailTextfield;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField studentBatchTextfield;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the frame.
	 */
	public StaffForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1098, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel staffSideDecorPanel = new JPanel();
		staffSideDecorPanel.setLayout(null);
		staffSideDecorPanel.setBorder(null);
		staffSideDecorPanel.setBackground(new Color(35, 45, 65));
		staffSideDecorPanel.setBounds(0, 0, 353, 626);
		contentPane.add(staffSideDecorPanel);
		
		JTabbedPane staffDashboardPane = new JTabbedPane(JTabbedPane.TOP);
		staffDashboardPane.setBounds(350, -29, 766, 683);
		contentPane.add(staffDashboardPane);
		
		JPanel staffProfilePanel = new JPanel();
		staffProfilePanel.setBackground(new Color(255, 255, 255));
		staffDashboardPane.addTab("New tab", null, staffProfilePanel, null);
		staffProfilePanel.setLayout(null);
		
		JPanel AddDelStudentPanel = new JPanel();
		AddDelStudentPanel.setForeground(new Color(0, 0, 0));
		AddDelStudentPanel.setBackground(new Color(255, 255, 255));
		staffDashboardPane.addTab("New tab", null, AddDelStudentPanel, null);
		AddDelStudentPanel.setLayout(null);
		
		studentFirstNameTextfield = new JTextField();
		studentFirstNameTextfield.setColumns(10);
		studentFirstNameTextfield.setBounds(40, 170, 312, 19);
		AddDelStudentPanel.add(studentFirstNameTextfield);
		
		studentLastNameTextfield = new JTextField();
		studentLastNameTextfield.setColumns(10);
		studentLastNameTextfield.setBounds(383, 170, 312, 19);
		AddDelStudentPanel.add(studentLastNameTextfield);
		
		studentIDTextfield = new JTextField();
		studentIDTextfield.setColumns(10);
		studentIDTextfield.setBounds(40, 274, 312, 19);
		AddDelStudentPanel.add(studentIDTextfield);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 147, 100, 13);
		AddDelStudentPanel.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name ");
		lblLastName.setForeground(new Color(128, 128, 128));
		lblLastName.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblLastName.setBounds(383, 199, 100, 13);
		AddDelStudentPanel.add(lblLastName);
		
		JLabel lblStudentId_1 = new JLabel("STUDENT ID");
		lblStudentId_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblStudentId_1.setBounds(40, 251, 100, 13);
		AddDelStudentPanel.add(lblStudentId_1);
		
		JLabel lblLevel = new JLabel("BATCH");
		lblLevel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLevel.setBounds(40, 354, 72, 13);
		AddDelStudentPanel.add(lblLevel);
		
		studentLevelTextfield = new JTextField();
		studentLevelTextfield.setColumns(10);
		studentLevelTextfield.setBounds(383, 375, 312, 19);
		AddDelStudentPanel.add(studentLevelTextfield);
		
		studentPhoneTextfield = new JTextField();
		studentPhoneTextfield.setColumns(10);
		studentPhoneTextfield.setBounds(383, 459, 312, 19);
		AddDelStudentPanel.add(studentPhoneTextfield);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String firstname=studentFirstNameTextfield.getText();
				String lastname=studentLastNameTextfield.getText();
				String ID=studentIDTextfield.getText();
				String level=studentLevelTextfield.getText();
				String number=studentPhoneTextfield.getText();
				String pwd=studentPwdTextfield.getText();
				String mail = studentEmailTextfield.getText();
				String batch = studentBatchTextfield.getText();
				Staff st = new Staff();
				try 
				{
					st.Add_student(ID,pwd,firstname,lastname,number,level,mail,batch);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 181, 165));
		btnNewButton.setBounds(173, 535, 174, 38);
		AddDelStudentPanel.add(btnNewButton);
		
		JLabel Password = new JLabel("STUDENT PASSWORD");
		Password.setFont(new Font("Dialog", Font.BOLD, 12));
		Password.setBounds(383, 251, 174, 13);
		AddDelStudentPanel.add(Password);
		
		studentPwdTextfield = new JTextField();
		studentPwdTextfield.setColumns(10);
		studentPwdTextfield.setBounds(383, 274, 312, 19);
		AddDelStudentPanel.add(studentPwdTextfield);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 181, 165));
		panel.setBounds(0, 0, 751, 103);
		AddDelStudentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Kindly fill up the form with necessary information");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(40, 48, 397, 20);
		panel.add(lblNewLabel_1);
		
		studentEmailTextfield = new JTextField();
		studentEmailTextfield.setColumns(10);
		studentEmailTextfield.setBounds(40, 459, 312, 19);
		AddDelStudentPanel.add(studentEmailTextfield);
		
		JLabel lblFirstName = new JLabel("First Name ");
		lblFirstName.setForeground(new Color(128, 128, 128));
		lblFirstName.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFirstName.setBounds(40, 199, 100, 13);
		AddDelStudentPanel.add(lblFirstName);
		
		JLabel lblLevel_2 = new JLabel("LEVEL");
		lblLevel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLevel_2.setBounds(383, 354, 72, 13);
		AddDelStudentPanel.add(lblLevel_2);
		
		JLabel lblPhoneNumber = new JLabel("EMAIL ADDRESS");
		lblPhoneNumber.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPhoneNumber.setBounds(40, 436, 139, 13);
		AddDelStudentPanel.add(lblPhoneNumber);
		
		JLabel lblPhoneNumber_2 = new JLabel("PHONE NUMBER");
		lblPhoneNumber_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPhoneNumber_2.setBounds(384, 436, 139, 13);
		AddDelStudentPanel.add(lblPhoneNumber_2);
		
		JLabel lblMustBeAt = new JLabel("Must be at least 8 characters");
		lblMustBeAt.setForeground(Color.GRAY);
		lblMustBeAt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMustBeAt.setBounds(383, 303, 190, 13);
		AddDelStudentPanel.add(lblMustBeAt);
		
		studentBatchTextfield = new JTextField();
		studentBatchTextfield.setColumns(10);
		studentBatchTextfield.setBounds(40, 375, 312, 19);
		AddDelStudentPanel.add(studentBatchTextfield);
		
		JButton btnClearForm = new JButton("Clear Form");
		btnClearForm.setForeground(Color.WHITE);
		btnClearForm.setFont(new Font("Dialog", Font.BOLD, 15));
		btnClearForm.setFocusPainted(false);
		btnClearForm.setBorder(null);
		btnClearForm.setBackground(new Color(51, 181, 165));
		btnClearForm.setBounds(383, 535, 174, 38);
		AddDelStudentPanel.add(btnClearForm);
		
		JPanel staffGiveFeedbackPanel = new JPanel();
		staffGiveFeedbackPanel.setBackground(new Color(255, 255, 255));
		staffDashboardPane.addTab("New tab", null, staffGiveFeedbackPanel, null);
		staffGiveFeedbackPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Select category:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(97, 61, 131, 33);
		staffGiveFeedbackPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Select Sub-category:");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(97, 129, 145, 33);
		staffGiveFeedbackPanel.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(51, 181, 165));
		btnNewButton_1.setBounds(297, 558, 164, 38);
		staffGiveFeedbackPanel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(344, 66, 312, 23);
		staffGiveFeedbackPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(344, 134, 312, 23);
		staffGiveFeedbackPanel.add(comboBox_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Subject Matter:");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(97, 328, 145, 20);
		staffGiveFeedbackPanel.add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setText("e.g. Circuit board is broken");
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(344, 328, 312, 23);
		staffGiveFeedbackPanel.add(textField_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Description (Optional):");
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(97, 387, 145, 20);
		staffGiveFeedbackPanel.add(lblNewLabel_3_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBounds(91, 423, 565, 98);
		staffGiveFeedbackPanel.add(textArea);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Location: ");
		lblNewLabel_3_1_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1_2.setBounds(97, 265, 145, 20);
		staffGiveFeedbackPanel.add(lblNewLabel_3_1_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(344, 266, 312, 23);
		staffGiveFeedbackPanel.add(textField_4);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Severity of the Issue:");
		lblNewLabel_3_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1_2_1.setBounds(97, 204, 145, 20);
		staffGiveFeedbackPanel.add(lblNewLabel_3_1_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setBounds(344, 203, 312, 23);
		staffGiveFeedbackPanel.add(comboBox_1_1);
		
		JPanel staffViewFeedbackPanel = new JPanel();
		staffDashboardPane.addTab("New tab", null, staffViewFeedbackPanel, null);
		
		JButton adminLogoutButton = new JButton("Logout");
		adminLogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Confirm Logout?");
				LoginForm window = new LoginForm();
				window.Loginregister.setVisible(true);
				dispose();
			}
		});
		adminLogoutButton.setForeground(new Color(206, 209, 217));
		adminLogoutButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminLogoutButton.setFocusPainted(false);
		adminLogoutButton.setBorder(null);
		adminLogoutButton.setBackground(new Color(35, 45, 65));
		adminLogoutButton.setBounds(0, 532, 353, 44);
		staffSideDecorPanel.add(adminLogoutButton);
		
		JButton btnAdddeleteStudent = new JButton("Add/Delete Student");
		btnAdddeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDashboardPane.setSelectedIndex(1);
			}
		});
		btnAdddeleteStudent.setForeground(new Color(206, 209, 217));
		btnAdddeleteStudent.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdddeleteStudent.setFocusPainted(false);
		btnAdddeleteStudent.setBorder(null);
		btnAdddeleteStudent.setBackground(new Color(35, 45, 65));
		btnAdddeleteStudent.setBounds(0, 219, 353, 44);
		staffSideDecorPanel.add(btnAdddeleteStudent);
		
		JButton btnGiveFeedback = new JButton("Give Feedback");
		btnGiveFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDashboardPane.setSelectedIndex(2);
			}
		});
		btnGiveFeedback.setForeground(new Color(206, 209, 217));
		btnGiveFeedback.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnGiveFeedback.setFocusPainted(false);
		btnGiveFeedback.setBorder(null);
		btnGiveFeedback.setBackground(new Color(35, 45, 65));
		btnGiveFeedback.setBounds(0, 273, 353, 44);
		staffSideDecorPanel.add(btnGiveFeedback);
		
		JLabel adminDashboardLabel = new JLabel("D A S H B O A R D");
		adminDashboardLabel.setForeground(new Color(206, 209, 217));
		adminDashboardLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		adminDashboardLabel.setBounds(82, 74, 178, 19);
		staffSideDecorPanel.add(adminDashboardLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(206, 209, 217));
		separator.setBounds(32, 130, 279, 2);
		staffSideDecorPanel.add(separator);
		
		JButton adminProfileButton = new JButton("Profile");
		adminProfileButton.setForeground(new Color(206, 209, 217));
		adminProfileButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminProfileButton.setFocusPainted(false);
		adminProfileButton.setBorder(null);
		adminProfileButton.setBackground(new Color(35, 45, 65));
		adminProfileButton.setBounds(0, 176, 353, 44);
		staffSideDecorPanel.add(adminProfileButton);
		
		JButton btnViewFeedbackStatus = new JButton("View Feedback Status");
		btnViewFeedbackStatus.setForeground(new Color(206, 209, 217));
		btnViewFeedbackStatus.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnViewFeedbackStatus.setFocusPainted(false);
		btnViewFeedbackStatus.setBorder(null);
		btnViewFeedbackStatus.setBackground(new Color(35, 45, 65));
		btnViewFeedbackStatus.setBounds(0, 327, 353, 44);
		staffSideDecorPanel.add(btnViewFeedbackStatus);
		
	
	}
}
