public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    Notebook greatNotebook = new Notebook(500, 1200, 2025);


    public void checkPrice (){
        if(this.price < 600){
            System.out.println("Thist notebook is very cheap");
        } else if(this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }


    public void checkWeight(){
        if (this.weight < 800) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 800 && this.weight <= 1500) {
            System.out.println("This notebook is not too heavy");
        } else if (this.weight > 1500) {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.year <= 2000 && this.price >= 1000){
            System.out.println("Promotion time!");
        } else if (this.year >= 2015 && this.price <= 1300) {
            System.out.println("Time to rise the price");
        }
    }

}
