package com.herencia03;

public class Mensaje {
    protected String destinatario;
    protected String numeroTelefono;

    Mensaje() { }

    public Mensaje(String destinatario, String numeroTelefono) { 
        this.destinatario = destinatario;
        this.numeroTelefono = numeroTelefono;
    }

    public String getDestinatario() { return destinatario; }

    public String getNumeroTelefono() { return numeroTelefono; }

    public void setNumeroTelefono(String numeroTelefono) { this.numeroTelefono = numeroTelefono; }

    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }
}
