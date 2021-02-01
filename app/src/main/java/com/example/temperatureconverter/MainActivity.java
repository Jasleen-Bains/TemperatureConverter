package com.example.temperatureconverter;
//https://codedost.com/get-started-android/android-programs/android-program-convert-temperature-celsius-fahrenheit-fahrenheit-celsius/
//https://kellylougheed.medium.com/so-you-want-to-use-java-for-android-build-a-temperature-app-7171bd91e10
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text_enter;
    Button button;
    ToggleButton toggleButton2;
    double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_enter = (EditText) findViewById(R.id.text_enter);
        button = (Button) findViewById(R.id.button);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v)
        {

            if(text_enter.getText().toString().isEmpty())
            {
                Toast.makeText(MainActivity.this,"Please enter the temperature",Toast.LENGTH_SHORT).show();
            }

            else if(toggleButton2.isChecked())
            {
                a=Double.parseDouble(String.valueOf(text_enter.getText()));
                Double b=a*9/5+32;
                String r=String.valueOf(b);
                Toast.makeText(MainActivity.this,r+"°F",Toast.LENGTH_SHORT).show();
            }

            else
            {
                a=Double.parseDouble(String.valueOf(text_enter.getText()));
                Double b=a-32;
                Double c=b*5/9;
                String r=String.valueOf(c);
                Toast.makeText(MainActivity.this,r+"°C",Toast.LENGTH_SHORT).show();
            }
        }
        });
}
}