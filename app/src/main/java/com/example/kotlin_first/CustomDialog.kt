package com.example.kotlin_first

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class CustomDialog(context: Context) : Dialog(context) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);

        val positiveButton = findViewById<Button>(R.id.dialog_positive_button);
        val negativeButton = findViewById<Button>(R.id.dialog_negative_button);

        positiveButton.setOnClickListener(){
            Toast.makeText(context, "Positive Clicked", Toast.LENGTH_SHORT).show()
        }

        negativeButton.setOnClickListener(){
            Toast.makeText(context, "Negative Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}