package be.joeri.byreforbyval;

public class ByValOrByRef_A_IncrementPrimitive {
    public ByValOrByRef_A_IncrementPrimitive() {
        int a = 1;
        int b = a;
        b++;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        new ByValOrByRef_A_IncrementPrimitive();
    }
}

//Output: A = 1, B = 2
