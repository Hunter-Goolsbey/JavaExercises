package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        //Parsing acts different to casting as Casting appears to alter how the system accepts data vs
        //parsing, where the data is changed in order to fulfill calculation/concat

        double number = Double.parseDouble(numberAsString);
        System.out.println("number= " + number);

        numberAsString+=1;
        number+=1;
        System.out.println("Number as String = " + numberAsString);
        System.out.println("Number = " + number);


    }
}
