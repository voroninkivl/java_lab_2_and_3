import java.util.Scanner;
public class zadachka_3_3 {
    public static void main(String[] args) {
        Scanner input_text = new Scanner(System.in);
        String text;
        double number;
        double[] array = new double[0];
        double number_in_array;
        int index_of_number = 0;
        System.out.println("Введите элемент массива (Для того, чтобы закончить ввод введите quit)");
        while (true) {
            text = input_text.nextLine();
            if (text.equals("quit")) {
                break;
            } else {
                try {
                    number_in_array = Double.parseDouble(text);
                    double[] new_array = new double[array.length + 1];
                    for (int i = 0; i < array.length; i += 1) {
                        new_array[i] = array[i];
                    }
                    new_array[index_of_number] = number_in_array;
                    array = new_array;
                    index_of_number += 1;
                } catch (NumberFormatException y) {
                    System.out.println("Некорректный ввод");
                }
            }
        }
        int index_of_max = 0;
        double maximum = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i += 1) {
            if (array[i] > maximum) {
                maximum = array[i];
                index_of_max = i;
            }
            else{
                count2 += 1;
            }
        }
        int count1 = 0;
        for (int i = 0; i < array.length; i += 1) {
            if (array[i] <= maximum && index_of_max < i) {
                count1 += 1;
                count2 -= 1;
            }
        }
        double[] new_array = new double[array.length - count1 - count2];
        new_array[0] = array[0];
        int index_of_numbers = 0;
        double max = 0;
        for (int i = 0; i < array.length - count1; i += 1){
            if (max < array[i]){
                max = array[i];
                new_array[i-index_of_numbers] = array[i];
            }
            else{
                index_of_numbers += 1;
            }
        }
        System.out.println("Исходный массив");
        for (int t = 0; t < array.length; t += 1) {
            System.out.print(array[t] + " ");
        }
        System.out.println();
        System.out.println("Массив после обработки");
        for (int t = 0; t < new_array.length; t += 1) {
            System.out.print(new_array[t] + " ");
        }
    }
}