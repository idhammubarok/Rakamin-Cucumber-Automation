package cucumber.stepDef;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    WebDriver driver;
    String baseURL = "https://www.saucedemo.com/";

    @Given("Halaman login aplikasi saucedemo")
    public void halaman_login_aplikasi_saucedemo(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseURL);

    }

    @When("Input username")
    public void inputUsername() {

        driver.findElement(By.cssSelector("[data-test='user-name']")).sendKeys("standard_user");
    }

    @And("Input password")
    public void inputPassword() {
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
    }

    @And("Click login button")
    public void clickLoginButton() {
        driver.findElement(By.cssSelector("[data-test='login-button']")).sendKeys("secret_sauce");
    }

    @Then("User in on dashboard page")
    public void userInOnDashboardPage() {
        String title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(title, "Products");
        driver.close();
    }

    @And("Input Invalid password")
    public void inputInvalidPassword() {
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("12345");
    }

    @Then("User get error message")
    public void userGetErrorMessage() {
        String errorMessage = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        Assert.assertEquals(errorMessage, "Products");
        driver.close();
    }
}
