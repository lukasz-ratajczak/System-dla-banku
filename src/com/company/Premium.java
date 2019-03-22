package com.company;

public class Premium extends Account {


    public Premium(Double availableFunds, String opepingDate, Integer IBAN, Client client) {
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
