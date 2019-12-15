package com.kai.justapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void profil(View view) {
    Intent intent = new Intent(MainActivity.this, profil.class);
    startActivity(intent);
  }

  public void galeri(View view) {
    Intent intent = new Intent(MainActivity.this, galeri.class);
    startActivity(intent);
  }

  public void kopi(View view) {
    Intent intent = new Intent(MainActivity.this, kopi.class);
    startActivity(intent);
  }

  public void berita(View view) {
    Intent intent = new Intent(MainActivity.this, berita.class);
    startActivity(intent);
  }

  public void headline(View view) {
    Intent intent = new Intent(MainActivity.this, headline.class);
    startActivity(intent);
  }

  public void olahraga(View view) {
    Intent intent = new Intent(MainActivity.this, olahraga.class);
    startActivity(intent);
  }

  public void kesehatan(View view) {
    Intent intent = new Intent(MainActivity.this, kesehatan.class);
    startActivity(intent);
  }

  public void enter(View view) {
    Intent intent = new Intent(MainActivity.this, enter.class);
    startActivity(intent);
  }

  public void science(View view) {
    Intent intent = new Intent(MainActivity.this, science.class);
    startActivity(intent);
  }
//  public void feed(View view) {
//    Intent intent = new Intent(Intent.ACTION_SENDTO);
//    intent.setData(Uri.parse("mailto:msidiq377@gmail.com"));
//    intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback for Just App");
//    if (intent.resolveActivity(getPackageManager()) !=null) {
//      startActivity(intent);
//    }
//  }
}
