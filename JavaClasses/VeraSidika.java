package JavaClasses;

public class VeraSidika {
    //1.Constructor class has to have the same name as the main class
    //2.use the key word public followed by the name of the constructor class
    //3.Constructor class is called when an object is created
    //4.All classes have a constructor class by default,if you dont
    //create the constructor yourself
    String color;
    int herAge;
    public VeraSidika(String rangi,int age){
        color="rangi";
        herAge =age;
    }

    public static void main(String[] args) {
        //create an object
        VeraSidika vera1=new VeraSidika("Pink");
        System.out.println(vera1.color);

        VeraSidika vera2=new VeraSidika("Chocolate");
        System.out.println(vera2.color);
    }
}