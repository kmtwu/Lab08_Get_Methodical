import java.util.Scanner;
public class CheckOut {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String ask = "Enter the price of your item from .5 to 10";
        String ask2 = "Add more items? Y/N";
        do {
            SafeInput.getRangedDouble(in, ask, 0.5, 10);
        } while (SafeInput.getYNConfirm(in, ask2));
    }
}
