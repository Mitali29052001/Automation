//set path
//launch browser
//maximize
//Navigate to qspider app
//other->click
//click on set element
//click here button
//get the element address
//refresh
//enter the text
//wait 
//close
//all the element there is one address for elements.
//after getting address if we do refresh entire thing will get changed 
//so here address is changed after refreshing page. and we get error as StateElementRefrenceException.
//StateElementRefrenceException->we will get exception whenever we try to perform action on the old element address whenever page is refresh.
//In real time if connection failed in runtime execution then also old element address will change.
//So to overcome that we used one concept called POM(Page Object Model):It is one of the Java designed pattern.
//Which will used by two people
//1)developer: used for to develope the software. They Take all element and put it into one page and take and use whenever they want to use.
//2)Automation Engineer: take from file and use directly.
//Framework developer will create POM page.
//This concept reffered by Google
//Encapsulation:It is process of hiding the element by using private keyword 
//If we want to use this private element we used Getters and Setters
//Rules:
//1)Declaration //int i;
//2)Initialization//i=0;
//3)Utilization//s.o.pln(i);  this(i);
//In one page there are multiple elements are present.
//So for every element we create separate class file for pages
//and in that class we locate all element respective to that page
//This is done by framework Developer by using POM concept
//How to do POM
//1)Declaration:
//@Findby(Xpath="//Section[.='Others'])
//private webelement othersLink
//@Findby->Annotation which is work same like driver.findelemnt().
//to do encapsulation we use private keyword to hide element.
//2)Initialize
//public StatePage(webdriver driver){
//pageFactory.initElements(driver, this);
//}
//StatePage(webdriver driver)->Parameterize Constructor here we add driver inside webdriver; we use Parameterize Constructor because we use driver in static method(initElement), if we not use then we get error
//pageFactory->class  initElements(driver, this)->Static Method  (driver, this)->Using Parameterize Constructor value come inside driver.
//It Initialize at Runtime
//3)Utilization
//Getters
//Source->Generate Getters and Setters->Select Getters(Select according to your Requirement)->Generate
package pom_Page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A00_POM_Page_Object_Model {
	//declaration
	@FindBy(xpath = "//section[.='Others']")
	private WebElement otherlink;
	
	@FindBy(xpath = "//section[.='Stale Element']")
	private WebElement stalelink;
	
	@FindBy(partialLinkText = "Click here to enter some text")
	private WebElement clicktextbox;
	
	@FindBy(xpath = "//input[@placeholder='enter text']")
	private WebElement entertexthere;

	
	//initialization
	
	public A00_POM_Page_Object_Model(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getotherlink() {
		return otherlink;
	}

	public WebElement getstalelink() {
		return stalelink;
	}

	public WebElement getclicktextbox() {
		return clicktextbox;
	}

	public WebElement getentertexthere() {
		return entertexthere;
	}
	

}
