package StructuralPatterns.Adapter;

public class Computer {
    void connectUSB(IUSB usb){
        System.out.println("Connecting USB device...");
        usb.plugIn();
        usb.transferData();
        System.out.println("Data transfer complete");
    }
}
