/**
 * 
 * @author Arvo Karaksela
 */
public class TestRectangle {
    /**
     * 
     * @param args
     */

    public static void main (String [] args) {
        Rectangle p = new Rectangle();
        System.out.println(p);

        p = null;

        kaynnistaRoskienKeruu();

    }

    public static void kaynnistaRoskienKeruu() {
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Tulostaa Rectangle@251a69d7 ja Deleting: Rectangle@251a69d7
    }
}
