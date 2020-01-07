package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image=findViewById(R.id.imageView);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://en.wikipedia.org/wiki/Virat_Kohli");
            }
            public void openUrl(String url){
                Uri uri=Uri.parse(url);
                Intent web=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(web);
            }
        });

    }
}
