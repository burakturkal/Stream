package Task7_TraderTask;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        System.out.println("--------------Task 1------------------");
        // 1. Find all transactions in 2011 and sort by value

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("--------------Task 2------------------");
        // 2. What are all the unique cities where the trader work?
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------------Task 3------------------");
        // 3. Find all traders from Cambridget and sort them by name
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("--------------Task 4------------------");
        // 4. Return a string of all trader's names sorted alphabetically -> in one line
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2)-> (name1+name2));
                // .forEach(System.out::println); -> we can't use it because there is only one element
                // which is a String. So instead, let's make this equal to

        System.out.println(result);



        System.out.println("--------------Task 5------------------");
        // 5. Are any traders based in Milan?
        boolean milanBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);




        System.out.println("--------------Task 6------------------");
        // 6. Print the values of all transactions from the traders living in Cambridge
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        System.out.println("--------------Task 7------------------");
        // 7. What is the highest value of all the transactions
        Optional<Integer> high =TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(high.get());


        System.out.println("--------------Task 6------------------");
        // 8. Find the transaction with the smallest value
        Optional<Transaction> smvalue = TransactionData.getAll().stream()
                .reduce((t1,t2)-> t1.getValue()<t2.getValue() ? t1:t2);

        System.out.println(smvalue.get());

        Optional<Transaction> smallestValue = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));

        System.out.println(smallestValue.get());
    }
}
