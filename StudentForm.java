import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

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
	private JTextField txtEgCircuitBoard;
	private JTextField textField;

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
		String studentName="mai";
				
		
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
				JOptionPane.showMessageDialog(null,"Confirm Logout?");
				LoginForm window = new LoginForm();
				window.Loginregister.setVisible(true);
				dispose();
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
		
		JLabel studentWelcomeLabel = new JLabel("Welcome");
		studentWelcomeLabel.setForeground(new Color(228, 228, 228));
		studentWelcomeLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		studentWelcomeLabel.setBounds(25, 37, 113, 23);
		studentWelcomePanel.add(studentWelcomeLabel);
		
		JLabel studentNameLabel = new JLabel("Name:");
		studentNameLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentNameLabel.setBounds(89, 308, 85, 19);
		studentProfilePanel.add(studentNameLabel);
		
		JLabel studentNameShowLabel = new JLabel("");
		studentNameShowLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		studentNameShowLabel.setBounds(156, 312, 63, 13);
		studentProfilePanel.add(studentNameShowLabel);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Dialog", Font.BOLD, 16));
		lblStudentId.setBounds(89, 354, 85, 19);
		studentProfilePanel.add(lblStudentId);
		
		JLabel studentNameShowLabel_1 = new JLabel("");
		studentNameShowLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		studentNameShowLabel_1.setBounds(184, 359, 63, 13);
		studentProfilePanel.add(studentNameShowLabel_1);
		
		JLabel lblLevel = new JLabel("Level: ");
		lblLevel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblLevel.setBounds(89, 398, 183, 19);
		studentProfilePanel.add(lblLevel);
		
		JLabel lblEmail = new JLabel("Batch:");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(89, 445, 93, 19);
		studentProfilePanel.add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPhoneNumber.setBounds(89, 493, 140, 19);
		studentProfilePanel.add(lblPhoneNumber);
		
		JLabel lblPhoneNumber_1 = new JLabel("");
		lblPhoneNumber_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPhoneNumber_1.setBounds(89, 510, 119, 19);
		studentProfilePanel.add(lblPhoneNumber_1);
		
		JLabel userIcon = new JLabel("");
		userIcon.setBounds(456, 312, 158, 188);
		studentProfilePanel.add(userIcon);
		userIcon.setIcon(new ImageIcon(userImg));
		
		/// ========================================== STUDENT GIVE FEEDBACK PANEL ============================================================/// 
		
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
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 181, 165));
		btnNewButton.setBounds(293, 586, 164, 38);
		studentGiveFeedbackPanel.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(340, 94, 312, 23);
		studentGiveFeedbackPanel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"- Category - ", "Technical", "Furniture and Fittings", "Network", "Others"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(340, 162, 312, 23);
		studentGiveFeedbackPanel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"- Sub-category -"}));

		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(comboBox.getSelectedItem().toString().equals("Technical"))
				{
					String[] test_1 = {"- Sub-category -","Light","Fan","Switch","Circuit Board","Multiplug","Projector","Keyboard","Power cord","Interactive Whiteboard","Miscellaneous"};
			        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(test_1);
			        comboBox_1.setModel(defaultComboBoxModel);
				}
				else if(comboBox.getSelectedItem().toString().equals("Furniture and Fittings"))
				{
					String[] test_1 = {"- Sub-category -","Tables","Chairs","Doors","Windows","Podium"};
			        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(test_1);
			        comboBox_1.setModel(defaultComboBoxModel);
				}
				else if(comboBox.getSelectedItem().toString().equals("Network"))
				{
					String[] test_1 = {"- Sub-category -","Wi-fi","Broadband"};
			        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(test_1);
			        comboBox_1.setModel(defaultComboBoxModel);
				}
			}
		});
		
		JLabel lblNewLabel_3_1 = new JLabel("Subject Matter:");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(93, 356, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1);
		
		txtEgCircuitBoard = new JTextField();
		txtEgCircuitBoard.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtEgCircuitBoard.setText("e.g. Circuit board is broken");
		txtEgCircuitBoard.setColumns(10);
		txtEgCircuitBoard.setBounds(340, 356, 312, 23);
		studentGiveFeedbackPanel.add(txtEgCircuitBoard);
		
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
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(340, 294, 312, 23);
		studentGiveFeedbackPanel.add(textField);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Severity of the Issue:");
		lblNewLabel_3_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3_1_2_1.setBounds(93, 232, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"- Severity -", "Trivial", "Moderate", "Urgent"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setBounds(340, 231, 312, 23);
		studentGiveFeedbackPanel.add(comboBox_1_1);
		
		/// =============================================== STUDENT VIEW STATUS PANEL =================================================================== ///
		
		JPanel studentViewStatusPanel = new JPanel();
		studentViewStatusPanel.setBackground(new Color(255, 255, 255));
		studentDashboardPane.addTab("New tab", null, studentViewStatusPanel, null);
		studentViewStatusPanel.setLayout(null);
		
		
 }
}
