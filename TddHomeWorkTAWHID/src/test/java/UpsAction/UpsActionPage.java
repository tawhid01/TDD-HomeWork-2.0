package UpsAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UpsElement.UpsPageElement;

public class UpsActionPage {
	UpsPageElement upsElement;

	public UpsActionPage(WebDriver driver) {
		this.upsElement = new UpsPageElement();
		PageFactory.initElements(driver, upsElement);

	}

	public void closebtn() {
		upsElement.closeBtn.click();

	}

	public void inputUserName() {
		upsElement.name.sendKeys("Tawhid Islam");

	}

	public void inputContactName() {
		upsElement.contactname.sendKeys("Tawhid Islam");

	}

	public void inputUserAddress() {
		upsElement.address.sendKeys("1265 Gerard Avenue");

	}

	public void inputUserAddress2() {
		upsElement.address2.sendKeys("2A");
	}

	public void inputUserZipCode() {
		upsElement.zipCode.sendKeys("10452");

	}

	public void inputUserCity() {
		upsElement.city.sendKeys("Bronx");

	}

	public void inputUserState() {

		upsElement.state.sendKeys("New York");

	}

	public void inputUserEmail() {
		upsElement.email.sendKeys("mi.tawhid@gmail.com");

	}

	public void inputUserPhoneNumber() {
		upsElement.phone.sendKeys("9192487845");

	}

	public void inputUserExtension() {
		upsElement.extension.sendKeys("1234");

	}

	public void checkBox() {
		upsElement.checkBox.click();

	}

	public void button() {
		upsElement.button.click();

	}

}
