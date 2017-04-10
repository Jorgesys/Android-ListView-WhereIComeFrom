package com.jorgesys.listviewwhereicomefrom;

/**
 * Created by jorgesys on 06/04/2017.
 */

public class myObjeto {

    private String texto_id;
    private String texto;
    private String descripcion;


    public myObjeto(String texto_id, String texto, String descripcion) {

        this.texto_id = texto_id;
        this.texto = texto;
        this.descripcion = descripcion;
    }


    public String getTexto_id() {
        return texto_id;
    }

    public void setTexto_id(String texto_id) {
        this.texto_id = texto_id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
