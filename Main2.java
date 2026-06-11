import java.util.Scanner;

/**
 * Класс для генерации квадратов чисел ряда
 * Правило: начальное число = меньшее из двух, шаг = тоже меньшее число
 * Остановка: когда текущее число превысит БОЛЬШЕЕ из исходных чисел
 */
class SequenceGenerator {
    private int start;   // Начало ряда (меньшее число)
    private int step;    // Шаг (тоже меньшее число)
    private int limit;   // Ограничение (большее число)
    
    public SequenceGenerator(int a, int b) {
        this.start = Math.min(a, b);
        this.step = this.start;
        this.limit = Math.max(a, b);
    }
    
    public void printSquares() {
        int current = start;
        
        while (current <= limit) {
            System.out.print(current * current);
            current += step;
            
            if (current <= limit) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        SequenceGenerator generator = new SequenceGenerator(num1, num2);
        generator.printSquares();
        
        scanner.close();
    }
}