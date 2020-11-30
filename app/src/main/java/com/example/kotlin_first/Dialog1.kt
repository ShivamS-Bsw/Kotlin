package com.example.kotlin_first

import android.content.Context
import android.widget.Toast

class Dialog1(context: Context) : CustomDialog(context) {
    override fun onPositiveClick() {
        Toast.makeText(context,"OnPositiveClick",Toast.LENGTH_SHORT).show();
    }

    override fun onNegativeClick() {
        Toast.makeText(context,"OnNegativeClick",Toast.LENGTH_SHORT).show();
    }


}