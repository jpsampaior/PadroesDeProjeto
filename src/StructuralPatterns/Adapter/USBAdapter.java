package StructuralPatterns.Adapter;

public class USBAdapter implements IUSB{
    private USBApple usbApple;

    public USBAdapter(USBApple usbApple) {
        this.usbApple = usbApple;
    }
    @Override
    public void plugIn() {
        usbApple.connect();
    }

    @Override
    public void transferData() {
        usbApple.transferData();
    }
}
