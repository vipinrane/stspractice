package vm;

import java.util.ResourceBundle;

public class App {

	public int userLogin(String inputUserName, String inputPassword) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String userName = rb.getString("username");
		String password = rb.getString("password");

		if (inputUserName.equals(userName) && inputPassword.equals(password)) {
			return 1;
		} else {
			return 0;
		}
	}
}
