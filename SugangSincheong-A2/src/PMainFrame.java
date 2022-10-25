
public class PMainFrame {

	private PLogin pLogin;
	
	public PMainFrame() {
		this.pLogin = new PLogin();
		
	}
	public void run() {
		VAccount vAccount = this.pLogin.login();
		if (vAccount == null) {
			// 아이디가 없거나 비밀번호가 틀렸음
		}
	}

}
