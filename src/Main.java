import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    //ЗАДАЧА №1, Удалите класс компаратора и в методе main замените объект этого удалённого класса
    //на лямбду с той же логикой. Т.е. по сути мы дадим имплементацию компаратору на лету с помощью лямбды.
    //Если вы делали вторую задачу, то параметра не будет (их у лямбд не бывает) - вместо этого просто
    //используйте напрямую в коде лямбды то значение, которое раньше передавали в конструктор компаратора.
    public static void main(String[] args) {
        Comparator<Person> personComparator = (p1, p2) -> {
            int len1 = Math.min(p1.getSurname().split("[ -]").length, 5);
            int len2 = Math.min(p2.getSurname().split("[ -]").length, 5);
            if (len1 != len2) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(p1.getAge(), p2.getAge());


        };
        ArrayList<Person> clients = new ArrayList<>();
        clients.add(new Person("Билл", "Гейтс", 5));
        clients.add(new Person("Макс", "Стародубский Ромодановский Пивоваренный Сыроед", 20));
        clients.add(new Person("Джефф", "Безос", 10));
        clients.add(new Person("Джастин", "Римский-Корсаков", 30));
        clients.add(new Person("Петр", "Михайловский Данилевский", 25));
        clients.add(new Person("!Роберт", "Тэппан-Моррис", 15));
        clients.add(new Person("!Геральд", "Муррэй Моррис", 40));
        clients.add(new Person("Пикассо", "Пабло Диего Хозе Франциско де Паула Хуан", 35));
        clients.sort(personComparator);
        System.out.println(clients);
    }
}
