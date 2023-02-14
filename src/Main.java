public class Main {
    public static void main(String[] args) {

//        System.out.println("A");
//        int arr[] = {1,2,3,4};
//
//        try{
//            System.out.println(arr[6]);
//        }
//        catch(ArithmeticException e){
//            System.out.println("C");
//        }
//        finally{
//            System.out.println("D");
//        }
//        System.out.println("E");
//
//        System.out.println("A");
       try{
           fun(5);
       }
       catch (Exception e){
           System.out.println("Chhoti bacchi ho kya "+e);
       }
        System.out.println("B");

//        try{
//        fun1();
//        }
//        catch(ArithmeticException e){
//            System.out.println("A");
//        }

    }

    public static int fun(int age) throws UnderAgeException {

        if(age<18){
            throw new UnderAgeException();
        }
        return 10;
    }

//    public static void fun1() throws Exception{
//        int i = 5/0;
//    }
}