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
        db.addProf(new Prof("Ravi", "9100000000"));        
        db.addProf(new Prof("Srinivas", "9199999999"));
        db.addProf(new Prof("Tommy", "9522222222"));
        db.addProf(new Prof("Karthik", "9533333333"));
         
        // Reading all profs
        Log.d("Reading: ", "Reading all profs.."); 
        List<Prof> profs = db.getAllProfs();       
         
        for (Prof cn : profs) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getSchool();
                // Writing Profs to log
        Log.d("Name: ", log);
    }
    }
}
