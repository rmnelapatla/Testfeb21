package stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allsearchinfo {


    public static WebDriver webDriver;

    @Given("^Open the browser chrome$")
    public void open_the_browser_chrome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //this is for test
        System.setProperty("webdriver.chrome.driver","E:\\AllBrowser\\chromedriver_win32_88\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://google.com");

    }

    @When("^user serach for \"([^\"]*)\"$")
    public void user_serach_for(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^User click on java script links$")
    public void user_click_on_java_script_links() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @When("^User search for  \"([^\"]*)\"$")
    public void user_search_for(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^validate the search restult$")
    public void validate_the_search_restult() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Given("^open the browser$")
    public void open_the_browser(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
    }

    @When("^User search for a key word$")
    public void user_search_for_a_key_word(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
    }

    @Then("^User validate the result$")
    public void user_validate_the_result() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

}
