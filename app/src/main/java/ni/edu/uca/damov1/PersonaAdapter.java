package ni.edu.uca.damov1;

import android.content.Context;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import ni.edu.uca.damov1.entidades.Persona;

/**
 * Created by pwk04 on 11-06-16.
 */
public class PersonaAdapter extends ArrayAdapter<Persona> {


    private List<Persona> personaList;
    private int resourceView;
    private SparseBooleanArray mSelectedItemsIds;


    public PersonaAdapter(Context context, int resource, List<Persona> objects) {
        super(context, resource, objects);
        this.personaList = objects;
        this.resourceView = resource;
        mSelectedItemsIds = new SparseBooleanArray();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_persona, parent, false);
        TextView nombre = (TextView) convertView.findViewById(R.id.nombre);
        TextView cedula = (TextView) convertView.findViewById(R.id.cedula);
        TextView correo = (TextView) convertView.findViewById(R.id.correo);
        TextView telefono = (TextView) convertView.findViewById(R.id.telefono);

        Persona personaActual = personaList.get(position);
        nombre.setText(personaActual.getNombre());
        cedula.setText(personaActual.getCedula());
        correo.setText(personaActual.getCorreo());
        telefono.setText(personaActual.getTelefono());

        convertView.setBackgroundColor(mSelectedItemsIds.get(position) ? Color.BLUE : Color.TRANSPARENT);

        return convertView;
    }

    /**
     * Selecciona o deselecciona un elemento
     * @param position
     */
    public void toggleSelection(int position){
        selectView(position, !mSelectedItemsIds.get(position));
    }

    /**
     * Elimina los elementos seleccionados del arreglo
     */
    public void removeSelection() {
        mSelectedItemsIds = new SparseBooleanArray();
        notifyDataSetChanged();
    }

    /**
     * Selecciona un objeto mediante la vista y lo agrega al arreglo
     * @param position
     * @param value
     */
    public void selectView(int position, boolean value) {
        if (value)
            mSelectedItemsIds.put(position, value);
        else
            mSelectedItemsIds.delete(position);

        notifyDataSetChanged();
    }

    /**
     * Obtiene el conteo de elementos seleccionados
     * @return
     */
    public int getSelectedCount() {
        return mSelectedItemsIds.size();
    }

    /**
     * Obtiene los indices o IDs de los objetos seleccionados
     * @return
     */
    public SparseBooleanArray getSelectedIds() {
        return mSelectedItemsIds;
    }
}
