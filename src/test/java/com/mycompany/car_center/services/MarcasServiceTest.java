package com.mycompany.car_center.services;

import com.mycompany.car_center.entities.MarcasEntity;
import com.mycompany.car_center.repositories.MarcaRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class MarcasServiceTest {

    @Mock
    private MarcaRepository repository;

    private MarcasService marcasService;

    @Before
    public void init(){ this.marcasService = new MarcasService(repository); }

    @Test
    public void getAllMarcasOk() {
        MarcasEntity marcasEntity = mock(MarcasEntity.class);
        List<MarcasEntity> list = new ArrayList<>();
        list.add(marcasEntity);
        when(repository.findAll()).thenReturn(list);
        List<MarcasEntity> listResponse = this.marcasService.getAllMarcas();
        Assert.assertEquals(1,listResponse.size());
    }

    @Test
    public void getMarcaByIdOk() {
        MarcasEntity marcasEntity = mock(MarcasEntity.class);
        when(repository.findById(anyInt())).thenReturn(Optional.of(marcasEntity));
        Optional<MarcasEntity> marca = this.marcasService.getMarcaById(1);
        Assert.assertEquals(marcasEntity.getCodigo(),marca.get().getCodigo());
    }
}
