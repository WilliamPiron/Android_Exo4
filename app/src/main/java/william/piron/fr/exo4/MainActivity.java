package william.piron.fr.exo4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    private static final String TRENTESECONDE_MESSAGE = "30 secondes";
    private static final String UNEMINUTE_MESSAGE = "1 minute";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button30s = (Button) findViewById(R.id.layoutLinear_button30s);
        Button button60s = (Button) findViewById(R.id.layoutLinear_button60s);


    }
}
