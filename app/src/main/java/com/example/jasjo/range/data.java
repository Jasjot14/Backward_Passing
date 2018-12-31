package com.example.jasjo.range;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class data extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2;
EditText etxt,etxt2;
TextView txtview;
int num;


void initviews(){
   btn1=findViewById(R.id.button);
    btn2=findViewById(R.id.button2);
    btn1.setOnClickListener(this);
    btn2.setOnClickListener(this);
    etxt=findViewById(R.id.editText);
    etxt2=findViewById(R.id.editText2);
    txtview=findViewById(R.id.textView3);


}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initviews();
    }

    @Override
    public void onClick(View v) {
    if (v==btn1){
        Intent intent = new Intent (data.this, data1.class);
        startActivityForResult(intent,101);
    }
    if (v==btn2){
        Intent intent = new Intent (data.this, data2.class);
        startActivityForResult(intent,101);

    }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        int range = 0;
        //int num=0;
        StringBuffer s1 = new StringBuffer();
        if (requestCode == 101 && resultCode == 203 ){
            //String name = data.getStringExtra("keyName");
              num = data.getIntExtra("keyNum", 0);


            etxt.setText(String.valueOf(num));


        }


        if (requestCode == 101 && resultCode == 202) {
            //String name = data.getStringExtra("keyName");
            range = data.getIntExtra("keyNum", 0);


            etxt2.setText(String.valueOf(range));
        }

        super.onActivityResult(requestCode, resultCode, data);
        for (int i = 1; i <= range; i++) {
            s1.append(num+"x" + i + "=" + num * i + "\n");
        }
        txtview.setText(s1.toString());
    }


}
