import java.util.List;

public interface Transaction {

     String returnTypOfOperation ();
     long valueOfTransaction(long value);
     long sumOfTransaction(List<Long> transactionList);
}
