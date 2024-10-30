public class or {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int count;
        try {
            System.out.print("how long you want to insert?(1/88) \n >>");
            count = input.nextInt();
            boolean[] a = new boolean[count];
            boolean [] b = new boolean[count];
            for (int i=0; i<count; i++) {
                System.out.print("enter true/false for a: ");
                a[i] = input.nextBoolean();
                System.out.print("enter true/false for b: ");
                b[i] = input.nextBoolean();
            }
            input.close();
            for (int i=0; i<a.length; i++) {
                System.out.println(classes.or(a[i], b[i]));
            }

        } catch (java.util.InputMismatchException e) {
            input.close();
            classes.BadUser();
        }
    }
}
