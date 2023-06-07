package com.diego.helpdesk.domain;

import com.diego.helpdesk.domain.enums.Priority;
import com.diego.helpdesk.domain.enums.Status;

import java.time.LocalDate;
import java.util.Objects;

public class Service {

    private Integer id;
    private LocalDate opening = LocalDate.now();
    private LocalDate closed;
    private Priority priority;
    private Status status;
    private  String tittle;
    private  String observations;
    private Technician  technician;

    private Client  client;

    public Service() {
        super();
    }

    public Service(Integer id, Priority priority, Status status, String tittle, String observations, Technician technician, Client client) {
        super();
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.tittle = tittle;
        this.observations = observations;
        this.technician = technician;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getOpening() {
        return opening;
    }

    public void setOpening(LocalDate opening) {
        this.opening = opening;
    }

    public LocalDate getClosed() {
        return closed;
    }

    public void setClosed(LocalDate closed) {
        this.closed = closed;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return id.equals(service.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
