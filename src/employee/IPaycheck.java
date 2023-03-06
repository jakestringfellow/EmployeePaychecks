package employee;

/**
 * This interface contains all operations that all types
 * of Paychecks should support.
 */
public interface IPaycheck {

  /**
   * Calculates the total pay depending on the type of employee (salary vs hourly).
   *
   * @return totalPay
   */
  double getTotalPay();

  /**
   * Calculates the total pay after taxes have been removed.
   *
   * @return payAfterTaxes
   */
  double getPayAfterTaxes();

  /**
   * Returns the pay rate given to the current paycheck.
   *
   * @return payRate
   */
  double getPayRate();
}
