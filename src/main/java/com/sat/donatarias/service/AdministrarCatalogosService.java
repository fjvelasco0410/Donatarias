package com.sat.donatarias.service;

import java.util.List;

import com.sat.donatarias.model.AdministrarCatalogos;


public interface AdministrarCatalogosService {
	

	public List<AdministrarCatalogos> consultaCatalogo();
	public List<AdministrarCatalogos> infoTransparencia();
	public List<AdministrarCatalogos> sDonativos();
	public List<AdministrarCatalogos> transparencia();
	public List<AdministrarCatalogos> donatarias();

	public List<AdministrarCatalogos> actividades();
	

}
