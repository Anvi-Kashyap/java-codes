//Q1.  Create an 2D array to store the time and value of different stocks with their respective time. Print their values at the respective timed intervals. 

import java.util.concurrent.TimeUnit;

public class exp3_1 {
    public static void main(String[] args) {
        
        String[][] stocks = {
            {"09:00", "AAPL", "150.25"},
            {"09:30", "GOOGL", "2800.50"},
            {"10:00", "AMZN", "3400.75"},
            {"10:30", "MSFT", "299.99"}
        };

        for (String[] stock : stocks) {
            System.out.println("Time: " + stock[0] + ", Stock: " + stock[1] + ", Value: " + stock[2]);
            try {
                TimeUnit.SECONDS.sleep(1); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

