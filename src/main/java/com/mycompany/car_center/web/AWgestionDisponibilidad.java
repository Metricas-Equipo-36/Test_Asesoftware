/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car_center.web;
import java.util.List;
import javax.websocket.Session;
import javax.servlet.http.HttpServletRequest;
import com.mycompany.car_center.eventos.EventosgestionDisponibilidad;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aswtest
 */
public class AWgestionDisponibilidad {
    
    public final String BUSCAR_MECANICOS = "BUSCAR_MECANICOS";
    
    public EventosgestionDisponibilidad perform(HttpServletRequest request) {
        accion = request.getParameter(WebKeys.ACCION);
        if ((accion == null) || (accion.trim().length() == 0)) {
            throw new AccionInvalidaException("Debe indicar una accion valida");
        }
        if (accion.equals(BUSCAR_MECANICOS)) {
            return buscarMecanicos(request);
        } else {
            throw new AccionInvalidaException("La accion " + accion
                    + " no es valida.");
        }
    }
    
    public void doEnd(HttpServletRequest request,EventosgestionDisponibilidad eventoRespuesta) {
        EventosgestionDisponibilidad respuesta = new EventosgestionDisponibilidad();
        HttpSession session = request.getSession();

            if (respuesta != null) {
                if (respuesta.getTipoEvento().equals(EvnRespPago.PROCESAMIENTO_PAGO)) {
                    request.getSession().removeAttribute(AWCertificadoMasivo.NOTA_INF_CERTIFICADOS_MASIVOS);
                }
            }
        }
        
    private List buscarMecanicos(HttpServletRequest request) {

            double valorConvenio = 0.0d;

            try {
                valorConvenio = Double.parseDouble(request.getParameter(AWgestionDisponibilidad.BUSCAR_MECANICOS));

                if (valorConvenio < 0) {
                    vpe.addError("El valor no puede ser negativo.");
            }
            } catch (NumberFormatException e) {
                vpe.addError("El valor en convenio no es v�lido.");
            }            
            if(request.getSession().getAttribute(WebKeys.NOMBRE_MECANICO) != null){
                vpe.addError("debe ingresar un nombre.");
            }
            if(request.getSession().getAttribute(WebKeys.TIPO_DOCUMENTO_MECANICO) != null){
                vpe.addError("debe ingresar un nombre.");
            }
            if(request.getSession().getAttribute(WebKeys.DOCUMENTO) != null){
                vpe.addError("debe ingresar un nombre.");
            }
            if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }
                        if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }
                                    if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }
                                                if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }
                                                            if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }
                                                                        if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }
                                                                                    if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }
                                                                                                if(request.getSession().getAttribute(WebKeys.PRIMER_NOMBRE) != null){
                vpe.addError("debe ingresar un nombre.");
            }

            if (vpe.getErrores().size() > 0) {
                throw vpe;
            }

            return aplicacionConvenio;
    }
    
}
