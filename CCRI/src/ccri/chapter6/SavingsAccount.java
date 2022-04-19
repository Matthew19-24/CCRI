package ccri.chapter6;

/**
 * An instance of this class represents a users bank account,
 * with the ability to withdraw, deposit, and calculate the monthly interest.
 */

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-07
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 12 (6.12)
 *
 */
public class SavingsAccount {
	
	/**
	 * The savings account's annual interest rate.
	 */
	private double interest;
	
	/**
	 * The balance of the savings account.
	 */
	private double balance;
	
	/**
	 * The total amount of deposits.
	 */
	private double totalDeposits;
	
	/**
	 * The total amount of withdrawals
	 */
	private double totalWithdrawals;
	
	/**
	 * The total amount of earned interest
	 */
	private double totalInterestEarned;
	
	/**
	 * The setInterest method stores data in the interest field.
	 */
	public void setInterest()
	{
		// Set variable.
		double interestRate = 0;
				
		// Get interest rate from user.
		interestRate = Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?"));
				
		// Validate input
		if (interestRate < 0)
		{
			interestRate = Double.parseDouble(JOptionPane.showInputDialog("Cannot be less than 0.\n" +
																				  "What is the anual interest rate?"));
		}
				
		// Set interest
		this.interest = interestRate;
		
	} // End setInterest.
	
	/**
	 * The getBalance method returns the data stored in the balance field.
	 * @return The account's balance.
	 */
	public double getBalance()
	{
		return this.balance;
	} // End getBalance.
	
	/**
	 * The getTotalDeposits method returns the data in the totalDeposits field.
	 * @return Total amount of deposits.
	 */
	public double getTotalDeposits()
	{
		return this.totalDeposits;
	}
	
	/**
	 * The getTotalWithdrawals method returns the data in the totalWithdrawals field.
	 * @return Total amount of deposits
	 */
	public double getTotalWithdrawals()
	{
		return this.totalWithdrawals;
	}
	
	/**
	 * The getTotalInterestEarned method returns the data in the totalInterestEarned field.
	 * @return Total amount of interest earned.
	 */
	public double getTotalInterestEarned()
	{
		return this.totalInterestEarned;
	}

	/**
	 * The deposit method increases the balance by the amount deposited into the account.
	 * @param deposit The amount being deposited. 
	 */
	public void deposit(double deposit)
	{
		this.balance += deposit; // Add to balance.
		this.totalDeposits += deposit; // Add to totalDeposits.
		
		System.out.println("Deposit: " + deposit); // Debugging
		System.out.println("Balance: " + balance); // Debugging
	} // End deposit.
	
	/**
	 * The withdraw method withdraws an amount from the balance.
	 * @param withdraw Amount to be withdrawn.
	 * @return the withdrawal amount, 0 if insufficient funds.
	 */
	public double withdraw(double withdraw)
	{
		// Check for sufficient funds.
		if (this.balance >= withdraw)
		{
			System.out.println("Withdraw: " + withdraw); // Debugging
			this.balance -= withdraw; // Subtract from balance.
			this.totalWithdrawals += withdraw; // Add to totalWithdrawals.
			System.out.println("Balance: " + balance); // Debugging
			return withdraw;
		}
		else
		{
			System.out.println("Insufficient Fudns!"); // Debugging
			JOptionPane.showMessageDialog(null, "Insuficient Funds!");
			return 0;
		} // End else-if statement.
		
	} // End withdraw.
	
	/**
	 * The monthlyCharge method adds the monthly interest to the balance and returns the amount gained.
	 * @return The amount earned.
	 */
	public double monthlyCharge()
	{
		double monthly = this.balance * (this.interest / 12);
		
		this.balance += monthly;
		
		this.totalInterestEarned += monthly;
		
		System.out.println("Interest: " + monthly);
		
		return monthly;
	} // End monthlyCharge.
	
	/**
	 * Constructor
	 * @param starting The users starting balance.
	 */
	public SavingsAccount(double starting)
	{
		// If starting balance is below 0, ask for new balance.
		if(starting < 0)
		{
			starting = Double.parseDouble(JOptionPane.showInputDialog("Balance cannot be below 0."));
		}
		this.balance = starting;
		this.interest = 0;
	} // End constructor.
	
	/**
	 * Default constructor.
	 */
	public SavingsAccount()
	{
		this(0.0);
	} // End constructor.
	
	/**
	 * The toString method returns String representation of object.
	 * @return The String representation of object.
	 */
	public String toString()
	{
		// Create StringBuilder object
		StringBuilder sb = new StringBuilder();
		
		sb.append(" this.getBalance()= ").append(this.getBalance());
		sb.append(" this.monthlyCharge()= ").append(this.monthlyCharge());
		sb.append(" this.getTotalDeposits()= ").append(this.getTotalDeposits());
		sb.append(" this.getTotalWithdrawals()= ").append(this.getTotalWithdrawals());
		sb.append(" this.getTotalInterestEarned()= ").append(this.getTotalInterestEarned());
		
		return sb.toString();
	} // End toString.
	
	/**
	 * The displayData method will display the current balance, total deposits,
	 * total withdrawals and total interest earned.
	 */
	public void displayData()
	{
		// Create StringBuilder
		StringBuilder sb = new StringBuilder();
				
		// Append data
		sb.append("Balance: ").append(String.format("%,.2f", this.getBalance()));
		sb.append("\nTotal Deposits: ").append(String.format("%,.2f", this.getTotalDeposits()));
		sb.append("\nTotal Withdrawals: ").append(String.format("%,.2f", this.getTotalWithdrawals()));
		sb.append("\nTotal Interest Earned: ").append(String.format("%,.2f", this.getTotalInterestEarned()));
				
		// Display data
		JOptionPane.showMessageDialog(null, sb);
	} // End displayData
	
} // End class
