package com.mycompany.car_center.services;

import com.mycompany.car_center.dto.MecanicoDto;
import com.mycompany.car_center.entities.MecanicosEntity;
import com.mycompany.car_center.repositories.MecanicosRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class MecanicosServiceTest {

    @Mock
    private MecanicosRepository repository;

    private MecanicosService mecanicosService;

    @Before
    public void init(){ this.mecanicosService = new MecanicosService(repository); }

    @Test
    public void saveMecanicoOk() {
        MecanicoDto mecanicoDto = mock(MecanicoDto.class);
        MecanicosEntity mecanicosEntity = mock(MecanicosEntity.class);
        when(repository.save(any())).thenReturn(mecanicosEntity);
        MecanicosEntity mecanicosEntityResponse = this.mecanicosService.saveMecanico(mecanicoDto);
        Assert.assertEquals(mecanicosEntity.getDocumento(),mecanicosEntityResponse.getDocumento());
    }

    @Test(expected = NullPointerException.class)
    public void saveMecanicoError() {
        this.mecanicosService.saveMecanico(null);
    }

    @Test
    public void getAllMecanicosOk() {
        MecanicosEntity mecanicosEntity = mock(MecanicosEntity.class);
        List<MecanicosEntity> list = new ArrayList<>();
        list.add(mecanicosEntity);
        when(repository.findAll()).thenReturn(list);
        List<MecanicosEntity> listResponse = this.mecanicosService.getAllMecanicos();
        Assert.assertEquals(1,listResponse.size());
    }

}
