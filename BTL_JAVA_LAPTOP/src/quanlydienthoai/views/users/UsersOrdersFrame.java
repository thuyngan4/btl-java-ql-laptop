package quanlydienthoai.views.users;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import quanlydienthoai.Controller.OrderController;
import quanlydienthoai.Controller.PhoneController;
import quanlydienthoai.Models.Order;
import quanlydienthoai.Models.Pair;
import quanlydienthoai.Models.Phone;
import quanlydienthoai.views.Login;

public class UsersOrdersFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	int idUser;

	public UsersOrdersFrame() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(UsersOrdersFrame.class.getResource("/quanlynhadat/views/icons/phone-call-icon.png")));
		initComponents();
		System.out.println("id = " + idUser);
	}

	public UsersOrdersFrame(int idUser) {
		initComponents();
		this.idUser = idUser;
		System.out.println("id = " + idUser);
	}

	@SuppressWarnings({ "serial", "deprecation" })
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		listInCart = new ArrayList<Phone>();

		jScrollPane2 = new javax.swing.JScrollPane();
		tbListPhone = new javax.swing.JTable();
		tbLstLapInOrder = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		btnQliPhone = new javax.swing.JButton();
		btnQliPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQliOrder = new javax.swing.JButton();
		btnQliOrder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jLabel1 = new javax.swing.JLabel();
		btnLogout = new javax.swing.JButton();
		btnLogout.setIcon(
				new ImageIcon(UsersOrdersFrame.class.getResource("/quanlynhadat/views/icons/logout-icon-16.png")));
		jPanel2 = new javax.swing.JPanel();
		jSeparator2 = new javax.swing.JSeparator();
		jPanel3 = new javax.swing.JPanel();
		btnReset = new javax.swing.JButton();
		btnReset.setIcon(new ImageIcon(
				UsersOrdersFrame.class.getResource("/quanlynhadat/views/icons/Actions-document-edit-icon-16.png")));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnThem = new javax.swing.JButton();
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnXoa = new javax.swing.JButton();
		btnXoa.setIcon(new ImageIcon(
				UsersOrdersFrame.class.getResource("/quanlynhadat/views/icons/Actions-edit-delete-icon-16.png")));
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnThanhToan = new JButton();
		btnThanhToan.setIcon(new ImageIcon(UsersOrdersFrame.class.getResource("/quanlynhadat/views/icons/new.png")));
		btnThanhToan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jblTotalMoney = new JLabel();
		jblTotalMoney.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTotalMoney = new JTextField();
		btnLS = new JButton();
		btnLS.setFont(new Font("Tahoma", Font.PLAIN, 12));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("QUẢN LÝ ĐƠN HÀNG ĐIỆN THOẠI\r\n");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		tbListPhone.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "STT", "Phone ID", "Tên Điện thoại", "Tên hãng", "Số lượng", "Giá bán" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});

		tbListPhone.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tbPhoneListMouseClicked(evt);
			}
		});

		jScrollPane2.setViewportView(tbListPhone);
		if (tbListPhone.getColumnModel().getColumnCount() > 0) {
			tbListPhone.getColumnModel().getColumn(0).setMinWidth(50);
			tbListPhone.getColumnModel().getColumn(0).setPreferredWidth(50);
			tbListPhone.getColumnModel().getColumn(0).setMaxWidth(50);
		}

		tbListPhone.getColumnModel().getColumn(1).setMinWidth(80);
		tbListPhone.getColumnModel().getColumn(1).setPreferredWidth(80);
		tbListPhone.getColumnModel().getColumn(1).setMaxWidth(80);

		tbLstLapInOrder = new JTable();
		tbLstLapInOrder.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "STT", "Phone ID", "Tên điện thoại", "Tên hãng", "Giá bán", "Số lượng" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});

		tbLstLapInOrder.getColumnModel().getColumn(0).setMinWidth(50);
		tbLstLapInOrder.getColumnModel().getColumn(0).setPreferredWidth(50);
		tbLstLapInOrder.getColumnModel().getColumn(0).setMaxWidth(50);

		jPanel1.setBackground(new Color(192, 192, 192));

		btnQliPhone.setText("Phone management");
		btnQliPhone.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnQliPhoneActionPerformed(evt);
			}
		});

		btnQliOrder.setText("Order management");
		btnQliOrder.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}
		});

		jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 16)); // NOI18N
		jLabel1.setText("Order Management");

		btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		btnLogout.setForeground(new Color(0, 0, 0));
		btnLogout.setText("Log out");
		btnLogout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLogoutActionPerformed(evt);
			}
		});

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));
		jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		btnReset.setText("Reset");
		btnReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnResetActionPerformed(evt);
			}
		});

		btnThem.setText("Add to cart");
		btnThem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThemActionPerformed(evt);
			}
		});

		btnXoa.setText("Delete");
		btnXoa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoaActionPerformed(evt);
			}
		});

		btnThanhToan.setText("Pay");
		btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnThanhToanActionPerformed(evt);
			}
		});

		btnLS.setText("Order history");
		btnLS.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnShowOrderHistoryActionPerformed(evt);
			}
		});

		jblTotalMoney.setText("Total amount:");
		txtTotalMoney.disable();

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(btnThem).addGap(88)
						.addComponent(btnXoa).addGap(18).addComponent(btnReset).addGap(18).addComponent(btnThanhToan)
						.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE).addComponent(btnLS)
						.addGap(17)
						.addComponent(jblTotalMoney, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtTotalMoney, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(btnThem)
						.addComponent(txtTotalMoney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReset).addComponent(btnLS).addComponent(btnThanhToan)
						.addComponent(btnXoa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jblTotalMoney, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		jPanel3.setLayout(jPanel3Layout);

		jScrlPanelLap = new JScrollPane();

		lblCart = new JLabel("Shopping cart");
		lblCart.setFont(new Font("Tahoma", Font.PLAIN, 14));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jScrlPanelLap, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE).addContainerGap())
				.addComponent(jPanel3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(lblCart, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(741, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(6).addComponent(lblCart).addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
						.addComponent(jScrlPanelLap, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(
						jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));

		jScrlPanelLap.setViewportView(tbLstLapInOrder);
		jPanel2.setLayout(jPanel2Layout);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(btnQliPhone).addGap(18)
								.addComponent(btnQliOrder, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addGap(137)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
								.addComponent(btnLogout)))
				.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(btnQliPhone)
								.addComponent(btnLogout).addComponent(btnQliOrder)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		lblLapList = new JLabel("Product list");
		lblLapList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setIcon(
				new ImageIcon(UsersOrdersFrame.class.getResource("/quanlynhadat/views/icons/search-icon-16.png")));
		jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 12));

		jLabel5.setText("Search by Phone name:");
		txtTimKiem = new javax.swing.JTextField();

		txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtTimKiemActionPerformed(evt);
			}
		});
		txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtTimKiemKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
						.addComponent(lblLapList, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 448, Short.MAX_VALUE).addComponent(jLabel5)
						.addGap(18).addComponent(txtTimKiem, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addGap(70)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(3).addComponent(jLabel5))
								.addComponent(txtTimKiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(lblLapList, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnQliPhoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnQliPhoneActionPerformed
		if (idUser != 0) {
			this.dispose();
			UsersFrame dialog = new UsersFrame(idUser);
			dialog.setVisible(true);
		}
	}// GEN-LAST:event_btnQliPhoneActionPerformed

	private void btnShowOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {
		if (idUser != 0) {
			OrderHistory dialog = new OrderHistory(idUser);
			dialog.setVisible(true);
		}
	}

	private void tbPhoneListMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbGDNhaMouseClicked

	}// GEN-LAST:event_tbGDNhaMouseClicked

	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetActionPerformed
		listInCart = new ArrayList<Phone>();
		UpdateCart();
	}// GEN-LAST:event_btnResetActionPerformed

	private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
		DefaultTableModel tableModel = (DefaultTableModel) tbListPhone.getModel();
		@SuppressWarnings("unchecked")
		Vector<Object> accountVector = (Vector<Object>) tableModel.getDataVector()
				.elementAt(tbListPhone.getSelectedRow());
		Phone laptop = PhoneController.getPhoneById(Integer.parseInt(accountVector.get(1).toString()));
		int quantity = Integer.parseInt(JOptionPane.showInputDialog(new JFrame(), "Nhập số lượng muốn thêm: "));

		while (quantity - laptop.getQuantity() > 0) {
			quantity = Integer.parseInt(
					JOptionPane.showInputDialog(new JFrame(), "Nhập quá số lượng tồn. Nhập số lượng muốn thêm: "));
		}

		boolean isAvail = false;
		for (int i = 0; i < listInCart.size(); i++) {
			if (listInCart.get(i).getId() == laptop.getId()) {
				isAvail = true;
				break;
			}
		}

		if (!isAvail) {
			laptop.setQuantity(quantity);
			listInCart.add(laptop);
		} else {
			int already = 0;
			for (int i = 0; i < listInCart.size(); i++) {
				if (listInCart.get(i).getId() == laptop.getId()) {
					already = listInCart.get(i).getQuantity();
					break;
				}
			}

			while (quantity + already - laptop.getQuantity() > 0) {
				quantity = Integer.parseInt(
						JOptionPane.showInputDialog(new JFrame(), "Nhập quá số lượng tồn. Nhập số lượng muốn thêm: "));
			}

			int id = 0;
			for (int i = 0; i < listInCart.size(); i++) {
				if (listInCart.get(i).getId() == laptop.getId()) {
					id = i;
					break;
				}
			}
			listInCart.get(id).setQuantity(listInCart.get(id).getQuantity() + quantity);
		}
		UpdateCart();
	}// GEN-LAST:event_btnThemActionPerformed

	private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
		DefaultTableModel tableModel = (DefaultTableModel) tbLstLapInOrder.getModel();
		@SuppressWarnings("unchecked")
		Vector<Object> accountVector = (Vector<Object>) tableModel.getDataVector()
				.elementAt(tbLstLapInOrder.getSelectedRow());

		for (int i = 0; i < listInCart.size(); i++) {
			if (listInCart.get(i).getId() == Integer.parseInt(accountVector.get(1).toString())) {
				listInCart.remove(i);
				break;
			}
		}
		UpdateCart();
	}// GEN-LAST:event_btnXoaActionPerformed

	private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThanhToanActionPerformed
		List<Pair<Phone, Integer>> listPair = new ArrayList<Pair<Phone, Integer>>();
		List<Phone> listAll = PhoneController.getAllPhone();

		for (int i = 0; i < listInCart.size(); i++) {
			Pair<Phone, Integer> pair = new Pair<Phone, Integer>(listInCart.get(i), listInCart.get(i).getQuantity());
			listPair.add(pair);
			for (int j = 0; j < listAll.size(); j++) {
				if (listAll.get(j).getId() == listInCart.get(i).getId()) {
					Phone lap = listAll.get(j);
					lap.setQuantity(listAll.get(j).getQuantity() - listInCart.get(i).getQuantity());
					PhoneController.updatePhone(lap);
				}
			}

		}

		Date date = new Date();
		int total = Integer.parseInt(txtTotalMoney.getText());
		int idAcc = idUser;

		Order o = new Order(listPair, date, total, idAcc);

		OrderController.CreateNewOrder(o);

		btnResetActionPerformed(evt);
		formWindowOpened(null);
	}// GEN-LAST:event_btnThanhToanActionPerformed

	private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLogoutActionPerformed
		this.dispose();
		Login dialog = new Login();
		dialog.setVisible(true);
	}// GEN-LAST:event_btnLogoutActionPerformed

	// Hiển thị dữ liệu cho Bảng
	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		List<Phone> laptops = List.copyOf(PhoneController.getAllPhone());

		DefaultTableModel model = (DefaultTableModel) tbListPhone.getModel();
		model.setRowCount(0);
		int stt = 0;
		for (int i = 0; i < laptops.size(); i++) {
			Phone laptop = laptops.get(i);
			stt++;
			model.addRow(new Object[] { stt, laptop.getId(), laptop.getName(), laptop.getManufacturer(),
					laptop.getQuantity(), laptop.getPrice() });
		}
	}// GEN-LAST:event_formWindowOpened

	private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTimKiemActionPerformed

	}// GEN-LAST:event_txtTimKiemActionPerformed

	private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtTimKiemKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			if ("".equals(txtTimKiem.getText().trim()) || txtTimKiem == null) {
				DefaultTableModel model = (DefaultTableModel) tbListPhone.getModel();
				model.setRowCount(0);
				formWindowOpened(null);

			} else {
				try {
					List<Phone> laptops = PhoneController.getAllPhoneByName(txtTimKiem.getText());

					DefaultTableModel model = (DefaultTableModel) tbListPhone.getModel();
					model.getDataVector().removeAllElements();
					model.fireTableDataChanged();
					for (int i = 0; i < laptops.size(); i++) {
						model.addRow(new Object[] { i + 1, laptops.get(i).getId(), laptops.get(i).getName(),
								laptops.get(i).getManufacturer(), laptops.get(i).getQuantity(),
								laptops.get(i).getPrice() });
					}
				} catch (Exception ex) {
					JOptionPane.showConfirmDialog(null, "Không tìm thấy giao dịch nào", "Tìm kiêm",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
					DefaultTableModel model = (DefaultTableModel) tbListPhone.getModel();
					model.setRowCount(0);
					formWindowOpened(null);

				}

			}
		}
	}// GEN-LAST:event_txtTimKiemKeyPressed

	private void UpdateCart() {
		DefaultTableModel model = (DefaultTableModel) tbLstLapInOrder.getModel();
		model.setRowCount(0);
		int stt = 0;
		for (int i = 0; i < listInCart.size(); i++) {
			Phone laptop = listInCart.get(i);
			stt++;
			model.addRow(new Object[] { stt, laptop.getId(), laptop.getName(), laptop.getManufacturer(),
					laptop.getPrice(), laptop.getQuantity() });
		}
		CalTotalMoney();
	}

	private void CalTotalMoney() {
		int total = 0;
		for (int i = 0; i < listInCart.size(); i++) {
			total = total + (listInCart.get(i).getPrice() * listInCart.get(i).getQuantity());
		}
		txtTotalMoney.setText(total + "");
	}

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
			java.util.logging.Logger.getLogger(UsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);

		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UsersOrdersFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnQliPhone;
	private javax.swing.JButton btnQliOrder;
	private javax.swing.JButton btnLogout;
	private javax.swing.JButton btnReset;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnXoa;
	private javax.swing.JButton btnThanhToan;
	private javax.swing.JButton btnLS;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTable tbListPhone;
	private javax.swing.JTable tbLstLapInOrder;
	private javax.swing.JTextField txtTimKiem;
	private javax.swing.JScrollPane jScrlPanelLap;

	private List<Phone> listInCart;
	private JLabel lblCart;
	private JLabel lblLapList;
	private JLabel jblTotalMoney;
	private JTextField txtTotalMoney;

}
