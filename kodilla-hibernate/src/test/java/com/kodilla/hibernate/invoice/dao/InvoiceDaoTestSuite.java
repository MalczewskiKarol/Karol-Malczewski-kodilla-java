//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//    @Autowired
//    InvoiceDao invoiceDao;
//
//
//    @Test
//    public void testInvoiceDaoSave() {
//        //Given
//        Product product = new Product("Car");
//        Product product1 = new Product("Motorbike");
//        Item item = new Item(new BigDecimal(5000), 1, new BigDecimal(5000));
//        Item item1 = new Item(new BigDecimal(3000), 2, new BigDecimal(1000));
//        Invoice invoice = new Invoice("17/09/28/355");
//
//        item.setProduct(product);
//        item1.setProduct(product1);
//        invoice.getItems().add(item);
//        invoice.getItems().add(item1);
//
//        //When
//        invoiceDao.save(invoice);
//
//        //Then
//        int id = invoice.getId();
//        Invoice readInvoice = invoiceDao.findOne(id);
//        Assert.assertEquals(id, readInvoice.getId());
//
//        //CleanUp
//        invoiceDao.delete(id);
//    }
//}
