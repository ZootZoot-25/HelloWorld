package josegonzalez.helloworld.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //First create findViewById(R.id."object") to cerate an object for the button
        //then set a setOnClickListener() then set a new OnClickListener
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //shows this message in logcat if program runs successfully
                Log.i("Success for Text Color", "Button clicked");

                //cast this view as a textview to alter it's propterites via
                //app interface
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Success for View Color", "Button clicked");
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.Blue));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Success for Change Text", "Button clicked");

                //grab text user inputted, get it as a string
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Goodbye!");

                } else {
                    //put text into our text view once the 'change text' button is clicked
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Reset", "Reset all Buttons");
                //set text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.Black));

                //set View Color back to ColorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));

                //set text back to "Change Text"
                ((TextView) findViewById(R.id.textView)).setText("Hello From Jose!");
            }
        });
    }
}
