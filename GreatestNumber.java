public class GreatestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        
        System.out.println("Num1 = "+num1);
        System.out.println("Num2 = "+num2);
        System.out.println("Num3 = "+num3);
        int max = num1;

        if(num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("The greatest number is: " + max);
    }
}