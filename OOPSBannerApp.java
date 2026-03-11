/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 * This version uses a modular approach with dedicated methods for each letter.
 * * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp{

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            // Using String.join for clean formatting
            System.out.println(String.join(" ", oPattern[i], oPattern[i], pPattern[i], sPattern[i]));
        }
    }

    public static String[] getOPattern() {
        return new String[] {
            "   ***    ",
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "   ***    "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "**   **",
            "**   **",
            "****** ",
            "** ",
            "** ",
            "** "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            " *****  ",
            "**      ",
            "**      ",
            " *****  ",
            "     ** ",
            "     ** ",
            " *****   "
        };
    }
}

