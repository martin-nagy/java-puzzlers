import java.text.MessageFormat;

public class UnsignedInt {
    public static void main(String[] args) {
        int a = 2;
        int b = ~a;
        int c = a ^ b;
        if (a < b & a > c++) {
            System.out.println("x");
        }
        System.out.println(MessageFormat.format("a={0}, b={1}, c={2}", a, b, c));
    }

}
