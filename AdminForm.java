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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JRadioButton;

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
	static JTable studentIssueTable;
	public String issueStatus,name;
	static DefaultTableModel model;
	public int lineNumber;
	/**
	 * Create the frame.
	 */
	public AdminForm() 
	{
		setResizable(false);
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
		adminIcon.setBounds(238, 252, 317, 301);
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
		
		JButton studentUpdateButton = new JButton("Update");
		studentUpdateButton.setForeground(Color.WHITE);
		studentUpdateButton.setFont(new Font("Dialog", Font.BOLD, 15));
		studentUpdateButton.setFocusPainted(false);
		studentUpdateButton.setBorder(null);
		studentUpdateButton.setBackground(new Color(51, 181, 165));
		studentUpdateButton.setBounds(376, 527, 164, 38);
		adminAddDelStaffPanel.add(studentUpdateButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setSize(new Dimension(4, 4));
		scrollPane.setPreferredSize(new Dimension(5, 2));
		scrollPane.setFont(new Font("Dialog", Font.PLAIN, 15));
		scrollPane.setFocusable(false);
		scrollPane.setBounds(new Rectangle(0, 0, 6, 10));
		scrollPane.setBorder(null);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(21, 130, 688, 181);
		adminAddDelStaffPanel.add(scrollPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(43, 360, 312, 19);
		adminAddDelStaffPanel.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_3.setBounds(43, 340, 100, 13);
		adminAddDelStaffPanel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(43, 415, 312, 19);
		adminAddDelStaffPanel.add(textField_1);
		
		JLabel lblStudentId_1_1 = new JLabel("STAFF ID");
		lblStudentId_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblStudentId_1_1.setBounds(43, 392, 100, 13);
		adminAddDelStaffPanel.add(lblStudentId_1_1);
		
		JLabel Password_1 = new JLabel("STAFF PASSWORD");
		Password_1.setFont(new Font("Dialog", Font.BOLD, 11));
		Password_1.setBounds(377, 340, 174, 13);
		adminAddDelStaffPanel.add(Password_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(377, 360, 312, 19);
		adminAddDelStaffPanel.add(textField_2);
		
		JLabel DEPARTMENT = new JLabel("DEPARTMENT");
		DEPARTMENT.setFont(new Font("Dialog", Font.BOLD, 11));
		DEPARTMENT.setBounds(377, 392, 126, 13);
		adminAddDelStaffPanel.add(DEPARTMENT);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(377, 467, 312, 19);
		adminAddDelStaffPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(43, 467, 312, 19);
		adminAddDelStaffPanel.add(textField_4);
		
		JLabel lblPhoneNumber_1 = new JLabel("EMAIL ADDRESS");
		lblPhoneNumber_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPhoneNumber_1.setBounds(43, 444, 139, 13);
		adminAddDelStaffPanel.add(lblPhoneNumber_1);
		
		JLabel lblPhoneNumber_2_1 = new JLabel("PHONE NUMBER");
		lblPhoneNumber_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPhoneNumber_2_1.setBounds(377, 444, 139, 13);
		adminAddDelStaffPanel.add(lblPhoneNumber_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(377, 415, 312, 19);
		adminAddDelStaffPanel.add(textField_5);
		
		JButton studentDeleteButton = new JButton("Delete");
		studentDeleteButton.setForeground(Color.WHITE);
		studentDeleteButton.setFont(new Font("Dialog", Font.BOLD, 15));
		studentDeleteButton.setFocusPainted(false);
		studentDeleteButton.setBorder(null);
		studentDeleteButton.setBackground(new Color(51, 181, 165));
		studentDeleteButton.setBounds(179, 527, 164, 38);
		adminAddDelStaffPanel.add(studentDeleteButton);
		
		JPanel adminViewStudentPanel = new JPanel();
		adminPane.addTab("New tab", null, adminViewStudentPanel, null);
		adminViewStudentPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 10, 737, 620);
		adminViewStudentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel topDecorPanel3 = new JPanel();
		topDecorPanel3.setLayout(null);
		topDecorPanel3.setBackground(new Color(51, 181, 165));
		topDecorPanel3.setBounds(0, 0, 751, 103);
		panel_2.add(topDecorPanel3);
		
		JLabel lblNewLabel_1_2 = new JLabel("View/Delete/Update Student Information");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(35, 48, 397, 20);
		topDecorPanel3.add(lblNewLabel_1_2);
		
		JPanel adminAddressFeedbackPanel = new JPanel();
		adminAddressFeedbackPanel.setLayout(null);
		adminAddressFeedbackPanel.setBackground(Color.WHITE);
		adminPane.addTab("New tab", null, adminAddressFeedbackPanel, null);
		
		JTabbedPane feedbackPane = new JTabbedPane(JTabbedPane.TOP);
		feedbackPane.setBackground(new Color(255, 255, 255));
		feedbackPane.setBounds(0, -48, 751, 701);
		adminAddressFeedbackPanel.add(feedbackPane);
		feedbackPane.setVisible(false);
		
		JPanel studentpendingPanel = new JPanel();
		studentpendingPanel.setBackground(new Color(255, 255, 255));
		feedbackPane.addTab("New tab", null, studentpendingPanel, null);
		studentpendingPanel.setLayout(null);
		
		JPanel pendingStudentIssueDecor = new JPanel();
		pendingStudentIssueDecor.setLayout(null);
		pendingStudentIssueDecor.setBorder(null);
		pendingStudentIssueDecor.setBackground(new Color(51, 181, 165));
		pendingStudentIssueDecor.setBounds(-11, 21, 762, 103);
		studentpendingPanel.add(pendingStudentIssueDecor);
		
		JLabel lblPendingStudentIssues = new JLabel("Pending Student Issues");
		lblPendingStudentIssues.setForeground(Color.WHITE);
		lblPendingStudentIssues.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPendingStudentIssues.setBounds(47, 46, 439, 23);
		pendingStudentIssueDecor.add(lblPendingStudentIssues);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(25, 157, 681, 355);
		studentpendingPanel.add(scrollPane1);
		
		studentIssueTable = new JTable();
		studentIssueTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//when user clicks on a row, and selects "view details", then all the details of that particular row is shown to him
				//do it using line numbers and row numbers to avoid problems
				
				lineNumber = studentIssueTable.getSelectedRow();
				issueStatus = "pending";
				
			}
		});
		scrollPane1.setViewportView(studentIssueTable);
		
		model = new DefaultTableModel();
		Object[] column = {"ID", "Category","Sub-category","Severity","Location","Date","Time"};
		Object[] row = new Object[10];
		model.setColumnIdentifiers(column);
		studentIssueTable.setModel(model);
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		render.setHorizontalAlignment(JLabel.CENTER);
		studentIssueTable.setForeground(new Color(35, 45, 65));
		studentIssueTable.setBackground(new Color(255, 255, 255));
		studentIssueTable.setFont(new Font("Dialog", Font.PLAIN, 10));
		scrollPane1.setViewportView(studentIssueTable);
		
		int size = studentIssueTable.getColumnCount();
		JTableHeader header = studentIssueTable.getTableHeader();
		header.setBackground(new Color(35,45,65));
		header.setForeground(Color.WHITE);
		header.setFont(new Font("Dialog", Font.BOLD, 12));
		for(int i=0;i<size;i++)
		{
	         studentIssueTable.getColumnModel().getColumn(i).setCellRenderer(render);
	         studentIssueTable.getColumnModel().getColumn(i).setResizable(false);
	    }
		
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("Student_pending_issues.txt"));
			String Line = null;
			int cnt = 0,Number = 0;
			while( (Line = in.readLine() )!=null)
			{
				//System.out.println(Line);
				//{"Name","Student ID", "Password","Batch","Level","Email","Phone Number"};
				++Number;
				if(Number == 6 || Number == 7 || Number == 8)
					continue;
				row[cnt++] = Line;
				if(cnt == 7)
				{
					model.addRow(row);
					cnt = 0;
					Number = 0;
				}
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		
		studentIssueTable.getColumnModel().getColumn(0).setPreferredWidth(0);
		studentIssueTable.getColumnModel().getColumn(1).setPreferredWidth(30);
		studentIssueTable.getColumnModel().getColumn(2).setPreferredWidth(30);
		studentIssueTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		studentIssueTable.getColumnModel().getColumn(4).setPreferredWidth(10);
		studentIssueTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		studentIssueTable.getColumnModel().getColumn(6).setPreferredWidth(20);
		
		scrollPane1.getViewport().setBackground(Color.WHITE);
		scrollPane1.setViewportBorder(null);
		JPanel pendingStudentIssueButton = new JPanel();
		
		JLabel goBackToPage = new JLabel("");
		goBackToPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setVisible(false);
				adminAddressFeedbackPanel.setVisible(true);
				pendingStudentIssueButton.setVisible(true);
			}
		});
		goBackToPage.setBounds(690, 585, 32, 56);
		studentpendingPanel.add(goBackToPage);
		Image goBackBlack = new ImageIcon(this.getClass().getResource("/goBackBlack.png")).getImage();
		goBackToPage.setIcon(new ImageIcon(goBackBlack));
		
		JButton btnViewDetails = new JButton("View Details");
		btnViewDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsFrame detail;
				try {
					detail = new detailsFrame(lineNumber,issueStatus); //send the id as parameter
					detail.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnViewDetails.setForeground(Color.WHITE);
		btnViewDetails.setFont(new Font("Dialog", Font.BOLD, 15));
		btnViewDetails.setFocusPainted(false);
		btnViewDetails.setBorder(null);
		btnViewDetails.setBackground(new Color(51, 181, 165));
		btnViewDetails.setBounds(307, 549, 164, 38);
		studentpendingPanel.add(btnViewDetails);
		
		JPanel studentInProgressPanel = new JPanel();
		studentInProgressPanel.setBackground(new Color(255, 255, 255));
		feedbackPane.addTab("New tab", null, studentInProgressPanel, null);
		studentInProgressPanel.setLayout(null);
		
		JPanel inProgressStudentIssueButton = new JPanel();
		JLabel goBackToPage2 = new JLabel("");
		goBackToPage2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setVisible(false);
				adminAddressFeedbackPanel.setVisible(true);
				inProgressStudentIssueButton.setVisible(true);
			}
		});
		goBackToPage2.setBounds(692, 588, 32, 50);
		studentInProgressPanel.add(goBackToPage2);
		goBackToPage2.setIcon(new ImageIcon(goBackBlack));
		
		JPanel pendingStudentIssueDecor_1 = new JPanel();
		pendingStudentIssueDecor_1.setLayout(null);
		pendingStudentIssueDecor_1.setBorder(null);
		pendingStudentIssueDecor_1.setBackground(new Color(51, 181, 165));
		pendingStudentIssueDecor_1.setBounds(0, 25, 762, 103);
		studentInProgressPanel.add(pendingStudentIssueDecor_1);
		
		JLabel lblStudentIssuesInprogress = new JLabel("Student Issues in-progress");
		lblStudentIssuesInprogress.setForeground(Color.WHITE);
		lblStudentIssuesInprogress.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblStudentIssuesInprogress.setBounds(47, 46, 439, 23);
		pendingStudentIssueDecor_1.add(lblStudentIssuesInprogress);
		
		JPanel studentCompletedPanel = new JPanel();
		studentCompletedPanel.setBackground(new Color(255, 255, 255));
		feedbackPane.addTab("New tab", null, studentCompletedPanel, null);
		studentCompletedPanel.setLayout(null);
		
		JPanel pendingStudentIssueDecor_2 = new JPanel();
		pendingStudentIssueDecor_2.setLayout(null);
		pendingStudentIssueDecor_2.setBorder(null);
		pendingStudentIssueDecor_2.setBackground(new Color(51, 181, 165));
		pendingStudentIssueDecor_2.setBounds(0, 26, 762, 103);
		studentCompletedPanel.add(pendingStudentIssueDecor_2);
		
		JLabel lblCompletedStudentIssues = new JLabel("Completed Student Issues");
		lblCompletedStudentIssues.setForeground(Color.WHITE);
		lblCompletedStudentIssues.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCompletedStudentIssues.setBounds(47, 46, 439, 23);
		pendingStudentIssueDecor_2.add(lblCompletedStudentIssues);
		
		JPanel completedStudentIssueButton = new JPanel();
		JLabel goBackToPage3 = new JLabel("");
		goBackToPage3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setVisible(false);
				adminAddressFeedbackPanel.setVisible(true);
				completedStudentIssueButton.setVisible(true);
			}
		});
		goBackToPage3.setBounds(688, 581, 48, 58);
		goBackToPage3.setIcon(new ImageIcon(goBackBlack));
		studentCompletedPanel.add(goBackToPage3);
		
		JPanel staffPendingPanel = new JPanel();
		feedbackPane.addTab("New tab", null, staffPendingPanel, null);
		staffPendingPanel.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(10, 0, 766, 672);
		staffPendingPanel.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel pendingStudentIssueDecor_3 = new JPanel();
		pendingStudentIssueDecor_3.setLayout(null);
		pendingStudentIssueDecor_3.setBorder(null);
		pendingStudentIssueDecor_3.setBackground(new Color(51, 181, 165));
		pendingStudentIssueDecor_3.setBounds(0, 26, 762, 103);
		panel_5.add(pendingStudentIssueDecor_3);
		
		JLabel lblPendingStaffIssues = new JLabel("Pending Staff Issues");
		lblPendingStaffIssues.setForeground(Color.WHITE);
		lblPendingStaffIssues.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPendingStaffIssues.setBounds(47, 46, 439, 23);
		pendingStudentIssueDecor_3.add(lblPendingStaffIssues);
		
		JPanel staffPendingIssueButton = new JPanel();
		JLabel goBackToPage4 = new JLabel("");
		goBackToPage4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setVisible(false);
				adminAddressFeedbackPanel.setVisible(true);
				staffPendingIssueButton.setVisible(true);
			}
		});
		goBackToPage4.setBounds(684, 580, 45, 61);
		goBackToPage4.setIcon(new ImageIcon(goBackBlack));
		panel_5.add(goBackToPage4);
		
		JPanel staffInProgressPanel = new JPanel();
		feedbackPane.addTab("New tab", null, staffInProgressPanel, null);
		staffInProgressPanel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(10, 0, 738, 667);
		staffInProgressPanel.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel pendingStudentIssueDecor_4 = new JPanel();
		pendingStudentIssueDecor_4.setLayout(null);
		pendingStudentIssueDecor_4.setBorder(null);
		pendingStudentIssueDecor_4.setBackground(new Color(51, 181, 165));
		pendingStudentIssueDecor_4.setBounds(0, 22, 762, 103);
		panel_6.add(pendingStudentIssueDecor_4);
		
		JLabel lblInprogressStaffIssues = new JLabel("In-Progress Staff Issues");
		lblInprogressStaffIssues.setForeground(Color.WHITE);
		lblInprogressStaffIssues.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblInprogressStaffIssues.setBounds(47, 46, 439, 23);
		pendingStudentIssueDecor_4.add(lblInprogressStaffIssues);
		
		JLabel goBackToPage5 = new JLabel("");
		goBackToPage5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setVisible(false);
				adminAddressFeedbackPanel.setVisible(true);
			}
		});
		goBackToPage5.setBounds(684, 590, 31, 50);
		goBackToPage5.setIcon(new ImageIcon(goBackBlack));
		panel_6.add(goBackToPage5);
		
		JPanel staffCompletedPanel = new JPanel();
		feedbackPane.addTab("New tab", null, staffCompletedPanel, null);
		staffCompletedPanel.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(null);
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(10, 10, 738, 656);
		staffCompletedPanel.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel pendingStudentIssueDecor_5 = new JPanel();
		pendingStudentIssueDecor_5.setLayout(null);
		pendingStudentIssueDecor_5.setBorder(null);
		pendingStudentIssueDecor_5.setBackground(new Color(51, 181, 165));
		pendingStudentIssueDecor_5.setBounds(0, 24, 762, 103);
		panel_7.add(pendingStudentIssueDecor_5);
		
		JLabel lblCompletedStaffIssues = new JLabel("Completed Staff Issues");
		lblCompletedStaffIssues.setForeground(Color.WHITE);
		lblCompletedStaffIssues.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCompletedStaffIssues.setBounds(47, 46, 439, 23);
		pendingStudentIssueDecor_5.add(lblCompletedStaffIssues);
		
		JLabel goBackToPage6 = new JLabel("");
		goBackToPage6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setVisible(false);
				adminAddressFeedbackPanel.setVisible(true);
			}
		});
		goBackToPage6.setBounds(683, 573, 28, 58);
		goBackToPage6.setIcon(new ImageIcon(goBackBlack));
		panel_7.add(goBackToPage6);
		
	//	JPanel pendingStudentIssueButton = new JPanel();
		pendingStudentIssueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setSelectedIndex(0);
				pendingStudentIssueButton.setVisible(false);
				feedbackPane.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pendingStudentIssueButton.setBackground(new Color(255,81,81));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				pendingStudentIssueButton.setBackground(new Color(255,49,49));
			}
		});
		pendingStudentIssueButton.setBackground(new Color(255, 49, 49));
		pendingStudentIssueButton.setBounds(52, 206, 156, 126);
		adminAddressFeedbackPanel.add(pendingStudentIssueButton);
		pendingStudentIssueButton.setLayout(null);
		
		JLabel studentPending = new JLabel("");
		studentPending.setBounds(51, 10, 102, 92);
		pendingStudentIssueButton.add(studentPending);
		Image pending = new ImageIcon(this.getClass().getResource("/pending.png")).getImage();
		studentPending.setIcon(new ImageIcon(pending));
		
		JLabel lblNewLabel_1_4 = new JLabel("Pending");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		lblNewLabel_1_4.setBounds(56, 98, 57, 13);
		pendingStudentIssueButton.add(lblNewLabel_1_4);
		
		completedStudentIssueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setSelectedIndex(2);
				completedStudentIssueButton.setVisible(false);
				feedbackPane.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				completedStudentIssueButton.setBackground(new Color(0,200,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				completedStudentIssueButton.setBackground(new Color(0,159,0));
			}
		});
		completedStudentIssueButton.setBackground(new Color(0, 159, 0));
		completedStudentIssueButton.setBounds(511, 206, 156, 126);
		adminAddressFeedbackPanel.add(completedStudentIssueButton);
		completedStudentIssueButton.setLayout(null);
		
		JLabel studentCompleted = new JLabel("");
		studentCompleted.setBounds(47, 16, 81, 77);
		completedStudentIssueButton.add(studentCompleted);
		
		Image done = new ImageIcon(this.getClass().getResource("/completed.png")).getImage();
		studentCompleted.setIcon(new ImageIcon(done));
		
		JLabel lblNewLabel_1 = new JLabel("Completed");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(52, 98, 81, 13);
		completedStudentIssueButton.add(lblNewLabel_1);
		
		
		inProgressStudentIssueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setSelectedIndex(1);
				feedbackPane.setVisible(true);
				inProgressStudentIssueButton.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				inProgressStudentIssueButton.setBackground(new Color(83,169,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				inProgressStudentIssueButton.setBackground(new Color(45, 150, 255));
			}
		});
		inProgressStudentIssueButton.setBackground(new Color(45, 150, 255));
		inProgressStudentIssueButton.setBounds(283, 206, 156, 126);
		adminAddressFeedbackPanel.add(inProgressStudentIssueButton);
		inProgressStudentIssueButton.setLayout(null);
		
		JLabel inProgressLabel = new JLabel("");
		inProgressLabel.setBounds(47, 10, 82, 93);
		inProgressStudentIssueButton.add(inProgressLabel);
		Image inProgress = new ImageIcon(this.getClass().getResource("/inProgress.png")).getImage();
		inProgressLabel.setIcon(new ImageIcon(inProgress));
		
		JLabel lblNewLabel_4 = new JLabel("In-progress");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(45, 98, 72, 13);
		inProgressStudentIssueButton.add(lblNewLabel_4);
		
		JPanel topDecorPanel = new JPanel();
		topDecorPanel.setLayout(null);
		topDecorPanel.setBackground(new Color(51, 181, 165));
		topDecorPanel.setBounds(0, 0, 751, 103);
		adminAddressFeedbackPanel.add(topDecorPanel);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("View and address lodged feedbacks ");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(35, 48, 397, 20);
		topDecorPanel.add(lblNewLabel_1_2_1);
		
		
		staffPendingIssueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setSelectedIndex(3);
				staffPendingIssueButton.setVisible(false);
				feedbackPane.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				staffPendingIssueButton.setBackground(new Color(255,81,81));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				staffPendingIssueButton.setBackground(new Color(255,49,49));
			}
		});
		staffPendingIssueButton.setLayout(null);
		staffPendingIssueButton.setBackground(new Color(255, 49, 49));
		staffPendingIssueButton.setBounds(52, 442, 156, 126);
		adminAddressFeedbackPanel.add(staffPendingIssueButton);
		
		JLabel staffPending = new JLabel("");
		staffPending.setBounds(51, 10, 118, 88);
		staffPendingIssueButton.add(staffPending);
		staffPending.setIcon(new ImageIcon(pending));
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Pending");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		lblNewLabel_1_4_1.setBounds(56, 97, 57, 13);
		staffPendingIssueButton.add(lblNewLabel_1_4_1);
		
		

		JPanel inProgressStaffIssueButton = new JPanel();
		inProgressStaffIssueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setSelectedIndex(4);
				feedbackPane.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				inProgressStaffIssueButton.setBackground(new Color(83,169,255));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				inProgressStaffIssueButton.setBackground(new Color(45, 150, 255));
			}
		});
		inProgressStaffIssueButton.setLayout(null);
		inProgressStaffIssueButton.setBackground(new Color(45, 150, 255));
		inProgressStaffIssueButton.setBounds(283, 442, 156, 126);
		adminAddressFeedbackPanel.add(inProgressStaffIssueButton);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setBounds(45, 10, 82, 93);
		inProgressStaffIssueButton.add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setIcon(new ImageIcon(inProgress));
		
		JLabel lblNewLabel_4_1 = new JLabel("In-progress");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(45, 97, 72, 13);
		inProgressStaffIssueButton.add(lblNewLabel_4_1);
		
		JPanel studentFeedbackHeading = new JPanel();
		studentFeedbackHeading.setBackground(new Color(35, 45, 65));
		studentFeedbackHeading.setBounds(270, 142, 191, 39);
		adminAddressFeedbackPanel.add(studentFeedbackHeading);
		studentFeedbackHeading.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Feedbacks");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel.setBounds(33, 10, 130, 19);
		studentFeedbackHeading.add(lblNewLabel);
		
		JPanel staffFeedbackHeading = new JPanel();
		staffFeedbackHeading.setBackground(new Color(35, 45, 65));
		staffFeedbackHeading.setLayout(null);
		staffFeedbackHeading.setBounds(270, 376, 191, 39);
		adminAddressFeedbackPanel.add(staffFeedbackHeading);
		
		JLabel lblStaffFeedbacks = new JLabel("Staff Feedbacks");
		lblStaffFeedbacks.setForeground(Color.WHITE);
		lblStaffFeedbacks.setFont(new Font("Dialog", Font.BOLD, 13));
		lblStaffFeedbacks.setBounds(47, 0, 144, 39);
		staffFeedbackHeading.add(lblStaffFeedbacks);
		
		JPanel completedStaffIssueButton = new JPanel();
		completedStaffIssueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				feedbackPane.setSelectedIndex(5);
				feedbackPane.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				completedStaffIssueButton.setBackground(new Color(0,200,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				completedStaffIssueButton.setBackground(new Color(0,159,0));
			}
		});
		completedStaffIssueButton.setLayout(null);
		completedStaffIssueButton.setBackground(new Color(0, 159, 0));
		completedStaffIssueButton.setBounds(511, 442, 156, 126);
		adminAddressFeedbackPanel.add(completedStaffIssueButton);
		
		JLabel studentCompleted_1 = new JLabel("");
		studentCompleted_1.setBounds(47, 16, 81, 77);
		completedStaffIssueButton.add(studentCompleted_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Completed");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		lblNewLabel_1_3.setBounds(52, 98, 81, 13);
		completedStaffIssueButton.add(lblNewLabel_1_3);
		
		JLabel staffCompleted = new JLabel("");
		staffCompleted.setBounds(47, 16, 81, 77);
		completedStaffIssueButton.add(staffCompleted);
		staffCompleted.setIcon(new ImageIcon(done));
		
		JPanel adminAddOptionPanel = new JPanel();
		adminPane.addTab("New tab", null, adminAddOptionPanel, null);
		adminAddOptionPanel.setLayout(null);
		
		JPanel addOptionPage = new JPanel();
		addOptionPage.setBackground(new Color(255, 255, 255));
		addOptionPage.setBounds(0, 10, 739, 657);
		adminAddOptionPanel.add(addOptionPage);
		addOptionPage.setLayout(null);
		
		JPanel pendingStudentIssueDecor_6 = new JPanel();
		pendingStudentIssueDecor_6.setLayout(null);
		pendingStudentIssueDecor_6.setBorder(null);
		pendingStudentIssueDecor_6.setBackground(new Color(51, 181, 165));
		pendingStudentIssueDecor_6.setBounds(0, -11, 762, 103);
		addOptionPage.add(pendingStudentIssueDecor_6);
		
		JLabel lblAddMoreFeedback = new JLabel("Add More Feedback Categories or Sub-categories");
		lblAddMoreFeedback.setForeground(Color.WHITE);
		lblAddMoreFeedback.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAddMoreFeedback.setBounds(47, 46, 439, 23);
		pendingStudentIssueDecor_6.add(lblAddMoreFeedback);
		
		
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
