package main;

import model.Amount;

public interface Payable {
    boolean pay(Amount amount);
    
}
