package ro.musichub.musichub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startOnClick(View v){
        Intent intent = new Intent(v.getContext(), LoginActivity.class);
        startActivityForResult(intent, 0);
    }
}
