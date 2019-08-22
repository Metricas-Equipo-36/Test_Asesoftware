package com.mycompany.car_center.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mantenimientos", schema = "carcenter", catalog = "")
@NamedQuery(name = MantenimientosEntity.FIND_ALL_CUSTOM,
        query = "SELECT m2.*, sum(sxm.tiempoEstimado) as time FROM MantenimientosEntity AS m\n" +
                "INNER JOIN ServiciosXMantenimientoEntity sxm on m.codigo = sxm.mantenimientosByCodMantenimiento\n" +
                "INNER JOIN MecanicosEntity m2 on m.mecanivosByTipoDocumento = m2.tipoDocumento and m.mecanivosByDocumento = m2.documento\n" +
                "WHERE m2.estado = 'D' and m.estado = 1\n" +
                "group by m2.documento\n" +
                "order by time asc\n" +
                "limit 10;")
public class MantenimientosEntity {
    public static final String FIND_ALL_CUSTOM = "MantenimientosEntity.findAllCustom";
    private int codigo;
    private Integer estado;
    private Date fecha;
    private MecanicosEntity mecanivosByTipoDocumento;
    private MecanicosEntity mecanivosByDocumento;

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

    @ManyToOne
    @JoinColumn(name = "MEC_TIPO_DOCUMENTO", referencedColumnName = "TIPO_DOCUMENTO", nullable = false)
    public MecanicosEntity getMecanicosByTipoDocumento() {
        return mecanivosByTipoDocumento;
    }

    public void setMecanicosByTipoDocumento(MecanicosEntity mecanivosByTipoDocumento) {
        this.mecanivosByTipoDocumento = mecanivosByTipoDocumento;
    }

    @ManyToOne
    @JoinColumn(name = "MEC_DOCUMENTO", referencedColumnName = "DOCUMENTO", nullable = false)
    public MecanicosEntity getMecanicosByDocumento() {
        return mecanivosByDocumento;
    }

    public void setMecanicosByDocumento(MecanicosEntity mecanivosByDocumento) {
        this.mecanivosByDocumento = mecanivosByDocumento;
    }

}
