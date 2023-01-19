package hello;

import common.Definitions;
import common.Variables;

public class Hello_world {
    public static void main(String[] args) {
        Variables newVariables = new Variables();
        newVariables.setMyWorld("Avengers Multiverse");
        newVariables.setHelloWorldResponse("Hello");
        String chosenCharacter = Definitions.whichCharacter("Des and Troy");

        System.out.println(
                newVariables.getHelloWorldResponse() +
                        ", " +
                        newVariables.getMyWorld() +
                        "."
        );

        System.out.println(chosenCharacter);
    }
}
