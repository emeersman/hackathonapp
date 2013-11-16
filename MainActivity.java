package com.example.proffice_hours;
 
import java.util.List;
 
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
 
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        DatabaseHandler db = new DatabaseHandler(this);
         
        /**
         * CRUD Operations
         * */
        // Inserting Profs
        Log.d("Insert: ", "Inserting .."); 
        db.addProf(new Prof("Ravi", "HMC"));        
        db.addProf(new Prof("Srinivas", "Pomona"));
        db.addProf(new Prof("Tommy", "HMC"));
        db.addProf(new Prof("Karthik", "Scripps"));
         
        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts.."); 
        List<Prof> contacts = db.getAllProfs();       
         
        for (Prof cn : contacts) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,School: " + cn.getSchool();
                // Writing Profs to log
        Log.d("Name: ", log);
    }
    }
}
