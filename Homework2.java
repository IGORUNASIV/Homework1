import java.util.Scanner;


public class Homework2 {



    public static void main(String[] args) {
        System.out.println("how many packages you want to deliver");
     Scanner twiter = new Scanner(System.in);
     int arkadash = twiter.nextInt();
        System.out.println("how much weight will be one package");
        double KG = twiter.nextDouble();
        System.out.println("type recipients name:");
        Scanner twiter1 = new Scanner(System.in);
        String bob =twiter1.nextLine();
        System.out.println("type recipients surname:");
        String gugu = twiter1.nextLine();
        System.out.println("seend me you address");
        String linela = twiter1.nextLine();
        System.out.println("recipient:" + " \""+ bob.toUpperCase() + " " + gugu.toUpperCase() +"\" " + "\n"+"adres dastavki: "+ "\""+linela.toUpperCase() + "\""
        + "\n"+ "obshii ves: "+ (arkadash*KG)+" kg ");


        Scanner inputCheckBox = new Scanner(System.in); //Checkbox yes/no
        System.out.println("All data correct?" + " Please input \"Yes\" or \"No\"");
        String inputCheckBoxString = inputCheckBox.next();

        boolean Yes = true;
        boolean No = false;


        ;







    }


}