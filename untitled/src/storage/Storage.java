package storage;

import model.Order;
import model.Product;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<User> users = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();

    public Storage() {
    }

    public static List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
