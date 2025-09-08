public class Book {
    public String title;
    public int releaseYear;
    public String name;
    public String surname;
    public int rating;
    public int pages;

    public Book(String title, int releaseYear, String name, String surname, int rating, int pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }
    // 1-ый метод
    public boolean isBig(){
        if(pages>500){
            System.out.println("Книга достаточно большая");
            return true;
        } else{
            System.out.println("Книга не достаточно большая");
            return false;
        }
    }
    // 2-ой метод
    public boolean matches(String word){
        if(word.contains(name) || word.contains(surname) || word.contains(title)){
            System.out.println("Есть совпадения слова с именем автора либо названием книги");
            return true;
        }
        System.out.println("Нет совпадения слова с именем автора либо названием книги");
        return false;
    }
    // 3-ий метод
    public double estimatePrice(){
        double price = ((pages * 3) * Math.sqrt(rating));
        if (price<250){
            System.out.println("цена ниже 250 руб.");
        }else{
            System.out.println("Оценочная цена состаувит " + (int) Math.floor(price) + " руб.");
        }
        return  price;
    }
}
