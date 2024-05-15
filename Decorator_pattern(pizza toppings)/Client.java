public class Client {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription() + " Cost: $" + plainPizza.getCost());

        Cheese addCheese = new Cheese(plainPizza);
        System.out.println(addCheese.getDescription() + " Cost: $" + addCheese.getCost());

        Pepperoni addPepperoni = new Pepperoni(plainPizza);
        System.out.println(addPepperoni.getDescription() + " Cost: $" + addPepperoni.getCost());

        Olives addOlives = new Olives(plainPizza);
        System.out.println(addOlives.getDescription() + " Cost: $" + addOlives.getCost());
        
        //topping with cheese , pepperoni , olives
        Pizza specialPizza = new PlainPizza();
        specialPizza = new Cheese(specialPizza);
        specialPizza = new Pepperoni(specialPizza);  
        specialPizza = new Olives(specialPizza);
          System.out.println(specialPizza.getDescription() + " Cost: $" + specialPizza.getCost());
    }
}
