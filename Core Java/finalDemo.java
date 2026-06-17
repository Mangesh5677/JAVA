final class calc{
   public void show(){
    System.out.println("in Calc Show");
   }
   public void add(int a,int b){
    System.out.println(a+b);
   }
}
// when use final keyword thwn not extends this class to another class
// class advcalc extends calc{

// }

public class finalDemo {
    public static void main(String[] args) {
        calc obj = new calc();
        obj.show();
        obj.add(10,20 );
    }
}
