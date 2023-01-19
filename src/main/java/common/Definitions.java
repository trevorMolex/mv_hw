package common;

public class Definitions {
    public static String whichCharacter(String marvelCharacter){
        if (marvelCharacter.equals("Thor")) {
            return "Thor, good.";
        }
        else if (marvelCharacter.equals("Loki")) {
            return "Loki, good and bad.";
        }
        else {
            return "Only Thor and Loki matter! Choose one. :)";
        }
    }
}
