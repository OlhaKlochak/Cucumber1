import config.BaseClass;
import config.Pages.MainPageFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import io.cucumber.datatable.DataTable;
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
        System.out.println(driver.getCurrentUrl());
    }

    @And("send certificate {string}")
    public void sendCertificate(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        int line = 0;
        List<String>list=data.get(line);
        mainPageFactory.getCertificate(list.get(0));
    }

    @And("click the field")
    public void clickTheField() {
        mainPageFactory.getButton();
    }
}
