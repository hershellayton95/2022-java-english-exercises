package javabasics._10;

public class Main {
    public static void main(String[] args) {
        boolean conditionA = true;
        boolean conditionB = true;

        if (conditionA ^ conditionB && (true || 5 > 73)) {
            System.out.println("XOR!");
        } else {
            System.out.println("Not xor :(");
        }
    }
}
