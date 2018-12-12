public class DateFormat {


    private EnumCountryCode enumCountryCode;
    private  int clientID;
    private Currency currency;
    private String typeOfTransaction;
    private long valueOfTransaction;

    public DateFormat(EnumCountryCode enumCountryCode, int clientID,
                      Currency currency, String typeOfTransaction,
                      long valueOfTransaction) {

        this.enumCountryCode = enumCountryCode;
        this.clientID = clientID;
        this.currency = currency;
        this.typeOfTransaction = typeOfTransaction;
        this.valueOfTransaction = valueOfTransaction;
    }
}
