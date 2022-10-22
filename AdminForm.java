import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;

public class AdminForm extends JFrame {

	private JPanel contentPane;
	JFrame adminFrame;
	/**
	 * Create the frame.
	 */
	public AdminForm() 
	{
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1098, 663);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		
		JPanel adminSideDecorPanel = new JPanel();
		adminSideDecorPanel.setLayout(null);
		adminSideDecorPanel.setBorder(null);
		adminSideDecorPanel.setBackground(new Color(35, 45, 65));
		adminSideDecorPanel.setBounds(0, 0, 353, 626);
		getContentPane().add(adminSideDecorPanel);
		
		JButton adminLogoutButton = new JButton("Logout");
		adminLogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adminLogoutButton.setForeground(new Color(206, 209, 217));
		adminLogoutButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminLogoutButton.setFocusPainted(false);
		adminLogoutButton.setBorder(null);
		adminLogoutButton.setBackground(new Color(35, 45, 65));
		adminLogoutButton.setBounds(0, 532, 353, 44);
		adminSideDecorPanel.add(adminLogoutButton);
		
		JButton adminAddDeleteStaffButton = new JButton("Add/Delete Staff");
		adminAddDeleteStaffButton.setForeground(new Color(206, 209, 217));
		adminAddDeleteStaffButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminAddDeleteStaffButton.setFocusPainted(false);
		adminAddDeleteStaffButton.setBorder(null);
		adminAddDeleteStaffButton.setBackground(new Color(35, 45, 65));
		adminAddDeleteStaffButton.setBounds(0, 219, 353, 44);
		adminSideDecorPanel.add(adminAddDeleteStaffButton);
		
		JButton adminViewFeedback = new JButton("Address Feedbacks");
		adminViewFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adminViewFeedback.setForeground(new Color(206, 209, 217));
		adminViewFeedback.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminViewFeedback.setFocusPainted(false);
		adminViewFeedback.setBorder(null);
		adminViewFeedback.setBackground(new Color(35, 45, 65));
		adminViewFeedback.setBounds(0, 320, 353, 44);
		adminSideDecorPanel.add(adminViewFeedback);
		
		JLabel adminDashboardLabel = new JLabel("D A S H B O A R D");
		adminDashboardLabel.setForeground(new Color(206, 209, 217));
		adminDashboardLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		adminDashboardLabel.setBounds(82, 74, 178, 19);
		adminSideDecorPanel.add(adminDashboardLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(206, 209, 217));
		separator.setBounds(32, 130, 279, 2);
		adminSideDecorPanel.add(separator);
		
		JButton adminProfileButton = new JButton("Profile");
		adminProfileButton.setForeground(new Color(206, 209, 217));
		adminProfileButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminProfileButton.setFocusPainted(false);
		adminProfileButton.setBorder(null);
		adminProfileButton.setBackground(new Color(35, 45, 65));
		adminProfileButton.setBounds(0, 176, 353, 44);
		adminSideDecorPanel.add(adminProfileButton);
		
		JButton adminViewStudentButton = new JButton("View Student");
		adminViewStudentButton.setForeground(new Color(206, 209, 217));
		adminViewStudentButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminViewStudentButton.setFocusPainted(false);
		adminViewStudentButton.setBorder(null);
		adminViewStudentButton.setBackground(new Color(35, 45, 65));
		adminViewStudentButton.setBounds(0, 272, 353, 44);
		adminSideDecorPanel.add(adminViewStudentButton);
		
		JButton adminAddFeedbackButton = new JButton("Add Feedback Options");
		adminAddFeedbackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adminAddFeedbackButton.setForeground(new Color(206, 209, 217));
		adminAddFeedbackButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminAddFeedbackButton.setFocusPainted(false);
		adminAddFeedbackButton.setBorder(null);
		adminAddFeedbackButton.setBackground(new Color(35, 45, 65));
		adminAddFeedbackButton.setBounds(0, 374, 353, 44);
		adminSideDecorPanel.add(adminAddFeedbackButton);
		
		JTabbedPane adminPane = new JTabbedPane(JTabbedPane.TOP);
		adminPane.setBounds(350, -30, 766, 667);
		getContentPane().add(adminPane);
		
		JPanel adminProfilePanel = new JPanel();
		adminPane.addTab("New tab", null, adminProfilePanel, null);
		adminProfilePanel.setLayout(null);
		
		JPanel adminAddDelStaffPanel = new JPanel();
		adminPane.addTab("New tab", null, adminAddDelStaffPanel, null);
		
		JPanel adminViewStaffPanel = new JPanel();
		adminPane.addTab("New tab", null, adminViewStaffPanel, null);
		
		JPanel adminAddressFeedbackPanel = new JPanel();
		adminPane.addTab("New tab", null, adminAddressFeedbackPanel, null);
		
		JPanel adminAddOptionPanel = new JPanel();
		adminPane.addTab("New tab", null, adminAddOptionPanel, null);
	}
}
