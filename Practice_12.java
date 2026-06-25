import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Practice_12 {
    public static void main(String[] args) {
        //Локализуем текущую дату
        LocalDate today = LocalDate.now();

        //Создает др чупапи 
        LocalDate birthDate = LocalDate.of(1995, 3, 15);

        //Расчет возраста в годах 
        Period agePeriod = Period.between(birthDate, today);
        int ageYears = agePeriod.getYears();

        //не оч понял, как это работает, но этому работает. Берем день рождения и переносим дату на этот год 
        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        
        //Проверяем, что день рождения ещё не прошёл. Если прошёл, то на следующий год кидаем 
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        //Считаем разницу в днях
        long daysUntilBirthday = java.time.temporal.ChronoUnit.DAYS.between(today, nextBirthday);

        //Вывод данных 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Текущая дата: " + today.format(formatter));
        System.out.println("Дата рождения: " + birthDate.format(formatter));
        System.out.println("Возраст: " + ageYears + " лет");
        System.out.println("До следующего дня рождения осталось: " + daysUntilBirthday + " дней");
        System.out.println("Следующий день рождения: " + nextBirthday.format(formatter));
    }
}
