/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car_center.eventos;

/**
 *
 * @author aswtest
 */
public class EventosgestionDisponibilidad {
    
    public final String MECANICOS_LIBRES = "MECANICOS_LIBRES";
    public final String LISTAR_MECANICOS = "LISTAR_MECANICOS";
    public final String PRIORIDAD_MECANICOS = "PRIORIDAD_MECANICOS";
    private String accion;
    private Object objecto;
    private String tipoEvento;

    public EventosgestionDisponibilidad() {

    }

    public EventosgestionDisponibilidad(Object obj, String accion) {
        
        this.accion = accion;
        this.objecto = obj;
        
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

}
