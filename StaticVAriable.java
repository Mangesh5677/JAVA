class Mobile{
  String brand;
  int price;
  String name;
  public void show(){
    System.out.println(brand+":"+price+":"+name);
  }
}

public class StaticVAriable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=100000;      
        obj1.name="Iphone 14 Pro Max";
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=80000;   
        obj2.name="Samsung Galaxy S23 Ultra";
        obj2.show();
    }
}