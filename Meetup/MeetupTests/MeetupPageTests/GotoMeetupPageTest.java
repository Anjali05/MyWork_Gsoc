package MeetupPageTests;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import BaseTests.CommonTest;
import MeetupPage.MeetupPageFeatures;

/*
 * @author Anjali
 */

/*
 * Checks navigation to the meetup page for a particular location
 */
public class GotoMeetupPageTest extends CommonTest
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, MeetupPageFeatures.CanGotoMeetupPage() );
	}
}
