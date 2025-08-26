abstract class bike{
    abstract void model();
    void company(){
        System.out.println("This is a Honda bike and below are the specifications");
    }
}
class Honda extends bike{
    @Override
    void model(){
        int wheels = 2;
        String name = "Unicorn";
        String color = "red";
        System.out.println("No of wheels: "+wheels+" Name of the model: "+name+" Colour of the bike: "+color);
    }
}
public class abs2{
    public static void main(String args[]){
        bike b = new Honda();
        b.company();
        b.model();
    }
}