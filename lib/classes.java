package lib;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
