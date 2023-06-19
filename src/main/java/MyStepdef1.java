import config.BaseClass;
import config.Pages.MainPageFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyStepdef1 extends BaseClass {
    static final String mainURL = "https://certificate.ithillel.ua/";
    MainPageFactory mainPageFactory = PageFactory.initElements(driver,MainPageFactory.class);

    static {
        if (driver == null) {
            BaseClass.BeforeParent();
        }
    }

    @Before("@Run")
    public void start() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.navigate().to(mainURL);
        }

    }

    @When("I open page {string}")
    public void iOpenPage(String arg0) {
        driver.get(arg0);
    }


    @And("send certificate {string}")
    public void sendCertificate(String certificateNumber) {

        mainPageFactory.getCertificate(certificateNumber);
    }
    @And("click the field")
    public void clickTheField() {
        mainPageFactory.getButton();
    }




    @Then("check the certificate validation {string}")
    public void chechTheCertificateValidation(String expected) throws Exception {
        Assert.assertEquals(Boolean.valueOf(expected),mainPageFactory.checkcertifChekForm());
    }
}
