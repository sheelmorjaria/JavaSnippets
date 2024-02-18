public abstract class AbstractFactoryGarden {
    public abstract Plant getCenter();
    public abstract Plant getBorder();
    public abstract Plant getShade();

class Plant{
    String name;
    public Plant(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
static class VegieGarden extends AbstractFactoryGarden{
    public Plant getCenter(){
        return new Plant("Tomato");
    }
    public Plant getBorder(){
        return new Plant("Corn");
    }
    public Plant getShade(){
        return new Plant("Peas");
    }
}
static class FlowerGarden extends AbstractFactoryGarden{
    public Plant getCenter(){
        return new Plant("Rose");
    }
    public Plant getBorder(){
        return new Plant("Marigold");
    }
    public Plant getShade(){
        return new Plant("Lily");
    }
}
 static class FruitGarden extends AbstractFactoryGarden{
    public Plant getCenter(){
        return new Plant("Apple");
    }
    public Plant getBorder(){
        return new Plant("Blueberry");
    }
    public Plant getShade(){
        return new Plant("Strawberry");
    }
}
//Abstract factory that returns one of three gardens
//isolates the concrete classes that are generated
//class names are hidden in the factory and are not exposed to the client
//since the classes are isolated, inteexchange of product class families without affecting the client
//since only one concrete class is returned, you cannot inadvertently use classes from different families of products
//although the generated classes have the same base class, the derived classes may have additional methods that differ from the methods of other classes
static class GardenMaker{
    private AbstractFactoryGarden gd;
    public AbstractFactoryGarden getGarden(String type){
        gd = new VegieGarden(); //default
        if(type.equals("Flower")){
            gd = new FlowerGarden();
        }else if(type.equals("Fruit")){
            gd = new FruitGarden();
        }
        return gd;
    }
}
public static void main(String[] args) {
    GardenMaker gm = new GardenMaker();
    AbstractFactoryGarden g = gm.getGarden("Flower");
    System.out.println(g.getCenter().getName());
    System.out.println(g.getBorder().getName());
    System.out.println(g.getShade().getName());
    g = gm.getGarden("Fruit");
    System.out.println(g.getCenter().getName());
    System.out.println(g.getBorder().getName());
    System.out.println(g.getShade().getName());
    g = gm.getGarden("Vegie");
    System.out.println(g.getCenter().getName());
    System.out.println(g.getBorder().getName());
    System.out.println(g.getShade().getName());
}
}
