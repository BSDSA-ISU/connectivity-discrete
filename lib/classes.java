package lib;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class classes {

    // if then method. if b is true returns true and so on
    public static boolean IfThen(boolean a, boolean b) {
        if (b) {
            return true;
        } else if (a==b) {
            return true;
        } else {
            return false;
        }
    }

    // if both true or both false. returns true
    public static boolean IfAndOnlyIf(boolean a, boolean b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    // if b and is true then it returns true. else it is false like false and false = false
    public static boolean and(boolean a, boolean b) {
        if (a && b) {
            return true;
        } else {
            return false;
        }
    }

    // or method. if a or b is true then it returns true
    public static boolean or(boolean a, boolean b) {
        if (a || b) {
            return true;
        } else {
            return false;
        }
    }

    // reverses a. example if a is true it became false and false to true
    public static boolean negation(boolean a) {
        return !a;
    }

    public static void BadUser() {
        JLabel label = new JLabel();
        label.setText("bad user Detected!");
        label.setSize(999, 999);

        JFrame frame = new JFrame("Stupid User");
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);
    }

}
