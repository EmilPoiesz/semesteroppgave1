import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Emil on 21.09.2016.
 */
public class EnkelKryptering {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        String innTekst, utTekst;
        int noekkel = 0;

        System.out.println("Inn-tekst:");
        innTekst = sc.nextLine();
        System.out.println("Noekkel-verdi:");
        try{
            noekkel = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Noekkel verdien burde ha vært ett tall...");
        }

        utTekst = krypteer(innTekst, noekkel);
        System.out.println("Ut-tekst:  " + utTekst);

    }

    private static String krypteer(String text, int key){
        String returnString = "";
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
                char currentChar = (char) (text.charAt(i)+(key%('z'-'a' + 1)));
                if(currentChar > 'z'){
                    returnString += (char)((currentChar % 'z')+ 'a' - 1);
                }else if(currentChar < 'a'){ //less then a doesnt work
                    returnString += (char)('z' - ('a' - currentChar) + 1);
                }else{
                    returnString += currentChar;
                }
            }else{
                returnString += (char)(text.charAt(i));
            }
        }

        return returnString;
    }
}
