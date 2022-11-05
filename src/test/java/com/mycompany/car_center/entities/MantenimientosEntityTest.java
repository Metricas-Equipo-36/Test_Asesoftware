package com.mycompany.car_center.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MantenimientosEntityTest {

    private MantenimientosEntity mantenimientosEntity;

    @Before
    public void init() {this.mantenimientosEntity = new MantenimientosEntity();}

    @Test
    public void whenFindByNameTest() {
        MantenimientosEntity mantenimientosEntity = new MantenimientosEntity();
        mantenimientosEntity.setCodigo(1);
        Assert.assertEquals(1, mantenimientosEntity.getCodigo());
    }

    @Test
    public void testGetAndSetCodigo() {
        this.mantenimientosEntity.setCodigo(2);
        Assert.assertEquals(2,this.mantenimientosEntity.getCodigo());
    }
}
