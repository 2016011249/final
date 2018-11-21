package com.example.a000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView TextView;
    private String first;
    private String second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button bun=(Button)findViewById(R.id.bun);
       TextView  = (TextView)findViewById(R.id.text3);
       final EditText view1=(EditText)findViewById(R.id.view1);
       final EditText view2=(EditText)findViewById(R.id.view2);

       bun.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               first= view1.getText().toString();
               second=view2.getText().toString();
               change(first,second);
           }
       });

    }
    private void change(String s1,String s2){
        if(s1.equals("")||s2.equals("")) {
            TextView.setText("");
        }
        else if (s1.equals("父亲")) {
            if (s2.equals("舅舅")) {
                TextView.setText("舅公");
            } else if (s2.equals("父亲")) {
                TextView.setText("爷爷");
            }
        } else {
            TextView.setText("叔叔阿姨爷爷奶奶好！");
        }

    }

}
