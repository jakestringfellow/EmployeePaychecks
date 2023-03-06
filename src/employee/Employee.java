package employee;

/**
 * This class represents a single Employee, either hourly or salaried.
 */
public class Employee {
  private String name;
  private String id;
  private double payRate;
  private int payInterval;
  private boolean isManager;
  private double hoursWorked;
  Paycheck employeePaycheck;

  /**
   * Constructs a salaried employee object and initializes it to the
   * given name, ID, pay rate, pay interval, and managerial status.
   *
   * @param name  the name of the employee
   * @param id    the ID of the employee
   * @param payRate       the yearly salary of the employee
   * @param payInterval   how often the employee is paid
   * @param isManager boolean, true if the employee is a manager, false if not
   * @throws IllegalArgumentException if the name, ID, pay rate, or pay interval is invalid
   */
  public Employee(String name, String id, double payRate, int payInterval,
                  boolean isManager) throws IllegalArgumentException {
    if (name == null || id == null || name.length() == 0 || id.length() == 0) {
      throw new IllegalArgumentException("Name and ID must be valid.");
    }
    if (payRate < 0) {
      throw new IllegalArgumentException("Pay rate cannot be negative");
    }
    if (payInterval != 1 && payInterval != 2 && payInterval != 4) {
      throw new IllegalArgumentException("Pay interval can only be 1, 2, or 4.");
    }
    this.name = name;
    this.id = id;
    this.payRate = payRate;
    this.payInterval = payInterval;
    this.isManager = isManager;
    employeePaycheck = new SalariedPaycheck(this.payRate, this.payInterval);
  }

  /**
   * Constructs an hourly employee object and initializes it to the
   * given name, ID, pay rate, and hours worked.
   *
   * @param name  the name of the employee
   * @param id    the ID of the employee
   * @param payRate       the hourly rate of the employee
   * @param hoursWorked   the hours the employee worked
   * @throws IllegalArgumentException if the name, ID, pay rate, or hours are invalid
   */
  public Employee(String name, String id, double payRate,
                  double hoursWorked) throws IllegalArgumentException {
    if (name == null || id == null || name.length() == 0 || id.length() == 0) {
      throw new IllegalArgumentException("Name and ID must be valid.");
    }
    if (payRate < 0 || hoursWorked < 0) {
      throw new IllegalArgumentException("Pay rate and hours worked cannot be negative");
    }
    this.name = name;
    this.id = id;
    this.hoursWorked = hoursWorked;
    this.payRate = payRate;
    employeePaycheck = new HourlyPaycheck(this.payRate, this.hoursWorked);
  }

  /**
   * Returns true if the employee is a manger, false if not.
   *
   * @return True if manager, false if not
   */
  public boolean isManager() {
    return this.isManager;
  }

  /**
   * Returns the employee's paycheck for that given payment period.
   *
   * @return Paycheck based on the type of employee they are
   */
  public IPaycheck getPaycheck() {
    return employeePaycheck;
  }

  /**
   * Returns a toString to represent the employee.
   *
   * @return String
   */
  public String toString() {
    return "Name: " + this.name + "\n" + "ID: " + this.id
      + "\n" + this.getPaycheck().toString();
  }


}
