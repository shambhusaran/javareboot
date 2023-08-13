public class Practice1 {
    //overloaded methods: same method name byt having different parameters

    static int add(int a, int b){
        int c = a+b;
        return  c;
    }
    static int add(int a, int b, int d){
        int c = a+b+d;
        return  c;
    }
    static int add(int a, int b, int d, int e){
        int c = a+b+d+e;
        return  c;
    }

    void overloadingMethod(){
  System.out.println( add(5,6));
        System.out.println(     add(5,6,3,4));
        System.out.println( add(5,8,9));


    }
}
