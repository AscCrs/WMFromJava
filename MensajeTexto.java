package com.herencia03;

import com.twilio.Twilio; 
import com.twilio.rest.api.v2010.account.Message; 

public class MensajeTexto extends Mensaje{
    private String texto;
    public static final String ACCOUNT_SID = "AC678db78944d9e898fd7e4f9db343b3f0"; 
    public static final String AUTH_TOKEN = "a4929a6f1cfc0849507ac6393cb2dcd8"; 

    MensajeTexto() { }

    public MensajeTexto(String destinatario, String numeroTelefono, String texto) {
        super(destinatario, numeroTelefono);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void enviarMensaje() {
        // Aqui va el codigo para enviar el mensaje
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("whatsapp:+521" + numeroTelefono), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),  
                texto)      
            .create(); 
 
        System.out.println(message.getSid()); 

        try {
            Thread.sleep(2000);

            System.out.println("\033[H\033[2J");
            System.out.println("Mensaje enviado exitosamente!");
        } catch (Exception e) {  }
    }
}
