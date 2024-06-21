package seleniungluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driverManager.DriverManager;
import utils.driverManager.DriverManagerFactory;
import utils.driverManager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverManager driverManager;

    public static int numeroDeCaso = 0;

    @Before
    public void setUp(){
        numeroDeCaso++;
        System.out.println("Se esta ejecutando el escenario nro: "+ numeroDeCaso);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        wait = new WebDriverWait(driver,10);
        driver.get("https://www.bci.cl/personas");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro: "+ numeroDeCaso + " se ejecuto correctamente.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getWaitDriver(){
        return wait;
    }
}
