
/**
 * esta clase reprecenta un emplado por hora
 * @author Luis Posadas
 * @version 1.0(15-sep-17)
 
 */

public class PorHora extends Empleado
{
    // instance variables - replace the example below with your own
    private float sueldoXhr;
    private float noHrs;
    private float sueldo;

    /**
     * Constructor for objects of porhora
     */
    
    public PorHora(String nombreIni,float sueldoXhrUsr, float noHrsUsr)
    {
        super(nombreIni);
        sueldoXhr = sueldoXhrUsr;
        noHrs =  noHrsUsr;
        sueldo = 0;
    }
    /**
     * Clase para calcular Ingresos
     */
    public void calcularIngresos()
    {
        if(noHrs > 40){
            sueldo = 40 * sueldoXhr + ((noHrs - 40) * 2 * sueldoXhr);
            
        }
        else
        {
           sueldo =  noHrs * sueldoXhr;
        }
        
    }
    /**
     * este metodo imprime en pntalla los datos de un empleado por hora
     */
    
    
       
     public void imprimirDatos()
    {
           System.out.println("El nombre es:" + super.nombre());
          System.out.println("El numero de horas es:" + noHrs);
          System.out.println("El sueldo por hora es:" + sueldoXhr);
          System.out.println("El sueldo es:" + sueldo);
          
    }
  
    
}
