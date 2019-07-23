package Introduction;

public class JavaException {
    static void checkAge(int age ){
        if (age < 18) {
            throw new ArithmeticException("access denied-you are underage");
        }else{
            System.out.println("Access granted");
        }
    }







    public static void main(String[] args) {

        //try - define a block of code that you want to test
        //catch - define a block of code to execute if there is an error in the try block
        //DRY - Don't Repeat Yourself
//throw :allows you to create a custom error message
//        :used together with exception type e.g Arithmetic exception
//        :ClassNotFoundException,ArrayIndexOutOfBoundException
//          :oftenly used together with custom methods

        try{
            int[] numbers = {4, 3, 2, 1};
            System.out.println(numbers[4]);
        }catch (Exception e){
            System.out.println("Something went wrong: "+ e);
        }finally{
            System.out.println("I will run if there is an error or no error");
        }























    }
}

