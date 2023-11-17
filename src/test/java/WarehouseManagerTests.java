import org.junit.Assert;
import org.junit.Test;
import org.example.data_object.Product;
import org.example.data_object.Warehouse;
import org.example.WarehouseManager;

public class WarehouseManagerTests {
    @Test
    public void testAddNewWarehouse(){
        var warehouseManager = new WarehouseManager();
        var warehouse = new Warehouse(1, "Kista");

        warehouseManager.addNewObject(warehouse);

        Assert.assertEquals(1,warehouseManager.getAllObjects().size());
    }

    @Test
    public void testAddProductToWarehouse(){
        var warehouseManager = new WarehouseManager();
        var warehouse = new Warehouse(1, "Kista");
        var product = new Product(1, "iphone", 10, "An exlusive phone");

        warehouseManager.addNewObject(warehouse);
        warehouseManager.addProductToWarehouse(1, product);

        warehouse = warehouseManager.getObjetById(1);

        Assert.assertEquals(1, warehouse.getAllProducts().size());
    }

    @Test
    public void testAddWarehouseNoId(){
        var warehouseManager = new WarehouseManager();
        var warehouse1 = new Warehouse("Sergels torg");
        var warehouse2 = new Warehouse("Falun");

        warehouseManager.addNewObject(warehouse1);
        warehouseManager.addNewObject(warehouse2);

        Assert.assertEquals(1,warehouse1.getId());
        Assert.assertEquals(2,warehouse2.getId());

    }

    @Test
    public void testAddWarehousesIdAndNoId(){
        var warehouseManager = new WarehouseManager();
        var warehouse1 = new Warehouse(200,"Sergels torg");
        var warehouse2 = new Warehouse("Falun");

        warehouseManager.addNewObject(warehouse1);
        warehouseManager.addNewObject(warehouse2);

        Assert.assertEquals(200,warehouse1.getId());
        Assert.assertEquals(201,warehouse2.getId());

    }
}
