import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class StaffForm extends JFrame {

	private JPanel contentPane;

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
		
		JPanel adminSideDecorPanel = new JPanel();
		adminSideDecorPanel.setLayout(null);
		adminSideDecorPanel.setBorder(null);
		adminSideDecorPanel.setBackground(new Color(35, 45, 65));
		adminSideDecorPanel.setBounds(0, 0, 353, 626);
		contentPane.add(adminSideDecorPanel);
		
		JButton adminLogoutButton = new JButton("Logout");
		adminLogoutButton.setForeground(new Color(206, 209, 217));
		adminLogoutButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		adminLogoutButton.setFocusPainted(false);
		adminLogoutButton.setBorder(null);
		adminLogoutButton.setBackground(new Color(35, 45, 65));
		adminLogoutButton.setBounds(0, 532, 353, 44);
		adminSideDecorPanel.add(adminLogoutButton);
		
		JButton btnAdddeleteStudent = new JButton("Add/Delete Student");
		btnAdddeleteStudent.setForeground(new Color(206, 209, 217));
		btnAdddeleteStudent.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnAdddeleteStudent.setFocusPainted(false);
		btnAdddeleteStudent.setBorder(null);
		btnAdddeleteStudent.setBackground(new Color(35, 45, 65));
		btnAdddeleteStudent.setBounds(0, 219, 353, 44);
		adminSideDecorPanel.add(btnAdddeleteStudent);
		
		JButton btnGiveFeedback = new JButton("Give Feedback");
		btnGiveFeedback.setForeground(new Color(206, 209, 217));
		btnGiveFeedback.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnGiveFeedback.setFocusPainted(false);
		btnGiveFeedback.setBorder(null);
		btnGiveFeedback.setBackground(new Color(35, 45, 65));
		btnGiveFeedback.setBounds(0, 273, 353, 44);
		adminSideDecorPanel.add(btnGiveFeedback);
		
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
		
		JButton btnViewFeedbackStatus = new JButton("View Feedback Status");
		btnViewFeedbackStatus.setForeground(new Color(206, 209, 217));
		btnViewFeedbackStatus.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnViewFeedbackStatus.setFocusPainted(false);
		btnViewFeedbackStatus.setBorder(null);
		btnViewFeedbackStatus.setBackground(new Color(35, 45, 65));
		btnViewFeedbackStatus.setBounds(0, 327, 353, 44);
		adminSideDecorPanel.add(btnViewFeedbackStatus);
	}

}
