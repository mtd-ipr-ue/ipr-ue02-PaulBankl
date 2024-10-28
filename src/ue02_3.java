import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
            Out.print("Gib mir eine x Koordinate:  ");
            double xcord = In.readDouble();

            Out.print("Gib mir eine y Koordinate:  ");
            double ycord = In.readDouble();

            if (xcord > 0 && ycord > 0 && xcord < 4 && ycord <4) {
                if (Math.sqrt(xcord * xcord + ycord* ycord) <= 4)  {
                    Out.print("Die Koordinaten liegen nicht in der grünen Fläche!");
                }
                else{
                    Out.print("Die Koordinaten liegen in der grünen Fläche!");
                }
            }
            else{
                Out.print("Die Koordinaten liegen nicht in der grünen Fläche!");
            }
    }
}
