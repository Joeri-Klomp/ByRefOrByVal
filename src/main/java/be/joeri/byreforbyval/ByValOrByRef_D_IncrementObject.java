package be.joeri.byreforbyval;

public class ByValOrByRef_D_IncrementObject {
    class MySpecialInt {
        int myInt;

        public MySpecialInt(int myInt) {
            super();
            this.myInt = myInt;
        }
    }

    public ByValOrByRef_D_IncrementObject() {
        MySpecialInt a = new MySpecialInt(1);
        MySpecialInt b = a;
        //Because MySpecialInt is an object, we are doing this ByRef: b is not a new object, it's a reference to a
        b.myInt++;
        //b is the same object as a: changing the state of b means also changing the state of a
        System.out.println(a.myInt);
        System.out.println(b.myInt);
    }

    public static void main(String[] args) {
        new ByValOrByRef_D_IncrementObject();
    }
}

//Output: A = 2, B = 2
