package ni.edu.uca.damov1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ni.edu.uca.damov1.entidades.Persona;

public class NuevaPersonaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1,editText2,editText3,editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_persona);
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);

        Button okButton = (Button) findViewById(R.id.botonGuardar);
        okButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre(editText1.getText().toString());
        nuevaPersona.setCedula(editText2.getText().toString());
        nuevaPersona.setCorreo(editText3.getText().toString());
        nuevaPersona.setTelefono(editText4.getText().toString());

        nuevaPersona.save();
        finish();
    }
}
