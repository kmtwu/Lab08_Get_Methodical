import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String askInt = "Enter your favorite int";
        String askDbl = "Enter your favorite double";
        SafeInput.getInt(in, askInt);
        SafeInput.getDouble(in, askDbl);
    }
}
