public class Book {
    public String title;
    public int releaseYear;
    public String name;
    public String surname;
    public int rating;
    public int pages;

    public Book(String title, int releaseYear, String name, String surname, int rating, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    // 1-ый метод
    public boolean isBig() {
        return (pages>500);
    }

    // 2-ой метод
    public boolean matches(String word) {
        return  word.contains(name)
                || word.contains(surname)
                || word.contains(title);
    }

    // 3-ий метод
    public double estimatePrice() {
        double price = ((pages * 3) * Math.sqrt(rating));
        return Math.max(price, 250);
    }
}
