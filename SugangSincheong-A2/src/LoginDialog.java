import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JTextField tfId;
	private SLogin sLogin;

	private JPasswordField tfPassword;

	public LoginDialog(JFrame parent) {
		super(parent);
		this.setSize(250, 250);
		this.setLocationRelativeTo(null);

		JPanel panel1 = new JPanel();
		panel1.setSize(100, 100);
		this.add(panel1);

		JPanel panel2 = new JPanel();
		panel2.setSize(100, 100);
		this.add(panel2);

		LayoutManager layoutManager = new GridLayout(0, 2);
		this.setLayout(layoutManager);
		panel1.setLayout(new GridLayout(3, 1));
		panel2.setLayout(new GridLayout(3, 1));

		this.setTitle("�α���");
		this.setLayout(layoutManager);

		JLabel lbId = new JLabel("���̵�");
		panel1.add(lbId);

		this.tfId = new JTextField();
		this.tfId.setColumns(10);
		panel2.add(tfId);

		JLabel lbPassword = new JLabel("��й�ȣ");
		panel1.add(lbPassword);

		this.tfPassword = new JPasswordField();
		this.tfPassword.setColumns(10);
		panel2.add(tfPassword);

		JButton btLogin = new JButton("�α���");
		this.add(btLogin, BorderLayout.SOUTH);

		JButton btFind = new JButton("��й�ȣ ã��");
		this.add(btFind, BorderLayout.SOUTH);

		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);

		this.sLogin = new SLogin();
	}

	void login() {
		String id = this.tfId.getText();
		VAccount vAccount = this.sLogin.login(id);
	}

	class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}
	}
}
