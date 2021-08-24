package module15.account.entities;

import module15.account.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = 0d;
        this.withDrawLimit = withDrawLimit;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }
    public void withDraw(Double amount) throws DomainException{
        if (this.balance == 0 || this.balance < amount || this.withDrawLimit < amount) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit!");
        }
        this.balance -= amount;
    }
}
