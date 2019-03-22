package com.company;

public class Standard {
    private Double availableFunds;
    private final String opepingDate;
    private final Integer IBAN;
    private String ownerFullName;


    public Standard(Double availableFunds, String opepingDate, Integer IBAN, String ownerFullName) {
        this.availableFunds = availableFunds;
        this.opepingDate = opepingDate;
        this.IBAN = IBAN;
        this.ownerFullName = ownerFullName;
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
