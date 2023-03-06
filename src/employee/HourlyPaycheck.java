package employee;

/**
 * This class represents a single hourly paycheck.
 */
public class HourlyPaycheck extends Paycheck implements IPaycheck {
  static final double MAX_HOURS = 40;
  static final double OVERTIME_MULTIPLIER = 1.5;


  /**
   * Constructor for the HourlyPaycheck class.
   *
   * @param payRate     the amount of money the employee receives per hour
   * @param hoursWorked the amount of hours the employee worked this week
   * @throws IllegalArgumentException if the pay rate or hours worked is negative
   */
  public HourlyPaycheck(double payRate, double hoursWorked) throws IllegalArgumentException {
    this.payRate = payRate;
    this.hoursWorked = hoursWorked;


  }

  /**
   * Calculates the total pay for the current hourly employee.
   *
   * @return totalPay the total pay for the week
   */
  public double getTotalPay() {
    double totalPay;
    double overtimeHours;
    double overtimePay;
    if (this.hoursWorked > MAX_HOURS) {
      overtimeHours = this.hoursWorked - MAX_HOURS;
      overtimePay = overtimeHours * this.payRate * OVERTIME_MULTIPLIER;
      totalPay = (this.payRate * (this.hoursWorked - overtimeHours))
                  + overtimePay;
    }
    else {
      totalPay = this.payRate * this.hoursWorked;
    }
    return totalPay;
  }

  /**
   * Takes a parameter (double) and adds the value of that to
   * the current number of hours the employee has worked this week,
   * as long as it doesn't result in a total hours worked less
   * than 0.
   *
   * @param newHours the hours being added
   */
  public void addHoursWorked(double newHours) {
    if (this.hoursWorked + newHours >= 0) {
      this.hoursWorked = this.hoursWorked + newHours;
    }
  }

  /**
   * Resets the hours worked by the employee to 0.
   */
  public void resetHoursWorked() {
    this.hoursWorked = 0;
  }

  public double getHoursWorked() {
    return this.hoursWorked;
  }

}
