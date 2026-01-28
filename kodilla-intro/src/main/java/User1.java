public class User1 {

    private String name;
    private double age;
    private double height;

    public User1 (String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public double getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }


    /*public static void main(String[] args) {
        User1 user1 = new User1("Marek", 27);
        User1 user2 = new User1("Jola", 19);
        User1 user3 = new User1("Andrzej", 55);
        User1 user4 = new User1("Ania", 23);
        User1 user5 = new User1("Wojtek", 33);

        User1[] users = {user1, user2, user3, user4, user5};

        System.out.println(user1.name);
        System.out.println(user2.name);
        System.out.println(user1.age);

    }*/
}
