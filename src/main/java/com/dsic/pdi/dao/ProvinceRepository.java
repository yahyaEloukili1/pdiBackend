package com.dsic.pdi.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.Province;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface ProvinceRepository extends JpaRepository<Province, Integer> {

	@RestResource(path= "/byProvince")
	public List<Province> findByProvinceContainsIgnoreCase(@Param("mc") String pr);
	
	@RestResource(path= "/byProvincePage")
	public Page<Province> findByProvinceContainsIgnoreCase(@Param("mc") String pr,Pageable peaPageable);
}
