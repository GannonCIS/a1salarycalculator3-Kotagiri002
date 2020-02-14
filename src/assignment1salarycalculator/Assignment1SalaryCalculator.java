/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

import java.util.Scanner;
/**
 *
 * @author gubotdev
 */

public class Assignment1SalaryCalculator
{
  int salary;
  int hourlyWage;
  double taxes;


  public int salary (int hourlyWage)
  {
    salary = hourlyWage * 2080;
    int monthlySalary = salary / 12;
      System.out.println ("Salary: ");
      return salary;
  }

  public double taxes ()
  {
    taxes = (salary * 15) / 100;
    System.out.println ("taxes: ");
    return taxes;
  }

  public double monthlyAfterTax ()
  {
    double monthlyAfterTax = (salary - taxes) / 12;
    System.out.println ("monthlyAfterTax: ");
    return monthlyAfterTax;
  }

  public static void main (String[]args)
  {
    Assignment1SalaryCalculator cal = new Assignment1SalaryCalculator ();

    Scanner myObj = new Scanner (System.in);

    System.out.println ("Enter Hourly Wage");

    int hourlyWage = myObj.nextInt ();

    System.out.println ("Hourly Wage is: " + hourlyWage);

    System.out.println (cal.salary (+hourlyWage));

    System.out.println (cal.taxes ());

    System.out.println (cal.monthlyAfterTax ());
  }
}
