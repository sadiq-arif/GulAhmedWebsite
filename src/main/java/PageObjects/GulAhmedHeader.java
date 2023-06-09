package PageObjects;

import Utils.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GulAhmedHeader extends BaseClass {
    private static String IdeasRewardXpath = "(//a[@href='/ideasrewards'])[1]";
    private static String ReturnAndExchangeXpath = "(//a[@href='/worry-free-returns-exchanges/'])[1]";
    private static String TrackOrderXpath = "(//a[@href='/shippingtracking/'])[1]";
    private static String LookbookXPath = "(//a[@href='/lookbook/'])[1]";
    private static String SignInXpath = "(//div[@id='authorization-trigger'])[2]";
    private static String EmailXpath = "//input[@placeholder='Email']";
    private static String PasswordXpath = "//input[@placeholder='Password']";
    private static String ForgotPasswordXpath = "(//a[@href='https://www.gulahmedshop.com/customer/account/forgotpassword/'])[2]";
    private static String LoginBtnXpath = "(//button[@name='send'])[1]";
    private static String CreateAnAccountBtnXpath = "(//a[@href='https://www.gulahmedshop.com/customer/account/create/'])[1]";
    private static String LoginWithFbXpath = "(//div[@class='sociallogin-box']/a)[1]";
    private static String LoginWithGoogleXpath = "(//div[@class='sociallogin-box']/a)[2]";
    private static String CurrencyPKRXpath= "//strong[@class='language-PKR']";
    private static String CurrencyUSDXpath = "//span[text()='USD']";
    private static String CameraIconXpath = "//button[@data-camera-button-placement='search-bar']";
    private static String SearchBarXpath = "//input[@id='search']";
    private static String QRSearchCss = "div.ga-qr-code";
    private static String MinicartIconXpath = "//a[@href='https://www.gulahmedshop.com/checkout/cart/']";
    private static String CloseMinicartBtnId = "btn-minicart-close";
    private static String EmptyMinicartTextXpath = "//strong[@class='subtitle empty']";

    private static WebElement getIdeasReward() {return driver.findElement(By.xpath(IdeasRewardXpath));}
    private static WebElement getReturnAndExchange() {return driver.findElement(By.xpath(ReturnAndExchangeXpath));}
    private static WebElement getTrackOrder() {return driver.findElement(By.xpath(TrackOrderXpath));}
    private static WebElement getLookbook() {return driver.findElement(By.xpath(LookbookXPath));}

    public static void checkIdeasReward() {
        Assert.assertTrue(getIdeasReward().isDisplayed());
    }

    public static void checkReturnAndExchange() {
        Assert.assertTrue(getReturnAndExchange().isDisplayed());
    }

    public static void checkTrackOrder() {
        Assert.assertTrue(getTrackOrder().isDisplayed());
    }

    public static void checkLookbook() {
        Assert.assertTrue(getLookbook().isDisplayed());
    }
}
