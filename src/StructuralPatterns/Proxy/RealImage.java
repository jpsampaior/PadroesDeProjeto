package StructuralPatterns.Proxy;

public class RealImage implements Image{
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk "+filename);
    }
    @Override
    public void display() {
        System.out.println("Printing the image "+filename);
    }
}
