package com.example.chethan.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Chethan on 5/20/2017.
 */

public class EditPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_page);
        Button button1 = (Button)findViewById(R.id.submit);
//        final DBhelper dBhelper = new DBhelper(this);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit1);
//                save(editText.getText().toString());

                String message=editText.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("Name",message);
                setResult(Activity.RESULT_OK,intent);
//                dBhelper.addContact(message);

                finish();

            }
        });

    }

}