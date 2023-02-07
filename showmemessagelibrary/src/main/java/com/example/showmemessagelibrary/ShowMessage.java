package com.example.showmemessagelibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowMessage {

    public static void showToast(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}