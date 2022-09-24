package vm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	
	//All tests are passed
	@Test
	public void ValidUserAndPassword() {
		App myApp = new App();
		Assert.assertEquals(myApp.userLogin("abc", "password"),1);
	}

	@Test
	public void InValidUserAndPassword() {
		App myApp = new App();
		Assert.assertEquals(myApp.userLogin("xyz", "password1"),0);
	}

	@Test
	public void ValidUserAndInValidPasswordTest() {
		App myApp = new App();
		Assert.assertEquals(myApp.userLogin("abc", "password1"),0);
	}

	@Test
	public void InValidUserAndValidPasswordTest() {
		App myApp = new App();
		Assert.assertEquals(myApp.userLogin("xyz", "password"),0);

	}
}
