package william.piron.fr.exo4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private static AlarmManager alarmManager;
    private static PendingIntent pendingIntent;
    private static Intent intent;
    private static final String TRENTESECONDE_MESSAGE = "30 secondes";
    private static final String UNEMINUTE_MESSAGE = "1 minute";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button30s = (Button) findViewById(R.id.layoutLinear_button30s);
        Button button60s = (Button) findViewById(R.id.layoutLinear_button60s);

        alarmManager = (AlarmManager) MainActivity.this.getSystemService(MainActivity.this.ALARM_SERVICE);
        //intent = new Intent(MainActivity.this, AlarmActivity.class);
        pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, intent, 0);

        button30s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button60s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
