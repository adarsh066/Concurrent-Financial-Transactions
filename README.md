## Author
- [ AADARSH PATIL ](https://github.com/adarsh066)

# Concurrent Financial Transactions

This Java project implements a concurrent data processing system for a financial trading platform. It handles multiple types of transactions from various sources, processes them concurrently, and maintains a historical record of all transactions in a highly efficient and thread-safe manner.

## Components

### 1. Transaction
- Represents individual transactions with attributes like transaction ID, timestamp, type, and amount.

### 2. TransactionHistory
- Manages the historical record of transactions using the List interface.
- Provides thread-safe operations for adding, retrieving, and removing transactions.

### 3. TransactionProcessor
- Uses a BlockingQueue to manage incoming transactions.
- Implements producer threads to generate random transactions and consumer threads to process them.

## Usage
1. Clone the repository.
2. Compile the Java files using any Java compiler or IDE.
3. Run the TransactionProcessor class to start processing transactions.

## Contributing
Contributions are welcome! Please feel free to fork the repository and submit pull requests with your improvements or bug fixes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
