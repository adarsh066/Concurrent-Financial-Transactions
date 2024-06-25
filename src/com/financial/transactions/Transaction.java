// Declares the package this class belongs to
package com.financial.transactions;

// Declares the Transaction class as public
public class Transaction {
	// Private field to store the transaction ID
	private String transactionID;

	// Private field to store the timestamp of the transaction
	private long timestamp;

	// Private field to store the type of transaction (e.g., BUY or SELL)
	private String type;

	// Private field to store the amount involved in the transaction
	private double amount;

	// Constructor to initialize a new Transaction object with the provided values
	public Transaction(String transactionID, long timestamp, String type, double amount) {
		this.transactionID = transactionID; // Assigns the provided transaction ID to the field
		this.timestamp = timestamp; // Assigns the provided timestamp to the field
		this.type = type; // Assigns the provided type to the field
		this.amount = amount; // Assigns the provided amount to the field
	}

	// Getter method to return the transaction ID
	public String getTransactionID() {
		return transactionID;
	}

	// Getter method to return the timestamp
	public long getTimestamp() {
		return timestamp;
	}

	// Getter method to return the type of transaction
	public String getType() {
		return type;
	}

	// Getter method to return the amount involved in the transaction
	public double getAmount() {
		return amount;
	}

	// Overridden toString method to return a string representation of the
	// Transaction object
	@Override
	public String toString() {
		return "Transaction{" + "transactionID='" + transactionID + '\'' + ", timestamp=" + timestamp + ", type='"
				+ type + '\'' + ", amount=" + amount + '}';
	}
}
