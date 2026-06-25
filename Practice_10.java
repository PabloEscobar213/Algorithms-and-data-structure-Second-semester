import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

class student{

    String name;
    int age;

    public student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Имя: " + name + ", Возраст: " + age;
    }
}

public class Practice_10 {
    public static void main(String[] args) {

        List<student> students = Arrays.asList(
                new student("Иван", 20),
                new student("Петр", 21),
                new student("Валерия", 22)
        );

        try(FileWriter writer = new FileWriter("file.txt")){
            for(student s : students){
                writer.write(s.toString() + "\n");
            }
            
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        try{
            List<String> lines = Files.readAllLines(Paths.get("file.txt"));
            System.out.println("Содержимое файла: ");
            for(String line : lines ){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

    }
}
