package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        //porsche.model = "Fred";
        System.out.println("Model is: " + porsche.getModel());
    }

}
