package Introduction;

public class JavaStrings {
    public static void main(String[]args){
        //strings are used to store text,enclosed in double quotes
        //before you create a string variable determine the data type it will store
        //syntax  type name of the variable +value
        //A string in java can actually be found with the length() method
        String firstname ="Developer";
        System.out.println(firstname);
        System.out.println(firstname.length());

        //Special characters
        System.out.println("The trainer said :\"Where is your assignment");
        System.out.println("I am a frontend developer\nJava Developer\nphpDeveloper" );
        System.out.println("I am a frontend developer \n \tJava Developer\n \tphpDeveloper");
    }
}
