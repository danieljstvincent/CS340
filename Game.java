import java.util.ArrayList;
import java.lang.Math;

class Game{
public static String poemStvincent(String name){
  String poem = "My student " + name + " standing proud, is a fine example for the crowd."; 
  return poem;
}


public static String FortuneTellerStvincent(String name){

    ArrayList<String> Fortune = new ArrayList<String>();
    Fortune.add("Buy a lottery today. You will be lucky! ");
    Fortune.add("You might step on gum. Watch your step!");
    Fortune.add("You to Vegas and bet all of your money");
    Fortune.add("A faithful friend is a strong defense.");
    Fortune.add("A fresh start will put you on your way.");
    int rand = (int)(Math.random() * Fortune.size());
    String ran = Fortune.get(rand);
    return ran;
  }
}
 

