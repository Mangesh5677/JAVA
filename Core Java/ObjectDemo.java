class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public String getAPen(int cost){
        return "Here is a pen.";
    }
}


public class ObjectDemo {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.playMusic();
        String pen = myComputer.getAPen(5);
        System.out.println(pen);
    }
}