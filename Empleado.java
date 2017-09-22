/**
 * esta clase reprecenta figuras las cuales pueden ser circulos poe ejemplo
 * @author Luis Posadas
 * @version 1.0(8-sep-17)
 
 */
abstract public class Empleado
{
    private String nombre;
    
    
    public Empleado(String nombreIni)
    {
        nombre = nombreIni;
    }
    public String nombre()
    {
        return nombre;
    }
    

    abstract public void calcularIngresos(); 
    abstract public void imprimirDatos();
    
  
}

