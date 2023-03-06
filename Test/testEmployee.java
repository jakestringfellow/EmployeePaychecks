import static org.junit.Assert.assertEquals;

import employee.Employee;
import employee.SalariedPaycheck;
import org.junit.Before;
import org.junit.Test;

/**
 * A Junit test class for the Employee class.
 */
public class testEmployee {
  private Employee george;
  private Employee bill;
  private Employee eric;
  private Employee invalidEmployee1;
  private Employee invalidEmployee2;

  /**
   * Set up for the Junit tests, 3 objects. First is george, a salaried employee
   * with the name "George", the id "GEORGE1", the pay rate 60,000, the pay Interval 2,
   * and is a manager.
   * Second is bill, an hourly employee with name "Bill", the id "BILL2", the
   * pay rate 12, and 35 hours worked. Third is eric, an hourly employee with
   * the name "Eric", the id "ERIC3", the pay rate 25, and the hours worked 45.
   */
  @Before
  public void setUp() {
    this.george = new Employee("George", "GEORGE1", 60000, 2, true);
    this.bill = new Employee("Bill", "BILL2", 12, 35);
    this.eric = new Employee("Eric", "ERIC3", 25, 45);
    try {
      this.invalidEmployee1 = new Employee("", "", 25, 45);
    } catch (IllegalArgumentException e) {
      //Will only be thrown if the argument is invalid
    }
    try {
      this.invalidEmployee2 = new Employee("Bob", "BOB5", 10000, 9, false);
    } catch (IllegalArgumentException e) {
      //Will only be thrown if the argument is invalid
    }

  }



  /**
   * Junit test for the isManager() method, as well as
   * proving the invalidEmployee classes invalid.
   */
  @Test
  public void testIsManager() {
    assertEquals(true, george.isManager());
    assertEquals(false, bill.isManager());
    assertEquals(false, eric.isManager());
    assertEquals(null, invalidEmployee1);
    assertEquals(null, invalidEmployee2);
  }

  /**
   * Junit test for the getPaycheck() method.
   */
  @Test
  public void getPaycheck() {
    assertEquals("Payment after taxes: $ 1961.54", george.getPaycheck().toString());
    assertEquals("Payment after taxes: $ 357.00", bill.getPaycheck().toString());
    assertEquals("Payment after taxes: $ 1009.37", eric.getPaycheck().toString());
  }

  /**
   * Junit test for the toString() method.
   */
  @Test
  public void testToString() {
    assertEquals("Name: George\n" + "ID: GEORGE1\n"
            + "Payment after taxes: $ 1961.54", george.toString());
  }
}
