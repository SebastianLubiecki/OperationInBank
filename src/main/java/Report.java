public class Report {

    String nameOfClient;
    long sumOfDebetTransaction;
    long sumOfCreditTransaction;
    Currency currency;

    public Report(String nameOfClient, long sumOfDebetTransaction,
                  long sumOfCreditTransaction, Currency currency) {
        this.nameOfClient = nameOfClient;
        this.sumOfDebetTransaction = sumOfDebetTransaction;
        this.sumOfCreditTransaction = sumOfCreditTransaction;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Report{" +
                "nameOfClient='" + nameOfClient + '\'' +
                ", sumOfDebetTransaction=" + sumOfDebetTransaction +
                ", sumOfCreditTransaction=" + sumOfCreditTransaction +
                ", currency=" + currency +
                '}';
    }
}
