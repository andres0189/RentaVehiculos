package rentaautomoviles;

import java.util.Scanner;

public class RentaAutomoviles 
{

    public static void main(String[] args) 
    {
        saludar();

        Carros autos = new Carros();
        int carrosParaLaRenta = verificarDisponibilidad(autos);
        if (carrosParaLaRenta > 0) 
        {
            mostrarCarrosDisponibles(autos);
            //Preguntar si desea rentar un auto
         
            Clientes cliente = ingresarCliente();

        } 
        
        else 
        
        {
            System.out.println("Lo sentimos en este momento no hay carros disponibles");
        }
    }

    public static void saludar() 
    {
        System.out.println("***BIENVENIDO A RENTA-AUTOS***");
    }

    public static void mostrarCarrosDisponibles(Carros autos) 
    {
        for (int i = 0; i < 5; i++) 
        
        {
            if (autos.disponible[i] == true) 
            
            {
                System.out.println("El auto " + autos.modelos[i] + "placas: " +autos.placas[i]+"precio:"+autos.precios[i]+ "Se encuentra disponible");
               
            }
        }

    }

    public static int verificarDisponibilidad(Carros autos) {
        int carrosDisponibles = 0;
        for (int i = 0; i < 5; i++) 
        {
            if (autos.disponible[i] == true)
            {
                //System.out.println("El auto" + autos.modelos[i] + "Se encuentra disponible");
            
            carrosDisponibles++;
            }
         }
            
        return carrosDisponibles;
    }

    public static Clientes ingresarCliente() 
    
    {
        Scanner entrada = new Scanner(System.in);
        Clientes cliente = new Clientes();

        System.out.println("Ingrese el tipo de documento:");
        cliente.tipoDocumento = entrada.next();

        System.out.println("Ingrese el numero del documento");
        cliente.documento = entrada.next();

        System.out.println("Ingrese el primer nombre: ");
        cliente.primerNombre = entrada.next();

        System.out.println("Ingrese el primer apellido: ");
        cliente.primerApellido = entrada.next();

        System.out.println("Ingrese el segundo apellido: ");
        cliente.segundoApellido = entrada.next();

        System.out.println("Ingrese su edad actual: ");
        cliente.edad = entrada.next();

        System.out.println("Ingrese su nacionalidad: ");
        cliente.nacionalidad = entrada.next();
        return cliente;

    }

}







