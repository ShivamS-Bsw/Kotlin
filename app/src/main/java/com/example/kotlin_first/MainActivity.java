package com.example.kotlin_first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openDialog = findViewById(R.id.button);
                System.out.println(SingletonClass.INSTANCE.getDetails());

                DataClass obj = new DataClass("Shivam",23);
                System.out.println(obj.getName());
                System.out.println(obj.getAge());

                //TODO:Getting Error : enclosing a inner class
//                InnerClass.Inner name = new InnerClass.Inner();

        openDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog1 dialog1 = new Dialog1(MainActivity.this);
                dialog1.show();

            }
        });

    }
}