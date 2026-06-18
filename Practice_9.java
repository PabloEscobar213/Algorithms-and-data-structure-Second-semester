import java.util.Scanner;
import java.util.InputMismatchException;

public class Practice_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Введите число: ");
            int number1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();
            int result = number1 / number2;
            System.out.println("Результат деления: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Ошибка: Деление на ноль невозможно.");
        }
        catch(InputMismatchException e){
            System.out.println("Ошибка: Введено не число.");
            
        }
        finally{
            System.out.println("Программа завершена.");
            scanner.close();
        }
           
    }
}
