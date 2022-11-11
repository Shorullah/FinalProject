package company;

public class Main {
    public static void main(String[] args) {
        ITarget target = new Adopter(new Adaptee());
        target.TVRequest();
        System.out.println("-------------------------------------------------------------");
        target.tempRequest();
    }
}
