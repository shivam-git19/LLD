package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{

  List<Observer> subscriber = new ArrayList<>();

  @Override
  public void subscribe(Observer ob) {
    this.subscriber.add(ob);
  }

  @Override
  public void unsubscribe(Observer ob) {
   this.subscriber.remove(ob);
  }

  @Override
  public void newVideoUploaded(String title) {
    for(Observer ob : this.subscriber){
      ob.notified(title);;
    }
  }
  
}
