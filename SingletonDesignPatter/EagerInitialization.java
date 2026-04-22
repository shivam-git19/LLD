package SingletonDesignPatter;

public class EagerInitialization {

  private static final EagerInitialization eagerInitialization = new EagerInitialization();

  private EagerInitialization(){};

  public static EagerInitialization getInstance(){
    return eagerInitialization;
  }

}
