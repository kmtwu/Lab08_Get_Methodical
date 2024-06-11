public class CtoFTableDisplay {
    public static void main (String[] args) {
        double i;
        System.out.println("C          F");
        for (i = -100; i <= 100; i++) {
            System.out.println(i + "     " + SafeInput.CtoF(i));
        }
    }
}
