import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Solve this puzzle by writing the shortest code.
 * Whitespaces (spaces, new lines, tabs...) are counted in the total amount of chars.
 * These comments should be burnt after reading!
 **/
class Player {

    public String deplaceX(int tX, int lX){
        if(tX>lX){  
            return "W" ; 
        }else if(tX<tX){
            return "E";
        }
        return "";
    }

    public String deplaceY(int tY,int lY){
       if(tY>lY){  
            return "N" ; 
        }else if(tY<tY){
            return "S";
        }
        return "";
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position

        int thorX=TX, ThorY=TY,cpt=0;
        String directionX, directionY;
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            directionX=""; directionY=""; 

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
           if(TX==LX && TY==LY)
               System.exit(0);

           if(TX>LX && (TX-1>=0)){
               TX=TX-1;
               directionX+="W";
           }else if(TX<LX && (TX+1<40)){
                TX=TX+1;
                directionX+="E";
           }

          if(TY>LY && (TY-1>=0)){
               TY=TY-1;
               directionY+="N";
          }
         else if(TY<LY && (TY+1<18)){
            TY=TY+1;
            directionY+="S";
        }
                    
                    // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(directionY+directionX);
        }
    }
}
