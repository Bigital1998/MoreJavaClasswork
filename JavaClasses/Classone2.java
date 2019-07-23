package JavaClasses;

public class Classone2 {

    String color="Blue";
    static void methodOne(){
        System.out.println("Hello world!!!");
    }
       public void methodTwo(){
           System.out.println("HELLO WORLD!!!");
       }

       static String methodThree(){
        return"I am a Static Method that returns a String";
       }

       public String methodFour(){
        return "I am a public method that returns a String";
       }





    public static void main(String[]args){
        methodOne();//for calling a static method to display
        System.out.println(methodThree());
        String res=methodThree();




        Classone2 objectOne= new Classone2();
        objectOne.methodTwo();//for calling a public method to display
        objectOne.methodFour();// public

        System.out.println(objectOne.color);
    }
}
