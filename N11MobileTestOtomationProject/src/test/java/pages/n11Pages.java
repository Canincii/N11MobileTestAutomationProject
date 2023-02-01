package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By kategorilerButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By otomotivVeMotosikletButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Otomotiv & Motosiklet\")");
    By kaskButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kask\")");
    By sharkMarkaButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Shark\")");
    By filtrelemeButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");

    By uygulaButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Uygula\")");
    By sonuclariGosterButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By urunSecimi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Shark Rıdıll Mecca Mat Kapalı Kask\")");
    By sepeteEkleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sepetiKontrolEt = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayout\")");

    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void kategoriyeTiklama() {
        driver.findElement(kategorilerButonu).click();
    }

    public void otomotivVeMotosikleteTiklama() {
        driver.findElement(otomotivVeMotosikletButonu).click();
    }

    public void motosikletSec() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        elementiIndexIleSecme.get(4).click();
    }

    public void kaskSec() {
        driver.findElement(kaskButonu).click();

    }

    public void sharkMarkaSec() {
        driver.findElement(sharkMarkaButonu).click();
    }

    public void filtrelemeButonu() {
        driver.findElement(filtrelemeButonu).click();
    }

    public void filtrelemeleriSec() {
        List <WebElement> elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/typeNameTV\")"));
        elementiIndexIleSecme.get(3).click();

        elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/nameTV\")"));
        elementiIndexIleSecme.get(0).click();
        elementiIndexIleSecme.get(4).click();
        driver.findElement(uygulaButonu).click();

        elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/typeNameTV\")"));
        elementiIndexIleSecme.get(4).click();

        elementiIndexIleSecme = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/nameTV\")"));
        elementiIndexIleSecme.get(0).click();
        elementiIndexIleSecme.get(1).click();
        elementiIndexIleSecme.get(3).click();
        driver.findElement(uygulaButonu).click();

    }

    public void sonuclariGosterButonu() {
        driver.findElement(sonuclariGosterButonu).click();

    }

    public void urunuSepeteEkle() {
        driver.findElement(urunSecimi).click();
    }

    public void sepeteGit() {
        driver.findElement(sepeteEkleButonu).click();
    }

    public void sepetteUrunKontrolu() {
        elementHelper.checkVisible(sepetiKontrolEt);
    }
}