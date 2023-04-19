public class Main {
    public static void main(String[] args) {


        Cappuccino cappuccino = new Cappuccino();
        System.out.println(cappuccino.getDescription() + " $" + cappuccino.cost());
        Expresso expresso = new Expresso();
        System.out.println(expresso.getDescription() + " $" + expresso.cost());
//        until here we suppose that the system is stable and working perfectly fine
//        the question is how to add more functionality to the system without changing the existing code(beverage classe, expresso and cappuccino classes)
//        the answer is to use the decorator pattern
//        the decorator pattern allows us to add new functionality to the system without changing the existing code

        Expresso expresso1 = new Expresso();
        Caramel caramel = new Caramel(expresso1);
        Soy soy = new Soy(caramel);
        System.out.println(soy.getDescription() + " $" + caramel.cost());

    }
}