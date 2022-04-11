package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 for Chrome");
        System.out.println("Press 2 for Edge");
        System.out.println("Press 3 for Firefox");
        int i = in.nextInt();
        String baseURL = "https://opensource-demo.orangehrmlive.com/";
        if (i==1){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
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
        else if (i==2){
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
        if (i==3){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            // Launch the URL.
            driver.get(baseURL);
            // Maximise Window
            driver.manage().window().maximize();
            // We give implicit time to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            // Get the title of the page
            String title = driver.getTitle();
            System.out.println(title);

            //Get urrent URL
            System.out.println("Current URL = " +driver.getCurrentUrl());

            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);

            System.out.println("Current URL = " +driver.getCurrentUrl());

            // Find the email field element
            WebElement emailField = driver.findElement(By.id("Email"));
            // Sending email to email field element
            emailField.sendKeys("prime123@gmail.com");

            // Find the password field element
            WebElement passwordField = driver.findElement(By.name("Password"));
            // Sending Password to password field element
            passwordField.sendKeys("Prime123");

            //Close the browser
            driver.close();


        }
        else {
            System.out.println("Invalid Selction");
        }


    }
}
