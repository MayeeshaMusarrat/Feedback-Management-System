package studentPackage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

import LoginRegisterPackage.*;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class StudentForm extends JFrame 
{

	JFrame studentFrame;
	private JPanel contentPane;
	private JPanel studentGiveFeedbackPanel1;
	public static String name,id,level,batch,phone,mail;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public StudentForm() {
		setRootPaneCheckingEnabled(false);
		setResizable(false);
		setTitle("Student Module");
		studentFrame = new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1098, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//studentFrame.setUndecorated(true);
		
				
		
		/// =============================================== SIDE DECOR PANELS ============================================================================//
		
		
		JPanel studentSideDecorPanel = new JPanel();
		studentSideDecorPanel.setBackground(new Color(35, 45, 65));
		studentSideDecorPanel.setBounds(0, 0, 353, 626);
		studentSideDecorPanel.setBorder(null);
		contentPane.add(studentSideDecorPanel);
		
		JTabbedPane studentDashboardPane = new JTabbedPane(JTabbedPane.TOP);
		studentDashboardPane.setBorder(null);
		studentDashboardPane.setBounds(352, -70, 761, 707);
		contentPane.add(studentDashboardPane);
		
		JButton studentLogoutButton = new JButton("Logout");
		studentLogoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				studentLogoutButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				studentLogoutButton.setBackground(new Color(35,45,65));
			}
		});
		studentLogoutButton.setForeground(new Color(206, 209, 217));
		studentLogoutButton.setBackground(new Color(35, 45, 65));
		studentLogoutButton.setBorder(null);
		studentLogoutButton.setFocusPainted(false);
		studentLogoutButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		studentLogoutButton.setBounds(0, 532, 353, 44);
		studentLogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int result = JOptionPane.showConfirmDialog(null,"Confirm Logout?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION)
				{
					LoginForm window = new LoginForm();
					window.Loginregister.setVisible(true);
					dispose();
				}
			}
		});
		studentSideDecorPanel.setLayout(null);
		studentSideDecorPanel.add(studentLogoutButton);
		
		
		JButton studentGiveFeedbackButton = new JButton("Give Feedback");
		studentGiveFeedbackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentDashboardPane.setSelectedIndex(1);
			}
		});
		studentGiveFeedbackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				studentGiveFeedbackButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				studentGiveFeedbackButton.setBackground(new Color(35,45,65));
			}
		});
		studentGiveFeedbackButton.setForeground(new Color(206, 209, 217));
		studentGiveFeedbackButton.setBackground(new Color(35, 45, 65));
		studentGiveFeedbackButton.setBorder(null);
		studentGiveFeedbackButton.setFocusPainted(false);
		studentGiveFeedbackButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		studentGiveFeedbackButton.setBounds(0, 278, 353, 44);
		studentSideDecorPanel.add(studentGiveFeedbackButton);
		
		JButton studentViewStatusButton = new JButton("View Feedback Status");
		studentViewStatusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentDashboardPane.setSelectedIndex(2);
			}
		});
		studentViewStatusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				studentViewStatusButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				studentViewStatusButton.setBackground(new Color(35,45,65));
			}
		});
		studentViewStatusButton.setForeground(new Color(206, 209, 217));
		studentViewStatusButton.setBackground(new Color(35, 45, 65));
		studentViewStatusButton.setBorder(null);
		studentViewStatusButton.setFocusPainted(false);
		studentViewStatusButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		studentViewStatusButton.setBounds(0, 319, 353, 44);
		studentSideDecorPanel.add(studentViewStatusButton);
		
		JLabel studentDashboardLabel = new JLabel("D A S H B O A R D");
		studentDashboardLabel.setForeground(new Color(206, 209, 217));
		studentDashboardLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		studentDashboardLabel.setBounds(82, 74, 178, 19);
		studentSideDecorPanel.add(studentDashboardLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(206, 209, 217));
		separator.setBounds(32, 130, 279, 2);
		studentSideDecorPanel.add(separator);
		
		JButton studentProfileButton = new JButton("Profile");
		studentProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentDashboardPane.setSelectedIndex(0);
			}
		});
		studentProfileButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				studentProfileButton.setBackground(new Color(53,68,98));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				studentProfileButton.setBackground(new Color(35,45,65));
			}
		});
		studentProfileButton.setForeground(new Color(206, 209, 217));
		studentProfileButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		studentProfileButton.setFocusPainted(false);
		studentProfileButton.setBorder(null);
		studentProfileButton.setBackground(new Color(35, 45, 65));
		studentProfileButton.setBounds(0, 237, 353, 44);
		studentSideDecorPanel.add(studentProfileButton);
		Image userImg = new ImageIcon(this.getClass().getResource("/userIcon.png")).getImage();
		
		/// ============================================ STUDENT PROFILE PANEL STARTS =========================================================== ///
		
		JPanel studentProfilePanel = new JPanel();
		studentProfilePanel.setLayout(null);
		studentProfilePanel.setBorder(null);
		studentProfilePanel.setBackground(Color.WHITE);
		studentDashboardPane.addTab("New tab", null, studentProfilePanel, null);
		
		JPanel studentWelcomePanel = new JPanel();
		studentWelcomePanel.setLayout(null);
		studentWelcomePanel.setBorder(null);
		studentWelcomePanel.setBackground(new Color(51, 181, 165));
		studentWelcomePanel.setBounds(0, 103, 768, 141);
		studentProfilePanel.add(studentWelcomePanel);
		
		JLabel studentWelcomeLabel = new JLabel("Welcome to Student Module");
		studentWelcomeLabel.setForeground(new Color(255, 255, 255));
		studentWelcomeLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentWelcomeLabel.setBounds(24, 37, 273, 23);
		studentWelcomePanel.add(studentWelcomeLabel);
		
		JLabel studentNameLabel = new JLabel("Name:");
		studentNameLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentNameLabel.setBounds(89, 308, 85, 19);
		studentProfilePanel.add(studentNameLabel);
		
		JLabel studentNameShowLabel = new JLabel(name);
		studentNameShowLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		studentNameShowLabel.setBounds(148, 300, 327, 32);
		studentProfilePanel.add(studentNameShowLabel);
		
		JLabel studentIDLabel = new JLabel("Student ID:");
		studentIDLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentIDLabel.setBounds(89, 354, 85, 19);
		studentProfilePanel.add(studentIDLabel);
		
		JLabel studentLevelShowLabel = new JLabel(level);
		studentLevelShowLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		studentLevelShowLabel.setBounds(143, 383, 183, 46);
		studentProfilePanel.add(studentLevelShowLabel);
		
		JLabel studentLevelLabel = new JLabel("Level: ");
		studentLevelLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentLevelLabel.setBounds(89, 398, 183, 19);
		studentProfilePanel.add(studentLevelLabel);
		
		JLabel studentBatchLabel = new JLabel("Batch:");
		studentBatchLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentBatchLabel.setBounds(89, 445, 93, 19);
		studentProfilePanel.add(studentBatchLabel);
		
		JLabel studentPhoneLabel = new JLabel("Phone Number:");
		studentPhoneLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentPhoneLabel.setBounds(89, 545, 140, 19);
		studentProfilePanel.add(studentPhoneLabel);
		
		JLabel userIcon = new JLabel("");
		userIcon.setBounds(434, 342, 158, 188);
		studentProfilePanel.add(userIcon);
		userIcon.setIcon(new ImageIcon(userImg));
		
		JLabel lblNewLabel_2 = new JLabel("MIST CSE Feedback System");
		lblNewLabel_2.setForeground(new Color(163, 163, 163));
		lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(25, 63, 192, 23);
		studentProfilePanel.add(lblNewLabel_2);
		
		JLabel studentIDShowLabel = new JLabel(id);
		studentIDShowLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		studentIDShowLabel.setBounds(184, 351, 327, 24);
		studentProfilePanel.add(studentIDShowLabel);
		
		JLabel studentMailLabel = new JLabel("Email Address:");
		studentMailLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentMailLabel.setBounds(89, 491, 140, 19);
		studentProfilePanel.add(studentMailLabel);
		
		JLabel studentBatchShowLabel = new JLabel(batch);
		studentBatchShowLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		studentBatchShowLabel.setBounds(148, 427, 327, 54);
		studentProfilePanel.add(studentBatchShowLabel);
		
		JLabel studentEmailShowLabel = new JLabel(mail);
		studentEmailShowLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		studentEmailShowLabel.setBounds(209, 483, 337, 32);
		studentProfilePanel.add(studentEmailShowLabel);
		
		JLabel studentPhoneShowLabel = new JLabel(phone);
		studentPhoneShowLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		studentPhoneShowLabel.setBounds(219, 542, 327, 24);
		studentProfilePanel.add(studentPhoneShowLabel);
		
		JPanel studentGiveFeedbackPanel = new JPanel();
		studentGiveFeedbackPanel.setLayout(null);
		studentGiveFeedbackPanel.setBorder(null);
		studentGiveFeedbackPanel.setBackground(Color.WHITE);
		studentDashboardPane.addTab("New tab", null, studentGiveFeedbackPanel, null);
		
		JLabel lblNewLabel = new JLabel("Select category:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setBounds(93, 89, 131, 33);
		studentGiveFeedbackPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Sub-category:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(93, 157, 145, 33);
		studentGiveFeedbackPanel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 181, 165));
		btnNewButton.setBounds(293, 586, 164, 38);
		studentGiveFeedbackPanel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(340, 94, 312, 23);
		studentGiveFeedbackPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(340, 162, 312, 23);
		studentGiveFeedbackPanel.add(comboBox_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Subject Matter:");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(93, 356, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setText("e.g. Circuit board is broken");
		textField.setFont(new Font("Dialog", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(340, 356, 312, 23);
		studentGiveFeedbackPanel.add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Description (Optional):");
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(93, 415, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBounds(87, 451, 565, 98);
		studentGiveFeedbackPanel.add(textArea);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Location: ");
		lblNewLabel_3_1_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1_2.setBounds(93, 293, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(340, 294, 312, 23);
		studentGiveFeedbackPanel.add(textField_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Severity of the Issue:");
		lblNewLabel_3_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1_2_1.setBounds(93, 232, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setBounds(340, 231, 312, 23);
		studentGiveFeedbackPanel.add(comboBox_1_1);
		
		JPanel studentViewFeebackPanel = new JPanel();
		studentViewFeebackPanel.setBackground(new Color(255, 255, 255));
		studentDashboardPane.addTab("New tab", null, studentViewFeebackPanel, null);
		
		
 }
}
