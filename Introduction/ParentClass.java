package Introduction;

public class ParentClass {
    String surname = "Kimathi";
    String color = "black";
    int hands = 2;
    int legs = 2;
    float height = 5.7f;

    public void PrintAge(){
        System.out.println("I am "+age());
    }






     //static method cant be accessed by the object since it is static
  static void fighter (){
        System.out.println(blows);
    }
    //public method ,can be accessed by the object for use
    public void fighter2(){
        System.out.println("100 uppercuts");
    }

      //accessing attributes
    public static void main(String[] args) {

        //accessing attributes
        ParentClass Kimathijnr = new ParentClass();
        System.out.println(Kimathijnr.surname);

        // modifying attributes
        //ta access an attribute or method in an object use a dot(.) notation

            Kimathijnr.surname="Njoroge";
            System.out.println(Kimathijnr.surname);
        }
        Mary.color="Brown";
        System.out.println(Mary.color);

        Mary.fighter2();
        System.out.println(Mary.fighter2);

        Mary.PrintAge(13);
        System.out.println();

    }


}
