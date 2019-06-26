package com.sat.donatarias.dao;

import java.util.List;

import com.sat.donatarias.model.AdministradorFirma;

public interface AdministradorFirmaDao {

	/** Metodo que obtiene la lista del catalogo de dministrador firma
	 *  @return List<AdministradorFirma> catalogo de dministrador firma
	 *  @author Julio Cesar Solorio
	 *  @since 06/2019 
	 * */
	List<AdministradorFirma> obtenListaAdministradorFirma();

}