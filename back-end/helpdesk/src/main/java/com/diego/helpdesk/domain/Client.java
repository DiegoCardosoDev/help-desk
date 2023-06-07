package com.diego.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Client extends People{

    private List<Service> services = new ArrayList<>();



    public Client(){
        super();
    }
    public Client(Integer id, String name, String email, String password, String cpf, List<Service> services) {
        super(id, name, email, password, cpf);
        this.services = services;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
