package Prueba;

import controlador.ControlConversor;

import modelo.ConversorEurosPesetas;

import vista.InterfazTextualConversor;
import vista.InterfazVista;

public class ProgramaDeConversionTexto
{
    public static void main(String[] args)
    {
        // el modelo:
        ConversorEurosPesetas modelo = new ConversorEurosPesetas();
        // la vista:
        InterfazVista vista = new InterfazTextualConversor();
        // y el control:
        ControlConversor control = new ControlConversor(vista, modelo);
        // configura la vista
        vista.setControlador(control);
        // y arranca la interfaz (vista):
        vista.arranca();
    }
}
