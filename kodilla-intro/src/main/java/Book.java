public class Book {
    private String author;
    private String title;

    private Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book (author, title);
    }

    public static void main (String[] args) {
        Book book1 = Book.of("Isaac Asimov", "The Galaxy");
        Book book2 = Book.of("Adam Mickiewicz", "Dziady");
        Book book3 = Book.of("Rok 1984", "George Orwell");

        System.out.println("Tytul pierwszy ksiazki: " + book1.title + " autorstwa: " + book1.author);

    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }
}
