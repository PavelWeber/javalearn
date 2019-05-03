package tests;

import module.TestBase;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;


public class GroupCreationTest extends TestBase {
  private String baseUrl;
  private boolean acceptNextAlert = true;



  @Test
  public void testGroupCreationTest()  {
    app.init();
    app.login("admin", "secret");
    app.goToGroupPage();
    fillInGroupForm(new GroupData("Test_1", "test2", "Test3"));
    sumbitGroupCreation();
  }

  public void sumbitGroupCreation() {
    app.driver.findElement(By.name("submit")).click();
  }

  public void fillInGroupForm(GroupData groupData) {
    app.driver.findElement(By.name("group_name")).click();
    app.driver.findElement(By.name("group_name")).click();
    app.driver.findElement(By.name("group_name")).clear();
    app.driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    app.driver.findElement(By.name("group_header")).click();
    app.driver.findElement(By.name("group_header")).clear();
    app.driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    app.driver.findElement(By.name("group_footer")).click();
    app.driver.findElement(By.name("group_footer")).clear();
    app.driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  private boolean isElementPresent(By by) {
    try {
      app.driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      app.driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = app.driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
