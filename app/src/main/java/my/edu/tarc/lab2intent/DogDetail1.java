package my.edu.tarc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DogDetail1 extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_detail1);

        int position;
        Intent intent = getIntent();
        position = intent.getIntExtra("DogPosition", 0);

        getSupportActionBar().setTitle("Dog Details "+ MainActivity.dogList.get(position).getName());

        button = findViewById(R.id.buttonContact);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity();

            }
        });
    }

    public void SecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }





    public void sendMessage(View view){

            return;

        }


/*
    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_REPLY_CODE){
            if(resultCode == RESULT_OK){
                TextView textViewReply;
                textViewReply = findViewById(R.id.textViewReply);
                String stringReply = data.getStringExtra(SecondActivity.TAG_REPLY);
                textViewReply.setText(stringReply);
            }
        }
    }
    */
}
