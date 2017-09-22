
/**
 * esta clase reprecenta un emplado por comision
 * @version 1.0(15-sep-17)
 
 */
public class PorComision extends Empleado
{
    // instance variables - replace the example below with your own
    private int ventasXSem;
    private float porcComision;
    private float sueldo;

    /**
     * Constructor for objects of class PorComision
     */
    
    public PorComision(String nombreIni, int ventasXSemUsr,
    float porcComisionUsr)
    {
        super(nombreIni);
        ventasXSem = ventasXSemUsr;
        porcComision = porcComisionUsr;
        sueldo = 0;
    }
    /**
     * Clase para calcular Ingresos
     */
    public void calcularIngresos()
    {
        sueldo = ventasXSem * porcComision;
    }
    /**
     * este metodo imprime en pntalla los datos de un  empleado por comision
     */
    
    public float dameVentasXSem()
    {
        return ventasXSem;
    }
       public float damePorcentaje()
    {
        return porcComision;
    }
     public void imprimirDatos()
    {
           System.out.println("El nombre es:" + super.nombre());
          System.out.println("las ventas por semana son:" + ventasXSem);
          System.out.println("El porcentaje de comicion es:" + porcComision);
          System.out.println("El sueldo es:" + sueldo);
           
    
    }
   
  
    
}