import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;



public class Main {
public static void main(String[] args) {
Scanner in = new Scanner (System.in);
System.out.println("WELCOME"); 
System.out.println("What is your username? " );
String name = in.nextLine();
System.out.println("1 - Poem");
System.out.println("2 - Fortune Teller");
System.out.println("3 - Lottery");
System.out.println("4 - MadLibs");
System.out.println("");
System.out.println("Choose a game: ");

Game g = new Game(); // game intitialize from class


int gameChose = in.nextInt();

if(gameChose==1)
{
 
    System.out.println(g.poemStvincent(name));
}
else if(gameChose==2)
{
 System.out.println(g.FortuneTellerStvincent(name));
}
else if(gameChose==3)
{

}
else if (gameChose==4)
{

}
else{
  System.out.println("invalid argument idiot!");
}




}




}



//1. inpput the game choice 2. if, if else statement to call functions 3. make your functions

  
