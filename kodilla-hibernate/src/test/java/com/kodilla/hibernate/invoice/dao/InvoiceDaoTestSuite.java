package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Test Product Name");

        Item item1 = new Item(product, new BigDecimal(1.11), 3, new BigDecimal(3.33));
        Item item2 = new Item(product, new BigDecimal(2.22), 2, new BigDecimal(4.44));
        item1.setProduct(product);
        item2.setProduct(product);
        Invoice invoice = new Invoice("001/2018");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        productDao.save(product);
        int productId = product.getId();

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Invoice invoiceFromDb = invoiceDao.findOne(invoiceId);
        Assert.assertThat(invoiceFromDb.getItems().size(), Matchers.is(2));

        //CleanUp
        invoiceDao.delete(invoiceId);
        productDao.delete(productId);
    }
}
