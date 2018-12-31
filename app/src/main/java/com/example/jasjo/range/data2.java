package com.example.jasjo.range;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class data2 extends AppCompatActivity implements View.OnClickListener {
    EditText etxt;
    Button btn1;
    void initviews(){
        etxt=findViewById(R.id.editText4);
        btn1=findViewById(R.id.button4);
        btn1.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);
        initviews();
    }

    @Override
    public void onClick(View v) {
        if (v==btn1){
            String num = etxt.getText().toString();
            int inum = Integer.parseInt(num);

            // Put Data in empty Intent
            Intent data = new Intent(); // no source and no destination

            data.putExtra("keyNum",inum);

            setResult(202, data);

            finish();

        }
    }

    }

