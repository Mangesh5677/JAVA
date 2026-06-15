class Mobile{
  String brand;
  int price;
  static String name;
  public void show(){
    System.out.println(brand+":"+price+":"+name);
  }
}

public class StaticVAriable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=100000;      
        Mobile.name="Iphone 14 Pro Max";
        
        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=80000;   
        Mobile.name="Samsung Galaxy S23 Ultra";

        Mobile.name="Phone";
        obj1.show();
        obj2.show();
    }
}