package sg.edu.rp.c346.p13practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 15007803 on 14/8/2018.
 */

public class MessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //Task 1a
        Toast my_toast = Toast.makeText(context, "You have changed the wallpaper", Toast.LENGTH_LONG);
        my_toast.show();


        //Task 1b
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        int id = prefs.getInt("id", R.id.radioButton);
        if (id == R.id.radioButton) {
            Toast.makeText(context, R.string.good, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, R.string.think, Toast.LENGTH_LONG).show();
        }
    }
}
