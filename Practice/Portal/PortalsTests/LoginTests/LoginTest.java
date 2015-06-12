package LoginTests;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import BaseTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginPage;

@RunWith(Parameterized.class)
public class LoginTest extends CommonTests
{
	static String s="Login";
	private String username;
	private String password;
	
	@Parameters
	public static Collection<Object[]>data()
	{
		return Arrays.asList(new Object[][]{
				{"anjali","anjali"},
				{"abc","xyz"},
				{"random",""}
		});		
	}
	public LoginTest(String username, String password) 
	{
		super(s);
		this.username=username;
		this.password=password;
		
	}

	@Test
	public void test() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs(username).WithPassword(password).Login();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAt());
	}
	

}
