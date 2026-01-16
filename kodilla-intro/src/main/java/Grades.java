public class Grades {
    private int[] grades;
    private int size;
    private int sum;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.sum = 0;
    }

    public void add(int value){
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        if (this.size == 0) {
            System.out.println("brak ocen");
        }
        return this.grades[this.size - 1];
    }


    public int averageGrade() {
        if (this.size == 0) {
            System.out.println("Brak ocen");
        }

        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + this.grades[i];
        }

        return sum / this.size;
    }

}
