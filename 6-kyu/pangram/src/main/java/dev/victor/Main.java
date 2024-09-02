package dev.victor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PangramChecker pc = new PangramChecker();
        System.out.println(pc.check("Pack my box with five dozen liquor jugs."));
    }


}