package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(int sum){
        amount = getAmount() + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum){
            throw new LimitException("Вы запрашиваете сумму [" + sum + "] которая больше чем на счету " +
                    "\nно вы сняли все что было: ", + getAmount());
        } else if(amount <= 0){
            amount = 0;
            throw new LimitException("На счете нет денег ", + getAmount());
        } else {
            amount = getAmount() - sum;
        }
    }
}
