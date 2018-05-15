package com.example.ramachandrans.spider1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class activity extends Activity {
    TextView t1,t2;
    LinearLayout l1;
    int n = 0,k;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        l1 = findViewById(R.id.l1);
        k = (int)(Math.random()*100);
        t1.setText("Rs. "+k);
    }

    public void b1click(View v){
        n+=1;
        check();
        t2.setText("Rs. "+n);
    }
    public void b2click(View v){
        n+=2;
        check();
        t2.setText("Rs. "+n);
    }
    public void b3click(View v){
        n+=5;
        check();
        t2.setText("Rs. "+n);
    }
    public void b4click(View v){
        n+=10;
        check();
        t2.setText("Rs. "+n);
    }
    public void reset(View v){
        n=0;
        t2.setText("Rs. "+n);
        l1.setBackgroundColor(Color.argb(0,0,0,0));
    }
    public void check(){
        if(n==k) {
            l1.setBackgroundColor(Color.argb(0xFF, 0x00, 0xFF, 0x00));
        }
    }
}
