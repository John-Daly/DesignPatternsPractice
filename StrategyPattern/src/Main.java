public class Main {
    public static void main(String[] args) {

        Car tesla = new Tesla();
        Car suv = new SUV();
        Car flintstone = new FlintstoneCar();

        System.out.println("Tesla: " + tesla.powerUnit());
        System.out.println("SUV: " + suv.powerUnit());
        System.out.println("Flintstone Car: " + flintstone.powerUnit());

    }
}
