package ni.edu.uca.damov1;

import android.content.Context;
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


    public PersonaAdapter(Context context, int resource, List<Persona> objects) {
        super(context, resource, objects);
        this.personaList = objects;
        this.resourceView = resource;
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

        return convertView;
    }
}
