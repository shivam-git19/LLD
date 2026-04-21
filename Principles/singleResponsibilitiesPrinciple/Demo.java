package Principles.singleResponsibilitiesPrinciple;

public class Demo{
    public static void main(String[] args){
        Marker marker = new Marker("name","color",20, 2026);
        Invoice invoice = new Invoice();
        InvoiceDao invoiceDao =new InvoiceDao(invoice);
        InvoicePrint invoicePrint = new InvoicePrint(invoice);

        invoice.CalculateTotal(marker);
        invoiceDao.saveToDB();
        invoicePrint.printInvoice();
    }
}
