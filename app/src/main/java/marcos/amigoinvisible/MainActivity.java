package marcos.amigoinvisible;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import marcos.amigoinvisible.model.Amigo;

public class MainActivity extends AppCompatActivity {
    public static final Amigo[] amigos = new Amigo[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.randomizar);
        boton.setOnClickListener(v -> {
            guardarNombres();
            randomizar();

            Intent intent = new Intent(MainActivity.this, Final.class);
            startActivity(intent);
        });
    }

    private void randomizar() {
        // Se guarda el array en una lista
        List<Amigo> amigosList = new ArrayList<>(Arrays.asList(amigos));

        // Barajamos los valores de la lista hasta que ninguno corresponda a la misma posicion del array
        do {
            Collections.shuffle(amigosList);
        } while (sonIguales(amigosList));

        // Guardamos el amigo invisible en el array
        for (int i = 0; i < amigosList.size(); i++) {
            amigos[i].setAmigoInvisible(amigosList.get(i));
        }
    }

    private boolean sonIguales(List<Amigo> amigoList) {
        // Si en la misma posicion los amigos son iguales retorna verdadero
        for (int i = 0; i < amigoList.size(); i++) {
            if (amigoList.get(i).equals(amigos[i])) return true;
        }
        // Para cualquier otro caso retorna falso
        return false;
    }

    private void guardarNombres() {
        EditText a1 = findViewById(R.id.textUno);
        EditText a2 = findViewById(R.id.textDos);
        EditText a3 = findViewById(R.id.textTres);

        String amigo1 = a1.getText().toString();
        String amigo2 = a2.getText().toString();
        String amigo3 = a3.getText().toString();

        amigos[0] = new Amigo(amigo1);
        amigos[1] = new Amigo(amigo2);
        amigos[2] = new Amigo(amigo3);
    }
}