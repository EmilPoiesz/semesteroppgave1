import java.util.Random;
import java.util.Scanner;

/**
 * Created by Emil on 21.09.2016.
 */
public class TerningSimulering {
    public static void main (String args[]){
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int hoyereEllerLik, antallTerningkast, antallHoeyere = 0;

        System.out.println("Oppgi verdien som terningens verdi skal vaere hoeyere eller lik (heltall fra 1 til 6):");
        hoyereEllerLik = sc.nextInt();
        while(hoyereEllerLik < 1 || hoyereEllerLik > 6){
            System.out.println("Tallet maa vaere mellom 1 og 6, skriv inn paa nytt:");
            hoyereEllerLik = sc.nextInt();
        }

        System.out.println("Oppgi antall terningkast (positivt heltall):");
        antallTerningkast = sc.nextInt();
        while(antallTerningkast < 1){
            System.out.println("Tallet maa vaere stoere enn 0, skriv inn paa nytt:");
            antallTerningkast = sc.nextInt();
        }

        for(int i = 0; i < antallTerningkast; i++){
            if(randomTall(rnd) >= hoyereEllerLik){
                antallHoeyere++;
            }
        }

        System.out.println("Terningens verdi var stoerre eller lik " + hoyereEllerLik + " " + antallHoeyere +
                " av " + antallTerningkast + " ganger.");
        System.out.println("p(v>=" + hoyereEllerLik + ") = " + (double) antallHoeyere/antallTerningkast);

    }

    private static int randomTall(Random rnd){
        return rnd.nextInt(6)+1;
    }
}
