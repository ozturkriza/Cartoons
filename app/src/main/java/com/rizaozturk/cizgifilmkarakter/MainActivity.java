package com.rizaozturk.cizgifilmkarakter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView resim;
    ImageView resim1;
    ImageView resim2;
    ImageView resim3;
    ImageView resim4;
    ImageView resim5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resim=(ImageView)findViewById(R.id.imageView);
        resim1=findViewById(R.id.imageView2);
        resim2=findViewById(R.id.imageView3);
        resim3=findViewById(R.id.imageView4);
        resim4=findViewById(R.id.imageView5);
        resim5=findViewById(R.id.imageView6);

        resim.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=B59NCRct7oI&list=PLo7e8zG-orhNd7cBs5VNhKXSQD6eTVgEd"));
                startActivity(intent);
            }
        });
        resim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=gCpAJeCbAiw&list=PL1AUBG8ZcZ-j-4aCzsqnd__wa6f_GI4wW"));
                startActivity(intent);
            }
        });
        resim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=yPWB5XLeK6U"));
                startActivity(intent);
            }
        });
        resim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=VBKgPmS5Fyw"));
                startActivity(intent);
            }
        });
        resim4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=iDYXVPVvcFY&list=PLaE8D0PEpUTtHl3NzB3VfscnmW68cZC58"));
                startActivity(intent);
            }
        });
        resim5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=ZsLa7-ajOIY&list=PL2PLVUUB79h3bu4h90-TMKstg7I28nCNB"));
                startActivity(intent);
            }
        });
    }

}
