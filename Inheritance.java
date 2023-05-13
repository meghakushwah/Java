class A {
    public int x, y, z;

    public void substract(int a, int b) {
        x = a;
        y = b;
        z = x - y;
        System.out.println(z);
    }
}

class B extends A {
    public void divide(int a, int b) {
        x = a;
        y = b;
        z = x / y;
        System.out.println(z);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.substract(5, 2);
        obj.divide(10, 2);
    }
}
