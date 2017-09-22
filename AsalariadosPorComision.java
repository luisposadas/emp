
public class AsalariadosPorComision extends PorComision
{
    // instance variables - replace the example below with your own
    private  float salarioXSem;
   
    private  float sueldo;

    /**
     * Constructor for objects of class AsalariadosPorComision
     */
    
    public AsalariadosPorComision(String nombreIni, int ventasXSemUsr,
    float porcComisionUsr, float salarioXSemUsr)
    {
        super(nombreIni,ventasXSemUsr,porcComisionUsr);
        salarioXSem = salarioXSemUsr;
        sueldo = 0;
    }
    /**
     * Clase para calcular Ingresos
     */
    public void calcularIngresos()
    {
        sueldo = salarioXSem + super.dameVentasXSem() * super.damePorcentaje();
    }
    /**
     * este metodo imprime en pntalla los datos de un  empleado asalariado 
     * por comision
     */
    
    
       
     public void imprimirDatos()
    {
          System.out.println("El nombre es:" + super.nombre());
          System.out.println("el salario base por semana es:" + salarioXSem);
          System.out.println("las ventas por semana son:" + super.dameVentasXSem());
          System.out.println("El porcentaje de comicion es:" + super.damePorcentaje());
          System.out.println("El sueldo es:" + sueldo);
           
          
    
    }
  
    
}
