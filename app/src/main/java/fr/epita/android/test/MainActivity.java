package fr.epita.android.test;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Buttons, Textview, popup and listener for top text
        TextView text1 = (TextView) findViewById(R.id.textView9);



        text1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Handles the creation and content of the popup
                // MainActivity.this it's the context in this case activity_main.xml
                AlertDialog.Builder popupBuilder = new AlertDialog.Builder(MainActivity.this);

                // Create the popup
                AlertDialog popup = popupBuilder.create();

                // Customize the popups built using the builder
                popup.setTitle("Why ?");
                popup.setMessage("Cuz the profesor rocks");
                AlertDialog.OnClickListener popupOnClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                };
                popup.setButton(AlertDialog.BUTTON_NEGATIVE, "cancel", popupOnClickListener);
                // Display the popup
                popup.show();
            }
        });


        TextView text3 = (TextView) findViewById(R.id.textView12);



        text3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Handles the creation and content of the popup
                // MainActivity.this it's the context in this case activity_main.xml
                AlertDialog.Builder popupBuilder = new AlertDialog.Builder(MainActivity.this);

                // Create the popup
                AlertDialog popup = popupBuilder.create();

                // Customize the popups built using the builder
                popup.setTitle("Why ?");
                popup.setMessage("Cuz yoga sucks !!");

                AlertDialog.OnClickListener popupOnClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                };
                popup.setButton(AlertDialog.BUTTON_NEGATIVE, "cancel", popupOnClickListener);

                // Display the popup
                popup.show();
            }
        });






    }
}