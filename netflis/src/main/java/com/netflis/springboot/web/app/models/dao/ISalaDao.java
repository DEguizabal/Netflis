package com.netflis.springboot.web.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.netflis.springboot.web.app.models.entity.Sala;

public interface ISalaDao extends CrudRepository<Sala,Long>{
	

}
