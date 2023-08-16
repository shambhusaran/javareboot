public class Bike {

    public String name = "NS";
    public String model = "200" ;
    public String year = "2020";
    public String company = "Pulsar";

// overriding the toString method  so it can return all the attributes if bike objct
    public String toString(){
        return name + " "+ model+" "+ year+ " "+ company;
    }
}
