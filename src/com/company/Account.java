package com.company;

public class Account {
    protected Double availableFunds;
    protected final String opepingDate;
    protected final Integer IBAN;
    protected Client client;

    public Account(Double availableFunds, String opepingDate, Integer IBAN, Client client) {
        this.availableFunds = availableFunds;
        this.opepingDate = opepingDate;
        this.IBAN = IBAN;
        this.client = client;
    }



}