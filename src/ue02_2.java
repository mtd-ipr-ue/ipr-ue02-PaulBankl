import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
      Out.print("Gib mir eine Jahreszahl: ");
      int jahr = In.readInt();

      Out.print("Gib mir ein Monat mit den Zahlen 1-12: ");
      int monat = In.readInt();

      switch (monat) {
        case 1: 
            Out.print("Der Monat hat 31 Tage!");
            break;
      case 2:
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 ==0) {
                    Out.print("Das Monat hat 29 Tage!");
                }
                else {
                    Out.print("Das Monat hat 28 Tage!");
                    }
                
            }
            else {
                Out.print("Das Monat hat 29 Tage!");
            }
        }
        else{
            Out.print("Das Monat hat 28 Tage!");
        }
      break;
      
      case 3: 
      Out.print("Der Monat hat 31 Tage!");
      break;

      case 5:
      Out.print("Der Monat hat 31 Tage!");
      break;
      case 7:
      Out.print("Der Monat hat 31 Tage!");
      break;
      case 8:
      Out.print("Der Monat hat 31 Tage!");
      break;
      case 10:
      Out.print("Der Monat hate 31 Tage!");
      break;
      
      case 12:
      Out.print("Der Monat hat 31 Tage!");
      break;
        default: Out.print("Der Monat hat 30 Tage!");
            break;
      }
    }
}
