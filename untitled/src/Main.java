import exception.OrderException;
import model.Product;
import service.UserService;
import service.impl.UserServiceImpl;
import storage.Storage;
import storage.StorageGenerator;

public class Main {
    public static void main(String[] args) throws OrderException {
        Storage storage = new Storage();
        StorageGenerator storageGenerator = new StorageGenerator();
        storage.setUsers(storageGenerator.generateUsers());
        storage.setProducts(storageGenerator.generateProducts());

        UserServiceImpl userService = new UserServiceImpl();
        userService.buy(storage.getUsers().get(0).getId(), storage.getProducts().get(2), storage);
        userService.displayAll();
        System.out.println(storage.getOrders());
        // test exception
        userService.buy(storage.getUsers().get(0).getId(), storage.getProducts().get(0), storage);
    }
}
