package com.aiapps.api.nfce;

import java.net.http.HttpClient;

public class NfceService {

    public String Route = "api/nfce";
    public String RouteCancel = "api/nfce/cancelar";
    public String RouteDanfe = "api/nfce/baixardanfe";

    private final HttpClient httpClient;

    /**
     * Constructor
     *
     * @param httpClient Http Client
     * @param credential Credential
     */
    public NfceService(HttpClient httpClient, Credential credential) {
        this.httpClient = httpClient;
    }

    public void send(Nfce nfce) {
        
    }
    
}