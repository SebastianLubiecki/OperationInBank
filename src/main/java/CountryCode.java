import java.util.LinkedHashMap;
import java.util.Map;

public class CountryCode {

    private static  Map<String, EnumCountryCode> mapOfCode = new LinkedHashMap<>();

    public  EnumCountryCode getCountryCode(String country) {
        mapOfCode.put("Poland", EnumCountryCode.PL);
        mapOfCode.put("United Kingdom", EnumCountryCode.GB);
        mapOfCode.put("United State", EnumCountryCode.US);
        mapOfCode.put("Spain", EnumCountryCode.ES);
        mapOfCode.put("Germany", EnumCountryCode.DE);
        return mapOfCode.get(country);
    }

}

enum EnumCountryCode {
    PL, GB, US, ES, DE,
}