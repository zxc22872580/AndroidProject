package com.tqc.gdd01;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.provider.MediaStore;
public class choose extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);

        Button bmiButton = findViewById(R.id.BMIbutton);
        Button recordButton = findViewById(R.id.RecordButton);
        Button cameraButton = findViewById(R.id.CameraButton);
        ImageView imageView1 =findViewById(R.id.imageView1);
        ImageView imageView2 =findViewById(R.id.imageView3);
        ImageView imageView3 =findViewById(R.id.imageView4);


        imageView1.setImageResource(R.drawable.bmi);
        imageView2.setImageResource(R.drawable.list);
        imageView3.setImageResource(R.drawable.camera);

        bmiButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choose.this, GDD01.class);
                startActivity(intent);
            }
        });
        recordButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choose.this, record.class);
                startActivity(intent);
            }
        });
        cameraButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(choose.this, Camera.class);
                startActivity(intent);
            }
        });

    }
}
