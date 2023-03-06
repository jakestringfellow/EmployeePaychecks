# EmployeePaychecks

## Project Description: 
* Project made to reinforce Composition, Delegation, and Inheritance understanding.
* Implements a single Employee class that can represent both salaried and hourly employees. The Employee class has two constructors that allows us to distinguish between the kind of employee we're creating. One constructor allows us to create employees that we will pay as "salaried" workers. It takes 5 parameters: name, id, pay rate, pay, and a boolean flag to indicate if the employee is a manager or not. The pay rate for salaried employees is their yearly salary. The pay interval determines how frequently the employee is paid: weekly (1 time per week), bi-weekly (1 time every two weeks) or quad-weekly (1 time every four weeks). 
* The second constructor takes four parameters: name, id, par rate and hours worked. In this case, the pay rate represents the hourly rate, and hours worked represents the number of hours the employee has worked. Hourly employees are paid at their rate * hours if the number of hours worked is 40 or less. If the hours worked exceeds 40, the employee is paid at an overtime rate of 1.5x for all of the hours in excess of 40.
* Hourly employees cannot be managers in this system.
* Throws an IllegalArgumentException if either the name or ID are null OR if they are empty strings (length = 0) when creating employees. Pay rate and hours cannot be negative.
* Employess have methods for returning a Paycheck instance (to get paid for the current pay period) and for telling if the employee is a manager or not.
* There are two variations of Paycheck; the HourlyPaycheck class and SalariedPaycheck class that both adhere to the IPaycheck protocol.
* HourlyPaycheck has a few more methods than  SalariedPaycheck; a method addHoursWorked(double hoursAdded) which takes a parameter (double) and adds the value of that parameter to the current number of hours worked this week. It is allowed to add "negative" hours for the week, however the total number of hours worked for the week cannot drop below 0. Another method resetHoursWorked() that resets the Paycheck to zero hours for payment, and a method getHoursWorked() that answers the number of hours an Hourly employee worked for the current paycheck
* Employee returns a String, allowing Employee objects to be represented by the employee name, ID, and current week's payment after taxes are assessed.
A visual representation of the String (if we were to print it) would be like this (note the space between the $ and the numeric value - you optionally might want to explore the java.text.DecimalFormat class to help your formatting):
* Name: Jake Stringfellow
* ID: SUPS-117
* Payment after taxes: $ 482.50

* Currency is US Dollars, "employees" will not get paid in a fraction of a cent, if an employee earned more than 0 but less than 1 cent, the system will pay them the 1 cent.

## Testing
* JUnit tests are used to test functionality of the project

## Acknowledgements
* Project interface created by Professor Bagley of Northeastern University for use of Object-Oriented Design students
                       
