package LoginTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginCommand;
import Login.LoginPage;

public class FacebookLoginTest extends CommonTests
{
	static String s="FacebookLogin";
	public FacebookLoginTest() 
	{
		super(s);
	}

	@Test
	public void test()
        {
		LoginPage.Goto();
		LoginCommand.FacebookLogin();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtFacebookLogin());
	}

}
