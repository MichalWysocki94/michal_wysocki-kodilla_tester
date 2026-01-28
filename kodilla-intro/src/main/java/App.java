public class App {
    public static void main(String[] args){

        User1 adam = new User1 ("Adam", 20, 176.7);
        UserValidator validator = new UserValidator();
        validator.validate(adam);

        User1 wojtek = new User1 ("Wojtek", 55, 161);
        validator.validate(wojtek);


    }
}
