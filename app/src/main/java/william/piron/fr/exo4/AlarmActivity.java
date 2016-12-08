package william.piron.fr.exo4;

import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AlarmActivity extends AppCompatActivity {
    public static Intent intent;
    public static TextView tempsText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        intent = getIntent();

    }
}
