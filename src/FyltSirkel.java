import java.util.Scanner;

/**
 * Created by Emil on 21.09.2016.
 */
public class FyltSirkel {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int radius, width, height;

        System.out.println("Oppgi radius (minst 1):");
        radius = sc.nextInt();

        if(radius < 1 ){
            System.out.println("Feil! Radius maa vaere minst 1.");
        }else{
            width = (radius*4)+2;
            height = (radius*2)+1;
            for(int x = -radius; x < radius+1; x++){
                for(int y = -radius; y < radius+1; y++){
                    if(((x*x)+(y*y)) <= (radius + 0.3)*(radius + 0.3)){
                        System.out.print("**");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
