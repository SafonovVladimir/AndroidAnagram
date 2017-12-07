package com.thrifty.Anagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.thrifty.task1.R;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn1);
        final TextView txtEnter = (TextView) findViewById(R.id.editText3);
        final TextView txtShow = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = String.valueOf(txtEnter.getText());
                String sub1 = (String) text.subSequence(0,5);
                String sub2 = (String) text.subSequence(6,11);
                Reverse newString = new Reverse();
                txtShow.setText(newString.reverseString(sub1) + " " + newString.reverseString(sub2));

            }
        });
    }

}
