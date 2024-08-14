### Task Trading Platform ###
This Java-based console application simulates a simple trading platform where users can buy and sell stocks, view their portfolio, and manage their account balance.

Features
Stock Purchase: Buy stocks by specifying the stock symbol and quantity, provided there are sufficient funds in the account.
Stock Sale: Sell owned stocks by specifying the stock symbol and quantity, provided there are enough shares in the portfolio.
Portfolio Display: View the current stock holdings and account balance.
Exit: Option to exit the application.
How It Works
1. Buy Stock
Users can purchase stocks by entering the stock symbol (e.g., AAPL, GOOGL, AMZN) and the quantity they wish to buy. The system checks if the user has enough balance to complete the transaction. If successful, the stock is added to the user's portfolio, and the account balance is updated.

2. Sell Stock
Users can sell their stocks by entering the stock symbol and the quantity they wish to sell. The system verifies if the user owns enough shares of the specified stock. If the transaction is valid, the shares are deducted from the user's portfolio, and the account balance is credited with the sale amount.

3. Display Portfolio
Users can view their current portfolio, which includes a list of all owned stocks and their quantities, as well as the remaining account balance.

4. Exit
The user can exit the application at any time by selecting the exit option.

Usage
Clone the repository to your local machine.
Compile the TradingPlatform class.
Run the application.
Follow the on-screen instructions to buy and sell stocks and manage your portfolio.
bash
Copy code
javac TradingPlatform.java
java TradingPlatform
Code Structure
TradingPlatform Class: Manages stock prices, user holdings, and account balance. It provides methods to buy and sell stocks and display the portfolio.
Main Method: Provides a command-line interface for the user to interact with the platform.
Example Interaction
yaml
Copy code
1. Buy 2. Sell 3. Portfolio 4. Exit: 1
Stock Symbol: AAPL
Quantity: 10
Holdings: {AAPL=10}
Balance: $8500.0

1. Buy 2. Sell 3. Portfolio 4. Exit: 2
Stock Symbol: AAPL
Quantity: 5
Holdings: {AAPL=5}
Balance: $9250.0

1. Buy 2. Sell 3. Portfolio 4. Exit: 3
Holdings: {AAPL=5}
Balance: $9250.0
Requirements
Java Development Kit (JDK) 8 or higher
License
This project is open-source and available under the MIT License.
