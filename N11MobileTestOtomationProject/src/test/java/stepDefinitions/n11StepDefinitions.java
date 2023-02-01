package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.DriverFactory;

public class n11StepDefinitions{

    n11Pages n11Pages = new n11Pages(DriverFactory.getDriver());
    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriyeTiklama();
    }

    @When("Otomotiv ve Motosiklet tiklanir")
    public void otomotivVeMotosikletTiklanir() {
        n11Pages.otomotivVeMotosikleteTiklama();
    }

    @When("Motosiklet secilir")
    public void motosikletSecilir() {
        n11Pages.motosikletSec();
    }

    @When("Kask secilir")
    public void kaskSecilir() {
        n11Pages.kaskSec();
    }

    @When("Shark marka secilir")
    public void sharkMarkaSecilir() {
        n11Pages.sharkMarkaSec();
    }

    @When("Filtrelemeye tiklanir")
    public void filtrelemeyeTiklanir() {
        n11Pages.filtrelemeButonu();
    }

    @When("Filtrelemeler yapilir")
    public void filtrelemelerYapilir() {
        n11Pages.filtrelemeleriSec();
    }

    @When("Sonuclari gostere tiklanir")
    public void sonuclariGostereTiklanir() {
        n11Pages.sonuclariGosterButonu();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        n11Pages.urunuSepeteEkle();
    }

    @When("Sepetime gidilir")
    public void sepetimeGidilir() {
        n11Pages.sepeteGit();
    }

    @Then("Sepete urunun geldigi kontrol edilir")
    public void sepeteUrununGeldigiKontrolEdilir() {
        n11Pages.sepetteUrunKontrolu();
    }
}
