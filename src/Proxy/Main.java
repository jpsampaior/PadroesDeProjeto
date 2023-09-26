package Proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("foto_familia_2012.jpg");
        image.display();
        image.display();
    }
}
