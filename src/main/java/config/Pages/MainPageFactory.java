package config.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageFactory {
    private WebDriver driver;
    @FindBy(xpath = "//input[@class='input -text certificate-check_input']")
    WebElement certificate;
    @FindBy(xpath = "//button[@class='btn btn-submit -submit certificate-check_submit']")
    WebElement Button;


    public MainPageFactory(WebDriver driver) {
        this.driver = driver;


    }
    public void getCertificate(String certificate){
        this.certificate.sendKeys("45924126");
    }
    public void getButton(){
        this.Button.click();
    }

}


//    @FindBy(xpath = "//div[@class='introduction_info introduction-info']")
//    WebElement CourseDescription;
//    @FindBy(xpath = "//button[@id='coachesShowAllButton']")
//    WebElement ButtonCoachesNames;
//
//    @FindBy(xpath = "//ul[@class='coach-list coaches_list']")
//    List<WebElement> couchList;
//

//
//        public String getCourseTitle (String title) {
//         driver.getTitle();
//         return title;
//    }
//    public  int getCourseRate(int rate){
//        driver.findElement(CourseRate);
//        return rate;
//    }
//
//    public List<String> getCoachList(){
//        List<String> stringList = new ArrayList<>();
//       for (WebElement element:couchList){
//           element.findElements(By.xpath("//p[@class='coach-card_name']"));
//        }
//       return stringList;
//    }
//        public WebElement getCourseRate(){
//        return CourseRate.getText();
//    }
//
//    public String getCourseTitle() {
//        return driver.getTitle();
//    }
//
//    public WebElement getCourseRate() {
//        return driver.findElement(CourseRate);
//    }
//
//    public WebElement getCourseDescription() {
//        return driver.findElement(CourseDescription);
//    }
//
//
//    public WebElement getButtonCoachesNames() {
//        return driver.findElement(ButtonCoachesNames);
//    }
//}
