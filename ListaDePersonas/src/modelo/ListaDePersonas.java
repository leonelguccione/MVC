package modelo;

import java.util.Vector;

public class ListaDePersonas
{
    protected Vector vectorDePersonas;

    public ListaDePersonas()
    {
        vectorDePersonas = new Vector();
    }

    public void agregarPersona(Persona aPersona)
    {
        vectorDePersonas.add(aPersona);
    }

    public int getNumeroDePersonas()
    {
        return vectorDePersonas.size();
    }

    public Persona getPersona(int aIndex)
    {
        return (Persona) vectorDePersonas.elementAt(aIndex);
    }
}
