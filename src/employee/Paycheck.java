package employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * This class defines all the operations mandated by the
 * IPaycheck interface.
 */
public abstract class Paycheck implements IPaycheck {
  double hoursWorked;
  double payRate;
  int payInterval;
  static final double TAX_THRESHOLD = 400.0;
  static final double AFTER_TAX_UNDER = 0.90;
  static final double AFTER_TAX_OVER = 0.85;



  @Override
  public double getPayAfterTaxes() {
    double payAfterTaxes;
    if (getTotalPay() < TAX_THRESHOLD) {
      payAfterTaxes = getTotalPay() * AFTER_TAX_UNDER;
      if (payAfterTaxes < 0.01 && payAfterTaxes > 0.00) {
        payAfterTaxes = 0.01;
      }
    }
    else {
      payAfterTaxes = getTotalPay() * AFTER_TAX_OVER;
    }
    return payAfterTaxes;

  }

  @Override
  public double getPayRate() {
    return this.payRate;
  }


  /**
   * Creates a String representation of the current
   * Paycheck instance.
   *
   * @return String
   */
  public String toString() {
    double weeklyPay;

    weeklyPay = getPayAfterTaxes();
    BigDecimal bd = new BigDecimal(weeklyPay).setScale(2, RoundingMode.HALF_DOWN);
    weeklyPay = bd.doubleValue();

    String str;
    str = String.format("Payment after taxes: $ %.2f", weeklyPay);
    return str;
  }
}
