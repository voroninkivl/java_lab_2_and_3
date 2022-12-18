import java.util.regex.*;
import java.util.Scanner;
public class zadacha_1_laba_2 {
    public static void main(String[] args) {
        Scanner new_str = new Scanner(System.in);
        System.out.println("Введите дату по образцу: dd/mm/yyyy");
        String introduced_data = new_str.nextLine();
        Pattern date_template = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
        Matcher matcher_date_template = date_template.matcher(introduced_data);
        Pattern months_have_31 = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[13578]|1[02])/(19\\d{2}|[2-9]\\d{3})$");
        Matcher matcher_months_have_31 =  months_have_31.matcher(introduced_data);
        Pattern months_have_30 = Pattern.compile("^(0[1-9]|[12][0-9]|30)/(0[469]|11)/(19\\d{2}|[2-9]\\d{3})$");
        Matcher matcher_months_have_30 =  months_have_30.matcher(introduced_data);
        Pattern february_leap_29 = Pattern.compile("^(0[1-9]|[12][0-9])/(02)/(19([02468][048]|[13579][26])|[2-9][0-9]([02468][048]|[13579][26]))$");
        Matcher matcher_february_leap_year = february_leap_29.matcher(introduced_data);
        Pattern february_leap_28 = Pattern.compile("^(0[1-9]|[12][0-8])/(02)/(19^([02468][048]|[13579][26])|[2-9][0-9]^([02468][048]|[13579][26]))$");
        Matcher matcher_february_common_year = february_leap_28.matcher(introduced_data);
        if (!matcher_date_template.matches()){
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
        else if (matcher_months_have_31.matches() || matcher_months_have_30.matches() || matcher_february_leap_year.matches() || matcher_february_common_year.matches()) {
            System.out.println("Введенное выражение является датой");
        }
        else {
            System.out.println("Введенное выражение не является датой");
        }
    }
}