import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Emil on 21.09.2016.
 */
public class Romertall {

    public static void main (String args[]){
        /*
         I = 1
         V = 5
         X = 10
         L = 50
         C = 100
         D = 500
         M = 1000
         */

        Scanner sc = new Scanner(System.in);
        String romertall;
        int verdi;
        ArrayList<Integer> romertallVerdier = new ArrayList<>();

        System.out.println("Oppgi romertall:");
        romertall = sc.nextLine();
        romertallVerdier = parseRomertallVerdier(romertall);
        verdi = parseRomertallSum(romertallVerdier);
        System.out.println("verdien i desimaltall er: " + verdi);

    }

    private static ArrayList<Integer> parseRomertallVerdier(String romertall){
        ArrayList<Integer> romertallVerdier = new ArrayList<>();;
        for(int i = 0; i < romertall.length(); i++){
            switch (romertall.charAt(i)){
                case 'I' :
                    romertallVerdier.add(i, 1);
                case 'V' :
                    romertallVerdier.add(i, 5);
                case 'X' :
                    romertallVerdier.add(i, 10);
                case 'L' :
                    romertallVerdier.add(i, 50);
                case 'C' :
                    romertallVerdier.add(i, 100);
                case 'D' :
                    romertallVerdier.add(i, 500);
                case 'M' :
                    romertallVerdier.add(i, 1000);
                default:
                    System.out.println(romertall.charAt(i) + " er ikke ett valid romertall.");
            }
        }

        System.out.println(romertallVerdier.toString());

        return romertallVerdier;
    }

    private static int parseRomertallSum(ArrayList<Integer> romertallVerdier){
        int sum = 0;
        for(int i = 0; i <romertallVerdier.size()-1; i++){
            if(romertallVerdier.get(i) < romertallVerdier.get(i+1)){
                sum += romertallVerdier.get(i+1) - romertallVerdier.get(i);
                i++;
            }else{
                sum += romertallVerdier.get(i);
            }
            System.out.println("romertall position " + i + " er " + romertallVerdier.get(i));
        }
        return sum;
    }
}
