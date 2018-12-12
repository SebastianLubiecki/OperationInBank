import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(123, "Seb", "qwrewr", "12213");
        Client client2 = new Client(234, "jfd", "zxczc", "45665");
        Client client3 = new Client(345, "hfg", "fgret", "6767332");
        Client client4 = new Client(456, "vc", "dfgdfg", "74676");
        Client client5 = new Client(567, "fn", "weasdf", "135332");
        Client client6 = new Client(678, "vcbdf", "sdgf", "975432");


        Transaction credit1 = new Credit();
        Transaction credit2 = new Credit();
        Transaction credit3 = new Credit();
        Transaction credit4 = new Credit();

        Transaction debet1 = new Debet();
        Transaction debet2 = new Debet();
        Transaction debet3 = new Debet();
        Transaction debet4 = new Debet();


        List <Long> listOfValueOfCreditTransaction = new ArrayList<>();
        listOfValueOfCreditTransaction.add(credit1.valueOfTransaction(20000000));
        listOfValueOfCreditTransaction.add(credit1.valueOfTransaction(2003443434));
        listOfValueOfCreditTransaction.add(credit1.valueOfTransaction(626623230));
        listOfValueOfCreditTransaction.add(credit1.valueOfTransaction(200233412));


        List <Long> listOfValueOfDebitTransaction = new ArrayList<>();
        listOfValueOfDebitTransaction.add(debet1.valueOfTransaction(20000000));
        listOfValueOfDebitTransaction.add(debet1.valueOfTransaction(2003443434));
        listOfValueOfDebitTransaction.add(debet1.valueOfTransaction(626623230));
        listOfValueOfDebitTransaction.add(debet1.valueOfTransaction(200233412));

        //DateFormat dateFormat = new DateFormat()



        Report report = new Report(client1.getName(), credit1.sumOfTransaction(listOfValueOfCreditTransaction),
                debet1.sumOfTransaction(listOfValueOfDebitTransaction),Currency.EU);
        System.out.println(report);

    }
}
