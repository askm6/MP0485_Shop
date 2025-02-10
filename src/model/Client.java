package model;

import main.Payable;

public class Client extends Person implements Payable {

    private final static int MEMBER_ID = 456;
    private final static Amount BALANCE = new Amount(50.00);
    private int memberId;
    private Amount balance = BALANCE;

    public Client(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Amount getBalance() {
        return balance;
    }

    public void setBalance(Amount balance) {
        this.balance = balance;
    }

    @Override
    public boolean pay(Amount amount) {
        this.balance.setValue(this.balance.getValue() - amount.getValue());
        return (this.balance.getValue() < 0);
    }

    @Override
    public String toString() {
        return "Client{" + "memberId=" + memberId + ", balance=" + balance + '}';
    }

}
