package quanlydienthoai.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import quanlydienthoai.Controller.AccountController;
import quanlydienthoai.Controller.AccountFileController;
import quanlydienthoai.Models.Account;
import quanlydienthoai.views.admin.AdminScreenMain;
import quanlydienthoai.views.users.UsersFrame;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form Login
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Login.class.getResource("/quanlynhadat/views/icons/phone-call-icon.png")));
		initComponents();
		AccountFileController.FileToSql();
	}

	private void initComponents() {

		jLabelTaiKhoan = new javax.swing.JLabel();
		txtUsername = new javax.swing.JTextField();
		jLabelMK = new javax.swing.JLabel();
		btnLogin = new javax.swing.JButton();
		btnLogin.setBackground(new Color(192, 192, 192));
		txtPassword = new javax.swing.JPasswordField();
		jPanel1 = new javax.swing.JPanel();
		jLabelDangNhap = new javax.swing.JLabel();
		jLabelDangNhap.setIcon(new ImageIcon(Login.class
				.getResource("/quanlynhadat/views/icons/Apps-preferences-desktop-user-password-icon-24.png")));
		jLabelDangNhap.setForeground(new Color(0, 0, 0));
		jLabelDangNhap.setBackground(new Color(255, 255, 255));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("QUẢN LÝ ĐIỆN THOẠI");

		jLabelTaiKhoan.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
		jLabelTaiKhoan.setText("User Name :");
		jLabelTaiKhoan.setMaximumSize(new java.awt.Dimension(50, 16));
		jLabelTaiKhoan.setMinimumSize(new java.awt.Dimension(50, 16));

		txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtUsernameKeyPressed(evt);
			}
		});

		jLabelMK.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
		jLabelMK.setText("Password :");
		jLabelMK.setMaximumSize(new java.awt.Dimension(50, 16));
		jLabelMK.setMinimumSize(new java.awt.Dimension(50, 16));

		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 18)); // NOI18N
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/quanlynhadat/views/icons/logout.png"))); // NOI18N
		btnLogin.setText("Log In");
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLoginActionPerformed(evt);
			}
		});

		txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtPasswordKeyPressed(evt);
			}
		});

		jPanel1.setBackground(new Color(192, 192, 192));
		jPanel1.setForeground(new java.awt.Color(51, 153, 255));

		jLabelDangNhap.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23)); // NOI18N
		jLabelDangNhap.setText("SIGN IN");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(195, Short.MAX_VALUE)
						.addComponent(jLabelDangNhap, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addGap(188)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap(30, Short.MAX_VALUE)
						.addComponent(jLabelDangNhap, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addGap(28)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(62, 62, 62).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabelMK, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabelTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(163, 163, 163).addComponent(btnLogin,
								javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(149, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(22, 22, 22)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelMK, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(41, 41, 41).addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(56, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtUsernameKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			btnLoginActionPerformed(null);
		}
	}// GEN-LAST:event_txtUsernameKeyPressed

	@SuppressWarnings("deprecation")
	private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoginActionPerformed
		String username = txtUsername.getText();
		String password = txtPassword.getText();
		if (username.equals("") || password.equals("")) {
			JOptionPane.showMessageDialog(this, "Vui vòng nhập đầy đủ thông tin!");
		} else {
			Account acc = new Account();
			acc = AccountController.checkLogin(username, password);
			if (acc != null) {
				if (acc.getRole_id() == 1) {
					JOptionPane.showMessageDialog(null, "Đăng nhập thành công với quyền Trưởng phòng!");
					AdminScreenMain adminScreenMain = new AdminScreenMain();
					adminScreenMain.setVisible(true);
					this.dispose();
				} else if (acc.getStatus().compareTo("Ðang hoạt động") == 0) {
					JOptionPane.showMessageDialog(null, "Đăng nhập thành công với quyền nhân viên!");
					int id = acc.getId();
					UsersFrame user = new UsersFrame(id);
					user.setVisible(true);
					this.dispose();

				} else if (acc.getStatus().compareTo("Ðang hoạt động") != 0) {
					JOptionPane.showMessageDialog(this, "Nhân viên này đã nghỉ làm! Vui lòng đăng nhập tài khoản khác");
				} else {
					JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!");
				}
			} else {
				JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!");
			}
		}
	}// GEN-LAST:event_btnLoginActionPerformed

	private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtPasswordKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			btnLoginActionPerformed(null);
		}
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(() -> {
			new Login().setVisible(true);
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnLogin;
	private javax.swing.JLabel jLabelDangNhap;
	private javax.swing.JLabel jLabelMK;
	private javax.swing.JLabel jLabelTaiKhoan;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
}
