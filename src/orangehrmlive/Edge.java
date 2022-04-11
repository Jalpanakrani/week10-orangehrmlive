  package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {

        String baseURL = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // Launch the URl
        driver.get(baseURL);
        //Maximisi window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get Current URl
        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginURL = "https://opensource-demo.orangehrmlive.com/";
        driver.navigate().to(loginURL);
        System.out.println("Current URl = " + driver.getCurrentUrl());

        //Find the email field element

        WebElement emailField = driver.findElement(By.id("txtUsername"));
        //sending email to email feild element
        emailField.sendKeys("Admin");
        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));

        passwordField.sendKeys("admin123");

        //close the browser
        driver.close();

    }
}
