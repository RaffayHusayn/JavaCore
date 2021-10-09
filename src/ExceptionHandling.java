import java.util.Arrays;

public class ExceptionHandling {

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        String name = "Raffay";
        int numerator = 8;
        int result;
        try{

           result = numerator/0;
            numbers[5] = 6;
            System.out.println(name.substring(2,6));
        }
        catch(IndexOutOfBoundsException ie ){
            System.out.println(ie.getMessage());
            System.out.println(ie.getCause());
            System.out.println(ie.getLocalizedMessage());
        }
        catch(NullPointerException ne){
            System.out.println(ne.getMessage());
            System.out.println(ne.getCause());
            System.out.println(ne.getLocalizedMessage());
        }
        catch(ArithmeticException ae){
            System.out.println(ae instanceof Exception);
            System.out.println(ae.getMessage());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println(Arrays.toString(numbers));
        }
    }
}
