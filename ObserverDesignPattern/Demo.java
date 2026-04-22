package ObserverDesignPattern;

public class Demo {
  public static void main(String[] args) {
    
    Youtube channel = new Youtube();

    Subscriber Joe = new Subscriber("Joe");
    Subscriber Doe = new Subscriber("Doe");

    channel.subscribe(Joe);
    channel.subscribe(Doe);

    channel.newVideoUploaded("Learn LLD");
  }
}
