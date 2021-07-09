package es.curso.examen;

import es.curso.examen.modelo.Empleado;
import es.curso.examen.logs.FicherosLog;

public class interceptar_info {
	
	private Empleado empleado;
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	private void crear(Empleado e) {
		FicherosLog.grabarLog("Hemos creado al empleado: " + e, "src/logs/mi_log.txt");
	}
	
	private void eliminar(int codigo) {
		FicherosLog.grabarLog("Hemos eliminado al empleado con el codigo: " + codigo, "src/logs/mi_log.txt");
	}
	private void actualizar(Empleado e) {
		FicherosLog.grabarLog("Hemos actualizado al empleado" + e, "src/logs/mi_log.txt");
	}
}
