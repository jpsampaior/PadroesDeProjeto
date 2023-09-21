package Adapter;

public class Main {
    public static void main(String[] args) {
        USBApple usbApple = new USBApple();
        USBAdapter usbAdapter = new USBAdapter(usbApple);
        Computer computer = new Computer();

        computer.connectUSB(usbAdapter);
    }
}
