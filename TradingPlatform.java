package javaapplication70;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TradingPlatform {
    private Map<String, Double> stockPrices = new HashMap<>();
    private Map<String, Integer> holdings = new HashMap<>();
    private double accountBalance = 10000;

    public TradingPlatform() {
        stockPrices.put("AAPL", 150.0);
        stockPrices.put("GOOGL", 2800.0);
        stockPrices.put("AMZN", 3400.0);
    }

    public void buyStock(String stockSymbol, int quantity) {
        double price = stockPrices.getOrDefault(stockSymbol, -1.0);
        if (price == -1.0 || accountBalance < price * quantity) {
            System.out.println("Invalid transaction.");
            return;
        }
        accountBalance -= price * quantity;
        holdings.put(stockSymbol, holdings.getOrDefault(stockSymbol, 0) + quantity);
    }

    public void sellStock(String stockSymbol, int quantity) {
        int ownedQuantity = holdings.getOrDefault(stockSymbol, 0);
        if (ownedQuantity < quantity) {
            System.out.println("Invalid transaction.");
            return;
        }
        accountBalance += stockPrices.get(stockSymbol) * quantity;
        holdings.put(stockSymbol, ownedQuantity - quantity);
    }

    public void displayPortfolio() {
        System.out.println("Holdings: " + holdings + "\nBalance: $" + accountBalance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TradingPlatform platform = new TradingPlatform();

        while (true) {
            System.out.print("1. Buy 2. Sell 3. Portfolio 4. Exit: ");
            int choice = input.nextInt();
            if (choice == 4) break;

            System.out.print("Stock Symbol: ");
            String stockSymbol = input.next().toUpperCase();
            if (choice == 1 || choice == 2) {
                System.out.print("Quantity: ");
                int quantity = input.nextInt();
                if (choice == 1) platform.buyStock(stockSymbol, quantity);
                if (choice == 2) platform.sellStock(stockSymbol, quantity);
            } else if (choice == 3) {
                platform.displayPortfolio();
            }
        }
        input.close();
    }
}