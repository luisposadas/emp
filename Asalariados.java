
/**
 * esta clase reprecenta un emplado asalariado
 * @author Luis Posadas
 * @version 1.0(15-sep-17)
 
 */

public class Asalariados extends Empleado
{
    // instance variables - replace the example below with your own
    private float salarioSemanal;
    private float sueldo;

    /**
     * Constructor for objects of class Asalariados
     */
    
    public Asalariados(String nombreIni,float salarioSemanalUsr )
    {
        super(nombreIni);
        sueldo = 0;
        salarioSemanal = salarioSemanalUsr;
    }
    /**
     * Clase para calcular Ingresos
     */
    public void calcularIngresos()
    {
        sueldo = salarioSemanal;
    }
    /**
     * este metodo imprime en pantalla los datos de un asalariado
     */
    
    
       
     public void imprimirDatos()
    {
          System.out.println("El nombre es:" + super.nombre());
          System.out.println("El sueldo es:" + sueldo);
          System.out.println("El sueldo es:" + salarioSemanal);
          
   
          
    }
  
    
}
