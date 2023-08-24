public class Van {
    /*
    Encapsulation
    encapsulation id the prcess of restricting access to a method variable or a class
    a private variable CAN only be accessed through a getter or a setter method outside the class
    a private variable will be accessible in the same class only


     */
    private String maker;
    private String model;
    private int cost;

    Van(String maker, String model, int cost){
        this.maker = maker;
        this.model = model;
        this.cost = cost;

    }

    public String getMaker(){
        return maker;
    }

    public String getModel(){
        return  model;
    }
    public int getCost(){
        return cost;
    }
}
