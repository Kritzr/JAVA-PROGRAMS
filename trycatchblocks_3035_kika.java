public class trycatchblocks_3035_kika {
    public static void main(String[] args) {
        System.out.println("KRITHIKA - 2022503035");
        trywithoutcatch();
        trywithcatch();
        trywithcatchandfinally();
        trywithmultiplecatches();
        nestedtry();
        withresource();
    }

    public static void trywithoutcatch(){
        System.out.println("this is try without catch");
        try{
            int div = 10/0;
        }
        finally{
            System.out.println("finally is executed irrespective of the exception");
        }
    }

    public static void trywithcatch(){
        System.out.println("this is try with catch");
        try{
            int div = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception: "+e.getMessage());
        }
    }

    public static void trywithcatchandfinally(){
        System.out.println("this is try with catch and finally");
        try{
            int div = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception: "+e.getMessage());
        }
        finally{
            System.out.println("finally is executed irrespective of the exception");
        }

    }

    public static void trywithmultiplecatches(){
        System.out.println("this is try with multiple catches");
        try{
            int[] arr = {4,12,24};
            int div = 10/0;
            System.out.println(arr[4]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds"+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception: "+e.getMessage());
        }
    }

    public static void nestedtry(){
        try{
            System.out.println("this is try nested-outer try");
            try{
                int div = 10/0;
                System.out.println("the result is " + div);
            }
            catch(ArithmeticException e){
                System.out.println("arithmetic exception in the inner try1: "+e.getMessage());
            }
            finally{
                System.out.println("finally of try1");
            }
        }
        catch(Exception e){
            System.out.println("Outer exception: "+e.getMessage());
        }
        finally{
            System.out.println("finally of outer try");
        }
    }

    public static void withresource(){
        System.out.println("this is with resource");
        try(java.util.Scanner sc = new java.util.Scanner(System.in)){
            int number = sc.nextInt();
            System.out.println("the number you have entered is : "+number);
        }
        catch(Exception e){
            System.out.println("Exception occured: "+e.getMessage());
        }
        finally{
            System.out.println("finally of resource");
        }
    }
}
