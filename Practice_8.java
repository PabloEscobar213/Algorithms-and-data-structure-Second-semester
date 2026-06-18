import java.util.ArrayList;
import java.util.Collections;

public class Practice_8 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Ваша задача");
        tasks.add("Не ваша задача");
        tasks.add("Покушать");
        System.out.println(tasks);
        tasks.remove(1);
        System.out.println(tasks);
        boolean containsTask = tasks.contains("Ваша задача");
        System.out.println(containsTask);
        Collections.sort(tasks);
        System.out.println(tasks);
    }
}
