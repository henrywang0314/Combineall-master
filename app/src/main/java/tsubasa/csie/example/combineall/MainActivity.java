package tsubasa.csie.example.combineall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CClick(View view) {
        Intent intent = new Intent(MainActivity.this,Compound.class);
        startActivity(intent);
    }

    public void MClick(View view) {
        Intent intent = new Intent(MainActivity.this,Menuuu.class);
        startActivity(intent);
    }

    public void RClick(View view) {
        Intent intent = new Intent(MainActivity.this,Rating.class);
        startActivity(intent);
    }

    public void ScClick(View view) {
        Intent intent = new Intent(MainActivity.this,Scroll.class);
        startActivity(intent);
    }

    public void SeClick(View view) {
        Intent intent = new Intent(MainActivity.this,Seek.class);
        startActivity(intent);
    }

    public void SpClick(View view) {
        Intent intent = new Intent(MainActivity.this,Spin.class);
        startActivity(intent);
    }

    public void WClick(View view) {
        Intent intent = new Intent(MainActivity.this,Web.class);
        startActivity(intent);
    }

    public void LClick(View view) {
        Intent intent = new Intent(MainActivity.this,Life.class);
        startActivity(intent);
    }

}
