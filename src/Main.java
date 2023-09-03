import java.util.*;

public class Main {
    public static void trainglePyramid(){
        int n= 10;
        for(int i=0; i<n; i++){
//            System.out.print(" ");
            for (int k=0; k<n-i-1; k++){
                System.out.print(k);
            }
            for (int j = 0; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void downwardsTraingle(){
        int n= 5;
        for(int i = 0; i<n; i++){
            System.out.println();
            for(int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            for (int k= i; k<n; k++){
                System.out.print("* ");
            }
        }
    }

    public static void referenceMethods(){
        String test = "Ram";

//       boolean result = test.equalsIgnoreCase("Ram");
//       int result = test.length();
//        int result = test.indexOf("R");
//        char result = test.charAt(2);
//            boolean result = test.isEmpty();
//        String result = test.trim();
        String result = test.replace("R", "Shy");
//        String result = test.toUpperCase();
//        String result = test.toLowerCase();

        System.out.println(result);
    }




    public static void practiceArrayList(){

        ArrayList<String> food = new ArrayList<String>(10);
        food.add("Mo:Mo");
        food.add("Pizza");
        food.add("Burgers");

        food.set(0,"Daal Bhaat");
        ArrayList<String> fd  = new ArrayList<String>(5);
        fd.add("daal");
        fd.add("Tarkari");
        String[] fdd = new String[]{"Chips", "Noodles"};
        food.addAll(3, List.of(fdd));
        food.add(3, "Biscuits");
        food.set(5, "Methai");
        food.remove("Biscuits");
        food.clear();


        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
    public static void practice2DArray(){

        ArrayList <ArrayList<String>> mainList = new ArrayList();


        ArrayList<String> cars = new ArrayList();
        cars.add("SUV");
        cars.add("Proche");
        cars.add("Sedan");

        ArrayList<String> foods = new ArrayList();
        foods.add("MoMo");
        foods.add("Daal Bhaat");
        foods.add("Pizza");

        ArrayList<String> drinks = new ArrayList();
        drinks.add("Coke");
        drinks.add("Fanta");
        drinks.add("Pepsi");


        mainList.add(cars);
        mainList.add(drinks);
        mainList.add(foods);
        

        System.out.println(mainList.get(0).get(0));
    }

    public static void practiceForEach(){
        String[] brand = {"Zara", "LV", "Chaneal", "Holister"};

        ArrayList<String> brands = new ArrayList<>();
        brands.add("Zara");
        brands.add("LV");
        brands.add("Chaneal");
        brands.add("SDMN");
        for(String s: brands){
            System.out.println(s);
        }
    }

    static int multiply(int a, int b){
        int c = a*b;
        return c;
    }


public static void overloadingTest(){
        Practice1 a  = new Practice1();
        a.overloadingMethod();
}


public static void printfPractice(){

        int a = 34;
        double b = 4.9;
        boolean c = true;
        char d = '@';


        System.out.printf("This is a integer value : %d", a);
    System.out.printf("This is a boolean : %10b",c);//provide 10 spaces before the value
    System.out.printf("This is a double : %.3f", b); //Limit the digits after decimal point
    System.out.printf("This is a character : %-3c", d); //provides 3 spaces after the value
    System.out.printf("This is an integer value again: %+d", a);
}

public static  void objectsInArray(){
    //how to create an array of objects



    Food f1 = new Food("Momo");
    Food f2 = new Food("Text Wrap");
    Food f3 = new Food ("Bufallo Wings");


    //Food [] refrigerator =  new Food[3];
    // alternative method
//    refrigerator[0] = f1;
//    refrigerator[1] = f2;
//    refrigerator[2] = f3;

    Food [] refrigerator = {f1, f2,f3};

    System.out.println(refrigerator[1].name);




}


public static void passingObjects(){

        // passing objects in parameters

        Garage grg = new Garage();
        Bicycle cyc = new Bicycle("Honey Hunter");

        grg.parkBicycle(cyc);
}



public static void saticKeyword(){

//a static keyword makes a variable or item same for every object created of certain class.
    // if changed or modified through an object the changes will be reflected in every other objects
    // can be accessed without creation of the object

        Friend f1 = new Friend("Ram");
        Friend f2 = new Friend("Shyam");
        Friend f3 = new Friend("Hari");
     Friend.displayNumberOfFriends();
    }


    public static void demonstrateInheritance(){
// Inheritence is the main concept of OOP
        // it states that a child class can inherit all the properties and methods of its parent class
        // it is achived by extending the parent class to the child class
        Bus bus = new Bus();
        bus.go();

        Jeep jeep = new Jeep();
        System.out.println(jeep.speed);
    }

    public static void methodoverriding(){
        Cat cat = new Cat();
        cat.speak();
    }

    public static void superKeyword(){

        Hero hero = new Hero("Shambhu MAN", 23, "shoot laser");
        hero.speak();
        hero.name = "Chaddi man";
        System.out.println(hero.name);

    }

    public static  void abstractionDemo(){
        //you cannot create an object of an abstract class

        Laptop laptop1 = new Laptop();
        laptop1.turnOn();
    }


    public static  void encapsulationDemo(){
        Van van = new Van("Mercedes", "Sprinter", 100000);

        System.out.println("Maker: "+ van.getMaker());
        System.out.println("Model: "+ van.getModel());
        System.out.println("Cost: "+ van.getCost());


    }


    public static void copyObjects(){
        Van van = new Van("Mercedes", "Sprinter", 100000);

        //   Van van1 = new Van("Toyota", "Yaris", 20000);


        //van1 = van
        //cannot do this because the address of the vans will be same we want to copy the details of van to van 1 this method will only
        //show the same memorlylocation and doesnot create two different van objects

        // van1.copy(van);


        // but to copy the objects without creating the object first has different method by overloading the van constructor

        Van van1 = new Van( van);


        System.out.println(van);
        System.out.println(van1);

        //van.setCost(30000);//setting value of cost through settermethod
        System.out.println("Maker: "+ van1.getMaker());
        System.out.println("Model: "+ van1.getModel());
        System.out.println("Cost: "+ van1.getCost());
        System.out.println();

        System.out.println("Maker: "+ van.getMaker());
        System.out.println("Model: "+ van.getModel());
        System.out.println("Cost: "+ van.getCost());


    }

    public static void interfaceDemo(){
        //interface is a description of what an object can do
        // the interface methos must be implemented in the child class

//        Rabbit rabbit = new Rabbit();
//    rabbit.flee();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        Hawk hawk = new Hawk();
        hawk.hunt();
    }

    public static void exceptionHandling() {
        try {


            Scanner scan1 = new Scanner(System.in);
            System.out.println("Enter the first number");
            int num1 = scan1.nextInt();

            System.out.println("Enter Second number");
            int num2 = scan1.nextInt();

            int value = num1 / num2;

            System.out.println("the value = " + value);
        } catch (ArithmeticException e) {
            System.out.println("Dinominator cannot be zero blad");

        }
        catch (InputMismatchException e){
            System.out.println("You cannot enter alphabet blad");
        }
        catch (Exception e){
            System.out.println("Exception occured");
        }
        finally {
            System.out.println("This code will always run");
        }
    }
   public static  void main(String [] args){

exceptionHandling();

   }
}
