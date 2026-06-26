import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Random;

public class Practice_13 {
    public static void main(String[] args){
        ArrayList<String> namesStudents = new ArrayList<>();
        
        namesStudents.add("Павел");
        namesStudents.add("Михаил");
        namesStudents.add("Валерия");
        namesStudents.add("Ангелина");
        namesStudents.add("Валерия");

        System.out.print(namesStudents);

        Set<String> names = new HashSet<>(namesStudents); //Передаем инфу и выводим, но уже без дубликатов имен
        System.out.print(names);
        
        Map<String, Integer> studentMap = new HashMap<>();
        for (String name : namesStudents){
            Random random = new Random();
            int randomNumber = random.nextInt(101); 
            studentMap.put(name, (int) randomNumber);
        }
        System.out.print(studentMap);
    }
}
