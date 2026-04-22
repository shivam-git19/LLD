package SingletonDesignPatter;

public class Demo {
  
  public static void main(String[] args){

    //Eager
    EagerInitialization eagerInitialization = EagerInitialization.getInstance();
    System.out.println(eagerInitialization.hashCode());
    EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
    System.out.println(eagerInitialization1.hashCode());

    //Lazy
    LazyInitialization lazyInitialization = LazyInitialization.getInstance();
    System.out.println(lazyInitialization.hashCode());
    LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
    System.out.println(lazyInitialization1.hashCode());

    //Synchronized
    SynchronizationInitialization synchronizationInitialization = SynchronizationInitialization.getInstance();
    System.out.println(synchronizationInitialization.hashCode());
    SynchronizationInitialization synchronizationInitialization1 = SynchronizationInitialization.getInstance();
    System.out.println(synchronizationInitialization1.hashCode());

    //DoubleCheck
    DoubleCheckedInitialization doubleCheckedInitialization = DoubleCheckedInitialization.getInstance();
    System.out.println(doubleCheckedInitialization.hashCode());
    DoubleCheckedInitialization doubleCheckedInitialization1 = DoubleCheckedInitialization.getInstance();
    System.out.println(doubleCheckedInitialization1.hashCode());

    //BillPugh
    BillPughInitialization billPughInitialization = BillPughInitialization.getInstance();
    System.out.println(billPughInitialization.hashCode());
    BillPughInitialization billPughInitialization1 = BillPughInitialization.getInstance();
    System.out.println(billPughInitialization1.hashCode());
  }
}
