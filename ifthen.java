import lib.*;

public class ifthen {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int thisint;
        try {
            System.out.print("how long you want to insert?(1/88) \n >>");
            thisint = input.nextInt();
            boolean[] a = new boolean[thisint];
            boolean [] b = new boolean[thisint];
            for (int i=0; i<thisint; i++) {
                System.out.print("enter true/false for "+ (i+1) + "a: ");
                a[i] = input.nextBoolean();
                System.out.print("enter true/false for " + (i+1) + "b: ");
                b[i] = input.nextBoolean();
            }
            for (int i=0; i<thisint; i++) {
                System.out.println("formula: ("+a[i]+" → "+b[i] + ") " + " the " + (i+1)+ "a → " +  + (i+1)+"b Is: " + classes.IfThen(a[i], b[i]));
            }
        } catch (java.util.InputMismatchException exception) {
            classes.BadUser();
        }

        input.close();
    }
}