package vista;

import controlador.ControlConversor;

public interface InterfazVista
{
    public void setControlador(ControlConversor c);
    public void arranca();
    // comienza la visualización
    public double getCantidad();
    // cantidad a convertir
    public void escribeCambio(String s); //texto con la conversión
    // Constantes que definen las posibles operaciones:
    static final String AEUROS = "Pesetas a Euros";
    static final String APESETAS = "Euros a Pesetas";
}

