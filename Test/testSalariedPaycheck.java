import static org.junit.Assert.assertEquals;

import employee.Employee;
import employee.SalariedPaycheck;
import org.junit.Before;
import org.junit.Test;


/**
 * A Junit test class for the SalariedPaycheck class.
 */
public class testSalariedPaycheck {
  private SalariedPaycheck sp1;
  private SalariedPaycheck sp2;
  private SalariedPaycheck sp3;
  private SalariedPaycheck sp4;

  /**
   * Set up for the Junit tests, 3 objects. First is sp1, with a pay rate of
   * $12,000 and a quad-weekly pay interval.
   * Second is sp2, with a pay rate of 0 and a bi-weekly pay interval. Third
   * is sp3, with a pay rate of $150,000 and a weekly pay interval.
   */
  @Before
  public void setUp() {
    this.sp1 = new SalariedPaycheck(12000, 4);
    this.sp2 = new SalariedPaycheck(0, 2);
    this.sp3 = new SalariedPaycheck(150000, 1);
  }

  /**
   * A junit test for the getTotalPay() method.
   */
  @Test
  public void testGetTotalPay() {
    assertEquals(923.07, sp1.getTotalPay(), 0.1);
    assertEquals(0, sp2.getTotalPay(), 0.1);
    assertEquals(2884.61, sp3.getTotalPay(), 0.1);
  }

  /**
   * A junit test for the getPayRate() method.
   */
  @Test
  public void testGetPayRate() {
    assertEquals(12000, sp1.getPayRate(), 0.1);
    assertEquals(0, sp2.getPayRate(), 0.1);
    assertEquals(150000, sp3.getPayRate(), 0.1);
  }

  /**
   * A junit test for the getPayAfterTaxes() method.
   */
  @Test
  public void testGetPayAfterTaxes() {
    assertEquals(784.61, sp1.getPayAfterTaxes(), 0.1);
    assertEquals(0, sp2.getPayAfterTaxes(), 0.1);
    assertEquals(2451.91, sp3.getPayAfterTaxes(), 0.1);
  }


  /**
   * A junit test for the toString() method.
   */
  @Test
  public void testToString() {
    assertEquals("Payment after taxes: $ 784.62", sp1.toString());
    assertEquals("Payment after taxes: $ 0.00", sp2.toString());
    assertEquals("Payment after taxes: $ 2451.92", sp3.toString());
  }
}
