package be.joeri.byreforbyval;

public class ByValOrByRef_E_VoidIncrementObject {
    class MySpecialInt {
        int myInt;

        public MySpecialInt(int myInt) {
            super();
            this.myInt = myInt;
        }
    }

    ByValOrByRef_E_VoidIncrementObject() {
        MySpecialInt a = new MySpecialInt(1);
        MySpecialInt b = a;
        incrementOnce(b);
        ////b is the same object as a: changing the state of b means also changing the state of a
        System.out.println(a.myInt);
        System.out.println(b.myInt);
    }

    void incrementOnce(MySpecialInt i) {
        i.myInt++;
    }

    public static void main(String[] args) {
        new ByValOrByRef_E_VoidIncrementObject();
    }
}

//Output: A = 2, B = 2
