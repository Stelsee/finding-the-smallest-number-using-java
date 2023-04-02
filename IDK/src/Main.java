// как найти наименьшее число с помощью массива
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // индекс цифры 1 = 0, индекс цифры 2 = 1, и тд

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            int value = scanner.nextInt();
            arr[i] = value;
    }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[1];
        }
        System.out.println("Minimal: " + min);
    }

}