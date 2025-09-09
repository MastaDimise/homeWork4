public class Main {
    public static void main(String[] args) {
        Author author = new Author("Дмитрий", "Пучков", 6);
        Book book = new Book("Колобок", 1990, author.name, author.surname, author.rating, 320);
        book.isBig();
        book.matches("Дмитрий");
        book.estimatePrice();
    }
}