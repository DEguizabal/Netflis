package com.netflis.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.netflis.springboot.web.app.models.entity.Pelicula;

public interface IPeliculaDao extends CrudRepository<Pelicula, Long>{

}
