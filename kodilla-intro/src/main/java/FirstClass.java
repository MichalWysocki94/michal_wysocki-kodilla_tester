public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2024);
        System.out.println("notebook.weight = " + notebook.weight);
        System.out.println("notebook.price = " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println("heavyNotebook.weight = " + heavyNotebook.weight);
        System.out.println("heavuNotebook.price = " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 1996);
        System.out.println("oldNotebook.weight = " + oldNotebook.weight);
        System.out.println("oldNotebook.price = " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        Notebook oldNotebook2 = new Notebook(1600, 1800, 2000);
        System.out.println(oldNotebook2.weight + " " + oldNotebook2.price);
        oldNotebook2.checkPrice();
        oldNotebook2.checkWeight();
        oldNotebook2.checkYearAndPrice();

        Grades grades123 = new Grades();
        grades123.add(2);
        grades123.add(5);
        grades123.add(1);
        grades123.add(2);
        System.out.println("srednia ocen");
        grades123.averageGrade();
        grades123.lastGrade();
    }
}