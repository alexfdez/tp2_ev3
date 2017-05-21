package TP2_Ev3;

public class Math {

    int a, b;
    
    Math(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int add() {
        return a + b;
    }
    
    public static void main(String[] args) {
        Math suma = new Math(2,2);
        System.out.println("2 + 2 = " + suma.add());
    }

}
