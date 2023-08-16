import java.util.ArrayList;
import java.util.List;

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

   public static  void main(String [] args){


        Bike bike = new Bike();
        System.out.println(bike);

//        Thali chickenThali = new Thali("rice", "Spanich", "mutton", "brownie");
//
//        System.out.println(chickenThali.dessert);
//
//
//        //constructor overloading
//
//        Thali vegthali = new Thali("rice", "Spanich", "Cheese Cake");
//                System.out.println(vegthali.dessert);

   }
}
