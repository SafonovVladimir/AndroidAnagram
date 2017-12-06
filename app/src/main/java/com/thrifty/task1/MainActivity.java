package com.thrifty.task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

        String text = String.valueOf(txtEnter.getText());
        final String first = (String) text.subSequence(0,5);
        final String end = (String) text.subSequence(6,11);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtShow.setText(reverseStr(first) + " " + reverseStr(end));

            }
        });
    }

    private static String reverseStr(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;

        while (i<j){
            if (!Character.isAlphabetic(ch[i])){
                i++;
            } else if (!Character.isAlphabetic(ch[j])) {
                j--;
            } else {
                char newCh = ch[i];
                ch[i] = ch [j];
                ch[j] = newCh;
                i++;
                j--;
            }
        }

        return new String(ch);


    }
}
