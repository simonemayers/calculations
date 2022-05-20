import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = n.nextInt();
        System.out.println("Enter another number: ");
        int n2 = n.nextInt();
        System.out.println(add(n1, n2));
        System.out.println(subtract(n1, n2));
        System.out.println(multiple(n1, n2));
        System.out.println(divide(n1, n2));
        System.out.println(remainder(n1, n2));
    }

    public static String add(int n1,int n2){
        return n1 + " + " + n2 + " = " + (n1+n2);
    }

    public static String subtract(int n1, int n2){
        return n1 + " - " + n2 + " = " + (n1-n2);
    }

    public static String multiple(int n1, int n2){
        return n1 + " * " + n2 + " = " + (n1*n2);
    }

    public static String divide(int n1, int n2){
        return n1 + " / " + n2 + " = " + ((float)n1/(float)n2);
    }

    public static String remainder(int n1, int n2){
        return n1 + " % " + n2 + " = " + (n1%n2);
    }

}
