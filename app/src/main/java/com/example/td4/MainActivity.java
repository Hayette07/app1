package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private  EditText ed1,ed2;
    int a,b,c;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {

        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
       t=(TextView)findViewById(R.id.tv);
        a = Integer.parseInt(ed1.getText().toString());
        b = Integer.parseInt(ed2.getText().toString());
        c = a + b;
        t.setText (Integer.toString(c));
      //  Integer.toString(c);
       /* Intent i=new Intent(this,Main2Activity.class);
        i.putExtra ("kay",c);
        Integer.toString(c);
        startActivity(i);*/
        Intent i=new Intent(this,Main2Activity.class);
        Bundle b=new Bundle ();
        Integer.toString(c);
        b.putString ("key",t.getText().toString());
        i.putExtras(b);
        startActivity(i);




    }
}
