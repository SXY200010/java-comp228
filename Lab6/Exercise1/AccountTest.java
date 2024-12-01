import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        Account sharedAccount = new Account(1000);

        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(sharedAccount, "deposit", 200));
        transactions.add(new Transaction(sharedAccount, "withdraw", 150));
        transactions.add(new Transaction(sharedAccount, "withdraw", 100));
        transactions.add(new Transaction(sharedAccount, "deposit", 50));

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (Transaction transaction : transactions) {
            executorService.execute(transaction);
        }

        executorService.shutdown();
    }
}
