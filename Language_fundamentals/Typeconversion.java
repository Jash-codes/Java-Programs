public class Typeconversion { //class name//

//implicit widening//
    public static void main(String[] args) {
        int num = 100;
        long bigNum = num;    // int to long//
        double doubleNum = bigNum;  // long to double//

        System.out.println("implicit conversiom; ");
        System.out.println("int to long:");
        System.out.println("long to double : " + doubleNum);

        //explicit narrowing//
        double pi = 3.14159;
        int approxPi = (int)pi;  //cast double to int//

        System.out.println("\nExplicit conversion :");
        System.out.println("double to int : " + approxPi);

        // caution : data loss//
        int huge = 130;
        byte small = (byte)huge; //wraps around due to overflow//

        System.out.println("\noverflow example :");
        System.out.println("int 130 to byte :" + small);
        

    }
}