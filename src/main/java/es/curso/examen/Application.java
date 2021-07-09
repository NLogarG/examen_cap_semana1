package es.curso.examen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.examen.logs.FicherosLog;
import es.curso.examen.modelo.Empleado;

public class Application {

	public static void main(String[] args) {
		ejemploGrabarEnElLog();
		
		pruebaConXML();
		pruebaConAnotaciones();
	}
		

	private static void ejemploGrabarEnElLog() {
		// Codigo de prueba para ver como se utiliza el metodo grabarLog de la clase FicherosLog	
		
		
		
		// Grabamos una linea en el fichero de Log:
		FicherosLog.grabarLog("####Añadimos el empleado####", "src/logs/mi_log.txt");
		FicherosLog.grabarLog("####Otra linea de log####", "src/logs/mi_log.txt");
		FicherosLog.grabarLog("####Una tercera linea de log####", "src/logs/mi_log.txt");
	}



	private static void pruebaConAnotaciones() {
		
		
	}

	private static void pruebaConXML() {
		ApplicationContext contexto;
		contexto = new ClassPathXmlApplicationContext("contexto.xml");
		Empleado u1 = (Empleado) contexto.getBean("u1");
		
		
		System.out.println(u1);
		((ClassPathXmlApplicationContext)contexto).close();
		
		
	}

}
