import java.util.Scanner;
public class Reggie {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        SafeInput.getRegExString(in, "Enter a valid SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        SafeInput.getRegExString(in, "Enter a UC student M number", "^(M|m)\\d{5}$");
        SafeInput.getRegExString(in, "Enter a menu choice", "^[OoSsVvQq]$");
    }
}
