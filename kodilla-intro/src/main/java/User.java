public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }





    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int sum = users[anna.age] + users[betty.age] + users[carl.age] + users[david.age] + users[eva.age] + users[david.age];

        System.out.println("This is user1: " + anna.name);
        System.out.println("This is sum age" + sum);


    }

}