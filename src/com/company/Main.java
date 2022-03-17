package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        bankAccount.deposit(20000);
        while (true) {
            try {
                System.out.println("На вашем счету: " + bankAccount.getAmount());
                bankAccount.withDraw(scanner.nextInt());
            } catch (LimitException e) {
                bankAccount.withDraw((int) bankAccount.getAmount());
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
