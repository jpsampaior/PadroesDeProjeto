package BehavioralPatterns.Chain;

class SupportLevel1 extends AbstractHandler{
    @Override
    public void processRequest(String request) {
        if(request.equals("Simple")) {
            System.out.println("Level 1 Support resolved the problem: " + request);
        } else {
            super.processRequest(request);
        }
    }
}

class SupportLevel2 extends AbstractHandler{
    @Override
    public void processRequest(String request) {
        if(request.equals("Medium")) {
            System.out.println("Level 2 Support resolved the problem: " + request);
        } else {
            super.processRequest(request);
        }
    }
}

class SupportLevel3 extends AbstractHandler {
    @Override
    public void processRequest(String request) {
        if(request.equals("Complex")) {
            System.out.println("Level 3 Support resolved the problem: " + request);
        } else {
            super.processRequest(request);
        }
    }
}
