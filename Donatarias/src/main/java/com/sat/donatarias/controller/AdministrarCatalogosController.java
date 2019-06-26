package com.sat.donatarias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sat.donatarias.model.AdministrarCatalogos;
import com.sat.donatarias.service.AdministrarCatalogosService;

@CrossOrigin
@RestController
@RequestMapping("/AdministrarCatalogos")

public class AdministrarCatalogosController {

	@Autowired
	AdministrarCatalogosService administrarCatalogosService;
	

	@GetMapping("/Solicitudes")
	public List<AdministrarCatalogos> consultaCatalogo(){
		return administrarCatalogosService.consultaCatalogo();
	}
	
	@GetMapping("/infoTransparencia")
	public List<AdministrarCatalogos> infoTransparenia(){
		return administrarCatalogosService.infoTransparencia();
	}
	
	@GetMapping("/sDonativos")
	public List<AdministrarCatalogos> sDonativos(){
		return administrarCatalogosService.sDonativos();
	}
	
	@GetMapping("/Transparencia")
	public List<AdministrarCatalogos> transparencia(){
		return administrarCatalogosService.transparencia();
	}
	
	@GetMapping("/Donatarias")
	public List<AdministrarCatalogos> donatarias(){
		return administrarCatalogosService.donatarias();
	}
	
	@GetMapping("/Actividades")
	public List<AdministrarCatalogos> actividades(){
		return administrarCatalogosService.actividades();
	}
}
