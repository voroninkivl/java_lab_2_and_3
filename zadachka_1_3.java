import java.util.Scanner;
public class zadachka_1_3 {
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
                } catch (NumberFormatException returt) {
                    System.out.println("Некорректный ввод");
                }
            }
        }
        double[] array_after_manipulation = new double[array.length];
        float summary_of_numbers = 0;
        for (int i = 0; i < array.length; i += 1) {
            summary_of_numbers += array[i];
            array_after_manipulation[i] = summary_of_numbers / ((float) i + 1.0);
        }
        System.out.println("Исходный массив");
        for (int t = 0; t < array.length; t += 1) {
            System.out.print(array[t] + " ");
        }
        System.out.println();
        System.out.println("Массив после обработки");
        for (int t = 0; t < array_after_manipulation.length; t += 1) {
            System.out.print(array_after_manipulation[t] + " ");
        }
        }
    }
