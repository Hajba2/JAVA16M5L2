package human;

public class HumanTest {

    public static void main(String[] args) {
        polimorf2();

    }

    public static void polimorf2() {
        Human human = new Human("Ivan", 33);
        Developer developer = new Developer("Java");
        Tester tester = new Tester(true);

        Object devObject = (Object) developer;
        System.out.println("devObject.toString() = " + devObject.toString());

        Developer devReference2 = developer;
        System.out.println("(devReference2 == developer) = " + (devReference2 == developer));
        System.out.println("devReference2.equals(developer) = " + devReference2.equals(developer));
    }

    public static void polimorf1() {
        Human human = new Human("Ivan", 33);
        Developer developer = new Developer("Java");
        Developer developer1 = new Developer("Java");
        Tester tester = new Tester(true);
        Tester tester2 = new Tester(true);

        human.printHumanInfo();
        developer.printHumanInfo();
        developer.isGoodDeveloper();
        tester.printHumanInfo();

        Human developerToHuman = (Human) developer;
        developerToHuman.printHumanInfo();
        Human testerToHuman = (Human) tester;
        testerToHuman.printHumanInfo();
        //Developer humanToDeveloper = human;

        System.out.println("in for cycle");
        Human[] hArr = {human, developer1, developer, tester2, tester};
        for (Human h : hArr) {
            h.printHumanInfo();
        }
    }

    public static void m1() {
        Human h1 = new Human("Lola", 43);
        Human h2 = new Human("Lola", 43);
        Human h3 = new Human("Lola", 23);
        Human h4 = new Human("Danil", 34);
        String sName = "Kola";

        System.out.println("h1.equals(h2) = " + h1.equals(h2));
        System.out.println("h1.equals(h3) = " + h1.equals(h3));
        System.out.println("h1.equals(sName) = " + h1.equals(sName));
        System.out.println("h1.equals(null) = " + h1.equals(null));

        Object ho1 = h1;

        int a = 9;
        int b = 9;
        if (a == b) {
            System.out.println("a == b");
        }
    }

}
