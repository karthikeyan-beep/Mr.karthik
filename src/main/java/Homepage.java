import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage {
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	  private WebElement womenTag;

   public WebElement getwomenTag()
 {
	 return womenTag;
	 
 }
   
   
   @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
   private WebElement dresstag;
   
   public WebElement getdresstag()
   {
	   return dresstag;
   }
   

   @FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
    WebElement Size;
   
   public WebElement Size()
   {
	   return Size;
   }
  
 
}
