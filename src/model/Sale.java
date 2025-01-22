package model;

import java.util.Arrays;

public class Sale {

    String client;
    Product[] products;
    Amount amount;

    public Sale(String client, Product[] products, double amount) {
        super();
        this.client = client;
        this.products = products;
        this.amount = new Amount(amount);
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Sale [client=" + client + ", products=" + Arrays.toString(products) + ", amount=" + amount + "]";
    }

}
