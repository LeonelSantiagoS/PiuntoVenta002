package com.mx.proyecto.Services;

import com.mx.proyecto.Dto.MisEmpleadosDTO;
import com.mx.proyecto.Dto.ResponseDto;

public interface MisEmpleadosService {

	ResponseDto insertEmpleado(MisEmpleadosDTO nuevoEmpleado);
	ResponseDto getMisEmpleados();
	

}