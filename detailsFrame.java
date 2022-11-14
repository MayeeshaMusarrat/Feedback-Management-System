package adminPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class detailsFrame extends JFrame 
{

	private JPanel contentPane;
	private JTextField textField;
	public detailsFrame() 
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
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("In-Progress");
		rdbtnNewRadioButton_1_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1.setBounds(412, 554, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Set the state of the issue :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 558, 206, 13);
		contentPane.add(lblNewLabel);
		
		JLabel issuePic = new JLabel("");
		issuePic.setBorder(new LineBorder(new Color(0, 0, 0)));
		issuePic.setBounds(38, 91, 281, 342);
		
		//add feedback image here
		contentPane.add(issuePic);
	
		
		JPanel studentWelcomePanel = new JPanel();
		studentWelcomePanel.setLayout(null);
		studentWelcomePanel.setBorder(null);
		studentWelcomePanel.setBackground(new Color(51, 181, 165));
		studentWelcomePanel.setBounds(-14, 0, 777, 60);
		contentPane.add(studentWelcomePanel);
		
		JLabel lblNewLabel_1 = new JLabel("VIEW FEEDBACK DETAILS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(255, 10, 277, 40);
		studentWelcomePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student ID:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(351, 91, 90, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Student name:");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(351, 114, 122, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Issue Category:");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(351, 137, 164, 21);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Issue Sub-category:");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(351, 168, 198, 21);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Issue Location:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1.setBounds(351, 199, 145, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Time of feedback lodged:");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1_1.setBounds(351, 261, 188, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Subject Matter:");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(351, 230, 135, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Action Taken (Compulsory) :");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(38, 473, 206, 28);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBounds(247, 468, 461, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(247, 492, 461, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("Description:");
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(351, 292, 188, 21);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_2);
		
		JButton btnConfirmChanges = new JButton("Save");
		btnConfirmChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Confirm changes?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
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
		
		
		
		
		
		
		
		
		
		
	}
}
