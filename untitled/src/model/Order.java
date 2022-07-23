package model;

public class Order {
    private long orderId;
    private long orderCounter = 1;
    private User user;
    private Product product;

    public Order(User user, Product product) {
        this.orderId = orderCounter;
        this.user = user;
        this.product = product;
        orderCounter++;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
