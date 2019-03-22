package com.company;

public class Standard extends Account {


    public Standard(Double availableFunds, String opepingDate, Integer IBAN, String ownerFullName) {
        super(availableFunds, opepingDate, IBAN, ownerFullName);
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
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

    public String getOwnerFullName() {
        return ownerFullName;
    }
}
