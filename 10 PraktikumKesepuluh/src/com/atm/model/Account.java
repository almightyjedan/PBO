package com.atm.model;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;
    public static final int MINIMUM_BALANCE = 50000;


    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public void changePin(String oldPin, String newPin1, String newPin2) {
        if (!this.pin.equals(oldPin)) {
            System.out.println("PIN lama tidak benar.");
            return;
        }

        if (!newPin1.equals(newPin2)) {
            System.out.println("PIN baru tidak cocok.");
            return;
        }

        this.pin = newPin1;
        System.out.println("PIN telah berhasil diubah.");
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }
}
