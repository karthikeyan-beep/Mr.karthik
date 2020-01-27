import org.testng.Assert;
import org.testng.annotations.Test;

public class hometest {

	Basepage bp;
	Homepage hp;
	
	public hometest() {
		
		bp=new Basepage();
		hp=new Homepage();
		
	}
	
	@Test
	
	public void verifyWomenTag()
	{
		
		hp.getwomenTag().click();
		
		String wmn=bp.driver.getTitle();
		
		System.out.println(wmn);
		
	     Assert.assertTrue(wmn.contains("Women"), "Fail");
	}
	
	@Test
	
	public void clickdress()
	{
	   hp.getdresstag().click();	     
	}
	
	
	public void size()
	{
		String siz=bp.driver.
	}
	
	
}
//isDisplay
//isenabled
//isSelected