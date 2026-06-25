import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Practice_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,-2,3,-4,5));

        List<Integer> positiveNumbers = numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

                System.out.println("Список чисел: " + numbers);
                System.out.println("Положительные числа возведенные в квадрат: " + positiveNumbers);

    }
}