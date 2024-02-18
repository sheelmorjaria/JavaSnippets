public class Pizza{
    //default
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(){
        this.dough = "thin crust";
        this.sauce = "tomato";
        this.topping = "cheese only";
    }

    public void setDough(String dough){
        this.dough = dough;
    }
    public  void setSauce(String sauce){
        this.sauce = sauce;
    }
    public void setTopping(String topping){
        this.topping = topping;
    }

    public String getDough(){
        return dough;
    }
    public String getSauce(){
        return sauce;
    }
    public String getTopping(){
        return topping;
    }
    


    public static class PizzaBuilder
    {
        public Pizza prepareVeggiePizza(){
            Pizza pizza = new Pizza();
            pizza.setDough("deep pan");
            pizza.setSauce("bbq");
            pizza.setTopping("veggie");
            return pizza;
        }
        public Pizza prepareSpicyPizza(){
            Pizza pizza = new Pizza();
            pizza.setDough("italian");
            pizza.setSauce("pesto");
            pizza.setTopping("chilli");
            return pizza;
        }
    }

    //customer
    public static void main(String[] args){
        PizzaBuilder pizza = new PizzaBuilder();
        Pizza pizzaVeg = pizza.prepareVeggiePizza();
        System.out.println("Pizza: " + pizzaVeg.getDough() + " " + pizzaVeg.getSauce() + " " + pizzaVeg.getTopping());
        Pizza pizzaSpicy = pizza.prepareSpicyPizza();
        System.out.println("Pizza: " + pizzaSpicy.getDough() + " " + pizzaSpicy.getSauce() + " " + pizzaSpicy.getTopping());
        Pizza cheese = new Pizza();
        System.out.println("Pizza: " + cheese.getDough() + " " + cheese.getSauce() + " " + cheese.getTopping());    
    }
}





