public class Thali {
    String item1 = "rice";
    String item2 = "Cauliflower curry";
    String meat = "chicken";
    String dessert = "Laalmoon & dahi";

    Thali(String item1, String item2, String meat, String dessert){
        this.item1 = item1;
        this.item2= item2;
        this.meat  = meat;
        this.dessert = dessert;

    }

    //Constructor overloading
    Thali(String item1, String item2, String dessert){
        this.item1 = item1;
        this.item2= item2;

        this.dessert = dessert;

    }
}
