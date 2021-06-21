package keyone.keytwo.mytestapplicationhw2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeToast("onCreate()");
        if(savedInstanceState==null){
            makeToast("первый запуск onCreate()");
        }else{
            makeToast("повторный запуск onCreate()");
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        makeToast("onStart()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        makeToast("onRestoreInstanceState()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        makeToast("onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        makeToast("onPause()");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        makeToast("onSaveInstanceState()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        makeToast("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeToast("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast("onDestroy()");
    }

    private void makeToast(String toast){
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        Log.e("mylogs: ", toast);
    }
}