public class HelloJava{
    public static void main(String[] args) {
        System.out.println("Hello Java");

        //print command lime arguments if provided//

        if(args.length>0){
            System.out.println("you entered : ");
            for(int i = 0; i < args.length; i++) {
                System.out.println("argument"+(i+1) + "." +args[i]);
                
            }
        }else{
            System.out.println("no command line arguments were provided");
        }
    }
}