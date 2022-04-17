package be.joeri.byreforbyval;

public class ByValOrByRef_B_VoidIncrementPrimitive {
    public ByValOrByRef_B_VoidIncrementPrimitive() {
        int a = 1;
        int b = a;
        incrementOnce(b);
        System.out.println(a);
        System.out.println(b);
}
    public static void main(String[] args) {
        new ByValOrByRef_B_VoidIncrementPrimitive();
    }
    private void incrementOnce(int b) {
        b++;
    }
}

//output: A = 1, B = 1
//the primitive datatype is passed ByValue (just a copy of the value is passed)
//we added 1 to the copy of b, but didn't do anything with it (like returning it)
//if we returned it and saved it in the b variable, b would equal 2 (see ByValOrByRef2)
