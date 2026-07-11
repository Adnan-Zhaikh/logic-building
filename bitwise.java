public class bitwise {
    public static void main(String[] args) {
        System.out.println("\n---Executing Low-Level Bit Manipulation---");

        //Binary representation
        //5 is 0101
        //6 is 0110
        int a = 5;
        int b = 6;

        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseNot = ~a;

        System.out.println("Bitwise AND ( 5 & 6): " + bitwiseAnd);
        System.out.println("Bitwise OR ( 5 & 6): " + bitwiseOr);
        System.out.println("Bitwise XOR ( 5 & 6): " + bitwiseXor);
        System.out.println("Bitwise NOT (5): " + bitwiseNot);
    }
}
