abstract class Car{
    public  abstract void drive();

    public void playMusic(){
        System.out.println("Play the Music");
    }
}

class BMW extends Car{
    public void drive(){
        System.out.println("Driving......");
    }
}



public class abstractdemo {
    public static void main(String[] args) {
        Car c = new BMW();
        c.drive();
        c.playMusic();
    }
}
