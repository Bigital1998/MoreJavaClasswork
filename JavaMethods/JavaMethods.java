package JavaMethods;







public class JavaMethod {

    //methods in java
    //methods are blocks of code that  do something specific
    //this methods can only work/run when they are called
    //why methods :To re use code


    //syntax :
    // A method must be declared inside a class
    // it is defined by name of the method followed by ()
    //e.g of an inbuilt method is system.out.println
    static void printName(String name){
        System.out.println("Java is awesome!!!");
    }
    static void addition (int num1,int num2){
        int sum= num1+ num2;
        System.out.println(num1);
    }
    static void subtraction(int num1,int num2){
        int ans= num1-num2;
        System.out.println();
    }


    //printName:name of the method
    //static:The method belongs to the JavaMethod and not an object of JavaMethods class
    // void :This method does not return a value


    //returning a value
    // use void in a method when its not going to return  a  value use
    //primitive datatypes such as int ,char INSTEAD of void and use
    //'return' key word  inside the method

    static int multiply (int num1, int num2){
        int results= num1*num2;
        if(results>100){
            return results ;
        }else{
        return results +100;
    }













    public static void main (String[]args){
        printName("Nicholas Cage");//does not take a parameter
        addition(100);//takes a parameter( Any int you give it)
        subtraction(100-40);
        int ans=multiply(1000*1000);
        System.out.println(ans);

    }
}

