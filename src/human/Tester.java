package human;

public class Tester extends Human {

    private boolean isAutomation = false;

    public Tester(boolean isAutomation) {
        this.isAutomation = isAutomation;
    }

    @Override
    public void printHumanInfo() {
        System.out.println("this is tester and automation is " + isAutomation);
    }
}
