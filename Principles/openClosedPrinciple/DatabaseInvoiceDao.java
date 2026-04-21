package Principles.OpenClosedPrinciple;

import Principles.SingleResponsibilitiesPrinciple.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{
    private Invoice invoice;

    public void save(){
        System.out.println("Saving to database...");
    }
}

