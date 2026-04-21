package Principles.OpenClosedPrinciple;

public class Demo {
    public static void main(String[] args){
        DatabaseInvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao();
        FileInvoiceDao fileInvoiceDao = new FileInvoiceDao();
        databaseInvoiceDao.save();
        fileInvoiceDao.save();
    }
}
