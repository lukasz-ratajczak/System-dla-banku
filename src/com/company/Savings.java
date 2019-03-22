package com.company;

public class Savings extends Account {


    public Savings(Double availableFunds, String opepingDate, Integer IBAN, Client client) {
        super(availableFunds, opepingDate, IBAN, client);
    }






    public Double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(Double availableFunds) {
        this.availableFunds = availableFunds;
    }

    public String getOpepingDate() {
        return opepingDate;
    }

    public Integer getIBAN() {
        return IBAN;
    }






}
