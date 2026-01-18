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

         int sumAge = 0;

         for(int i = 0; i < users.length; i++){
             sumAge = sumAge + users[i].getAge();
         }

         int averageAge = sumAge / users.length;

         System.out.println("suma lat = " + sumAge);
         System.out.println("średnia lat = " + averageAge);

         for(int i = 0; i < users.length; i++){
             if(users[i].getAge() < averageAge){
                 System.out.println("ta osoba jest poniżej średniego wieku = " + users[i].getName());
             }
         }

     }

     public int getAge() {
        return age;
     }

     public String getName() {
        return name;
     }
}