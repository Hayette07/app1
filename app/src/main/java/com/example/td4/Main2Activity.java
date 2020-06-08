package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView)findViewById(R.id.tv);
        Intent i=new Intent() ;
      /*  i=getIntent();
       String a=i.getStringExtra("key");
       tv. setText (a);
        Toast.makeText(this,"resultat est=="+a, Toast.LENGTH_SHORT).show();*/
      Bundle bb=getIntent().getExtras();
      String n=bb.getString ("key");
      tv.setText(n);




    }

    public void back(View view) {
        Intent ii=new Intent (this,MainActivity.class);
        startActivity(ii);
    }

    public void lien(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.android.com"));
        startActivity(intent);
    }
}
