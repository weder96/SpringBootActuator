package com.wsousa.notification.request;

import com.wsousa.notification.domain.Mensagem;
import com.wsousa.notification.domain.Usuario;

import javax.validation.constraints.NotBlank;

public class MensagemRequest {

    @NotBlank
    private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public Mensagem converterParaUsuario(Usuario autor){
        return new Mensagem(autor, conteudo);
    }
}
