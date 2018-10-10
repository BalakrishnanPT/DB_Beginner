package beginner.sample.dbsqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper = new DatabaseHelper(this);
//        insertData();

        for (TableDetails tableDetails1 : databaseHelper.getDetails()) {
            Log.d(TAG, "onCreate: " + tableDetails1.toString());
        }
    }

    private void insertData() {
        databaseHelper.insertDetails("A", "Android", "QQ");
        databaseHelper.insertDetails("B", "Android", "QQ");
        databaseHelper.insertDetails("C", "Android", "QQ");
        databaseHelper.insertDetails("D", "Android", "QQ");
        databaseHelper.insertDetails("E", "Android", "QQ");
        databaseHelper.insertDetails("F", "Android", "QQ");
        databaseHelper.insertDetails("G", "Android", "QQ");
        databaseHelper.insertDetails("H", "Android", "QQ");
        databaseHelper.insertDetails("I", "IPhone", "QQ");
        databaseHelper.insertDetails("J", "IPhone", "QQ");
        databaseHelper.insertDetails("K", "IPhone", "QQ");
        databaseHelper.insertDetails("L", "IPhone", "QQ");
        databaseHelper.insertDetails("M", "IPhone", "QQ");
        databaseHelper.insertDetails("N", "IPhone", "QQ");
        databaseHelper.insertDetails("O", "IPhone", "QQ");
    }
}
