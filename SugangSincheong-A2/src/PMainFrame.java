
public class PMainFrame {

	private PLogin pLogin;
	
	public PMainFrame() {
		this.pLogin = new PLogin();
		
	}
	public void run() {
		VAccount vAccount = this.pLogin.login();
		if (vAccount == null) {
			// ���̵� ���ų� ��й�ȣ�� Ʋ����
		}
	}

}
