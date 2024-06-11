import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ask = "Input your username";
        SafeInput.getNonZeroLenString(in, ask);
    }
}
