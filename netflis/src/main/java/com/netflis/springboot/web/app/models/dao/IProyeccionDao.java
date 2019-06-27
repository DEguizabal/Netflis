package com.netflis.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.netflis.springboot.web.app.models.entity.Proyeccion;
import com.netflis.springboot.web.app.models.entity.Usuario;

public interface IProyeccionDao extends CrudRepository<Proyeccion, Long> {

}
