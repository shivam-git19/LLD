package SingletonDesignPatter;

public class BillPughInitialization {
  private BillPughInitialization(){}

  private static class BillPughInnerClass{
    private static final BillPughInitialization billPughInitialization = new BillPughInitialization();
  }

  public static BillPughInitialization getInstance(){
    return BillPughInnerClass.billPughInitialization;
  }
}
