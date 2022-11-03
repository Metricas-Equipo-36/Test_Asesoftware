package com.mycompany.car_center.entities;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MantenimientosEntityTest {

    @Test
    public void whenFindByNameTest() {
        MantenimientosEntity mantenimientosEntity = new MantenimientosEntity();
        mantenimientosEntity.setCodigo(1);
        Assert.assertEquals(1, mantenimientosEntity.getCodigo());
    }
}
