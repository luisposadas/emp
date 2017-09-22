
import java.util.ArrayList;
   
/**
 *Una empresa que tiene empleados
 * 
 * @author Luis Martin Lopez Posadas 
 * @version 15-sep-17
 */
public class Empresa
{
    private ArrayList<Empleado> empleados;
    public Empresa()
    {
        
        empleados = new ArrayList<Empleado>();
    }
    /**
     * Agrega un empleado a la empresa
 
    */
   public void agregaEmpleado(Empleado unEmpleado)
    {
        //ojo sissepuede figuras = new Figura[100];
        empleados.add(unEmpleado);
    }
    public void calculaIngresos()
    {
        for(int i = 0; i<empleados.size(); i++)
        {
            empleados.get(i).calcularIngresos();
        }
    }
     public void imprimeDatos()
    {
        for(int i = 0; i<empleados.size(); i++)
        {
            empleados.get(i).imprimirDatos();
        }
    }
    
    }

