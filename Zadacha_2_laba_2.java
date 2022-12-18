import java.util.Scanner;
import java.util.regex.*;
public class Zadacha_2_laba_2 {
    public static void main(String[] args){
        Scanner password = new Scanner(System.in);
        System.out.println("Введите пароль");
        String string_with_password = password.nextLine();
        Pattern password_checking_in_full = Pattern.compile("^[A-Za-z0-9_]{8,}$");
        Matcher matcher_password_checking_in_full = password_checking_in_full.matcher(string_with_password);
        Pattern password_check_capital_letter = Pattern.compile("[A-Z]");
        Matcher matcher_password_check_capital_letter = password_check_capital_letter.matcher(string_with_password);
        Pattern password_check_uppercase = Pattern.compile("[a-z]");
        Matcher matcher_password_check_uppercase = password_check_uppercase.matcher(string_with_password);
        Pattern password_check_numbers = Pattern.compile("[0-9]");
        Matcher matcher_password_check_numbers = password_check_numbers.matcher(string_with_password);
        int cycle = 1;
        while (cycle > 0) {
            if (matcher_password_checking_in_full.matches() && matcher_password_check_capital_letter.find() && matcher_password_check_uppercase.find() && matcher_password_check_numbers.find()) {
                System.out.println("Пароль надежен");
                break;
            }
            else {
                System.out.println("Пароль ненадежен. Повторите ввод");
                String string_with_password_cycle = password.nextLine();

            }
        }
    }
}
