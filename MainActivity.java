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
        db.addProf(new Prof("HMC", "CS", "Kuenning", "Olin 1277", "11:30-12, 3-4", "1-2, 5-6", "", "3-4", ""));        
        db.addProf(new Prof("Scripps", "CS", "BLEH", "Olin 1277", "11:30-12, 3-4", "1-2, 5-6", "", "3-4", ""));        
        db.addProf(new Prof("HMC", "CS", "Lewis", "Olin 1275", "11:30-12, 3-4", "1-2, 5-6", "4-5", "3-4", ""));        
        db.addProf(new Prof("HMC", "CS", "Keller", "Olin 1277", "NEVER", "1-2, 5-6", "", "3-4", "12-1"));        
         
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
