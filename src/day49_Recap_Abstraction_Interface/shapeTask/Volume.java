package day49_Recap_Abstraction_Interface.shapeTask;

public interface Volume {

    boolean hasVolume = true;   //public static final by default
    //public abstract double volume();  // it is public abstract by default that is why we don't need to write it down.
    double volume();

    /*
    public static void main(String[] args) {
        System.out.println(hasVolume);
        System.out.println(Volume.hasVolume);
        hasVolume = false;
    }
     */

}
