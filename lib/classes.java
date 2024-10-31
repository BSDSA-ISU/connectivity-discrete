package lib;

public class classes {

    public static boolean IfThen(boolean a, boolean b) {
        if (b) {
            return true;
        } else if (a==b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean IfAndOnlyIf(boolean a, boolean b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean and(boolean a, boolean b) {
        if (a && b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean or(boolean a, boolean b) {
        if (a || b) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean negation(boolean a) {
        return !a;
    }

    public static void BadUser() {
        System.out.print("Loser");
        System.exit(1);
    }

}
