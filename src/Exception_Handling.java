//public class Exception_Handling {
//    public static void main(String[] args) {
//        try{
//            System.out.println(50/0);
//        }catch (Exception obj){
//
//            System.out.println(obj);
//        }
//    }
//}
//
//
//import java.util.Scanner;
//
//public class Exception_Handling {
//    public static void main(String[] args) {
//        try{
//            Scanner sc =new Scanner(System.in);
//            int a=sc.nextInt();
//        }catch(Exception obj){
//            System.out.println(obj);
//        }
//       finally {
//            System.out.println("Final Block Execute");
//
//        }
//    }
//}
//
//


public class Exception_Handling{
    public static void main(String[] args) {
        int i=10;
        int j=0;

        try{
            int data=i/j;
        }
        catch(Exception e){
            int data=i/0;

        }
        System.out.println("rest of code");
    }
}