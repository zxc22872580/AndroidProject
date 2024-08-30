package com.tqc.gdd01;
import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.provider.MediaStore;

import androidx.core.app.ActivityCompat;

public class Camera extends Activity
{
    ImageView imageView;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);
        ImageView imageView =findViewById(R.id.imageView5);
        imageView.setImageResource(R.drawable.camera);

        getPermissionCamera();

        Button b1 = findViewById(R.id.button4);
        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(takePictureIntent);

            }
        });
        //ImageView imageView =findViewById(R.id.imageView1);


    }
    public  void getPermissionCamera(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},1);
        }

    }

}
