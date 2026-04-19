public class coprime {
    public static void main(String[] args) {
        int a = 15, b = 28;
        if (gcd(a, b) == 1) {
            System.out.println(a + " and " + b + " are coprime.");
        } else {
            System.out.println(a + " and " + b + " are not coprime.");
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
