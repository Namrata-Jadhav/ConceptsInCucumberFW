package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class StepDefs {

    WebDriver driver;

    public void CleanUp() {
        if (!(driver == null)) {
            driver.quit();
        }
    }
    @Given("I want to do something")
    public void i_want_to_do_something(){
    }

    @When("I have a argumentts to send as")
    public void i_have_a_argument_to_send_as(String arg) {
        System.out.println("Arguments to be passed as: "+arg);
    }
    @When("I have a list of students to send as")
    public void i_have_a_list_of_students_to_send_as(List<String> list) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(list.toString());
    }
    @When("I have a list of students and their marks to send as")
    public void i_have_a_list_of_students_and_their_marks_to_send_as(Map<String, String> map ) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(map.toString());
    }


    @Then("Something should happen")
    public void something_should_happen() {

    }

}