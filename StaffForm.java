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
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StaffForm extends JFrame {

	private JPanel contentPane;
	String firstname,lastname,ID,level,number,pwd,mail,batch;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;
	private JTextField textField_4;
	DefaultTableModel model;
	private JTable studentTable;
	private JButton add;
	private JButton update;
	private JTextField updateName;
	private JTextField updateID;
	private JTextField updatePwd;
	private JTextField updateNumber;
	private JTextField updateMail;
	private JTextField updateBatch;
	private final ButtonGroup studentLevel = new ButtonGroup();
	private JRadioButton level2,level1,level3,level4;
	private JTextField studentFirstName;
	private JTextField studentLastName;
	private JTextField studentID;
	private JTextField stuLevel;
	private JTextField studentNumber;
	private JTextField studentPwd;
	private JTextField studentMail;
	private JTextField studentBatch;

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
		
		JPanel studentWelcomePanel = new JPanel();
		studentWelcomePanel.setLayout(null);
		studentWelcomePanel.setBorder(null);
		studentWelcomePanel.setBackground(new Color(51, 181, 165));
		studentWelcomePanel.setBounds(0, 58, 768, 141);
		staffProfilePanel.add(studentWelcomePanel);
		
		JLabel lblWelcomeToStaff = new JLabel("Welcome to Staff Module");
		lblWelcomeToStaff.setForeground(Color.WHITE);
		lblWelcomeToStaff.setFont(new Font("Dialog", Font.BOLD, 16));
		lblWelcomeToStaff.setBounds(24, 37, 273, 23);
		studentWelcomePanel.add(lblWelcomeToStaff);
		
		JLabel lblNewLabel_2_1 = new JLabel("MIST CSE Feedback System");
		lblNewLabel_2_1.setForeground(new Color(163, 163, 163));
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_2_1.setBounds(21, 20, 192, 23);
		staffProfilePanel.add(lblNewLabel_2_1);
		
		JLabel staffIcon = new JLabel("");
		staffIcon.setBounds(438, 265, 256, 256);
		staffProfilePanel.add(staffIcon);
		
		Image staffImg = new ImageIcon(this.getClass().getResource("/userIcon.png")).getImage();
		staffIcon.setIcon(new ImageIcon(staffImg));
		
		JPanel staffViewFeedbackPanel = new JPanel();
		staffDashboardPane.addTab("New tab", null, staffViewFeedbackPanel, null);
		
		JPanel staffViewStudentPanel = new JPanel();
		staffViewStudentPanel.setBackground(new Color(255, 255, 255));
		staffDashboardPane.addTab("New tab", null, staffViewStudentPanel, null);
		staffViewStudentPanel.setLayout(null);
		
		JPanel topDecorPanel3 = new JPanel();
		topDecorPanel3.setLayout(null);
		topDecorPanel3.setBackground(new Color(51, 181, 165));
		topDecorPanel3.setBounds(0, 0, 751, 103);
		staffViewStudentPanel.add(topDecorPanel3);
		
		JLabel lblNewLabel_1_2 = new JLabel("View/Delete/Update Student Information");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(35, 48, 397, 20);
		topDecorPanel3.add(lblNewLabel_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(0, 0, 6, 10));
		scrollPane.setSize(new Dimension(4, 4));
		scrollPane.setPreferredSize(new Dimension(5, 2));
		scrollPane.setFont(new Font("Dialog", Font.PLAIN, 15));
		scrollPane.setFocusable(false);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBorder(null);
		scrollPane.setBounds(20, 134, 695, 152);
		
		
		studentTable = new JTable();
		studentTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int i = studentTable.getSelectedRow();
				updateName.setText(studentTable.getModel().getValueAt(i, 0).toString());
				updateID.setText(studentTable.getModel().getValueAt(i, 1).toString());
				updatePwd.setText(studentTable.getModel().getValueAt(i, 2).toString());
				updateBatch.setText(studentTable.getModel().getValueAt(i, 3).toString());
				updateMail.setText(studentTable.getModel().getValueAt(i, 5).toString());
				updateNumber.setText(studentTable.getModel().getValueAt(i, 6).toString());
				String j = studentTable.getModel().getValueAt(i, 4).toString();
				if(j.equals("1"))
				{
					level1.setSelected(true);
				}
				else if(j.equals("2"))
				{
					level2.setSelected(true);
				}
				else if(j.equals("3"))
				{
					level3.setSelected(true);
				}
				else if(j.equals("4"))
				{
					level4.setSelected(true);
				}
			}
		});
		model = new DefaultTableModel();
		Object[] column = {"Name","Student ID", "Password","Batch","Level","Email","Phone Number"};
		Object[] row = new Object[7];
		model.setColumnIdentifiers(column);
		studentTable.setModel(model);
		DefaultTableCellRenderer Center = new DefaultTableCellRenderer();
	    Center.setHorizontalAlignment(JLabel.CENTER);
	    studentTable.setForeground(new Color(35, 45, 65));
		studentTable.setBackground(new Color(255, 255, 255));
		studentTable.setFont(new Font("Dialog", Font.PLAIN, 10));
		scrollPane.setViewportView(studentTable);
		int sz = studentTable.getColumnCount();
		JTableHeader Header = studentTable.getTableHeader();
		Header.setBackground(new Color(35,45,65));
		Header.setForeground(new Color(206,209,217));
		Header.setFont(new Font("Dialog", Font.BOLD, 12));
		for(int i=0;i<sz;i++)
		{
	         studentTable.getColumnModel().getColumn(i).setCellRenderer(Center);
	    }
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader("Student_info.txt"));
			String Line = null;
		
			while( (Line = in.readLine() )!=null)
			{
				//System.out.println(Line);
				String spliced[] = Line.split("\\s+");
				row[0]=spliced[2]+" "+spliced[3];
				row[1]=spliced[0];
				row[2]=spliced[1];
				row[3]=spliced[7];
				row[4]=spliced[4];
				row[5]=spliced[6];
				row[6]=spliced[5];
				model.addRow(row);
			}
			in.close();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		}
		studentTable.getColumnModel().getColumn(0).setResizable(false);
		studentTable.getColumnModel().getColumn(0).setPreferredWidth(80);
		studentTable.getColumnModel().getColumn(1).setResizable(false);
		studentTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		studentTable.getColumnModel().getColumn(2).setPreferredWidth(80);
		studentTable.getColumnModel().getColumn(2).setResizable(false);
		studentTable.getColumnModel().getColumn(3).setPreferredWidth(40);
		studentTable.getColumnModel().getColumn(4).setResizable(false);
		studentTable.getColumnModel().getColumn(4).setPreferredWidth(20);
		studentTable.getColumnModel().getColumn(5).setPreferredWidth(80);
		studentTable.getColumnModel().getColumn(5).setResizable(false);
		studentTable.getColumnModel().getColumn(6).setPreferredWidth(80);
		studentTable.getColumnModel().getColumn(6).setResizable(false);
		
		
		
		JButton studentUpdateButton = new JButton("Update");
		studentUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		studentUpdateButton.setForeground(Color.WHITE);
		studentUpdateButton.setFont(new Font("Dialog", Font.BOLD, 15));
		studentUpdateButton.setFocusPainted(false);
		studentUpdateButton.setBorder(null);
		studentUpdateButton.setBackground(new Color(51, 181, 165));
		studentUpdateButton.setBounds(379, 545, 164, 38);
		staffViewStudentPanel.add(studentUpdateButton);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname = studentFirstName.getText();
			    lastname = studentLastName.getText();
			    ID = studentID.getText();
				pwd = studentPwd.getText();
				batch = studentBatch.getText();
				level = stuLevel.getText();
				number = studentNumber.getText();
				mail = studentMail.getText();
				Staff st = new Staff();
				try {
					
					//Object[] column = {"Name","Student ID", "Password","Batch","Level","Email","Phone Number"};
					st.Create_student(ID, pwd, firstname, lastname, number, level, mail, batch);
					row[0] = firstname+" "+lastname;
					row[1] = ID;
					row[2] = pwd;
					row[3] = batch;
					row[4] = level;
					row[5] = mail;
					row[6] = number;
					model.addRow(row);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
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
		
		
		
		
		
		
		staffViewStudentPanel.add(scrollPane);
		
		
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setViewportBorder(null);
		
		
		
		
		updateName = new JTextField();
		updateName.setColumns(10);
		updateName.setBounds(45, 329, 312, 19);
		staffViewStudentPanel.add(updateName);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_3.setBounds(45, 309, 100, 13);
		staffViewStudentPanel.add(lblNewLabel_3);
		
		updateID = new JTextField();
		updateID.setColumns(10);
		updateID.setBounds(45, 384, 312, 19);
		staffViewStudentPanel.add(updateID);
		
		JLabel lblStudentId_1_1 = new JLabel("STUDENT ID");
		lblStudentId_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblStudentId_1_1.setBounds(45, 361, 100, 13);
		staffViewStudentPanel.add(lblStudentId_1_1);
		
		JLabel Password_1 = new JLabel("STUDENT PASSWORD");
		Password_1.setFont(new Font("Dialog", Font.BOLD, 11));
		Password_1.setBounds(379, 309, 174, 13);
		staffViewStudentPanel.add(Password_1);
		
		updatePwd = new JTextField();
		updatePwd.setColumns(10);
		updatePwd.setBounds(379, 329, 312, 19);
		staffViewStudentPanel.add(updatePwd);
		
		JLabel lblLevel_1 = new JLabel("BATCH");
		lblLevel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblLevel_1.setBounds(379, 361, 72, 13);
		staffViewStudentPanel.add(lblLevel_1);
		
		updateNumber = new JTextField();
		updateNumber.setColumns(10);
		updateNumber.setBounds(379, 436, 312, 19);
		staffViewStudentPanel.add(updateNumber);
		
		updateMail = new JTextField();
		updateMail.setColumns(10);
		updateMail.setBounds(45, 436, 312, 19);
		staffViewStudentPanel.add(updateMail);
		
		JLabel lblLevel_2_1 = new JLabel("STUDENT LEVEL");
		lblLevel_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLevel_2_1.setBounds(45, 484, 100, 13);
		staffViewStudentPanel.add(lblLevel_2_1);
		
		JLabel lblPhoneNumber_1 = new JLabel("EMAIL ADDRESS");
		lblPhoneNumber_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPhoneNumber_1.setBounds(45, 413, 139, 13);
		staffViewStudentPanel.add(lblPhoneNumber_1);
		
		JLabel lblPhoneNumber_2_1 = new JLabel("PHONE NUMBER");
		lblPhoneNumber_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPhoneNumber_2_1.setBounds(379, 413, 139, 13);
		staffViewStudentPanel.add(lblPhoneNumber_2_1);
		
		updateBatch = new JTextField();
		updateBatch.setColumns(10);
		updateBatch.setBounds(379, 384, 312, 19);
		staffViewStudentPanel.add(updateBatch);
		
		level1 = new JRadioButton("Level 1");
		studentLevel.add(level1);
		level1.setBorder(null);
		level1.setFocusPainted(false);
		level1.setBackground(new Color(255, 255, 255));
		level1.setFont(new Font("Dialog", Font.PLAIN, 11));
		level1.setBounds(174, 480, 54, 21);
		staffViewStudentPanel.add(level1);
		
		level2 = new JRadioButton("Level 2");
		studentLevel.add(level2);
		level2.setFont(new Font("Dialog", Font.PLAIN, 11));
		level2.setFocusPainted(false);
		level2.setBorder(null);
		level2.setBackground(Color.WHITE);
		level2.setBounds(278, 480, 60, 21);
		staffViewStudentPanel.add(level2);
		
		level3 = new JRadioButton("Level 3");
		studentLevel.add(level3);
		level3.setFont(new Font("Dialog", Font.PLAIN, 11));
		level3.setFocusPainted(false);
		level3.setBorder(null);
		level3.setBackground(Color.WHITE);
		level3.setBounds(379, 480, 60, 21);
		staffViewStudentPanel.add(level3);
		
		level4 = new JRadioButton("Level 4");
		studentLevel.add(level4);
		level4.setFont(new Font("Dialog", Font.PLAIN, 11));
		level4.setFocusPainted(false);
		level4.setBorder(null);
		level4.setBackground(Color.WHITE);
		level4.setBounds(479, 480, 72, 21);
		staffViewStudentPanel.add(level4);
		
		
		
		JPanel StaffAddStudentPanel = new JPanel();
		StaffAddStudentPanel.setLayout(null);
		StaffAddStudentPanel.setForeground(Color.BLACK);
		StaffAddStudentPanel.setBackground(Color.WHITE);
		staffDashboardPane.addTab("New tab", null, StaffAddStudentPanel, null);
		
		studentFirstName = new JTextField();
		studentFirstName.setColumns(10);
		studentFirstName.setBounds(40, 170, 312, 19);
		StaffAddStudentPanel.add(studentFirstName);
		
		studentLastName = new JTextField();
		studentLastName.setColumns(10);
		studentLastName.setBounds(383, 170, 312, 19);
		StaffAddStudentPanel.add(studentLastName);
		
		studentID = new JTextField();
		studentID.setColumns(10);
		studentID.setBounds(40, 274, 312, 19);
		StaffAddStudentPanel.add(studentID);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 147, 100, 13);
		StaffAddStudentPanel.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name ");
		lblLastName.setForeground(Color.GRAY);
		lblLastName.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblLastName.setBounds(393, 198, 100, 13);
		StaffAddStudentPanel.add(lblLastName);
		
		JLabel lblStudentId_1 = new JLabel("STUDENT ID");
		lblStudentId_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblStudentId_1.setBounds(40, 251, 100, 13);
		StaffAddStudentPanel.add(lblStudentId_1);
		
		JLabel lblLevel = new JLabel("BATCH");
		lblLevel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLevel.setBounds(40, 344, 72, 13);
		StaffAddStudentPanel.add(lblLevel);
		
		stuLevel = new JTextField();
		stuLevel.setColumns(10);
		stuLevel.setBounds(383, 365, 312, 19);
		StaffAddStudentPanel.add(stuLevel);
		
		studentNumber = new JTextField();
		studentNumber.setColumns(10);
		studentNumber.setBounds(383, 451, 312, 19);
		StaffAddStudentPanel.add(studentNumber);
		
		
		
		JButton studentDeleteButton = new JButton("Delete");
		studentDeleteButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int result = JOptionPane.showConfirmDialog(null, "Delete Student?","Confirmation",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION)
				{
					int i = studentTable.getSelectedRow();
					String val = studentTable.getModel().getValueAt(i,1).toString();
					model.removeRow(i);
					Staff st = new Staff();
					try {
						//System.out.println(val);
						st.Delete_student(val);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			    }
			}
		});
		studentDeleteButton.setForeground(Color.WHITE);
		studentDeleteButton.setFont(new Font("Dialog", Font.BOLD, 15));
		studentDeleteButton.setFocusPainted(false);
		studentDeleteButton.setBorder(null);
		studentDeleteButton.setBackground(new Color(51, 181, 165));
		studentDeleteButton.setBounds(193, 545, 164, 38);
		staffViewStudentPanel.add(studentDeleteButton);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 181, 165));
		btnNewButton.setBounds(170, 522, 174, 38);
		StaffAddStudentPanel.add(btnNewButton);
		
		JLabel Password = new JLabel("STUDENT PASSWORD");
		Password.setFont(new Font("Dialog", Font.BOLD, 12));
		Password.setBounds(383, 251, 174, 13);
		StaffAddStudentPanel.add(Password);
		
		studentPwd = new JTextField();
		studentPwd.setColumns(10);
		studentPwd.setBounds(383, 274, 312, 19);
		StaffAddStudentPanel.add(studentPwd);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 181, 165));
		panel.setBounds(0, 0, 751, 103);
		StaffAddStudentPanel.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Kindly fill up the form with necessary information");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(40, 48, 397, 20);
		panel.add(lblNewLabel_1);
		
		studentMail = new JTextField();
		studentMail.setColumns(10);
		studentMail.setBounds(40, 451, 312, 19);
		StaffAddStudentPanel.add(studentMail);
		
		JLabel lblFirstName = new JLabel("First Name ");
		lblFirstName.setForeground(Color.GRAY);
		lblFirstName.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblFirstName.setBounds(40, 198, 100, 13);
		StaffAddStudentPanel.add(lblFirstName);
		
		JLabel lblLevel_2 = new JLabel("LEVEL");
		lblLevel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLevel_2.setBounds(383, 344, 72, 13);
		StaffAddStudentPanel.add(lblLevel_2);
		
		JLabel lblPhoneNumber = new JLabel("EMAIL ADDRESS");
		lblPhoneNumber.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPhoneNumber.setBounds(40, 428, 139, 13);
		StaffAddStudentPanel.add(lblPhoneNumber);
		
		JLabel lblPhoneNumber_2 = new JLabel("PHONE NUMBER");
		lblPhoneNumber_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPhoneNumber_2.setBounds(384, 428, 139, 13);
		StaffAddStudentPanel.add(lblPhoneNumber_2);
		
		JLabel lblMustBeAt = new JLabel("Must be at least 8 characters");
		lblMustBeAt.setForeground(Color.GRAY);
		lblMustBeAt.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMustBeAt.setBounds(383, 303, 190, 13);
		StaffAddStudentPanel.add(lblMustBeAt);
		
		studentBatch = new JTextField();
		studentBatch.setColumns(10);
		studentBatch.setBounds(40, 365, 312, 19);
		StaffAddStudentPanel.add(studentBatch);
		
		JButton btnClearForm = new JButton("Clear Form");
		btnClearForm.setForeground(Color.WHITE);
		btnClearForm.setFont(new Font("Dialog", Font.BOLD, 15));
		btnClearForm.setFocusPainted(false);
		btnClearForm.setBorder(null);
		btnClearForm.setBackground(new Color(51, 181, 165));
		btnClearForm.setBounds(383, 522, 174, 38);
		StaffAddStudentPanel.add(btnClearForm);
		
		//panel.add(add1);
		
		/*JButton delete = new JButton("delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table_2.getSelectedRow();
				model.removeRow(i);
			}
		});
		delete.setBounds(80, 249, 85, 21);
		panel.add(delete);
		
		update = new JButton("update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table_2.getSelectedRow();
				model.setValueAt("mose", i, 0);
				model.setValueAt("202114005", i, 1);
			}
		});
		update.setBounds(80, 299, 85, 21);
		panel.add(update);*/
		
	
		
		JButton adminLogoutButton = new JButton("Logout");
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
		adminLogoutButton.addActionListener(new ActionListener() 
		{
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
		adminLogoutButton.setForeground(new Color(206, 209, 217));
		adminLogoutButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminLogoutButton.setFocusPainted(false);
		adminLogoutButton.setBorder(null);
		adminLogoutButton.setBackground(new Color(35, 45, 65));
		adminLogoutButton.setBounds(0, 532, 353, 44);
		staffSideDecorPanel.add(adminLogoutButton);
		
		JButton btnAdddeleteStudent = new JButton("Add Student");
		btnAdddeleteStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAdddeleteStudent.setBackground(new Color(53,68,98));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAdddeleteStudent.setBackground(new Color(35,45,65));
			}
		});
		btnAdddeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDashboardPane.setSelectedIndex(4);
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
		btnGiveFeedback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGiveFeedback.setBackground(new Color(53,68,98));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnGiveFeedback.setBackground(new Color(35,45,65));
			}
		});
		btnGiveFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDashboardPane.setSelectedIndex(3);
			}
		});
		btnGiveFeedback.setForeground(new Color(206, 209, 217));
		btnGiveFeedback.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnGiveFeedback.setFocusPainted(false);
		btnGiveFeedback.setBorder(null);
		btnGiveFeedback.setBackground(new Color(35, 45, 65));
		btnGiveFeedback.setBounds(0, 304, 353, 44);
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
		adminProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDashboardPane.setSelectedIndex(0);
			}
			
		});
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
		adminProfileButton.setForeground(new Color(206, 209, 217));
		adminProfileButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminProfileButton.setFocusPainted(false);
		adminProfileButton.setBorder(null);
		adminProfileButton.setBackground(new Color(35, 45, 65));
		adminProfileButton.setBounds(0, 176, 353, 44);
		staffSideDecorPanel.add(adminProfileButton);
		
		JButton btnViewFeedbackStatus = new JButton("View Feedback Status");
		btnViewFeedbackStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDashboardPane.setSelectedIndex(1);
			}
		});
		btnViewFeedbackStatus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnViewFeedbackStatus.setBackground(new Color(53,68,98));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnViewFeedbackStatus.setBackground(new Color(35,45,65));
			}
		});
		btnViewFeedbackStatus.setForeground(new Color(206, 209, 217));
		btnViewFeedbackStatus.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnViewFeedbackStatus.setFocusPainted(false);
		btnViewFeedbackStatus.setBorder(null);
		btnViewFeedbackStatus.setBackground(new Color(35, 45, 65));
		btnViewFeedbackStatus.setBounds(0, 347, 353, 44);
		staffSideDecorPanel.add(btnViewFeedbackStatus);
		
		JButton staffDelStudentButton = new JButton("View/Delete Student");
		staffDelStudentButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				staffDelStudentButton.setBackground(new Color(53,68,98));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				staffDelStudentButton.setBackground(new Color(35,45,65));
			}
		});
		staffDelStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffDashboardPane.setSelectedIndex(2);
			}
		});
		staffDelStudentButton.setForeground(new Color(206, 209, 217));
		staffDelStudentButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		staffDelStudentButton.setFocusPainted(false);
		staffDelStudentButton.setBorder(null);
		staffDelStudentButton.setBackground(new Color(35, 45, 65));
		staffDelStudentButton.setBounds(0, 262, 353, 44);
		staffSideDecorPanel.add(staffDelStudentButton);
		
	
	}
}
