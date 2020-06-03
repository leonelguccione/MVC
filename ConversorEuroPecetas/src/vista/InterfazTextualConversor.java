package vista;

import controlador.ControlConversor;

import java.awt.event.ActionEvent;

import java.util.Scanner;

public class InterfazTextualConversor implements InterfazVista
{
    /**
     * @aggregation shared
     */
    private ControlConversor controlador;
    // Gestión de la entrada por teclado
    private Scanner in = new Scanner(System.in);

    private int leeOpcion()
    {
        String s = null;
        try
        {
            s = in.nextLine();
            return Integer.parseInt(s);
        }
        catch (Exception e)
        {
            operaciónIncorrecta();
            return 0;
        }
    }

    private double leeCantidad()
    {
        String s = null;
        try
        {
            s = in.nextLine();
            return Double.parseDouble(s);
        }
        catch (Exception e)
        {
            System.out.println("Error en formato del número, tiene que ser 99.99: ");
            return leeCantidad();
        }
    }

    private void solicitaOperacion()
    {
        System.out.println("Indica la operación que quiere realizar:");
        System.out.println("1: convertir a euros");
        System.out.println("2: convertir a pesetas");
        System.out.println("0: salir");
    }

    private void procesaNuevaOperacion()
    {
        int operacion;
        solicitaOperacion();
        operacion = leeOpcion();
        if (operacion == 0)
        {
            System.out.println("Adiós.");
            System.exit(0);
        }
        if (operacion == 1)
        {
            controlador.actionPerformed(new ActionEvent(this, operacion, AEUROS));
        }
        if (operacion == 2)
        {
            controlador.actionPerformed(new ActionEvent(this, operacion, APESETAS));
        }
        operaciónIncorrecta();
    }

    private void operaciónIncorrecta()
    {
        System.out.print("Operación incorrecta. ");
        procesaNuevaOperacion();
    }

    @Override
    public void setControlador(ControlConversor c)
    {
        controlador = c;
    }

    @Override
    public void arranca()
    {
        procesaNuevaOperacion();
    }

    @Override
    public void escribeCambio(String s)
    {
        // escribe el resultado:
        System.out.println(s);
        // y vuelve a solicitar al usuario una operación:
        procesaNuevaOperacion();
    }

    public double getCantidad()
    {
        System.out.print("Cantidad a convertir (formato 99.99): ");
        return leeCantidad();
    }
}

