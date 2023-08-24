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
        setMaker(maker);
       setModel(model);
       setCost(cost);

    }

    Van(Van x){
        this.copy(x);

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
    public void setMaker(String maker){
       this. maker =maker;

    }
    public void setModel(String model){
        this.model = model;

    }
    public void setCost(int cost){
        this.cost = cost;

    }

    public void copy(Van x){
        this.maker = x.getMaker();
        this.model = x.getModel();
        this.cost = x.getCost();

    }
}
