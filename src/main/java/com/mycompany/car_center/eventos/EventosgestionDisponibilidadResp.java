package com.mycompany.car_center.eventos;

public class EventosgestionDisponibilidadResp {

    public static final String BUSCAR_MECANICOS = "BUSCAR_MECANICOS";
    private String accion;
    private Object objecto;
    private String tipoEvento;

    public EventosgestionDisponibilidadResp() {

    }

    public EventosgestionDisponibilidadResp(Object obj, String accion) {

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
