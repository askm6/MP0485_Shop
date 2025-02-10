package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Sale {

    Client client;
    ArrayList<Product> products;
    Amount amount;

    public Sale(int client, ArrayList<Product>  products, double amount) {
        super();
        this.client = new Client(client);
        this.products = products;
        this.amount = new Amount(amount);
    }

    public int getClient() {
        return client.getMemberId();
    }

    public void setClient(int client) {
        this.client.setMemberId(client);
    }

    public ArrayList<Product>  getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product>  products) {
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
        return "Sale{" + "client=" + client + ", products=" + products + ", amount=" + amount + '}';
    }
    
}
