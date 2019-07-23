package JavaClasses;
//class,bject,attributes method
public class ClassOne {
    //everything in java is associated in a class,objects,attributes
    //methods

    int age =45;//attribute
    String name="Developer";
    String country="Kenya";

   //You can create  an object of a class and access it in another class
   //objective :for better organisation of classes/project



    public static void main (String[]args){
        //syntax:classname of the object=new classname()
        //creating an object
        //an object is an instance of a class
        ClassOne obj1= new ClassOne();
        ClassOne obj2=new ClassOne();
        ClassOne obj3= new ClassOne();
        System.out.println(obj1.age);
        System.out.println(obj2.name);
        System.out.println(obj3.country);

    }



}
