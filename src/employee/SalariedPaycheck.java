package employee;

/**
 * This class represents a single Salaried Paycheck.
 */
public class SalariedPaycheck extends Paycheck implements IPaycheck {
  static final int WEEKS_IN_YEAR = 52;

  /**
   * Constructor for the SalariedPaycheck class.
   *
   * @param payRate     the amount of money the employee receives per hour
   * @param payInterval how many weeks pass between paychecks
   * @throws IllegalArgumentException if the pay rate or pay interval is invalid
   */
  public SalariedPaycheck(double payRate, int payInterval) throws IllegalArgumentException {
    this.payRate = payRate;
    this.payInterval = payInterval;

  }

  /**
   * Calculates the total pay per pay interval the employee receives.
   *
   * @return totalPay, the amount of money the employee receives per payment
   */
  public double getTotalPay() {
    double totalPay;
    totalPay = (this.payRate / WEEKS_IN_YEAR) * payInterval;
    return totalPay;
  }
}
