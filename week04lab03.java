public class week04lab03 {
    public static void max1(int a , int b ) {
        if (a > b) {
            System.out.println("Max: " + a);
        } else if (b > a) {
            System.out.println("Max: " + b);
        } else {
            System.out.println("Both numbers are equal: " + a);
        }
       
    } 
    public static void max2(double a , double b, double c) {
        if (a > b && a > c) {
            System.out.println("Max: " + a);
        } else if (b > a && b > c) {
            System.out.println("Max: " + b);
        } else {
            System.out.println("Max: " + c);
        }
    }

    public static void main(String[] args) {
        max1(5, 10);
        max1(15, 10);
        max1(7, 7);
        
        max2(3.5, 2.8, 4.1);
        max2(1.2, 5.6, 3.4);
        max2(6.0, 6.0, 6.0);
    }
}
