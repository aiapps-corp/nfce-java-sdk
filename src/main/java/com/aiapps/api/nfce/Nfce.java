package com.aiapps.api.nfce;

import java.util.Date;

public class Nfce {
    private String number;
    private String serie;
    public Date dateAndTime;
    private Customer customer;
    private Item[] itens;
    private String reference;

    public Item[] getItens() {
        return itens;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCliente() {
        return customer;
    }

    public void setCliente(final Customer customer) {
        this.customer = customer;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(final String serie) {
        this.serie = serie;
    }

    public void setItens(final Item[] itens) {
        this.itens = itens;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(final String reference) {
        this.reference = reference;
    }
}