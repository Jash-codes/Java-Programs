public class operatordemo {
    public static void main(String[] args) {
        int a = 10 , b = 3;

        //arithmetic//
        System.out.println("a + b = " + (a+b));
        System.out.println("a % b = " + (a%b));

        //relational//
        System.out.println("a > b = " + (a>b));

        //logical//
        boolean x = true, y = false;
        System.out.println("x&&y : " + (x&&y));

        //bitwise//
        System.out.println("a & b :"+ (a&b));

        //assignment//
        a+=5 ; // a = a+5
        System.out.println("a after a + 5" + (5+a));

        //unary//
        System.out.println("++b="+(++b));

        //ternary//
        int max = (a>b) ? a:b ;
        System.out.println("Max is "+ max);

        //instance of//
        String name = "jash";
        System.out.println("name instance of" + (name instanceof  String));
    }
} 