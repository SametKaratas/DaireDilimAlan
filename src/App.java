import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double r, a, 𝜋 = 3.14;
        Scanner  input = new Scanner(System.in);
        System.out.print("Yari capi giriniz :");
        r = input.nextDouble();
        System.out.print("Merkez acisinin olcusunu giriniz :");
        a =input.nextDouble();
        double sonuc = (𝜋 * (r * r) * a) / 360;
        System.out.print("Daire diliminin alani :" + sonuc);
    }
}
