public class App {
    public static void main(String[] args){

        User1 adam = new User1 ("Adam", 20, 176.7);
        UserValidator validator = new UserValidator();
        validator.validate(adam);

        User1 wojtek = new User1 ("Wojtek", 55, 161);
        validator.validate(wojtek);


        Book book1 = Book.of("Isaac Asimov", "The Galaxy");
        Book book2 = Book.of("Adam Mickiewicz", "Dziady");
        Book book3 = Book.of("Rok 1984", "George Orwell");

        System.out.println(book1.getTitle());
        System.out.println((book2.getTitle()));

    }
}
