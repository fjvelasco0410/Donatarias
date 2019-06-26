package com.sat.donatarias.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.donatarias.dao.AdministrarCatalogosDao;
import com.sat.donatarias.model.AdministrarCatalogos;
import com.sat.donatarias.service.AdministrarCatalogosService;


@Service
public class AdministrarCatalogosServiceImpl implements AdministrarCatalogosService {
	
	@Autowired
	AdministrarCatalogosDao administrarCatalogosDao;
	

	@Override
	public List<AdministrarCatalogos> consultaCatalogo() {
		
		return administrarCatalogosDao.consultaCatalogo();
	}
	
	@Override
	public List<AdministrarCatalogos> infoTransparencia() {
		
		return administrarCatalogosDao.infoTransparencia();
	}
	
	@Override
	public List<AdministrarCatalogos> sDonativos() {
		
		return administrarCatalogosDao.sDonativos();
	}
	
	@Override
	public List<AdministrarCatalogos> transparencia() {
		
		return administrarCatalogosDao.transparencia();
	}
	
	@Override
	public List<AdministrarCatalogos> donatarias() {
		
		return administrarCatalogosDao.donatarias();
	}
	
	@Override
	public List<AdministrarCatalogos> actividades() {
		
		return administrarCatalogosDao.actividades();
	}
	
	
	
	
	
	
	
	
	
	

}
