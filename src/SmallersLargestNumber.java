import java.util.Scanner;

public class SmallersLargestNumber {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = inputUser.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = inputUser.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = inputUser.nextInt();


        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("The Largest number is " + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("The Largest number is " + num2);
        } else {
            System.out.println("The Largest number is " + num3);
        }

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("The smallest number is " + num1);
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println("The greatest number is " + num2);
        } else {
            System.out.println("The greatest number is " + num3);
        }

    }

}