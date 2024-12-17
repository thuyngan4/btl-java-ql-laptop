package quanlydienthoai.views.admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;

import quanlydienthoai.Controller.AccountController;
import quanlydienthoai.Models.Account;
import quanlydienthoai.views.Login;

public class AddUserFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public AddUserFrame() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(AddUserFrame.class.getResource("/quanlynhadat/views/icons/phone-call-icon.png")));
		initComponents();
	}

	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		txtName = new javax.swing.JTextField();
		txtUsername = new javax.swing.JTextField();
		txtPassword = new javax.swing.JPasswordField();
		btnAdd = new javax.swing.JButton();
		btnAdd.setIcon(new ImageIcon(AddUserFrame.class.getResource("/quanlynhadat/views/icons/gpa-icon-24.png")));
		btnExit = new javax.swing.JButton();
		btnExit.setIcon(new ImageIcon(AddUserFrame.class.getResource("/quanlynhadat/views/icons/logout-icon-16.png")));
		btnReset = new javax.swing.JButton();
		btnReset.setIcon(new ImageIcon(
				AddUserFrame.class.getResource("/quanlynhadat/views/icons/Actions-edit-delete-icon-16.png")));
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setIcon(new ImageIcon(AddUserFrame.class.getResource(
				"/quanlynhadat/views/icons/Occupations-Technical-Support-Representative-Male-Light-icon.png")));
		jPanel2 = new javax.swing.JPanel();
		lbStatusCaps = new javax.swing.JLabel();
		lbDate = new javax.swing.JLabel();
		lbTime = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		miNew = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		miExit = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("THÊM TÀI KHOẢN NGƯỜI DÙNG");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
		jLabel2.setText("Full Name :");

		jLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
		jLabel3.setText("User Name :");

		jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
		jLabel4.setText("Password :");

		txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		btnAdd.setFont(new Font("Segoe UI", Font.BOLD, 20)); // NOI18N
		btnAdd.setText("Add");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		btnExit.setFont(new Font("Segoe UI", Font.BOLD, 20)); // NOI18N
		btnExit.setText("Close");
		btnExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExitActionPerformed(evt);
			}
		});

		btnReset.setFont(new Font("Segoe UI", Font.BOLD, 20)); // NOI18N
		btnReset.setText("Delete ");
		btnReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnResetActionPerformed(evt);
			}
		});

		jPanel1.setBackground(new Color(192, 192, 192));

		jLabel1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 26)); // NOI18N
		jLabel1.setText("NEW ACCOUNT");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(291).addComponent(jLabel1)
						.addContainerGap(299, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(35)
						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(58)));
		jPanel1.setLayout(jPanel1Layout);

		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

		lbStatusCaps.setText("CAPS");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lbTime).addGap(48, 48, 48).addComponent(lbDate).addGap(29, 29, 29)
								.addComponent(lbStatusCaps).addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lbStatusCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhadat/views/icons/home2.png"))); // NOI18N
		jMenu1.setMnemonic('H');
		jMenu1.setText("System");

		miNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhadat/views/icons/new.png"))); // NOI18N
		miNew.setMnemonic('N');
		miNew.setText("Trang chủ");
		jMenu1.add(miNew);
		jMenu1.add(jSeparator1);

		miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W,
				java.awt.event.InputEvent.CTRL_DOWN_MASK));
		miExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhadat/views/icons/logout.png"))); // NOI18N
		miExit.setMnemonic('L');
		miExit.setText("Log out");
		miExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				miExitActionPerformed(evt);
			}
		});
		jMenu1.add(miExit);

		jMenuBar1.add(jMenu1);

		jMenu3.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/quanlynhadat/views/icons/Person-Male-Light-icon-24.png"))); // NOI18N
		jMenu3.setText("User account management");

		jMenuItem2.setText("Danh sách người dùng");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem2);

		jMenuItem4.setText("Thêm nhân viên");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenuBar1.add(jMenu3);

		jMenu4.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/quanlynhadat/views/icons/Actions-view-choose-icon-24.png"))); // NOI18N
		jMenu4.setText("Revenue");

		jMenuItem3.setText("Tất cả doanh thu");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem3);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(201)
				.addGroup(layout.createParallelGroup(Alignment.LEADING, false).addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel2)
								.addComponent(jLabel3).addComponent(jLabel4))
						.addGap(18)
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(txtName, 417, 417, 417)
								.addComponent(txtUsername, 417, 417, 417).addComponent(txtPassword, 417, 417, 417)))
						.addGroup(
								layout.createSequentialGroup().addComponent(btnReset).addGap(101).addComponent(btnAdd)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnExit)))
				.addGap(198)).addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(70)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(txtName,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3).addComponent(txtUsername,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel4).addComponent(txtPassword,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(57)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE).addComponent(jPanel2,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
		// TODO add your handling code here:
		this.dispose();
		UsersManagement usersManagement = new UsersManagement();
		usersManagement.setVisible(true);
	}// GEN-LAST:event_btnExitActionPerformed

	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetActionPerformed
		// TODO add your handling code here:
		txtName.setText("");
		txtUsername.setText("");
		txtPassword.setText("");
		txtName.requestFocus();

	}// GEN-LAST:event_btnResetActionPerformed

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
		// TODO add your handling code here:
		if (txtName.getText().trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Họ tên không được để trống", "Lỗi thêm mới",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (txtUsername.getText().trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Tên đăng nhập không được để trống", "Lỗi thêm mới",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (AccountController.checkUsername(txtUsername.getText().trim())) {
			JOptionPane.showConfirmDialog(null, "Tên đăng nhập đã tồn tại", "Lỗi thêm mới", JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (String.valueOf(txtPassword.getPassword()).trim().compareTo("") == 0) {
			JOptionPane.showConfirmDialog(null, "Mật khẩu không được để trống", "Lỗi thêm mới",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (String.valueOf(txtPassword.getPassword()).length() < 8) {
			JOptionPane.showConfirmDialog(null, "Mật khẩu phải có ít nhất 8 ký tự", "Lỗi thêm mới",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		Account account = new Account(txtName.getText(), txtUsername.getText(),
				String.valueOf(txtPassword.getPassword()), 2, true);
		System.out.println(account);
		if (!AccountController.CreateNewAccount(account)) {
			System.out.println("-----");
			System.out.println(account);
			JOptionPane.showConfirmDialog(null, "Thêm tài khoản người dùng thất bại", "Lỗi thêm mới",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			return;
		}
		int responseStatus = JOptionPane.showConfirmDialog(null, "Thêm tài khoản người dùng thành công", "Thêm mới",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if (responseStatus == JOptionPane.OK_OPTION) {
			this.dispose();
			UsersManagement usersManagement = new UsersManagement();
			usersManagement.setVisible(true);
		}
		System.out.println("-----");
		System.out.println(account);
	}// GEN-LAST:event_btnAddActionPerformed

	private void miExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_miExitActionPerformed
		// TODO add your handling code here:
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
	}// GEN-LAST:event_miExitActionPerformed

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
		// TODO add your handling code here:
		this.dispose();
		UsersManagement usersManagement = new UsersManagement();
		usersManagement.setVisible(true);
	}// GEN-LAST:event_jMenuItem2ActionPerformed

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed

	}// GEN-LAST:event_jMenuItem4ActionPerformed

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		isCapsOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
		lbStatusCaps.setEnabled(isCapsOn);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("HH:mm:ss");

		Calendar calendar = Calendar.getInstance();
		Date currentTime = calendar.getTime();
		lbDate.setText(simpleDateFormat.format(currentTime));
		lbTime.setText(simpleTimeFormat.format(currentTime));

		timerNow = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Calendar calendar = Calendar.getInstance();
				Date currentTime = calendar.getTime();
				lbTime.setText(simpleTimeFormat.format(currentTime));
			}
		});
		timerNow.start();
	}// GEN-LAST:event_formWindowOpened

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddUserFrame().setVisible(true);
			}
		});
	}

	private boolean isCapsOn;
	private Timer timerNow;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnExit;
	private javax.swing.JButton btnReset;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	private javax.swing.JLabel lbDate;
	private javax.swing.JLabel lbStatusCaps;
	private javax.swing.JLabel lbTime;
	private javax.swing.JMenuItem miExit;
	private javax.swing.JMenuItem miNew;
	private javax.swing.JTextField txtName;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
}
