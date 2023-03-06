import static org.junit.Assert.assertEquals;

import employee.HourlyPaycheck;
import employee.SalariedPaycheck;
import org.junit.Before;
import org.junit.Test;


/**
 * A Junit test class for the HourlyPaycheck class.
 */
public class testHourlyPaycheck {
  private HourlyPaycheck hp1;
  private HourlyPaycheck hp2;
  private HourlyPaycheck hp3;

  /**
   * Set up for the Junit tests, 3 objects. First is hp1, with a pay rate of
   * $65 and 47 hours worked.
   * Second is hp2, with a pay rate of $0 and 1 hour worked. Third
   * is hp3, with a pay rate of $12 and 22 hours worked.
   */
  @Before
  public void setUp() {
    this.hp1 = new HourlyPaycheck(65, 47);
    this.hp2 = new HourlyPaycheck(0, 1);
    this.hp3 = new HourlyPaycheck(12, 22);
  }

  /**
   * A junit test for the addHoursWorked() method.
   */
  @Test
  public void testAddHoursWorked() {
    hp1.addHoursWorked(-5);
    hp2.addHoursWorked(-1);
    hp3.addHoursWorked(8);
    assertEquals(42, hp1.getHoursWorked(), 0.1);
    assertEquals(0, hp2.getHoursWorked(), 0.1);
    assertEquals(30, hp3.getHoursWorked(), 0.1);

    hp1.addHoursWorked(-300);
    assertEquals(42, hp1.getHoursWorked(), 0.1);
    //Testing no change when the potential hours would make
    //the employee's hours go negative.

  }

  /**
   * A junit test for the resetHoursWorked() method.
   */
  @Test
  public void testResetHoursWorked() {
    hp1.resetHoursWorked();
    hp2.resetHoursWorked();
    hp3.resetHoursWorked();
    assertEquals(0, hp1.getHoursWorked(), 0.1);
    assertEquals(0, hp2.getHoursWorked(), 0.1);
    assertEquals(0, hp3.getHoursWorked(), 0.1);
  }

  /**
   * A junit test for the getTotalPay() method.
   */
  @Test
  public void testGetTotalPay() {
    assertEquals(3282.5, hp1.getTotalPay(), 0.1);
    assertEquals(0, hp2.getTotalPay(), 0.1);
    assertEquals(264, hp3.getTotalPay(), 0.1);
  }

  /**
   * A junit test for the getPayAfterTaxes() method.
   */
  @Test
  public void testPayAfterTaxes() {
    assertEquals(2790.12, hp1.getPayAfterTaxes(), 0.1);
    assertEquals(0, hp2.getPayAfterTaxes(), 0.1);
    assertEquals(237.6, hp3.getPayAfterTaxes(), 0.1);
  }

  /**
   * A junit test for the getPayRate() method.
   */
  @Test
  public void testGetPayRate() {
    assertEquals(65, hp1.getPayRate(), 0.1);
    assertEquals(0, hp2.getPayRate(), 0.1);
    assertEquals(12, hp3.getPayRate(), 0.1);
  }

  /**
   * A junit test for the toString() method.
   */
  @Test
  public void testToString() {
    assertEquals("Payment after taxes: $ 2790.12", hp1.toString());
    assertEquals("Payment after taxes: $ 0.00", hp2.toString());
    assertEquals("Payment after taxes: $ 237.60", hp3.toString());
  }



}
