
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан", "Роулинг", 5);
        Author author2 = new Author("Маргарет", "Митчил", 4);
        Author author3 = new Author("Стивен", "Кинг", 3);

        Book book1 = new Book("Гарри Поттер", 2021, author1, 650);
        Book book2 = new Book("Унесенные Ветром", 1972, author2, 420);
        Book book3 = new Book("Зеленая Миля", 2025, author3, 320);

        System.out.println(book1.isBig());
        System.out.println(book2.isBig());
        System.out.println(book3.isBig());

        System.out.println("-------------");

        System.out.println(book1.matches("Поттер"));
        System.out.println(book1.matches("роул"));
        System.out.println(book1.matches("Стивен"));

        System.out.println("-------------");

        System.out.println(book1.estimatePrice());
        System.out.println(book2.estimatePrice());
        System.out.println(book3.estimatePrice());
    }
}