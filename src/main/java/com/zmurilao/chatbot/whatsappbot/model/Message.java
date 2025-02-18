package com.zmurilao.chatbot.whatsappbot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Message {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private  String  remetente;
    private String destinatario;
    private LocalDateTime dataEnvio;

    public Message(Integer id, String remetente, String destinatario, LocalDateTime dataEnvio) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.dataEnvio = dataEnvio;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
}
