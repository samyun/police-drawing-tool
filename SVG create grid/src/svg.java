/**
 * Put a short phrase describing the program here.
 * 
 * @author Put your name here
 * 
 */
public final class svg {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private svg() {
    }

    /**
     * Main method.
     * 
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        int xmax = 640, ymax = 640, y = 20, x = 20, i = 0;
        int[] xlist = new int[13 * 13];
        int[] ylist = new int[13 * 13];
        while (y < ymax) {
            while (x < xmax) {
                xlist[i] = x;
                ylist[i] = y;
                i++;
                x = x + 50;
            }
            x = 20;
            y = y + 50;
        }

        for (int k = 0; k < i; k++) {
            System.out.println("<rect id=\"pt" + (k + 1)
                    + "\" height=\"10\" width=\"10\" y=\"" + ylist[k]
                    + "\" x=\"" + xlist[k]
                    + "\" fill=\"#cccccc\" onclick=\"selectDot(id)\"/>");
        }

    }

}
