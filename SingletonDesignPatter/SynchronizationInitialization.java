package SingletonDesignPatter;

public class SynchronizationInitialization {

  private static SynchronizationInitialization synchronizationInitialization;

  private SynchronizationInitialization(){}

  public static synchronized SynchronizationInitialization getInstance(){
    if(synchronizationInitialization == null){
      synchronizationInitialization = new SynchronizationInitialization();
    }
    
    return synchronizationInitialization;
  }
  
}
