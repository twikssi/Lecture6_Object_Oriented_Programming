package by.andrey.twikss.exe5creditcard.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard {
    private Logger logger = LoggerFactory.getLogger(CreditCard.class);
    private long numberCard;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double indebtedness;

    public CreditCard(long numberCard, int pinCode) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
        this.balance = 0;
        this.indebtedness = 0;
        this.creditLimit = 0;
    }

    public void withdraw(double moneyWant, int pinCode){
        if (this.pinCode == pinCode){
            double actualBallance;
            actualBallance = this.balance - moneyWant;
            if (actualBallance < 0){
                actualBallance = Math.abs(actualBallance);
                if ((float) actualBallance <= (float)(this.creditLimit - this.indebtedness)){
                    this.indebtedness = this.indebtedness + actualBallance;
                    this.balance = 0;
                } else {
                    logger.info("Credit limit has max.");
                }
            } else{
                this.balance = actualBallance;
            }
        } else {
            logger.info("pincode is wrong. Retry effort.");
        }

    }

    public void deposit(double money, int pinCode){
        if (this.pinCode == pinCode) {
            if (this.indebtedness > 0){
                this.indebtedness = money - this.indebtedness;
                if (this.indebtedness < 0){
                    this.indebtedness = Math.abs(this.indebtedness);
                } else {
                    this.balance = this.indebtedness;
                    this.indebtedness = 0;
                }
            } else{
                this.balance += money;
            }
        } else {
            logger.info("pincode is wrong. Retry effort.");
        }
    }


    public long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(long numberCard) {
        this.numberCard = numberCard;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getIndebtedness() {
        return indebtedness;
    }

    public void setIndebtedness(double indebtedness) {
        this.indebtedness = indebtedness;
    }
}
