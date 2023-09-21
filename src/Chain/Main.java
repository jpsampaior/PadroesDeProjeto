package Chain;

public class Main {
    public static void main(String[] args) {
        AbstractHandler supportLevel1 = new SupportLevel1();
        AbstractHandler supportLevel2 = new SupportLevel2();
        AbstractHandler supportLevel3 = new SupportLevel3();

        supportLevel1.setNextHandler(supportLevel2);
        supportLevel2.setNextHandler(supportLevel3);

        supportLevel1.processRequest("Simple");
        supportLevel1.processRequest("Medium");

    }
}
