package my.edu.tarc.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextMessage;
    private EditText editTextName;
    private EditText editTextAge;
    public static final String MSG_EXTRA = "MSG";
    public static final String NAME_EXTRA = "NAME";
    public static final String AGE_EXTRA = "AGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Link code to UI (can only happen after setContentView)
        editTextMessage = (EditText) findViewById(R.id.editTextMessage);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);

    }

    public void sendMessage(View view) {
        String message;
        String name;
        String age;
        message = editTextMessage.getText().toString();
        name = editTextName.getText().toString();
        age = editTextAge.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MSG_EXTRA, message);
        intent.putExtra(NAME_EXTRA, name);
        intent.putExtra(AGE_EXTRA, age);
        startActivity(intent);
    }


}
