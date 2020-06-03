package modeloDeAplicacion;

import javax.swing.table.AbstractTableModel;

import modelo.ListaDePersonas;
import modelo.Persona;

public class PersonasTableModel extends AbstractTableModel
{
    protected ListaDePersonas listaDePersonas;

    public PersonasTableModel(ListaDePersonas aListaDePersonas)
    {
        listaDePersonas = aListaDePersonas;
    }

    @Override
    public int getRowCount()
    {
        return listaDePersonas.getNumeroDePersonas();
    }

    @Override
    public int getColumnCount()
    {
        return 4; //hay cuatro atributos en la clase Persona
    }

    @Override
    public Object getValueAt(int aRow, int aCol)
    {
        Persona persona = listaDePersonas.getPersona(aRow);
        switch (aCol)
        {
        case 0:
            return persona.getNombre();
        case 1:
            return persona.getApellido();
        case 2:
            return persona.getCarnet();
        case 3:
            return persona.getTelefono();
        }
        return "";
    }

    @Override
    public String getColumnName(int aCol)
    {
        switch (aCol)
        {
        case 0:
            return "Nombre";
        case 1:
            return "Apellido";
        case 2:
            return "CI";
        case 3:
            return "Teléfono";
        }
        return "";
    }
}
