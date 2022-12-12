package marcos.amigoinvisible;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        TextView amigo1 = findViewById(R.id.amigo1_final);
        TextView amigo2 = findViewById(R.id.amigo2_final);
        TextView amigo3 = findViewById(R.id.amigo3_final);

        amigo1.setText(MainActivity.amigos[0].toString());
        amigo2.setText(MainActivity.amigos[1].toString());
        amigo3.setText(MainActivity.amigos[2].toString());
    }
}