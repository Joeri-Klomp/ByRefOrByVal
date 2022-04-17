package be.joeri.byreforbyval;

public class ByValOrByRef_C_ReturnPrimitiveAfterIncrement {
    public ByValOrByRef_C_ReturnPrimitiveAfterIncrement() {
        int a = 1;
        int b = a;
        b = incrementOnce(b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        new ByValOrByRef_C_ReturnPrimitiveAfterIncrement();
    }
    private int incrementOnce(int b) {
        b++;
        return b;
    }
}

//output: A = 1, B = 2

