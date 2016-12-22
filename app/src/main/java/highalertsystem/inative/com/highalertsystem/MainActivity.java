package highalertsystem.inative.com.highalertsystem;


import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends Activity {

    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.mainactivity);
        start=(Button)findViewById(R.id.start);
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Calendar cal = Calendar.getInstance();
//                Intent intent = new Intent(getApplicationContext(), MyService.class);
//                PendingIntent pintent = PendingIntent
//                        .getService(getApplicationContext(), 0, intent, 0);
//
//                AlarmManager alarm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//                // Start service every hour
//                alarm.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),
//                        5000, pintent);
//
//            }
//        });
        Calendar cal = Calendar.getInstance();
        Intent intent = new Intent(getApplicationContext(), MyService.class);
        PendingIntent pintent = PendingIntent
                .getService(getApplicationContext(), 0, intent, 0);

        AlarmManager alarm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        // Start service every hour
        alarm.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),
                5000, pintent);

    }
}
