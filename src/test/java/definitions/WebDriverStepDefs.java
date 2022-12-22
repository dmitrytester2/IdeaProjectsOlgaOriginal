package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class WebDriverStepDefs {
    @Given("I go to {string}")
    public void iGoTo(String page) {
        //using navigate()
        getDriver().navigate().to("https://yahoo.com");
        //using get()
        switch (page.toLowerCase()){
            case "google":
                getDriver().get("https://google.com");
                break;
            case "yahoo":
                getDriver().get("https://yahoo.com");
                break;
            case "bing":
                getDriver().get("https://bing.com");
                break;
            default:
                throw new RuntimeException("Unsupported page "+page);
        }
    }

    @And("I print page details")
    public void iPrintPageDetails() {
        System.out.println(getDriver().getTitle());
        System.out.println(getDriver().getCurrentUrl());
    }

    @And("I go back then forward and refresh the page")
    public void iGoBackThenForwardAndRefreshThePage() {
        getDriver().navigate().back();
        getDriver().navigate().forward();
        getDriver().navigate().refresh();
    }

    @Given("I navigate to {string}")
    public void iNavigateTo(String arg0) {
        getDriver().get("https://skryabin.com/market/quote.html");
    }

    @When("I fill out first name as {string} and last name as {string}")
    public void iFillOutFirstNameAsAndLastNameAs(String firstName, String lastName) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='name']")).click();
        getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
        getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
        getDriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
    }

    @And("I fill out all required fields")
    public void iFillOutAllRequiredFields() {
        WebElement userName=getDriver().findElement(By.xpath("//input[@name='username']"));
        String username="po"; //using variables
        userName.sendKeys(username);
        //userName.sendKeys("po"); using the value that need to be typed


    }

    @Given("I need to go to the page {string}")
    public void iNeedToGoToThePage(String arg0) throws InterruptedException {
        getDriver().get("https://skryabin.com/market/quote.html");
        Thread.sleep(2000);
    }

    @And("I fill out Email as {string}")
    public void iFillOutEmailAs(String email) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        Thread.sleep(1000);
    }

    @And("I fill out Password as {string}")
    public void iFillOutPasswordAs(String password) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(1000);
    }

    @And("I fill out Confirm Password as {string}")
    public void iFillOutConfirmPasswordAs(String confirmPassword) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPassword);
        Thread.sleep(1000);
    }

    @Given("I navigate to the page {string}")
    public void iNavigateToThePage(String arg0) throws InterruptedException {
        getDriver().get("https://skryabin.com/market/quote.html");
        WebElement email=getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("abc@abc.com");
        Thread.sleep(1000);
        WebElement password=getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("qwerty");
        Thread.sleep(1000);
        WebElement confirmPassword=getDriver().findElement(By.xpath("//input[@name='confirmPassword']"));
        confirmPassword.sendKeys("qwerty");
        Thread.sleep(1000);


    }

    @Given("I open page")
    public void iOpenPage() {
        getDriver().get("https://skryabin.com/market/quote.html");

    }

    @And("I type first name {string} and last name {string}")
    public void iTypeFirstNameAndLastName(String firstName, String lastName) throws InterruptedException {
        WebElement name=getDriver().findElement(By.xpath("//input[@id='name']"));
        name.click();
        WebElement frstName=getDriver().findElement(By.xpath("//input[@id='firstName']"));
        frstName.sendKeys(firstName);
        WebElement lstName=getDriver().findElement(By.xpath("//input[@id='lastName']"));
        lstName.sendKeys(lastName);
        WebElement save=getDriver().findElement(By.xpath("//span[contains(text(),'Save')]"));
        save.click();
        Thread.sleep(1000);
    }

    @And("I type my username")
    public void iTypeMyUsername() {
        WebElement usrName=getDriver().findElement(By.xpath("//input[@name='username']"));
        usrName.sendKeys("po"); //using hard coded value
}

    @And("I fill out the rest of required fields")
    public void iFillOutTheRestOfRequiredFields() throws InterruptedException {
        WebElement eml=getDriver().findElement(By.xpath("//input[@name='email']"));
        eml.sendKeys("abc@abc.com");
        Thread.sleep(1000);
        WebElement pswd=getDriver().findElement(By.xpath("//input[@name='password']"));
        String userPswd="qwerty"; //using variables
        pswd.sendKeys(userPswd);
        //pswd.sendKeys("qwerty");
        Thread.sleep(1000);
        WebElement confirmPswd=getDriver().findElement(By.xpath("//input[@name='confirmPassword']"));
        String cnfrmPswd="qwerty"; //using variables
        confirmPswd.sendKeys(cnfrmPswd);
        //confirmPswd.sendKeys("qwerty");
        Thread.sleep(1000);
        WebElement agreeTo=getDriver().findElement(By.xpath("//input[@name='agreedToPrivacyPolicy']"));
        agreeTo.click();
        Thread.sleep(1000);
        WebElement submit=getDriver().findElement(By.xpath("//button[@id='formSubmit']"));
        submit.submit();
        Thread.sleep(1000);

    }

    @Then("I assert required fields")
    public void iAssertRequiredFields() throws InterruptedException {
        // asserting that submitted information is displayed
        WebElement resultPage=getDriver().findElement(By.xpath("//div[@id='quotePageResult']"));
        assertThat(resultPage.isDisplayed()).isTrue();
        //asserting Agreed to Policy is checked
        String actualAgreeTo=getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertThat(actualAgreeTo).isEqualToIgnoringCase("true");
        //verifying name
        String actualName=getDriver().findElement(By.xpath("//b[@name='name']")).getText();
        System.out.println(actualName);
        assertThat(actualName).isEqualToIgnoringCase("peter orange");
        //verifying username
        String userName=getDriver().findElement(By.xpath("//b[@name='username']")).getText();
        System.out.println(userName);
        assertThat(userName).isEqualToIgnoringCase("po");
        Thread.sleep(2000);
    }
}
