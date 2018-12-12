import java.util.List;

public class Credit implements Transaction {


    @Override
    public String returnTypOfOperation() {
        return "Credit";
    }

    @Override
    public long valueOfTransaction(long value) {
        return value;
    }

    @Override
    public long sumOfTransaction(List<Long> transactionList) {
        long sum = 0;
        for (int i = 0; i<transactionList.size(); i++){
            sum += transactionList.get(i);
        }
        return sum;
    }


}
