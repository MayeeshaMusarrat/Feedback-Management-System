package adminPackage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import LoginRegisterPackage.LoginForm;
import staffPackage.Staff;

import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;


abstract class Issues
{
	public String ID;
	public String category;
	public String subcategory;
	public String location;
	public String severity;
	public String subjectMatter;
	public String filepath;
	public String description;
	public String date;
	public String time;
	abstract Issues lodge_issue(String ID, String category,String subcategory,String severity,String location,String subjectMatter,
			String filepath,String description,String date,String time);
}

class StudentIssues extends Issues
{
	StudentIssues lodge_issue(String ID, String category,String subcategory,String severity,String location,String subjectMatter,
			String filepath,String description,String date,String time)
	{
		this.ID = ID;
		this.category = category;
		this.subcategory = subcategory;
		this.severity = severity;
		this.location = location;
		this.subjectMatter = subjectMatter;
		this.filepath = filepath;
		this.description = description;
		this.date = date;
		this.time = time;
		return this;
	}
}
class StaffIssues extends Issues
{
	StaffIssues lodge_issue(String ID, String category,String subcategory,String severity,String location,String subjectMatter,
			String filepath,String description,String date,String time)
	{
		this.ID = ID;
		this.category = category;
		this.subcategory = subcategory;
		this.severity = severity;
		this.location = location;
		this.subjectMatter = subjectMatter;
		this.filepath = filepath;
		this.description = description;
		this.date = date;
		this.time = time;
		return this;
	}
}



@SuppressWarnings("serial")
public class AdminForm extends JFrame {

	private JPanel contentPane;
	JFrame adminFrame;
	public static String ID;
	private JTextField staffName;
	private JTextField staffID;
	private JTextField staffPassword;
	private JTextField staffPhone;
	private JTextField staffEmail;
	private JTextField staffDept;
	private String staffNameVariable;
	private String staffIDVariable;
	private String staffPasswordVariable;
	private String staffDeptVariable;
	private String staffEmailVariable;
	private String staffPhoneVariable;
	static JTable studentIssueTable;
	public String issueStatus,name;
	static DefaultTableModel pendingModel,inProgressModel,completedModel,studentInfoModel;
	public int lineNumber;
	private JTable studentInprogressTable;
	private JTable adminViewStudentTable;
	private JTable studentCompletedTable;
	private JTable staffInfoTable;
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
		
		JPanel dashboardDecorOptional = new JPanel();
		dashboardDecorOptional.setBounds(0, 0, 353, 105);
		
		dashboardDecorOptional.setLayout(null);
		dashboardDecorOptional.setBorder(null);
		dashboardDecorOptional.setBackground(new Color(51, 181, 165));
		
		
		JPanel adminSideDecorPanel = new JPanel();
		adminSideDecorPanel.setLayout(null);
		adminSideDecorPanel.setBorder(null);
		adminSideDecorPanel.setBackground(new Color(35, 45, 65));
		adminSideDecorPanel.setBounds(0, 0, 351, 626);
		getContentPane().add(adminSideDecorPanel);
		adminSideDecorPanel.add(dashboardDecorOptional);
		dashboardDecorOptional.setVisible(true);
		
		JTabbedPane adminPane = new JTabbedPane(JTabbedPane.TOP);
		adminPane.setBounds(347, -30, 769, 670);
		getContentPane().add(adminPane);
		Image adminImg = new ImageIcon(this.getClass().getResource("/adminIcon.png")).getImage();
		
		JPanel adminProfilePanel = new JPanel();
		adminProfilePanel.setBackground(new Color(255, 255, 255));
		adminPane.addTab("New tab", null, adminProfilePanel, null);
		adminProfilePanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MIST CSE Feedback System");
		lblNewLabel_2.setForeground(new Color(163, 163, 163));
		lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(26, 594, 192, 23);
		adminProfilePanel.add(lblNewLabel_2);
		
		JLabel adminIcon = new JLabel("");
		adminIcon.setBounds(300, 118, 534, 491);
		adminProfilePanel.add(adminIcon);
		
		Image adminImage = new ImageIcon("C:\\Users\\MAYESHA\\Downloads\\adminPage3.png").getImage();
		adminImage = adminImage.getScaledInstance(adminIcon.getWidth(), adminIcon.getHeight(),Image.SCALE_SMOOTH);
		adminIcon.setIcon(new ImageIcon(adminImage));
		
		JPanel studentWelcomePanel_1_1 = new JPanel();
		studentWelcomePanel_1_1.setLayout(null);
		studentWelcomePanel_1_1.setBorder(null);
		studentWelcomePanel_1_1.setBackground(new Color(51, 181, 165));
		studentWelcomePanel_1_1.setBounds(0, 0, 751, 112);
		adminProfilePanel.add(studentWelcomePanel_1_1);
		
		JLabel lblId = new JLabel("ID 4004");
		lblId.setBounds(21, 60, 273, 23);
		studentWelcomePanel_1_1.add(lblId);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel lblNewLabel_5 = new JLabel("Welcome to Admin Panel!");
		lblNewLabel_5.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(26, 216, 315, 54);
		adminProfilePanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("<HTML>"+"The module has been created for you for efficient and effective feedback management"+"</HTML>");
		lblNewLabel_6.setFont(new Font("Poppins", Font.ITALIC, 12));
		lblNewLabel_6.setBounds(26, 185, 291, 194);
		adminProfilePanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("FEATURES");
		lblNewLabel_7.setFont(new Font("Poppins Medium", Font.PLAIN, 14));
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setBounds(26, 336, 254, 23);
		adminProfilePanel.add(lblNewLabel_7);
		
		JLabel bulletFeature = new JLabel("<HTML><ul>"+"<li> Add/Delete staff information</li>"+"<li> View student information</li>"+"<li> Address the "
				+ "lodged feedbacks");
		bulletFeature.setBounds(-13, 318, 315, 166);
		bulletFeature.setFont(new Font("Poppins Light", Font.PLAIN, 13));
		adminProfilePanel.add(bulletFeature);
		
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
		topDecorPanel3.setBounds(0, -11, 762, 103);
		panel_2.add(topDecorPanel3);
		
		JLabel lblNewLabel_1_2 = new JLabel("View Student Information");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(35, 48, 397, 20);
		topDecorPanel3.add(lblNewLabel_1_2);
		
		JScrollPane viewStudentScrollPane = new JScrollPane();
		viewStudentScrollPane.setBounds(22, 114, 692, 444);
		panel_2.add(viewStudentScrollPane);
		
		adminViewStudentTable = new JTable();
		viewStudentScrollPane.setViewportView(adminViewStudentTable);
		
		studentInfoModel = new DefaultTableModel();
		Object[] studentColumn = {"Name","Student ID", "Password","Batch","Level","Email","Phone Number"};
		Object[] studentRow = new Object[10];
	
		studentInfoModel.setColumnIdentifiers(studentColumn);
		adminViewStudentTable.setModel(studentInfoModel);
		DefaultTableCellRenderer Center = new DefaultTableCellRenderer();
	    Center.setHorizontalAlignment(JLabel.CENTER);
	    adminViewStudentTable.setForeground(new Color(35, 45, 65));
	    adminViewStudentTable.setBackground(new Color(255, 255, 255));
	    adminViewStudentTable.setFont(new Font("Dialog", Font.PLAIN, 10));
		int sz = adminViewStudentTable.getColumnCount();
		JTableHeader Header = adminViewStudentTable.getTableHeader();
		Header.setBackground(new Color(35,45,65));
		Header.setForeground(Color.WHITE);
		Header.setFont(new Font("Dialog", Font.BOLD, 12));
		for(int i=0;i<sz;i++)
		{
			adminViewStudentTable.getColumnModel().getColumn(i).setCellRenderer(Center);
			adminViewStudentTable.getColumnModel().getColumn(i).setResizable(false);
	    }
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("Student_info.txt"));
			String Line = null;
			int cnt = 0;
			while( (Line = in.readLine() )!=null)
			{
				
				String spliced[] = Line.split("\\s+");
				studentRow[0]=spliced[2]+" "+spliced[3];
				studentRow[1]=spliced[0];
				studentRow[2]=spliced[1];
				studentRow[3]=spliced[7];
				studentRow[4]=spliced[4];
				studentRow[5]=spliced[6];
				studentRow[6]=spliced[5];
			    studentInfoModel.addRow(studentRow);
				
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		adminViewStudentTable.getColumnModel().getColumn(0).setPreferredWidth(80);
		adminViewStudentTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		adminViewStudentTable.getColumnModel().getColumn(2).setPreferredWidth(80);
		adminViewStudentTable.getColumnModel().getColumn(3).setPreferredWidth(40);
		adminViewStudentTable.getColumnModel().getColumn(4).setPreferredWidth(20);
		adminViewStudentTable.getColumnModel().getColumn(5).setPreferredWidth(80);
		adminViewStudentTable.getColumnModel().getColumn(6).setPreferredWidth(80);
		viewStudentScrollPane.getViewport().setBackground(Color.WHITE);
		viewStudentScrollPane.setViewportBorder(null);
		
		JPanel adminAddressFeedbackPanel = new JPanel();
		adminAddressFeedbackPanel.setLayout(null);
		adminAddressFeedbackPanel.setBackground(Color.WHITE);
		adminPane.addTab("New tab", null, adminAddressFeedbackPanel, null);
		
		JTabbedPane feedbackPane = new JTabbedPane(JTabbedPane.TOP);
		feedbackPane.setBackground(new Color(255, 255, 255));
		feedbackPane.setBounds(-11, -48, 762, 688);
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
	
		
		JScrollPane studentPendingIssueScrollPane = new JScrollPane();
		studentPendingIssueScrollPane.setBounds(30, 188, 689, 362);
		studentpendingPanel.add(studentPendingIssueScrollPane);
		
		studentIssueTable = new JTable();
		studentIssueTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lineNumber = studentIssueTable.getSelectedRow();
				issueStatus = "pending";
			}
		});
		studentPendingIssueScrollPane.setViewportView(studentIssueTable);
		
		pendingModel = new DefaultTableModel();
		Object[] column = {"ID", "Category","Sub-category","Severity","Location","Date","Time"};
		Object[] row = new Object[10];
		pendingModel.setColumnIdentifiers(column);
		studentIssueTable.setModel(pendingModel);
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		render.setHorizontalAlignment(JLabel.CENTER);
		studentIssueTable.setForeground(new Color(35, 45, 65));
		studentIssueTable.setBackground(new Color(255, 255, 255));
		studentIssueTable.setFont(new Font("Dialog", Font.PLAIN, 10));
		studentPendingIssueScrollPane.setViewportView(studentIssueTable);
		
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
		ArrayList <StudentIssues> list=new ArrayList<StudentIssues>();
		try 
		{
			String id=null;
			String category=null;
			String subcategory=null;
			String severity=null;
			String location=null;
			String subjectMatter=null;
			String filepath=null;
			String description = null;
			String date=null;
			String time=null;
			BufferedReader in = new BufferedReader(new FileReader("Student_pending_issues.txt"));
			String Line = null;
			int Number = 0;
			while( (Line = in.readLine() )!=null)
			{
				++Number;
                switch(Number)
                {
	                case 1: id = Line;
	                case 2: category = Line;
	                case 3: subcategory = Line;
	                case 4: severity = Line;
	                case 5: location = Line;
	                case 6: subjectMatter = Line;
	                case 7: filepath = Line;
	                case 8: description = Line;
	                case 9: date = Line;
	                case 10: time = Line;
	                default: { break; }
                }
                if(Number==10)
                {
                	StudentIssues st = new StudentIssues();
                	list.add(st.lodge_issue(id,category,subcategory,severity,location,subjectMatter, filepath, description,date,time));
                	Number = 0;
                	
                }
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		int cnt = 0;
		for(StudentIssues issues : list)
		{
			row[cnt++] = issues.ID;
			row[cnt++] = issues.category;
			row[cnt++] = issues.subcategory;
			row[cnt++] = issues.severity;
			row[cnt++] = issues.location;
			row[cnt++] = issues.date;
			row[cnt++] = issues.time;
			pendingModel.addRow(row);
			cnt = 0;
			
		}
		
		studentIssueTable.getColumnModel().getColumn(0).setPreferredWidth(20);
		studentIssueTable.getColumnModel().getColumn(1).setPreferredWidth(30);
		studentIssueTable.getColumnModel().getColumn(2).setPreferredWidth(50);
		studentIssueTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		studentIssueTable.getColumnModel().getColumn(4).setPreferredWidth(10);
		studentIssueTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		studentIssueTable.getColumnModel().getColumn(6).setPreferredWidth(20);
		
		studentPendingIssueScrollPane.getViewport().setBackground(Color.WHITE);
		studentPendingIssueScrollPane.setViewportBorder(null);
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
		
		JLabel studentPending = new JLabel("");
		studentPending.setBounds(51, 10, 102, 92);
		pendingStudentIssueButton.add(studentPending);
		Image pending = new ImageIcon(this.getClass().getResource("/pending.png")).getImage();
		studentPending.setIcon(new ImageIcon(pending));
		
		JButton viewDetailsButton = new JButton("View Details");
		viewDetailsButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				viewDetailsButton.setBackground(new Color(51, 181, 165));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				viewDetailsButton.setBackground(new Color(51, 181, 165));
			}
		});
		viewDetailsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					//list.add(st.lodge_issue(id,category,subcategory,severity,location,subjectMatter, filepath, description,date,time));
		detailsFrame detail = new detailsFrame(list.get(lineNumber).ID,list.get(lineNumber).category,list.get(lineNumber).subcategory,
				list.get(lineNumber).location, list.get(lineNumber).subjectMatter,list.get(lineNumber).date,list.get(lineNumber).time,
				list.get(lineNumber).description,list.get(lineNumber).filepath,issueStatus,lineNumber);
					detail.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		viewDetailsButton.setForeground(Color.WHITE);
		viewDetailsButton.setFont(new Font("Dialog", Font.BOLD, 15));
		viewDetailsButton.setFocusPainted(false);
		viewDetailsButton.setBorder(null);
		viewDetailsButton.setBackground(new Color(51, 181, 165));
		viewDetailsButton.setBounds(307, 574, 164, 38);
		studentpendingPanel.add(viewDetailsButton);
		
		JComboBox filterComboBox = new JComboBox();
		filterComboBox.setModel(new DefaultComboBoxModel(new String[] {"All", "Urgent", "Moderate", "Trivial"}));
		filterComboBox.setBackground(new Color(255, 255, 255));
		filterComboBox.setBounds(61, 148, 169, 21);
		///System.out.println(list.size());
		filterComboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String selection = filterComboBox.getSelectedItem().toString();
				if(selection.equals("Urgent"))
				{
					pendingModel.setRowCount(0);
					int cnt = 0;
					for(StudentIssues issues : list)
					{
						if(issues.severity.equals("Urgent"))
						{
							row[cnt++] = issues.ID;	
							row[cnt++] = issues.category;
							row[cnt++] = issues.subcategory;
							row[cnt++] = issues.severity;
							row[cnt++] = issues.location;
							row[cnt++] = issues.date;
							row[cnt++] = issues.time;
							pendingModel.addRow(row);
							cnt = 0;
						}
					}
				}
				else if(selection.equals("All"))
				{
					pendingModel.setRowCount(0);
					int cnt = 0;
					for(StudentIssues issues : list)
					{
						row[cnt++] = issues.ID;
						row[cnt++] = issues.category;
						row[cnt++] = issues.subcategory;
						row[cnt++] = issues.severity;
						row[cnt++] = issues.location;
						row[cnt++] = issues.date;
						row[cnt++] = issues.time;
						pendingModel.addRow(row);
						cnt = 0;
					}
				}
				else if(selection.equals("Moderate"))
				{
					pendingModel.setRowCount(0);
					int cnt = 0;
					for(StudentIssues issues : list)
					{
						if(issues.severity.equals("Moderate"))
						{
							row[cnt++] = issues.ID;	
							row[cnt++] = issues.category;
							row[cnt++] = issues.subcategory;
							row[cnt++] = issues.severity;
							row[cnt++] = issues.location;
							row[cnt++] = issues.date;
							row[cnt++] = issues.time;
							pendingModel.addRow(row);
							cnt = 0;
						}
					}
				}
				else if(selection.equals("Trivial"))
				{
					pendingModel.setRowCount(0);
					int cnt = 0;
					for(StudentIssues issues : list)
					{
						if(issues.severity.equals("Trivial"))
						{
							row[cnt++] = issues.ID;	
							row[cnt++] = issues.category;
							row[cnt++] = issues.subcategory;
							row[cnt++] = issues.severity;
							row[cnt++] = issues.location;
							row[cnt++] = issues.date;
							row[cnt++] = issues.time;
							pendingModel.addRow(row);
							cnt = 0;
						}
					}
				}
			}
		});
		filterComboBox.setFont(new Font("Dialog", Font.PLAIN, 11));
		studentpendingPanel.add(filterComboBox);
		
		Image FilterImg = new ImageIcon("C:\\Users\\MAYESHA\\Downloads\\filter.png").getImage();
		JLabel filterLabel = new JLabel("");
		filterLabel.setBounds(30, 146, 24, 24);
		studentpendingPanel.add(filterLabel);
		FilterImg = FilterImg.getScaledInstance(filterLabel.getWidth(), filterLabel.getHeight(),Image.SCALE_SMOOTH);
		filterLabel.setIcon(new ImageIcon(FilterImg));

		
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
		
		JScrollPane studentInProgressScrollPane = new JScrollPane();
		studentInProgressScrollPane.setBounds(46, 176, 665, 390);
		studentInProgressPanel.add(studentInProgressScrollPane);
		
		studentInprogressTable = new JTable();
		studentInProgressScrollPane.setViewportView(studentInprogressTable);
		
		
		DefaultTableModel inProgressModel = new DefaultTableModel();
		Object[] inProgressColumn = {"ID", "Category","Sub-category","Location","Severity","Date","Time"};
		Object[] inProgressRow = new Object[10];
		inProgressModel.setColumnIdentifiers(inProgressColumn);
		studentInprogressTable.setModel(inProgressModel);
		DefaultTableCellRenderer InprogressRender = new DefaultTableCellRenderer();
		InprogressRender.setHorizontalAlignment(JLabel.CENTER);
		studentInprogressTable.setForeground(new Color(35, 45, 65));
		studentInprogressTable.setBackground(new Color(255, 255, 255));
		studentInprogressTable.setFont(new Font("Dialog", Font.PLAIN, 10));
		studentInProgressScrollPane.setViewportView(studentInprogressTable);
		
		int inProgressSize = studentInprogressTable.getColumnCount();
		JTableHeader inProgressHeader = studentInprogressTable.getTableHeader();
		inProgressHeader.setBackground(new Color(35,45,65));
		inProgressHeader.setForeground(Color.WHITE);
		inProgressHeader.setFont(new Font("Dialog", Font.BOLD, 12));
		for(int i=0;i<inProgressSize;i++)
		{
			studentInprogressTable.getColumnModel().getColumn(i).setCellRenderer(InprogressRender);
			studentInprogressTable.getColumnModel().getColumn(i).setResizable(false);
	    }
		
		studentInprogressTable.getColumnModel().getColumn(0).setPreferredWidth(0);
		studentInprogressTable.getColumnModel().getColumn(1).setPreferredWidth(30);
		studentInprogressTable.getColumnModel().getColumn(2).setPreferredWidth(30);
		studentInprogressTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		studentInprogressTable.getColumnModel().getColumn(4).setPreferredWidth(10);
		studentInprogressTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		studentInprogressTable.getColumnModel().getColumn(6).setPreferredWidth(20);
		
		studentInProgressScrollPane.getViewport().setBackground(Color.WHITE);
		studentInProgressScrollPane.setViewportBorder(null);
		 
		ArrayList <StudentIssues> inProgressList=new ArrayList<StudentIssues>();
		try 
		{
			String id=null;
			String category=null;
			String subcategory=null;
			String severity=null;
			String location=null;
			String subjectMatter=null;
			String filepath=null;
			String description = null;
			String date=null;
			String time=null;
			BufferedReader in = new BufferedReader(new FileReader("Student_inProgress_issues.txt"));
			String Line = null;
			int Number = 0;
			while( (Line = in.readLine() )!=null)
			{
				++Number;
				
                switch(Number)
                {
	                case 1: id = Line;
	                case 2: category = Line;
	                case 3: subcategory = Line;
	                case 4: severity = Line;
	                case 5: location = Line;
	                case 6: subjectMatter = Line;
	                case 7: filepath = Line;
	                case 8: description = Line;
	                case 9: date = Line;
	                case 10:time = Line;
	                default: { break; }
                }
                if(Number==10)
                {
                	StudentIssues st = new StudentIssues();
                	inProgressList.add(st.lodge_issue(id,category,subcategory,severity,location,subjectMatter, filepath, description,date,time));
                	Number = 0;
                }
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		cnt = 0;
		//Collections.sort(list);
		for(StudentIssues issues : inProgressList)
		{
			inProgressRow[cnt++] = issues.ID;
			inProgressRow[cnt++] = issues.category;
			inProgressRow[cnt++] = issues.subcategory;
			inProgressRow[cnt++] = issues.severity;
			inProgressRow[cnt++] = issues.location;
			inProgressRow[cnt++] = issues.date;
			inProgressRow[cnt++] = issues.time;
			inProgressModel.addRow(inProgressRow);
			cnt = 0;
			
		}
		
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
		
		JScrollPane adminViewStudentCompletedScrollPane = new JScrollPane();
		adminViewStudentCompletedScrollPane.setBounds(43, 175, 673, 389);
		studentCompletedPanel.add(adminViewStudentCompletedScrollPane);
		
		studentCompletedTable = new JTable();
		adminViewStudentCompletedScrollPane.setViewportView(studentCompletedTable);
		completedModel = new DefaultTableModel();
		Object[] CompletedColumn = {"ID", "Category","Sub-category","Severity","Location","Date","Time"};
		Object[] CompletedRow = new Object[10];
		completedModel.setColumnIdentifiers(CompletedColumn);
		studentCompletedTable.setModel(completedModel);
		DefaultTableCellRenderer CompletedRender = new DefaultTableCellRenderer();
		CompletedRender.setHorizontalAlignment(JLabel.CENTER);
		studentCompletedTable.setForeground(new Color(35, 45, 65));
		studentCompletedTable.setBackground(new Color(255, 255, 255));
		studentCompletedTable.setFont(new Font("Dialog", Font.PLAIN, 10));
		
		int CompletedSize = studentCompletedTable.getColumnCount();
		JTableHeader completedHeader = studentCompletedTable.getTableHeader();
		completedHeader.setBackground(new Color(35,45,65));
		completedHeader.setForeground(Color.WHITE);
		completedHeader.setFont(new Font("Dialog", Font.BOLD, 12));
		for(int i=0;i<CompletedSize;i++)
		{
			studentCompletedTable.getColumnModel().getColumn(i).setCellRenderer(CompletedRender);
			studentCompletedTable.getColumnModel().getColumn(i).setResizable(false);
	    }
		ArrayList <StudentIssues> completedList = new ArrayList<StudentIssues>();
		try 
		{
			String id=null;
			String category=null;
			String subcategory=null;
			String severity=null;
			String location=null;
			String subjectMatter=null;
			String filepath=null;
			String description = null;
			String date=null;
			String time=null;
			BufferedReader in = new BufferedReader(new FileReader("Student_completed_issues.txt"));
			String Line = null;
			int Number = 0;
			while( (Line = in.readLine() )!=null)
			{
				++Number;
                switch(Number)
                {
	                case 1: id = Line;
	                case 2: category = Line;
	                case 3: subcategory = Line;
	                case 4: severity = Line;
	                case 5: location = Line;
	                case 6: subjectMatter = Line;
	                case 7: filepath = Line;
	                case 8: description = Line;
	                case 9: date = Line;
	                case 10:time = Line;
	                default: { break; }
                }
                if(Number==10)
                {
                	StudentIssues st = new StudentIssues();
                	completedList.add(st.lodge_issue(id,category,subcategory,severity,location,subjectMatter, filepath, description,date,time));
                	Number = 0;
                	
                }
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		cnt = 0;
		for(StudentIssues issues : completedList)
		{
			CompletedRow[cnt++] = issues.ID;
			CompletedRow[cnt++] = issues.category;
			CompletedRow[cnt++] = issues.subcategory;
			CompletedRow[cnt++] = issues.severity;
			CompletedRow[cnt++] = issues.location;
			CompletedRow[cnt++] = issues.date;
			CompletedRow[cnt++] = issues.time;
			completedModel.addRow(CompletedRow);
			cnt = 0;
			
		}
		
		studentCompletedTable.getColumnModel().getColumn(0).setPreferredWidth(0);
		studentCompletedTable.getColumnModel().getColumn(1).setPreferredWidth(30);
		studentCompletedTable.getColumnModel().getColumn(2).setPreferredWidth(30);
		studentCompletedTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		studentCompletedTable.getColumnModel().getColumn(4).setPreferredWidth(10);
		studentCompletedTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		studentCompletedTable.getColumnModel().getColumn(6).setPreferredWidth(20);
		
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
		
		JLabel staffPendingLabel_1 = new JLabel("Pending");
		staffPendingLabel_1.setForeground(Color.WHITE);
		staffPendingLabel_1.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		staffPendingLabel_1.setBounds(56, 100, 57, 13);
		pendingStudentIssueButton.add(staffPendingLabel_1);
		
		
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
		
		JLabel staffPendingLabel = new JLabel("Pending");
		staffPendingLabel.setForeground(Color.WHITE);
		staffPendingLabel.setFont(new Font("Poppins Medium", Font.PLAIN, 11));
		staffPendingLabel.setBounds(56, 97, 57, 13);
		staffPendingIssueButton.add(staffPendingLabel);
		

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
		
		JPanel adminAddDelStaffPanel = new JPanel();
		adminAddDelStaffPanel.setLayout(null);
		adminAddDelStaffPanel.setBackground(Color.WHITE);
		adminPane.addTab("New tab", null, adminAddDelStaffPanel, null);
		
		JPanel studentWelcomePanel = new JPanel();
		studentWelcomePanel.setLayout(null);
		studentWelcomePanel.setBorder(null);
		studentWelcomePanel.setBackground(new Color(51, 181, 165));
		studentWelcomePanel.setBounds(0, 0, 762, 103);
		adminAddDelStaffPanel.add(studentWelcomePanel);
		
		JLabel lblAddStaffsBy = new JLabel("Add staffs by filling up necessary information");
		lblAddStaffsBy.setForeground(Color.WHITE);
		lblAddStaffsBy.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAddStaffsBy.setBounds(25, 42, 321, 23);
		studentWelcomePanel.add(lblAddStaffsBy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 140, 671, 160);
		adminAddDelStaffPanel.add(scrollPane);
		
		staffInfoTable = new JTable();
		scrollPane.setViewportView(staffInfoTable);
		
		DefaultTableModel staffModel = new DefaultTableModel();
		Object[] staffColumn = {"Name","ID","Password","Department","Email Address","Phone Number"};
		Object[] staffRow = new Object[10];
		staffModel.setColumnIdentifiers(staffColumn);
		staffInfoTable.setModel(staffModel);
		DefaultTableCellRenderer staffRender = new DefaultTableCellRenderer();
		staffRender.setHorizontalAlignment(JLabel.CENTER);
		staffInfoTable.setForeground(new Color(35, 45, 65));
		staffInfoTable.setBackground(new Color(255, 255, 255));
		staffInfoTable.setFont(new Font("Dialog", Font.PLAIN, 10));
	
		int staffSize = staffInfoTable.getColumnCount();
		JTableHeader staffHeader = staffInfoTable.getTableHeader();
		staffHeader.setBackground(new Color(35,45,65));
		staffHeader.setForeground(Color.WHITE);
		staffHeader.setFont(new Font("Dialog", Font.BOLD, 12));
		for(int i=0;i<staffSize;i++)
		{
			staffInfoTable.getColumnModel().getColumn(i).setCellRenderer(staffRender);
			staffInfoTable.getColumnModel().getColumn(i).setResizable(false);
	    }
		
		staffInfoTable.getColumnModel().getColumn(0).setPreferredWidth(30);
		staffInfoTable.getColumnModel().getColumn(1).setPreferredWidth(10);
		staffInfoTable.getColumnModel().getColumn(2).setPreferredWidth(30);
		staffInfoTable.getColumnModel().getColumn(3).setPreferredWidth(20);
		staffInfoTable.getColumnModel().getColumn(4).setPreferredWidth(10);
		staffInfoTable.getColumnModel().getColumn(5).setPreferredWidth(20);
		
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setViewportBorder(null);
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("Staff_info.txt"));
			String Line=null;
			while((Line=in.readLine())!=null)
			{
				//Object[] staffColumn = {"Name","ID","Password","Department","Email Address","Phone Number"};
				cnt=0;
				String[] spliced = Line.split("\\s+");
				staffRow[cnt++]=spliced[2];
				staffRow[cnt++]=spliced[0];
				staffRow[cnt++]=spliced[1];
				staffRow[cnt++]=spliced[3];
				staffRow[cnt++]=spliced[4];
				staffRow[cnt++]=spliced[5];
				staffModel.addRow(staffRow);
				
			}
			in.close();
		}
		catch(Exception e)
		{
			
		}
		
		JButton staffAddButton = new JButton("Add"); ///use arraylist to add staffs
		staffAddButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int cnt = 0;
				try 
				{
					Admin admin = new Admin(staffIDVariable,staffPasswordVariable,staffNameVariable,staffDeptVariable,staffEmailVariable,staffPhoneVariable);
				} 
				catch (FileNotFoundException e1) 
				{
					e1.printStackTrace();
				} catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			    staffRow[cnt++]=staffNameVariable;
			    staffRow[cnt++]=staffIDVariable;
			    staffRow[cnt++]=staffPasswordVariable;
			    staffRow[cnt++]=staffDeptVariable;
			    staffRow[cnt++]=staffEmailVariable;
			    staffRow[cnt++]=staffPhoneVariable;
			    staffModel.addRow(staffRow);
			    
			}
		});
		staffAddButton.setForeground(Color.WHITE);
		staffAddButton.setFont(new Font("Dialog", Font.BOLD, 15));
		staffAddButton.setFocusPainted(false);
		staffAddButton.setBorder(null);
		staffAddButton.setBackground(new Color(51, 181, 165));
		staffAddButton.setBounds(197, 529, 164, 38);
		adminAddDelStaffPanel.add(staffAddButton);
		
		staffName = new JTextField();
		staffName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffNameVariable = staffName.getText();
			}
		});
		staffName.setColumns(10);
		staffName.setBounds(43, 360, 312, 19);
		adminAddDelStaffPanel.add(staffName);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_3.setBounds(43, 340, 100, 13);
		adminAddDelStaffPanel.add(lblNewLabel_3);
		
		staffID = new JTextField();
		staffID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffIDVariable = staffID.getText();
			}
		});
		staffID.setColumns(10);
		staffID.setBounds(43, 415, 312, 19);
		adminAddDelStaffPanel.add(staffID);
		
		JLabel lblStudentId_1_1 = new JLabel("STAFF ID");
		lblStudentId_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblStudentId_1_1.setBounds(43, 392, 100, 13);
		adminAddDelStaffPanel.add(lblStudentId_1_1);
		
		JLabel Password_1 = new JLabel("STAFF PASSWORD");
		Password_1.setFont(new Font("Dialog", Font.BOLD, 11));
		Password_1.setBounds(377, 340, 174, 13);
		adminAddDelStaffPanel.add(Password_1);
		
		staffPassword = new JTextField();
		staffPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffPasswordVariable = staffPassword.getText();
			}
		});
		staffPassword.setColumns(10);
		staffPassword.setBounds(377, 360, 312, 19);
		adminAddDelStaffPanel.add(staffPassword);
		
		JLabel DEPARTMENT = new JLabel("DEPARTMENT");
		DEPARTMENT.setFont(new Font("Dialog", Font.BOLD, 11));
		DEPARTMENT.setBounds(377, 392, 126, 13);
		adminAddDelStaffPanel.add(DEPARTMENT);
		
		staffPhone = new JTextField();
		staffPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffPhoneVariable = staffPhone.getText();
			}
		});
		staffPhone.setColumns(10);
		staffPhone.setBounds(377, 467, 312, 19);
		adminAddDelStaffPanel.add(staffPhone);
		
		staffEmail = new JTextField();
		staffEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffEmailVariable = staffEmail.getText();
			}
		});
		staffEmail.setColumns(10);
		staffEmail.setBounds(43, 467, 312, 19);
		adminAddDelStaffPanel.add(staffEmail);
		
		JLabel lblPhoneNumber_1 = new JLabel("EMAIL ADDRESS");
		lblPhoneNumber_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPhoneNumber_1.setBounds(43, 444, 139, 13);
		adminAddDelStaffPanel.add(lblPhoneNumber_1);
		
		JLabel lblPhoneNumber_2_1 = new JLabel("PHONE NUMBER");
		lblPhoneNumber_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPhoneNumber_2_1.setBounds(377, 444, 139, 13);
		adminAddDelStaffPanel.add(lblPhoneNumber_2_1);
		
		staffDept = new JTextField();
		staffDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDeptVariable = staffDept.getText();
			}
		});
		staffDept.setColumns(10);
		staffDept.setBounds(377, 415, 312, 19);
		adminAddDelStaffPanel.add(staffDept);
		
		JButton studentDeleteButton = new JButton("Delete");
		studentDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = staffInfoTable.getSelectedRow();
				String val = staffInfoTable.getModel().getValueAt(i,1).toString();
				staffModel.removeRow(i);
				Admin admin = new Admin(); 
				try 
				{
					admin.deleteStaff(val);
				}
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
		studentDeleteButton.setForeground(Color.WHITE);
		studentDeleteButton.setFont(new Font("Dialog", Font.BOLD, 15));
		studentDeleteButton.setFocusPainted(false);
		studentDeleteButton.setBorder(null);
		studentDeleteButton.setBackground(new Color(51, 181, 165));
		studentDeleteButton.setBounds(393, 529, 164, 38);
		adminAddDelStaffPanel.add(studentDeleteButton);	
		
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
				dashboardDecorOptional.setVisible(true);
			}
		});
		adminProfileButton.setForeground(new Color(206, 209, 217));
		adminProfileButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminProfileButton.setFocusPainted(false);
		adminProfileButton.setBorder(null);
		adminProfileButton.setBackground(new Color(35, 45, 65));
		adminProfileButton.setBounds(0, 142, 353, 44);
		adminSideDecorPanel.add(adminProfileButton);
		
		JButton adminAddDeleteStaffButton = new JButton("Add/Delete Staff");
		adminAddDeleteStaffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPane.setSelectedIndex(3);
				dashboardDecorOptional.setVisible(false);
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
		adminAddDeleteStaffButton.setBounds(0, 185, 353, 44);
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
				adminPane.setSelectedIndex(2);
				dashboardDecorOptional.setVisible(false);

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
		adminAddressFeedback.setBounds(0, 270, 353, 44);
		adminSideDecorPanel.add(adminAddressFeedback);
		
		JButton adminViewStudentButton = new JButton("View Student");
		adminViewStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminPane.setSelectedIndex(1);
				dashboardDecorOptional.setVisible(false);
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
		adminViewStudentButton.setBounds(0, 228, 353, 44);
		adminSideDecorPanel.add(adminViewStudentButton);

		JLabel adminDashboardLabel = new JLabel("D A S H B O A R D");
		adminDashboardLabel.setBounds(88, 48, 178, 19);
		dashboardDecorOptional.add(adminDashboardLabel);
		adminDashboardLabel.setForeground(new Color(255, 255, 255));
		adminDashboardLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel adminDashboardLabel_1 = new JLabel("D A S H B O A R D");
		adminDashboardLabel_1.setForeground(Color.WHITE);
		adminDashboardLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		adminDashboardLabel_1.setBounds(88, 48, 178, 19);
		adminSideDecorPanel.add(adminDashboardLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(29, 87, 300, 1);
		adminSideDecorPanel.add(separator);
		
	}
}
