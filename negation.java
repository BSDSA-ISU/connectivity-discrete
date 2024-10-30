public class negation {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int count;
        try {
            System.out.print("how long you want to insert?(1/88) \n >>");
            count = input.nextInt();
            boolean[] a = new boolean[count];
            for (int i=0; i<count; i++) {
                System.out.print("enter true/false for "+ (i+1) + "a: ");
                a[i] = input.nextBoolean();
            }
            input.close();
            for (int i=0; i<a.length; i++) {
                System.out.println("formula: (!"+a[i]+") " + " the " + (i+1)+ "a" + " Is: " + classes.negation(a[i]));
            }

        } catch (java.util.InputMismatchException e) {
            input.close();
            classes.BadUser();
        }
    }
}
