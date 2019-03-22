package com.company;

public class Account {
    protected Double availableFunds;
    protected final String opepingDate;
    protected final Integer IBAN;
    protected String ownerFullName;

    public Account(Double availableFunds, String opepingDate, Integer IBAN, String ownerFullName) {
        this.availableFunds = availableFunds;
        this.opepingDate = opepingDate;
        this.IBAN = IBAN;
        this.ownerFullName = ownerFullName;
    }

}