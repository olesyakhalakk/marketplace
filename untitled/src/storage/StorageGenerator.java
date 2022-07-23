package storage;

import model.Product;
import model.User;

import java.util.Arrays;
import java.util.List;

public class StorageGenerator {
    public List<User> generateUsers() {
        User user1 = new User("Marko", "Parker", 1000);
        User user2 = new User("Anton", "Shewchenko", 15000);
        User user3 = new User("Alisa", "Makarenko", 2000);
        return Arrays.asList(user1, user2, user3);
    }

    public List<Product> generateProducts() {
        Product item1 = new Product("Phone", 5000);
        Product item2 = new Product("Headphone", 1000);
        Product item3 = new Product("Watch", 500);
        return Arrays.asList(item1, item2, item3);
    }
}
