package Introduction;

public class Operators {
    public static void main(String[]args){
        //operators in java
        //1.Arithmetic operators
        //2.Comparison operators
        //3.Assignment operators
        //4.logical operators

        //1.Arithmetic operators
       // used to perform arithmetic operators i.e +,-,*,%,++,--,/

        int y =3 ,x =4;
        System.out.println(y+x);
        System.out.println(4%3);


        //2.Assignment operators
        //eg:used to assign values to variables
        //e.g =,+=,-=,*=.....
        System.out.println(y=+x);
        System.out.println(y=y+x);

        //3 comparison operators
        // used to compare two values
        //eg =>,<=,!=,==,...
        System.out.println(y==x);

        //4 logical operators
       // eg &&  and
         //  ||  or
         //  !   not
           // used to determine logic between two variables or values
           System.out.println(x>y||y<x);
          System.out.println(y<x && x>y);
          System.out.println((!x>y&&x>y));
    }
}
