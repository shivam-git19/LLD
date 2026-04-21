package Principles.OpenClosedPrinciple;

import Principles.SingleResponsibilitiesPrinciple.Invoice;

public class FileInvoiceDao implements InvoiceDao{
    private Invoice invoice;

    public void save(){
        System.out.println("Saving to file...");
    }
}
