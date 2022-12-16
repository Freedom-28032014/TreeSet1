import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            ArrayList<Person> clients = new ArrayList<>();
            clients.add(new Person("Билл", "Гейтс", 5));
            clients.add(new Person("Макс", "Стародубский Ромодановский Пивоваренный Сыроед", 20));
            clients.add(new Person("Джефф", "Безос", 10));
            clients.add(new Person("Джастин", "Римский-Корсаков", 30));
            clients.add(new Person("Петр", "Михайловский Данилевский", 25));
            clients.add(new Person("!Роберт", "Тэппан-Моррис", 15));
            clients.add(new Person("!Геральд", "Муррэй Моррис", 40));
            clients.add(new Person("Пикассо", "Пабло Диего Хозе Франциско де Паула Хуан", 35));
            clients.sort(new PersonComparator(5));
        System.out.println(clients);
        }
    }
