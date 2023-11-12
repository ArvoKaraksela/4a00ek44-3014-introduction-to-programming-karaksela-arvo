
public class Rectangle {
    public int width;
    public int height; 

    public void printMe() {
        System.out.println(width);
        System.out.println(height);
    }

    public void whoAmI () {
        System.out.println(this);
    }
    
    public void finalize () {
        System.out.println("Deleting: " + this);
    }
}
