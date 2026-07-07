package practical;
public class animal {
    protected void sound(){
        System.out.println("Animal Sound");

    }
    public static void main(String[] args) {
        animal a = new animal();
        a.sound();
    }
}