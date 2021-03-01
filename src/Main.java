import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>(5);
        System.out.println("------Выводим все 5 книг------");;
        books.add("Том Сойер");
        books.add("Джек Лондон");
        books.add("Витязь в тигровой шкуре");
        books.add("Алхимик");
        books.add("Маленький принц");
        books.forEach(System.out::println);   //Выводим все 5 книг
        /*for (String book: books) {
            System.out.println(book);
        }*/

        System.out.println("------Удаляем последнюю книгу------");
        books.remove(4);    //Удаляем последнюю книгу
        books.forEach(System.out::println);

        System.out.println("------Заменяем последнюю книгу------");
        books.set(3, "Большие надежды");  //Заменяем последнюю книгу
        books.forEach(System.out::println);

        System.out.println("------Выводим только последнюю книгу------");
        String book = books.get(3);     // Выводим только последнюю книгу
        System.out.println(book);
//        books.forEach(System.out::println);

        System.out.println("-------Очищаем список------");
        books.clear();                       // Очищаем список
        System.out.println(books.isEmpty() + " --Подтверждаем правда или нет");  // Подтверждаем правда или нет
        books.forEach(System.out::println);
        System.out.println("------Добавляем 3 книги, которые собираемся прочитать------");
        books.add("Трансмормация огня");
        books.add("Фергюсон");                 //Добавляем 3 книги, которые собираемся прочитать
        books.add("Джек Лондон ч2");
        books.forEach(System.out::println);
    }
}
