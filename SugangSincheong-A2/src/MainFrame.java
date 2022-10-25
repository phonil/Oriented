import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		this.setSize(400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);

		SugangsincheongPanel sugangsincheongPanel = new SugangsincheongPanel();
		this.add(sugangsincheongPanel, BorderLayout.CENTER);

		LoginDialog loginDialog = new LoginDialog(this);
		loginDialog.setVisible(true);
	}
}
