import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       MyClas myClas = new MyClas();
       myClas.jakshy_korgon_tamaguguz = "ash";
       myClas.tolyk_atygyz = "JANABEKOV";
       myClas.atynyz =  "TALANT";
        String[] araau =  {myClas.toString()};
        System.out.println(Arrays.toString(araau));


        System.out.println("--------------------------------------------------------------------");


        MyClas myClas1 =  new MyClas("JOOMART","BAKTYBEKOV","PLOV",18);
        System.out.printf(myClas1.toString());



        }
    }
