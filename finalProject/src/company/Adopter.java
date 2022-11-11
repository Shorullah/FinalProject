package company;

public class Adopter implements ITarget{
    Adaptee adaptee;
    public Adopter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void TVRequest() {
        System.out.println("TV controller!\n");
        this.adaptee.tvSpecificRequest();
    }
    public void tempRequest(){
        System.out.println("Air condition controller!\n");
        this.adaptee.tempRequest();
    }
}
