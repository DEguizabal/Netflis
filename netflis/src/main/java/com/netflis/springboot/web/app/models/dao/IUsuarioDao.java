package com.netflis.springboot.web.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.netflis.springboot.web.app.models.entity.Usuario;

public interface IUsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
	
}
