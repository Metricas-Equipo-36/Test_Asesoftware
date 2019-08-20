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
import com.mycompany.car_center.eventos.EventosgestionDisponibilidadResp;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aswtest
 */
public class AWgestionDisponibilidad {
    
    public static final String BUSCAR_MECANICOS = "BUSCAR_MECANICOS";
    private String accion;
    
        public EventosgestionDisponibilidad perform(HttpServletRequest request) throws Exception {

            accion = request.getParameter(WebKeys.ACCION);
            if ((accion == null) || (accion.trim().length() == 0)) {
                throw new Exception("Debe indicar una accion valida");
            }

            if (accion.equals(BUSCAR_MECANICOS)) {
                buscarMecanicos(request);
            } else {
                throw new Exception("La accion " + accion  + " no es valida.");
            }
            return null;
        }
    
        public void doEnd(HttpServletRequest request,EventosgestionDisponibilidad eventoRespuesta) {
            EventosgestionDisponibilidad respuesta = new EventosgestionDisponibilidad();
            HttpSession session = request.getSession();

                if (respuesta != null) {
                    if (respuesta.getTipoEvento().equals(EventosgestionDisponibilidadResp.BUSCAR_MECANICOS)) {

                    }
                }
            }
        
    private List buscarMecanicos(HttpServletRequest request)throws Exception {

            double valorConvenio = 0.0d;

            try {
                valorConvenio = Double.parseDouble(request.getParameter(AWgestionDisponibilidad.BUSCAR_MECANICOS));

                if (valorConvenio < 0) {
                    throw new Exception("El valor no puede ser negativo.");
                }

            } catch (NumberFormatException e) {
                throw new Exception("El valor en convenio no es v�lido.");
            }

            return null;
    }
    
}
