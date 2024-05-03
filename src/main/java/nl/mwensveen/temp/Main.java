package nl.mwensveen.temp;

import io.jsondb.JsonDBTemplate;

public class Main {
    private static JsonDBTemplate jsonDBTemplate;

    public static void main(String[] args) {
        System.out.println("Temp");
        jsonDBTemplate = new JsonDBTemplate(".", ".");
    }

}
