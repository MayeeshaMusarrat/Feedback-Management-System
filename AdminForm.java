import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class LoginForm 
{

	JFrame Loginregister;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	Boolean id_Enabled = false,	pwd_Enabled = false, registerGranted = false;
	private JTextField idField;
	private JPasswordField pwdField;
	private JTextField adminIDTextField;
	private JPasswordField adminPwdTextField;
	private JPasswordField confirmPwdTextField;
	public String userType="null";
	public String adminID, adminPwd="",confirm="",id,pwd;

	/*** Launch the application. ***/
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.Loginregister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		Loginregister = new JFrame();
		Loginregister.setLocationByPlatform(true);
		Loginregister.setTitle("Login/Register");
		Loginregister.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 10));
		Loginregister.setResizable(false);
		Loginregister.setBackground(new Color(255, 255, 255));
		Loginregister.getContentPane().setBackground(new Color(34, 45, 65));
		Loginregister.setForeground(new Color(255, 255, 255));
		Loginregister.getContentPane().setForeground(new Color(182, 186, 197));
		Loginregister.setBounds(100, 100, 848, 569);
		Loginregister.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Loginregister.getContentPane().setLayout(null);
		//Loginregister.setUndecorated(true);
		
	
		
/// =============================================== CLOSE ICON =========================================================== ///
		
		         /// needs to be added at the last
		
		
				/*JLabel closeLabel = new JLabel("");
				Loginregister.getContentPane().add(closeLabel);
				closeLabel.setVisible(true);
				closeLabel.setLabelFor(Loginregister);
				closeLabel.addMouseListener(new MouseAdapter() 
				{
					@Override
					public void mousePressed(MouseEvent e) {
						System.exit(0);
					}
				});
			    closeLabel.setBounds(796, 22, 35, 21);
			    Loginregister.getContentPane().add(closeLabel);
			    Image closeImage = new ImageIcon(this.getClass().getResource("/close.png")).getImage();
			    closeLabel.setIcon(new ImageIcon(closeImage));*/
				
		
/// ============================================== START SIDE_DECOR PANEL ====================================================================== ///
				
				JPanel sideDecor = new JPanel();
				sideDecor.setBackground(new Color(95, 210, 195));
				sideDecor.setBounds(0, 0, 381, 567);
				Loginregister.getContentPane().add(sideDecor);
				sideDecor.setLayout(null);
				
				JLabel picLabel = new JLabel("");
				picLabel.setBounds(77, 90, 256, 338);
				sideDecor.add(picLabel);
				Image feedbackImg = new ImageIcon(this.getClass().getResource("/feedbackIcon.png")).getImage();
				picLabel.setIcon(new ImageIcon(feedbackImg));
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setForeground(new Color(255, 255, 255));
				separator_2.setBounds(50, 426, 266, 2);
				sideDecor.add(separator_2);
				
				JSeparator separator_2_1 = new JSeparator();
				separator_2_1.setForeground(Color.WHITE);
				separator_2_1.setBounds(85, 453, 198, 2);
				sideDecor.add(separator_2_1);
				
				JLabel projectName = new JLabel("MIST CSE Feedback Management System");
				projectName.setFont(new Font("Quicksand Medium", Font.BOLD, 15));
				projectName.setForeground(new Color(255, 255, 255));
				projectName.setBounds(38, 64, 313, 24);
				sideDecor.add(projectName);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(381, 0, 462, 533);
				sideDecor.add(panel_1);
		
		
		
		/// ===================================== START LOGIN PANEL ====================================================== ///
		

				JPanel loginPanel = new JPanel();
				loginPanel.setBounds(381, 0, 545, 532);
				Loginregister.getContentPane().add(loginPanel);
				loginPanel.setBackground(new Color(35, 45, 65));
				loginPanel.setLayout(null);
				
			
				JRadioButton admin = new JRadioButton("ADMIN");
				admin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						userType="Admin";
					}
				});
				buttonGroup.add(admin);
				admin.setForeground(new Color(182, 186, 197));
				admin.setFont(new Font("Dialog", Font.BOLD, 12));
				admin.setFocusPainted(false);
				admin.setBorder(null);
				admin.setBackground(new Color(34, 45, 65));
				admin.setBounds(55, 364, 63, 21);
				loginPanel.add(admin);
				
				JRadioButton staff = new JRadioButton("STAFF");
				staff.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						userType="Staff";
					}
				});
				buttonGroup.add(staff);
				staff.setForeground(new Color(182, 186, 197));
				staff.setFont(new Font("Dialog", Font.BOLD, 12));
				staff.setFocusPainted(false);
				staff.setBackground(new Color(34, 45, 65));
				staff.setBounds(191, 362, 63, 24);
				loginPanel.add(staff);
				
				JRadioButton student = new JRadioButton("STUDENT");
				student.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						userType="Student";
					}
				});
				buttonGroup.add(student);
				student.setForeground(new Color(182, 186, 197));
				student.setFont(new Font("Dialog", Font.BOLD, 12));
				student.setFocusPainted(false);
				student.setBackground(new Color(34, 45, 65));
				student.setBounds(318, 364, 83, 21);
				loginPanel.add(student);
			
				idField = new JTextField();
				idField.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						id = idField.getText();
					}
				});
				idField.setText("Enter your ID");
				idField.setForeground(new Color(182, 186, 197));
				idField.setFont(new Font("Dialog", Font.PLAIN, 10));
				idField.setColumns(10);
				idField.setBorder(null);
				idField.setBackground(new Color(34, 45, 65));
				idField.setBounds(55, 165, 307, 14);
				loginPanel.add(idField);
				idField.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) 
					{
						id_Enabled = true;
					}
				});
				
		        idField.addMouseListener(new MouseAdapter()  
				{
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						if(!id_Enabled)
						{
							idField.setText(null);
						    if(!pwd_Enabled)
						    	pwdField.setText("password");
						}
						else 
							return ;
					}
					
				});
    
			    JLabel Id_label = new JLabel("USER ID");
			    Id_label.setForeground(new Color(182, 186, 197));
			    Id_label.setFont(new Font("Dialog", Font.BOLD, 12));
			    Id_label.setBounds(55, 127, 49, 16);
			    loginPanel.add(Id_label);
			        
				JButton login = new JButton("Login");
				login.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						if(userType.equals("Student"))
						{
							///check student info in files 
							StudentForm studentPanel = new StudentForm();
							studentPanel.setVisible(true);
							Loginregister.dispose();
						}
						else if(userType.equals("Admin"))
						{
							//check login credentials here
							Boolean notGranted=true;
							try 
							{
								 BufferedReader verify = new BufferedReader(new FileReader("Admin_info.txt"));
					             String Line = null;
								 while ((Line = verify.readLine()) != null)
					                {
					                    String[] spliced = Line.split("\\s+");
					                    for(int i=0;i<spliced.length;++i)
					                    {
					                    	if(spliced[i].equals(id)==false || spliced[1].equals(pwd)==false)
						                    {	
						                    	notGranted=true;
						                    }

					                    	else if(spliced[i].equals(id)==true && spliced[1].equals(pwd)==true)
						                    {
						                    	notGranted=false;
						                    	break;
						                    }
					                    }
					                    if(!notGranted)
					                    	break;
					                }
							} 
							catch (IOException e2) 
							{
								e2.printStackTrace();
							}
							
							if(!notGranted)  //login ok
							{
								JOptionPane.showMessageDialog(null, "Login Successful!");
								AdminForm adminPanel = new AdminForm();
								adminPanel.setVisible(true);
								Loginregister.dispose();
							}
							else 
							{
								JOptionPane.showMessageDialog(null,"Login Unsuccessful!");
							}
							
						}
						else if(userType.equals("Staff"))
						{
							StaffForm staffPanel = new StaffForm();
							staffPanel.setVisible(true);
							Loginregister.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Incorrect Option" );
						}
					}
				});
				login.setForeground(new Color(34, 45, 65));
				login.setFont(new Font("Dialog", Font.BOLD, 13));
				login.setFocusPainted(false);
				login.setBorder(null); 
				login.setBackground(new Color(55, 196, 179));
				login.setBounds(55, 434, 153, 39);
				loginPanel.add(login);
				login.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						login.setBackground(new Color(136, 221, 210));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						login.setBackground(new Color(95, 210, 195));
					}
				});

		
				pwdField = new JPasswordField();
				pwdField.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pwd = new String(pwdField.getPassword());
					}
				});
				pwdField.setToolTipText("");
				pwdField.setText("Password");
				pwdField.setForeground(new Color(182, 186, 197));
				pwdField.setFont(new Font("Quicksand", Font.PLAIN, 12));
				pwdField.setBorder(null);
				pwdField.setBackground(new Color(34, 45, 65));
				pwdField.setBounds(55, 291, 307, 19);
				loginPanel.add(pwdField);
				pwdField.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						pwd_Enabled = true;
						
					}
				});
				pwdField.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						if(pwd_Enabled)
							return ;
						pwdField.setText(null);
						if(!id_Enabled)
							idField.setText("Enter your ID");
						
					}
				});
				
				JSeparator separator = new JSeparator();
				separator.setForeground(new Color(245, 245, 245));
				separator.setFocusable(false);
				separator.setBorder(null);
				separator.setBackground(new Color(245, 245, 245));
				separator.setBounds(55, 189, 341, 1);
				loginPanel.add(separator);
		
				JSeparator separator_1 = new JSeparator();
				separator_1.setForeground(new Color(245, 245, 245));
				separator_1.setBorder(null);
				separator_1.setBounds(55, 316, 341, 1);
				loginPanel.add(separator_1);
				
				JLabel pwd_Label = new JLabel("USER PASSWORD");
				pwd_Label.setForeground(new Color(182, 186, 197));
				pwd_Label.setFont(new Font("Dialog", Font.BOLD, 12));
				pwd_Label.setBounds(55, 253, 106, 16);
				loginPanel.add(pwd_Label);
				
				JLabel loginOrRegisterLabel = new JLabel("Login or Register");
				loginOrRegisterLabel.setForeground(new Color(182, 186, 197));
				loginOrRegisterLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
				loginOrRegisterLabel.setBounds(55, 67, 106, 13);
				loginPanel.add(loginOrRegisterLabel);
				
				
				JSeparator separator_3 = new JSeparator();
				separator_3.setBackground(Color.WHITE);
				separator_3.setBounds(269, 471, 100, 1);
				loginPanel.add(separator_3);
			
		
		
		
		/// ==============================================  START REGISTER ADMIN PANEL ============================================================ ///
		
		
				JPanel registerPanel = new JPanel();
				registerPanel.setForeground(new Color(255, 255, 255));
				registerPanel.setBounds(381, 0, 460, 532);
				Loginregister.getContentPane().add(registerPanel);
				registerPanel.setBackground(new Color(35, 45, 65));
				registerPanel.setLayout(null);
				
				JSeparator separator_4 = new JSeparator();
				separator_4.setForeground(new Color(245, 245, 245));
				separator_4.setBounds(55, 168, 341, 1);
				registerPanel.add(separator_4);
				
				
				adminIDTextField = new JTextField();
				adminIDTextField.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						adminID = adminIDTextField.getText();
					}
				});
				adminIDTextField.setBounds(55, 139, 354, 19);
				registerPanel.add(adminIDTextField);
				
				adminIDTextField.setForeground(new Color(182, 186, 197));
				adminIDTextField.setFont(new Font("Dialog", Font.PLAIN, 10));
				adminIDTextField.setBorder(null);
				adminIDTextField.setBackground(new Color(35, 45, 65));
				adminIDTextField.setColumns(10);
				
				JSeparator separator_5 = new JSeparator();
				separator_5.setForeground(new Color(245, 245, 245));
				separator_5.setBounds(55, 279, 341, 1);
				registerPanel.add(separator_5);
				
				JSeparator separator_6 = new JSeparator();
				separator_6.setForeground(new Color(245, 245, 245));
				separator_6.setBounds(55, 392, 341, 1);
				registerPanel.add(separator_6);
				
				JLabel registerLabel = new JLabel("Register");
				registerLabel.setForeground(new Color(182, 186, 197));
				registerLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
				registerLabel.setBounds(58, 55, 45, 13);
				registerPanel.add(registerLabel);
				
				JLabel adminIDLabel = new JLabel("ADMIN ID");
				adminIDLabel.setBounds(55, 103, 63, 13);
				registerPanel.add(adminIDLabel);
				adminIDLabel.setBackground(new Color(255, 255, 255));
				adminIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
				adminIDLabel.setForeground(new Color(182, 186, 197));
				adminIDLabel.setFont(new Font("Dialog", Font.BOLD, 12));
				adminIDLabel.setLabelFor(adminIDTextField);
				
				JLabel adminPwdLabel = new JLabel("ADMIN PASSWORD");
				adminPwdLabel.setForeground(new Color(182, 186, 197));
				adminPwdLabel.setFont(new Font("Dialog", Font.BOLD, 12));
				adminPwdLabel.setBounds(55, 217, 145, 13);
				registerPanel.add(adminPwdLabel);
				
				adminPwdTextField = new JPasswordField();
				adminPwdTextField.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						adminPwd = new String(adminPwdTextField.getPassword());
					}
				});
				adminPwdTextField.setForeground(new Color(182, 186, 197));
				adminPwdTextField.setBorder(null);
				adminPwdTextField.setBackground(new Color(35, 45, 65));
				adminPwdTextField.setBounds(55, 250, 341, 19);
				registerPanel.add(adminPwdTextField);
				
				JLabel confirmPwdLabel = new JLabel("CONFIRM ADMIN PASSWORD");
				confirmPwdLabel.setFont(new Font("Dialog", Font.BOLD, 12));
				confirmPwdLabel.setForeground(new Color(182, 186, 197));
				confirmPwdLabel.setBounds(55, 329, 196, 13);
				registerPanel.add(confirmPwdLabel);
				
				
				
				confirmPwdTextField = new JPasswordField();
				confirmPwdTextField.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
					   confirm = new String(confirmPwdTextField.getPassword());
					}
				});
				confirmPwdTextField.setBorder(null);
				confirmPwdTextField.setForeground(new Color(182, 186, 197));
				confirmPwdTextField.setBackground(new Color(35, 45, 65));
				confirmPwdTextField.setBounds(55, 363, 341, 19);
				registerPanel.add(confirmPwdTextField);
				
				JButton registerButton = new JButton("Register");
				registerButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						Boolean notGranted=false;
						try 
						{
							 BufferedReader verify = new BufferedReader(new FileReader("Admin_info.txt"));
				             String Line = null;
							 while ((Line = verify.readLine()) != null)
				                {
				                    String[] spliced = Line.split("\\s+");
				                    for(int i=0;i<spliced.length;++i)
				                    {
				                    	if(spliced[i].equals(adminID))
					                    {
					                    	JOptionPane.showMessageDialog(null,"This ID already exists");
					                    	notGranted=true;
					                    	break;
					                    }
				                    }
				                    if(notGranted)
				                    	break;
				                }
						} 
						catch (IOException e2) 
						{
							e2.printStackTrace();
						}
						
						if(confirm.equals(adminPwd)==true && !notGranted)
						{
							JOptionPane.showMessageDialog(null, "Successfully Registered!");
							// create Admin class here
							Admin admin = new Admin();
							try {
								admin.Admin_register(adminPwd, adminID);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							
						}
						else if(confirm.equals(adminPwd)==false)	
						{
							JOptionPane.showMessageDialog(null,"Password does not match");
						}
						adminIDTextField.setText("Enter Admin ID");
						adminPwdTextField.setText("password");
						confirmPwdTextField.setText("pasword");
						
					}
				});
				registerButton.setFont(new Font("Dialog", Font.BOLD, 13));
				registerButton.setBackground(new Color(95, 210, 195));
				registerButton.setFocusPainted(false);
				registerButton.setForeground(new Color(35, 45, 65));
				registerButton.setBorder(null);
				registerButton.setBounds(55, 446, 127, 41);
				registerPanel.add(registerButton);
				
				JLabel goBack = new JLabel("");
				goBack.setVerticalAlignment(SwingConstants.BOTTOM);
				goBack.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						idField.setText("Enter your ID");
						pwdField.setText("password");
						id_Enabled = false;
						pwd_Enabled = false;
						loginPanel.setVisible(true);
						registerPanel.setVisible(false);
					}
				});
				goBack.setBounds(401, 464, 24, 16);
				registerPanel.add(goBack);
				Image goBackImage = new ImageIcon(this.getClass().getResource("/goBack.png")).getImage();
				goBack.setIcon(new ImageIcon(goBackImage));
				
				registerPanel.setVisible(false);
			
		        		
				
				
		/// =============================================== END REGISTER PANEL =================================================== ///
				
		
        		
		// login and register panel needs to be before this portion
				
		JLabel register = new JLabel("Register as an admin");
		register.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mousePressed(MouseEvent e) 
			{
				loginPanel.setVisible(false);
				registerPanel.setVisible(true);
				pwd_Enabled = false;
				id_Enabled = false;
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				register.setForeground(new Color(95,210,195));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				register.setForeground(new Color(182, 186, 197));
			}
		});
		register.setForeground(new Color(182, 186, 197));
		register.setFont(new Font("Dialog", Font.PLAIN, 10));
		register.setBounds(269, 448, 118, 13);
		loginPanel.add(register);
		
	}
}
