public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();

        Greeting lambdaGreeting = () -> System.out.println("Hello World! I am a Lambda expression!");
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello World! I am an inner class!");
            }
        };

        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);

        String names[] = {"Ada", "Bertoldo", "Carlo", "Davide", "Ernesto", "Fabio"};
        int ages[] = {25,36,18,15,87,18};
        for (String name : names) {
            System.out.println("Il tuo nome è: " + name);
        }

        for (int age : ages) {
            if (age >=18) {
                System.out.println("Avanti");
            } else {
                System.out.println("Fermi tutti, è minorenne");
                break;
            }

        }

    }
}
