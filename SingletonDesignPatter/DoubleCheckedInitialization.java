package SingletonDesignPatter;

public class DoubleCheckedInitialization {
  
  private static DoubleCheckedInitialization doubleCheckedInitialization;

  private DoubleCheckedInitialization(){}

  public static DoubleCheckedInitialization getInstance(){
    if(doubleCheckedInitialization == null){
      synchronized(DoubleCheckedInitialization.class){
         if(doubleCheckedInitialization == null){
          doubleCheckedInitialization = new DoubleCheckedInitialization();
         }
      }
    }
    return doubleCheckedInitialization;
  }
}
