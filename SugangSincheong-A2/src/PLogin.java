import java.util.Scanner;

public class PLogin {
	private SLogin sLogin;
	public PLogin() {
		this.sLogin = new SLogin();
	}

	public VAccount login() {
		System.out.print("���̵� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		
		VAccount vAccount = this.sLogin.login(id);
		
		scanner.close();
		return vAccount;
	}
}
