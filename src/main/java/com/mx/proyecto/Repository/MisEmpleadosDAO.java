package com.mx.proyecto.Repository;

import java.util.List;
import com.mx.proyecto.Entity.MisEmpleados;

public interface MisEmpleadosDAO extends DAO<MisEmpleados, Integer> {

	Integer obtenerValorSecuencia();
	List<MisEmpleados> obtieneEmpleados();

}