package com.mycompany.car_center.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mantenimientos", schema = "carcenter", catalog = "")
public class MantenimientosEntity {
    private int codigo;
    private Integer estado;
    private Date fecha;

    @Id
    @Column(name = "CODIGO")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "ESTADO")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "FECHA")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MantenimientosEntity that = (MantenimientosEntity) o;

        if (codigo != that.codigo) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        return result;
    }
}
