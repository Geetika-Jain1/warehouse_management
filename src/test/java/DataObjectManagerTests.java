import org.example.DataObjectManager;
import org.example.DataObjectManager;
import org.example.data_object.Product;
import org.example.data_object.Warehouse;
import org.junit.Assert;
import org.junit.Test;


public class DataObjectManagerTests {

    @Test
    public class testAddNewObject() {
        Warehouse warehouse = new Warehouse("Kista");
        DataObjectManager<Warehouse> warehouseDataObjectnager = new DataObjectManager<>();

        warehouseDataObjectnager.addNewObject(warehouse);

        Assert.assertEquals(1,warehouseDataObjectManager.getAllObjects().size());

    }
    @Test
    public void testAddObjectsWithIdNoId(){
        DataObjectManager<Product> productDataObjectManager = new DataObjectManager<>();
        Product product1 = new Product(200, "iphone", 100, "An exclusive phone");
        Product product2 = new Product("usb-c charger", 1000, "Change your phone and /or computer");

        productDataObjectManager.addNewObject(product1);
        productDataObjectManager.addNewObject(product2);

        Assert.assertEquals(201, product2.getId());

    }
    @Test
    public void testGetObjectById(){
        DataObjectManager<Product> productDataObjectManager = new DataObjectManager<>();
        Product product1 = new Product(200, "iphone", 100, "An exclusive phone");
        Product product2 = new Product("usb-c charger", 1000, "Change your phone and /or computer");

        productDataObjectManager.addNewObject(product1);
        productDataObjectManager.addNewObject(product2);

        Assert.assertEquals( "iphone",productDataObjectManager.getObjetById(200).getProductname());
        Assert.assertEquals( "usb-c charger",productDataObjectManager.getObjetById(201).getProductname());
    }
}

