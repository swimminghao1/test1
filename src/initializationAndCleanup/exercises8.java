package initializationAndCleanup;

class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}
public class exercises8 {
    public static void main(String[] args) {
        new Doc().intubate();
    }
}
