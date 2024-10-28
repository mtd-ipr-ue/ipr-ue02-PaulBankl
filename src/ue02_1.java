import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Gib mir die erste deiner 3 Zahlen: ");
        double zahl1 = In.readDouble();

        Out.println("Gib mir die zweite Zahl: ");
        double zahl2 = In.readDouble();

        Out.println("Gib mir die dritte Zahl: ");
        double zahl3 = In.readDouble();

        if (zahl1 > zahl2 && zahl1 > zahl3) {
            Out.print("Die erste Zahl ist die größte:  " + zahl1);
        }
        else if (zahl2 > zahl1 && zahl2 > zahl3) {
                Out.print("Die zweite Zahl ist die größte:  " + zahl2);
            }
        else if (zahl3 > zahl1 && zahl3 > zahl2) {
                Out.print("Die dritte Zahl ist die größte:  " + zahl3);
            }
        else if (zahl1 == zahl2 && zahl1 > zahl3) {
            Out.print("Zahl eins und zwei sind die größten: " +zahl1);
        }
        else if (zahl1 == zahl3 && zahl1 > zahl2) {
            Out.print("Die erste und die dritte Zahl sind die größten: " + zahl1);
        }
        else if (zahl2 == zahl3 && zahl2 > zahl1){
            Out.print("Zahl zwei und drei sind die größten: " + zahl2);
        }
        else if (zahl1 == zahl2 && zahl1 == zahl3) {
            Out.print("Alle zahlen sind gleich groß: " + zahl1);
        }
        }


}
