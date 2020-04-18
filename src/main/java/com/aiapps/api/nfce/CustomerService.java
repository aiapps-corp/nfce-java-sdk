package com.aiapps.api.nfce;

import java.net.http.HttpClient;

public class CustomerService {
    private final HttpClient httpClient;

    /**
     * Constructor
     *
     * @param httpClient Http Client
     * @param credential Credential
     */
    public CustomerService(HttpClient httpClient, Credential credential) {
        this.httpClient = httpClient;
    }

    
}