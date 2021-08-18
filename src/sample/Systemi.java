package sample;
import java.util.Scanner;

public class Systemi {

    public static void main(String[]args){
        Scanner test = new Scanner(System.in);
                    String code = "Pc-";



                    System.out.println("Welcome to New Windows 11");
                    System.out.println("Set name PC");
                    String name = test.nextLine();

                String en = "You location";
                String cro = "Vasa lokacija";
                String srb = "Vasa lokacija";

                System.out.println(code +  name);
                System.out.println("Language select");

                System.out.println("Englis plase press 1," +  "Croatian plase press 2," + " Srbian plase press 3");
                int lang = test.nextInt();


                switch (lang) {
                    case 1:

                                System.out.println(en);

                                System.out.println("Englis");
                        break;
                    case 2:
                            System.out.println(cro);
                                System.out.println("Croatian");
                        break;
                    case 3:
                        System.out.println(srb);
                        System.out.println("Srbian");

                }
                System.out.println("Your locate is,"+"Europe plase press 1,"+"Asia plase press 2, "+"Usa plase press 3,"+"Africa plase press 4,");
        int lok = test.nextInt();
        switch (lok){
            case 1:
                System.out.println("europe");
                break;
            case 2:
                System.out.println("Asia");
                        break;
                    case 3:
                        System.out.println("Usa");
                        break;
                    case  4:
                        System.out.println("Africa");
                        break;
                }

                int lic = test.nextInt();

                if (lic == 1987){
                    System.out.println("your licence is corectli");
                }else {
                    System.out.println("your licenc is false");
                }
                    System.out.println("your EMAIL");
        String email = test.nextLine();


    }
}
