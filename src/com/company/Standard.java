package com.company;

public class Standard extends Account {


    public Standard(Double availableFunds, String opepingDate, Integer IBAN, Client client) {
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
