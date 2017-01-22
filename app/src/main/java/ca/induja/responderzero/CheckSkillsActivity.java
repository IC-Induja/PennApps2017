package ca.induja.responderzero;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by nitaycaspi on 1/21/17.
 */

public class CheckSkillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skills_checklist);

        View cpr_box = findViewById(R.id.cpr_checkbox);
        View aed_box = findViewById(R.id.aed_checkbox);
        View naloxone_box = findViewById(R.id.naloxone_checkbox);
        View choking_box = findViewById(R.id.choking_checkbox);
        View bleeding_box = findViewById(R.id.bleeding_checkbox);
        View epinephrine_box = findViewById(R.id.epinephrine_checkbox);

    }

}
