package studentPackage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import LoginRegisterPackage.*;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import javax.swing.JFileChooser;
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
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class StudentForm extends JFrame 
{

	JFrame studentFrame;
	private JPanel contentPane;
	private JPanel studentGiveFeedbackPanel1;
	public static String name,id,level,batch,phone,mail,pwd,fileName;
	private JTextField studentIssueSubjectMatter;
	private JTextField studentIssueLocation;
	private JTextField filePathTextField;
	private JTable studentViewStatusTable;
	public int serial = 1;

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
		contentPane.setBorder(null);
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
		studentPhoneLabel.setBounds(89, 532, 140, 19);
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
		studentPhoneShowLabel.setBounds(219, 527, 327, 24);
		studentProfilePanel.add(studentPhoneShowLabel);
		
		JPanel studentGiveFeedbackPanel = new JPanel();
		studentGiveFeedbackPanel.setLayout(null);
		studentGiveFeedbackPanel.setBorder(null);
		studentGiveFeedbackPanel.setBackground(Color.WHITE);
		studentDashboardPane.addTab("New tab", null, studentGiveFeedbackPanel, null);
		
		JLabel lblNewLabel = new JLabel("Select category:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(37, 176, 131, 33);
		studentGiveFeedbackPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Sub-category:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(37, 219, 145, 33);
		studentGiveFeedbackPanel.add(lblNewLabel_1);
		
		JButton studentSubmitIssueButton = new JButton("Submit");
		
		studentSubmitIssueButton.setForeground(Color.WHITE);
		studentSubmitIssueButton.setFont(new Font("Dialog", Font.BOLD, 15));
		studentSubmitIssueButton.setFocusPainted(false);
		studentSubmitIssueButton.setBorder(null);
		studentSubmitIssueButton.setBackground(new Color(51, 181, 165));
		studentSubmitIssueButton.setBounds(204, 608, 145, 33);
		studentGiveFeedbackPanel.add(studentSubmitIssueButton);

		JComboBox studentIssueSubcategory = new JComboBox();
		studentIssueSubcategory.setFont(new Font("Dialog", Font.PLAIN, 12));
		studentIssueSubcategory.setEditable(true);
		studentIssueSubcategory.setBackground(Color.WHITE);
		studentIssueSubcategory.setBounds(178, 223, 257, 23);
		studentIssueSubcategory.setModel(new DefaultComboBoxModel(new String[] {"- Sub-category -"}));
		studentGiveFeedbackPanel.add(studentIssueSubcategory);
		
		JComboBox studentIssueCategory = new JComboBox();
		studentIssueCategory.setModel(new DefaultComboBoxModel(new String[] {"- Category - ", "Technical", "Furniture and Fittings", "Network", "Others"}));
		studentIssueCategory.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(studentIssueCategory.getSelectedItem().toString().equals("Technical"))
					{
						String[] test_1 = {"- Sub-category -","Light","Fan","AC","Switch","Circuit Board","Multiplug","Projector","Keyboard","Power cord","Interactive Whiteboard","Miscellaneous"};
				        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(test_1);
				        studentIssueSubcategory.setModel(defaultComboBoxModel);
					}
					else if(studentIssueCategory.getSelectedItem().toString().equals("Furniture and Fittings"))
					{
						String[] test_1 = {"- Sub-category -","Tables","Chairs","Doors","Windows","Podium"};
				        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(test_1);
				        studentIssueSubcategory.setModel(defaultComboBoxModel);
					}
					else if(studentIssueCategory.getSelectedItem().toString().equals("Network"))
					{
						String[] test_1 = {"- Sub-category -","Wi-fi","Broadband"};
				        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(test_1);
				        studentIssueSubcategory.setModel(defaultComboBoxModel);
					}
				}
		});
		studentIssueCategory.setFont(new Font("Dialog", Font.PLAIN, 12));
		studentIssueCategory.setEditable(true);
		studentIssueCategory.setBackground(Color.WHITE);
		studentIssueCategory.setBounds(178, 180, 257, 23);
		studentGiveFeedbackPanel.add(studentIssueCategory);
		
		
		JLabel lblNewLabel_3_1 = new JLabel("Subject Matter:");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(37, 352, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1);
		
		studentIssueSubjectMatter = new JTextField();
		studentIssueSubjectMatter.setText("e.g. Circuit board is broken");
		studentIssueSubjectMatter.setFont(new Font("Dialog", Font.PLAIN, 11));
		studentIssueSubjectMatter.setColumns(10);
		studentIssueSubjectMatter.setBounds(178, 351, 257, 23);
		studentGiveFeedbackPanel.add(studentIssueSubjectMatter);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Description (Optional):");
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(37, 434, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1_1);
		
		JTextArea descriptionText = new JTextArea();
		descriptionText.setBorder(new LineBorder(new Color(0, 0, 0)));
		descriptionText.setBounds(37, 464, 656, 124);
		studentGiveFeedbackPanel.add(descriptionText);
		descriptionText.setLineWrap(true);
		descriptionText.setWrapStyleWord(true);

		
		JLabel lblNewLabel_3_1_2 = new JLabel("Location: ");
		lblNewLabel_3_1_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_3_1_2.setBounds(37, 310, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1_2);
		
		studentIssueLocation = new JTextField();
		studentIssueLocation.setFont(new Font("Tahoma", Font.PLAIN, 11));
		studentIssueLocation.setColumns(10);
		studentIssueLocation.setBounds(178, 310, 257, 23);
		studentGiveFeedbackPanel.add(studentIssueLocation);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Severity of the Issue:");
		lblNewLabel_3_1_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_3_1_2_1.setBounds(37, 270, 145, 20);
		studentGiveFeedbackPanel.add(lblNewLabel_3_1_2_1);
		
		JComboBox studentIssueSeverity = new JComboBox();
		studentIssueSeverity.setModel(new DefaultComboBoxModel(new String[] {"-select severity - ", "Trivial", "Moderate", "Urgent"}));
		studentIssueSeverity.setFont(new Font("Dialog", Font.PLAIN, 12));
		studentIssueSeverity.setEditable(true);
		studentIssueSeverity.setBackground(Color.WHITE);
		studentIssueSeverity.setBounds(178, 268, 257, 23);
		studentGiveFeedbackPanel.add(studentIssueSeverity);
		
		JPanel studentWelcomePanel_1 = new JPanel();
		studentWelcomePanel_1.setLayout(null);
		studentWelcomePanel_1.setBorder(null);
		studentWelcomePanel_1.setBackground(new Color(51, 181, 165));
		studentWelcomePanel_1.setBounds(-5, 45, 751, 103);
		studentGiveFeedbackPanel.add(studentWelcomePanel_1);
		
		JLabel lblKindlyFillUp = new JLabel("Kindly fill up the form carefully to submit a feedback");
		lblKindlyFillUp.setForeground(Color.WHITE);
		lblKindlyFillUp.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKindlyFillUp.setBounds(46, 41, 439, 23);
		studentWelcomePanel_1.add(lblKindlyFillUp);
		
		JLabel addPicLabel = new JLabel("                          Add picture");
		addPicLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		addPicLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		addPicLabel.setBounds(471, 176, 222, 239);
		studentGiveFeedbackPanel.add(addPicLabel);
		
		filePathTextField = new JTextField();
		filePathTextField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		filePathTextField.setColumns(10);
		filePathTextField.setBounds(178, 393, 257, 23);
		studentGiveFeedbackPanel.add(filePathTextField);
		
		JButton browsePictureButton = new JButton("Browse Picture");
		browsePictureButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				JFileChooser Chooser = new JFileChooser();
				Chooser.showOpenDialog(null);
				File picFile = Chooser.getSelectedFile();
				fileName = picFile.getAbsolutePath();
				
				filePathTextField.setText(fileName);
				ImageIcon Icon = new ImageIcon(fileName);
				Image img = Icon.getImage().getScaledInstance(addPicLabel.getWidth(), addPicLabel.getHeight(),Image.SCALE_SMOOTH);
				addPicLabel.setIcon(new ImageIcon(img));
			}
		});
		
		browsePictureButton.setForeground(Color.WHITE);
		browsePictureButton.setFont(new Font("Dialog", Font.BOLD, 12));
		browsePictureButton.setFocusPainted(false);
		browsePictureButton.setBorder(null);
		browsePictureButton.setBackground(new Color(51, 181, 165));
		browsePictureButton.setBounds(37, 392, 109, 23);
		studentGiveFeedbackPanel.add(browsePictureButton);
	
		
		JButton studentClearFormButton = new JButton("Clear Form");
		studentClearFormButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentIssueCategory.setModel(new DefaultComboBoxModel(new String[] {"- Category - ", "Technical", "Furniture and Fittings", "Network", "Others"}));
				studentIssueSubcategory.setModel(new DefaultComboBoxModel(new String[] {"- Sub-category -"}));
				studentIssueSeverity.setModel(new DefaultComboBoxModel(new String[] {"- Select severity -"}));
				studentIssueLocation.setText("");
				studentIssueSubjectMatter.setText("e.g Circuit board is broken");
				filePathTextField.setText("");
				addPicLabel.setIcon(null);
				descriptionText.setText("");
			}
		});
		studentClearFormButton.setForeground(Color.WHITE);
		studentClearFormButton.setFont(new Font("Dialog", Font.BOLD, 15));
		studentClearFormButton.setFocusPainted(false);
		studentClearFormButton.setBorder(null);
		studentClearFormButton.setBackground(new Color(51, 181, 165));
		studentClearFormButton.setBounds(390, 608, 145, 33);
		studentGiveFeedbackPanel.add(studentClearFormButton);
		
		JPanel studentViewFeebackPanel = new JPanel();
		studentViewFeebackPanel.setBackground(new Color(255, 255, 255));
		studentDashboardPane.addTab("New tab", null, studentViewFeebackPanel, null);
		studentViewFeebackPanel.setLayout(null);
		
		JPanel studentWelcomePanel_1_1 = new JPanel();
		studentWelcomePanel_1_1.setLayout(null);
		studentWelcomePanel_1_1.setBorder(null);
		studentWelcomePanel_1_1.setBackground(new Color(51, 181, 165));
		studentWelcomePanel_1_1.setBounds(0, 46, 751, 103);
		studentViewFeebackPanel.add(studentWelcomePanel_1_1);
		
		JLabel lblKindlyFillUp_1 = new JLabel("");
		lblKindlyFillUp_1.setForeground(Color.WHITE);
		lblKindlyFillUp_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKindlyFillUp_1.setBounds(46, 41, 439, 23);
		studentWelcomePanel_1_1.add(lblKindlyFillUp_1);
		
		JLabel lblViewStatusOf = new JLabel("View status of the lodged feedbacks");
		lblViewStatusOf.setForeground(Color.WHITE);
		lblViewStatusOf.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblViewStatusOf.setBounds(24, 41, 439, 23);
		studentWelcomePanel_1_1.add(lblViewStatusOf);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 187, 676, 437);
		studentViewFeebackPanel.add(scrollPane);
		
		studentViewStatusTable = new JTable();
		scrollPane.setViewportView(studentViewStatusTable);
		
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = {"Category","Sub-category","Location","Severity","Date","Time","Status"};
		Object[] row = new Object[10];
		model.setColumnIdentifiers(column);
		studentViewStatusTable.setModel(model);
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		render.setHorizontalAlignment(JLabel.CENTER);
		studentViewStatusTable.setForeground(new Color(35, 45, 65));
		studentViewStatusTable.setBackground(new Color(255, 255, 255));
		studentViewStatusTable.setFont(new Font("Dialog", Font.PLAIN, 10));
		scrollPane.setViewportView(studentViewStatusTable);
		
		int size =studentViewStatusTable.getColumnCount();
		JTableHeader header = studentViewStatusTable.getTableHeader();
		header.setBackground(new Color(35,45,65));
		header.setForeground(Color.WHITE);
		header.setFont(new Font("Dialog", Font.BOLD, 12));
		for(int i=0;i<size;i++)
		{
			studentViewStatusTable.getColumnModel().getColumn(i).setCellRenderer(render);
			studentViewStatusTable.getColumnModel().getColumn(i).setResizable(false);
	    }
		
		studentViewStatusTable.getColumnModel().getColumn(0).setPreferredWidth(30);
		studentViewStatusTable.getColumnModel().getColumn(1).setPreferredWidth(30);
		studentViewStatusTable.getColumnModel().getColumn(2).setPreferredWidth(20);
		studentViewStatusTable.getColumnModel().getColumn(3).setPreferredWidth(10);
		studentViewStatusTable.getColumnModel().getColumn(4).setPreferredWidth(20);
		studentViewStatusTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		studentViewStatusTable.getColumnModel().getColumn(6).setPreferredWidth(40);
		
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setViewportBorder(null);
		
		studentSubmitIssueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Student student = new Student();
				try 
				{
					//"Category","Sub-category","Location","Severity","Date","Time","Status"
					String cat = studentIssueCategory.getSelectedItem().toString();
					String subcat = studentIssueSubcategory.getSelectedItem().toString();
					Object obj = studentIssueSeverity.getSelectedItem();
					String sev = obj.toString();
					String loc = studentIssueLocation.getText();
					String matter = studentIssueSubjectMatter.getText();
					String filename = filePathTextField.getText();
					String description = descriptionText.getText();
					LocalDateTime dateAndTime=LocalDateTime.now();
			        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			        String Formatted_date_and_time = format.format(dateAndTime);
					String dt[] = Formatted_date_and_time.split("\\s+");
					
					row[0] = cat;
					row[1] = subcat;
					row[2] = loc;
					row[3] = sev;
					row[4] = dt[0];
					row[5] = dt[1];
					row[6] = "Pending";
					model.addRow(row);
					student.lodge_Feedback(id,cat,subcat, sev,loc,matter,filename, description,dt[0],dt[1]);
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("Student_pending_issues.txt"));
			String Line = null;
			int cnt = 1,Number = 0;
			Boolean read = false;
			//System.out.println(id);
			while( (Line = in.readLine() )!=null)
			{
				//"Category","Sub-category","Location","Severity","Date","Time","Status"
				//System.out.println(Line);
				if(Line.equals(id))
					read = true;
				if(read)
				{
					row[0] = serial;	
					++Number;
					if(Number == 1|| Number == 6 || Number == 7 || Number == 8)
						continue;
					row[cnt++] = Line;
					if(cnt == 7) //working!
					{
						row[cnt] = "Pending";
						model.addRow(row);
						cnt = 1;
						Number = 0;
						++serial;
						read = false;
					}
				}
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("Student_inProgress_issues.txt"));
			String Line = null;
			int cnt = 1,Number = 0;
			Boolean read = false;
			//System.out.println(id);
			while( (Line = in.readLine() )!=null)
			{
				//"Category","Sub-category","Location","Severity","Date","Time","Status"
				//System.out.println(Line);
				if(Line.equals(id))
					read = true;
				if(read)
				{
					row[0] = serial;	
					++Number;
					if(Number == 1|| Number == 6 || Number == 7 || Number == 8)
						continue;
					row[cnt++] = Line;
					if(cnt == 7) //working!
					{
						row[cnt] = "In-progress";
						model.addRow(row);
						cnt = 1;
						Number = 0;
						++serial;
						read = false;
					}
				}
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("Student_completed_issues.txt"));
			String Line = null;
			int cnt = 1,Number = 0;
			Boolean read = false;
			//System.out.println(id);
			while( (Line = in.readLine() )!=null)
			{
				if(Line.equals(id))
					read = true;
				if(read)
				{
					row[0] = serial;	
					++Number;
					if(Number == 1|| Number == 6 || Number == 7 || Number == 8)
						continue;
					row[cnt++] = Line;
					if(cnt == 7) //working!
					{
						row[cnt] = "Completed";
						model.addRow(row);
						cnt = 1;
						Number = 0;
						++serial;
						read = false;
					}
				}
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		
		
		
		
 }
}
