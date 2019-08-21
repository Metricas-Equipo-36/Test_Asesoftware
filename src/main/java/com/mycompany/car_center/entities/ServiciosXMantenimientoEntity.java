package com.mycompany.car_center.entities;

import javax.persistence.*;

@Entity
@Table(name = "servicios_x_mantenimiento", schema = "carcenter", catalog = "")
public class ServiciosXMantenimientoEntity {
    private int codigo;
    private int tiempoEstimado;
    private ServiciosEntity serviciosByCodServicio;
    private MantenimientosEntity mantenimientosByCodMantenimiento;

    @Id
    @Column(name = "CODIGO")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "TIEMPO_ESTIMADO")
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiciosXMantenimientoEntity that = (ServiciosXMantenimientoEntity) o;

        if (codigo != that.codigo) return false;
        if (tiempoEstimado != that.tiempoEstimado) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + tiempoEstimado;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COD_SERVICIO", referencedColumnName = "CODIGO", nullable = false)
    public ServiciosEntity getServiciosByCodServicio() {
        return serviciosByCodServicio;
    }

    public void setServiciosByCodServicio(ServiciosEntity serviciosByCodServicio) {
        this.serviciosByCodServicio = serviciosByCodServicio;
    }

    @ManyToOne
    @JoinColumn(name = "COD_MANTENIMIENTO", referencedColumnName = "CODIGO", nullable = false)
    public MantenimientosEntity getMantenimientosByCodMantenimiento() {
        return mantenimientosByCodMantenimiento;
    }

    public void setMantenimientosByCodMantenimiento(MantenimientosEntity mantenimientosByCodMantenimiento) {
        this.mantenimientosByCodMantenimiento = mantenimientosByCodMantenimiento;
    }
}
