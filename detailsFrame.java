package adminPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class detailsFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField txtEgInstalledA;
	public String stuID,stuName,stuCat,stuSubCat,stuLoc,stuSubmatter,stuDate,stuTime,stuDescrip,URL;
	public Boolean inProgressBool,completedBool,pendingBool;
	public detailsFrame(int lineNumber, String issueStatus) throws IOException 
	{
		setBackground(new Color(255, 255, 255));
		setTitle("Pending Feedback Form");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 751, 724);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnInprogress = new JRadioButton("Pending");
		rdbtnInprogress.setBackground(new Color(255, 255, 255));
		rdbtnInprogress.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnInprogress.setBounds(247, 554, 103, 21);
		contentPane.add(rdbtnInprogress);
		
		JRadioButton inProgressRadioButton = new JRadioButton("In-Progress");
		inProgressRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inProgressBool = true;
				pendingBool=completedBool=false;
			}
		});
		inProgressRadioButton.setBackground(new Color(255, 255, 255));
		inProgressRadioButton.setFont(new Font("Dialog", Font.PLAIN, 13));
		inProgressRadioButton.setBounds(412, 554, 103, 21);
		contentPane.add(inProgressRadioButton);
		
		JLabel lblNewLabel = new JLabel("Set the state of the issue :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 558, 206, 13);
		contentPane.add(lblNewLabel);
		
		
		
		JPanel studentWelcomePanel = new JPanel();
		studentWelcomePanel.setLayout(null);
		studentWelcomePanel.setBorder(null);
		studentWelcomePanel.setBackground(new Color(51, 181, 165));
		studentWelcomePanel.setBounds(-14, 0, 777, 72);
		contentPane.add(studentWelcomePanel);
		
		JLabel lblNewLabel_1 = new JLabel("VIEW FEEDBACK DETAILS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(255, 22, 277, 35);
		studentWelcomePanel.add(lblNewLabel_1);
		
		
		if(issueStatus.equals("pending"))
			{
			    BufferedReader Read = new BufferedReader(new FileReader("Student_pending_issues.txt"));
			    int pointer = 1,reached = 0;
			    String Line=null;
			    while((Line=Read.readLine())!=null)
			    {
			    	
			    	if(reached!=lineNumber)
			    	{
			    		//System.out.println("hello ");
			    		for(int i=0;i<9;++i)
			    			{
			    			  //System.out.println("hi ");
			    			  Line=Read.readLine();
			    			}
			    		
			    		++reached;
			    		continue;
			    	}
			    	else
			    	{
			    		
			    		stuID = Line;
			    		//System.out.println(Line);
			    		Line=Read.readLine();
			    		stuCat = Line;
			    		//System.out.println(Line);
			    		Line=Read.readLine();
			    		stuSubCat = Line;
			    		//System.out.println(Line);
			    		Line=Read.readLine();
			    		Line=Read.readLine();
			    		stuLoc = Line;
			    		//System.out.println(Line);
			    		Line=Read.readLine();
			    		stuSubmatter = Line;
			    		//System.out.println(Line);
			    		Line=Read.readLine();
			    		URL = Line;
			    		Line=Read.readLine();
			    		stuDescrip = Line;
			    		//System.out.println(Line);
			    		Line=Read.readLine();
			    		stuDate = Line;
			    		//System.out.println(Line);
			    		Line=Read.readLine();
			    		stuTime = Line;
			    		//System.out.println(Line);
			    		Line = null;
			    		break;
			    		
			    	}
			    }
			    Read.close();
			}
		
		JLabel lblNewLabel_2 = new JLabel("Student ID:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(351, 117, 90, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Category:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(351, 142, 164, 21);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Sub-category:");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(351, 177, 198, 21);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Location:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1.setBounds(351, 208, 145, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Date: ");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1_1.setBounds(351, 270, 116, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Subject Matter:");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(351, 239, 135, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Action Taken (Compulsory) :");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(38, 473, 206, 28);
		contentPane.add(lblNewLabel_3);
		
		txtEgInstalledA = new JTextField();
		txtEgInstalledA.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtEgInstalledA.setText("e.g. Installed a new circuit board in all floors");
		txtEgInstalledA.setBorder(null);
		txtEgInstalledA.setBounds(247, 470, 461, 21);
		contentPane.add(txtEgInstalledA);
		txtEgInstalledA.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(247, 492, 461, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("Description:");
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(351, 332, 122, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_2);
		
		JButton btnConfirmChanges = new JButton("Save");
		btnConfirmChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Confirm changes?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.YES_OPTION)
				{
					if(inProgressBool)
					{
						
						inProgressBool=false;
						Admin admin = new Admin();
						try {
							//open file read again //DID NOT WORK
							AdminForm.model.removeRow(lineNumber);
							admin.Address_feedback("inProgress", "pending", lineNumber);
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
					else if(completedBool)
					{
						completedBool=false;
					}
					else
					{
						pendingBool=false;
					}
				}
			}
		});
		btnConfirmChanges.setForeground(Color.WHITE);
		btnConfirmChanges.setFont(new Font("Dialog", Font.BOLD, 15));
		btnConfirmChanges.setFocusPainted(false);
		btnConfirmChanges.setBorder(null);
		btnConfirmChanges.setBackground(new Color(51, 181, 165));
		btnConfirmChanges.setBounds(351, 614, 122, 38);
		contentPane.add(btnConfirmChanges);
		
		JRadioButton rdbtnCompleted = new JRadioButton("Completed");
		rdbtnCompleted.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnCompleted.setBackground(Color.WHITE);
		rdbtnCompleted.setBounds(605, 554, 103, 21);
		contentPane.add(rdbtnCompleted);
		
		JLabel lblNewLabel_2_1_1_1_1_1_3 = new JLabel("Time: ");
		lblNewLabel_2_1_1_1_1_1_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1_1_3.setBounds(351, 301, 55, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_3);
		
		JLabel descripBox = new JLabel();
		descripBox.setFont(new Font("Dialog", Font.PLAIN, 14));
		descripBox.setVerticalAlignment(SwingConstants.TOP);
		descripBox.setBounds(351, 363, 357, 58);
		contentPane.add(descripBox);
		descripBox.setText("<HTML>"+stuDescrip+"</HTML");
		
		
		JLabel idBox = new JLabel(stuID);
		idBox.setFont(new Font("Dialog", Font.PLAIN, 14));
		idBox.setBounds(437, 109, 257, 28);
		contentPane.add(idBox);
		
		JLabel lblCategory = new JLabel(stuCat);
		lblCategory.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCategory.setBounds(426, 138, 198, 28);
		contentPane.add(lblCategory);
		
		JLabel lblSubcategory = new JLabel(stuSubCat);
		lblSubcategory.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSubcategory.setBounds(457, 173, 198, 28);
		contentPane.add(lblSubcategory);
		
		JLabel lblLocation = new JLabel(stuLoc);
		lblLocation.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblLocation.setBounds(426, 203, 198, 28);
		contentPane.add(lblLocation);
		
		JLabel lblCircuitLightIs = new JLabel(stuSubmatter);
		lblCircuitLightIs.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCircuitLightIs.setBounds(469, 234, 198, 28);
		contentPane.add(lblCircuitLightIs);
		
		JLabel lblCircuitLightIs_1 = new JLabel(stuDate);
		lblCircuitLightIs_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCircuitLightIs_1.setBounds(395, 266, 198, 28);
		contentPane.add(lblCircuitLightIs_1);
		
		JLabel lblCircuitLightIs_1_1 = new JLabel(stuTime);
		lblCircuitLightIs_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCircuitLightIs_1_1.setBounds(395, 296, 198, 28);
		contentPane.add(lblCircuitLightIs_1_1);
		
		JLabel issuePic = new JLabel("");
		issuePic.setBorder(new LineBorder(new Color(0, 0, 0)));
		issuePic.setBounds(38, 116, 284, 305);
		
		BufferedImage img = null;
		try
		{
			img = ImageIO.read(new File(URL));
			Image dimg = img.getScaledInstance(issuePic.getWidth(), issuePic.getHeight(),Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			issuePic.setIcon(icon);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	
		
		//add feedback image here
		contentPane.add(issuePic);
		
	}
}
