public class Laptop extends  Device {

    //overriding the turnOn method inthe parent class
    @Override
    void turnOn() {
        System.out.println("Your device is turned on");
    }
}
