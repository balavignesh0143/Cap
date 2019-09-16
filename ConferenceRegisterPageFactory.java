package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConferenceRegisterPageFactory {
	WebDriver driver;

	// step 1 : identify elements
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement firstName;

	@FindBy(name = "txtLN")
	@CacheLookup
	WebElement lastName;

	@FindBy(how = How.NAME, using = "txtEmail")
	@CacheLookup
	WebElement email;

	@FindBy(css = "input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement contactNo;

	@FindBy(how = How.NAME, using = "size")
	@CacheLookup
	int peopleCount;

	@FindBy(how = How.NAME, using = "Address")
	@CacheLookup
	WebElement addressBName;

	@FindBy(how = How.NAME, using = "Address2")
	@CacheLookup
	WebElement addressAName;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement city;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement state;

	@FindBy(how = How.NAME, using = "memberStatus")
	@CacheLookup
	WebElement memberStatus;

	@FindBy(how = How.LINK_TEXT, using = "Next")
	@CacheLookup
	WebElement nextLink;

	public WebElement getNextLink() {
		return nextLink;
	}

	public void setNextLink() {
		this.nextLink.click();
	}

	

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);;
	}

	public WebElement getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}

	public int getPeopleCount() {
		return peopleCount;
	}

	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}

	public WebElement getAddressBName() {
		return addressBName;
	}

	public void setAddressBName(String addressBName) {
		this.addressBName.sendKeys(addressBName);;
	}

	public WebElement getAddressAName() {
		return addressAName;
	}

	public void setAddressAName(String addressAName) {
		this.addressAName.sendKeys(addressAName);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String state) {
		this.state.sendKeys(state);
	}

	public WebElement getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus.sendKeys(memberStatus);
	}

	// initiating Elements
	public ConferenceRegisterPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
