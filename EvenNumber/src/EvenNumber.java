import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int input = scanner.nextInt();
        if (input  % 2  > 0) {
            System.out.println("Число четное.");
        }
        else if (input == 0){
            System.out.println(" Вы ввели 0.");
        }
        else {
            System.out.println("Число не четное.");
        }
    }
}
