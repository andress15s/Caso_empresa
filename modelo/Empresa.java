package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Empresa
{
    //--------------------------
    //Atributos
    //--------------------------
    private double totalPagar;
    private double salario;
    private double horasMensuales;
    private Calendar fechaNacimiento;
    private Calendar fechaIngreso;
    private final double SALARIO_MIN = 1000000;
    private final double AUXILIO_TRANSP = 117000;
    
    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    public Empresa(double tPagar, double hMensual, Calendar fNacimiento, Calendar fIngreso)
    {
        this.totalPagar = tPagar;
        this.horasMensuales = hMensual;
        this.fechaNacimiento = fNacimiento;
        this.fechaIngreso = fIngreso;
        this.salario = 0;
    }

    public double getPagar()
    {
        return this.totalPagar;
    }
    
    public double getMesual()
    {
        return this.horasMensuales;
    }
    
    public Calendar getNacimiento()
    {
        return this.fechaNacimiento;
    }
    
    public Calendar getIngreso()
    {
        return this.fechaIngreso;
    }
    
    public void setPagar(int tPagar)
    {
        this.totalPagar = tPagar;
    }
    
    public void setMesual(int hMensual)
    {
        this.horasMensuales = hMensual;
    }
    
    public void setNacimiento(Calendar fNacimiento)
    {
        this.fechaNacimiento = fNacimiento;
    }
    
    public void setIngreso(Calendar fIngreso)
    {
        this.fechaIngreso = fIngreso;
    }

    public double getSalario() 
    {
        return salario;
    }
    public void hallarHoras()
    {
        horasMensuales = (double) salario;      
        if (horasMensuales<=500)        
        {            
            salario = horasMensuales*4000;       
        }        
        if(salario<2*SALARIO_MIN)
        {
        totalPagar = salario+AUXILIO_TRANSP; 
        System.out.println("Recibe auxilio de transporte" + totalPagar);
        }
        else         
        {         
            salario = horasMensuales*4000;   
            System.out.println("Su sueldo es : " + salario);               
        }    
    }

 
    public int calcularEdad()
    {  
        Calendar ahora = new GregorianCalendar();
        if (ahora.get(Calendar.YEAR) >= ( fechaNacimiento ).get(Calendar.YEAR)) 
        {
            if (ahora.get(Calendar.MONTH) >= fechaNacimiento.get(Calendar.MONTH)) 
            {
                return ahora.get(Calendar.YEAR) - (fechaNacimiento).get(Calendar.YEAR);
            }
            else
            {
                return ahora.get(Calendar.YEAR) - (fechaNacimiento).get(Calendar.YEAR) - 1;
            }
        }
        else
        {
            return 0;
        }

    }

}
