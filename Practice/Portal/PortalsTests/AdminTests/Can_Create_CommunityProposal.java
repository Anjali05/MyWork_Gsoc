package AdminTests;
import junit.framework.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.CommunityFormCheck;
import BaseTests.CommonTests;

public class Can_Create_CommunityProposal extends CommonTests
{
  
        static String s="CanCreateCommunity";
	public Can_Create_CommunityProposal() 
	{
		super(s);
		
	}
	@Test
	public void test() 
	{
		AdminLogin.login();
		Assert.assertEquals("Failed",true,CommunityFormCheck.IsForm());
	}
	
}
