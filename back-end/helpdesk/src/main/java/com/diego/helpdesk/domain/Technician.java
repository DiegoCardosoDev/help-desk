package com.diego.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Technician extends People{

    private List<Service> services = new ArrayList<>();



    public  Technician(){
        super();
    }
    public Technician(Integer id, String name, String email, String password, String cpf, List<Service> services) {
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
