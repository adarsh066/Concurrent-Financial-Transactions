// Declares the package this class belongs to
package com.financial.transactions;

// Imports necessary classes for using a list
import java.util.ArrayList;
import java.util.List;

// Declares the TransactionHistory class as public
public class TransactionHistory {
	// Private field to store a list of transactions
	private List<Transaction> transactions = new ArrayList<>();

	// Synchronized method to add a transaction to the list
	public synchronized void add(Transaction transaction) {
		transactions.add(transaction); // Adds the provided transaction to the list
	}

	// Method to return a copy of the list of transactions
	public List<Transaction> getTransactions() {
		return new ArrayList<>(transactions); // Returns a new list containing all transactions
	}
}
