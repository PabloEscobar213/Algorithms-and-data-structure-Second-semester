import java.math.BigInteger;
import java.util.Scanner;

/**
 * Класс для работы с числами Фибоначчи и поиска наиболее частой цифры
 */
class FibonacciAnalyzer {
    private BigInteger fibNumber;
    
    /**
     * Вычисляет i-ое число Фибоначчи (i >= 10, i <= 100000)
     */
    public void computeFibonacci(int n) {
        if (n < 10 || n > 100000) {
            throw new IllegalArgumentException("i должен быть от 10 до 100000");
        }
        
        // Для n=10 считаем с самого начала
        BigInteger a = BigInteger.ZERO;  // F(0)
        BigInteger b = BigInteger.ONE;   // F(1)
        
        for (int i = 2; i <= n; i++) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        
        fibNumber = (n == 0) ? BigInteger.ZERO : 
                    (n == 1) ? BigInteger.ONE : b;
    }
    
    /**
     * Находит цифру, которая встречается наибольшее количество раз в числе
     * Возвращает массив: [цифра, количество]
     * Если несколько цифр имеют одинаковый максимум - выбираем наибольшую цифру
     */
    public int[] findMostFrequentDigit() {
        if (fibNumber == null) {
            throw new IllegalStateException("Сначала вычислите число Фибоначчи");
        }
        
        // Переводим число в строку
        String numStr = fibNumber.toString();
        
        // Считаем частоту каждой цифры (0-9)
        int[] frequency = new int[10];
        
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            int digit = ch - '0';
            frequency[digit]++;
        }
        
        // Ищем цифру с максимальной частотой
        // Если частоты равны - берем большую цифру
        int maxDigit = 0;
        int maxCount = 0;
        
        for (int digit = 0; digit <= 9; digit++) {
            if (frequency[digit] > maxCount) {
                maxCount = frequency[digit];
                maxDigit = digit;
            } else if (frequency[digit] == maxCount && maxCount > 0) {
                // При равной частоте берем большую цифру
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }
        }
        
        return new int[]{maxDigit, maxCount};
    }
    
    public BigInteger getFibNumber() {
        return fibNumber;
    }
}

/**
 * Главный класс программы
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        
        FibonacciAnalyzer analyzer = new FibonacciAnalyzer();
        
        long startTime = System.currentTimeMillis();
        
        // Вычисляем i-ое число Фибоначчи
        analyzer.computeFibonacci(i);
        
        // Находим наиболее частую цифру
        int[] result = analyzer.findMostFrequentDigit();
        
        long endTime = System.currentTimeMillis();
        
        // Выводим результат в формате [(цифра, количество)]
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        
        scanner.close();
    }
}