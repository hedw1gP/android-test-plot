package cc.dnation.android_test_plot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Button 1 clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
        public boolean onOptionsItemSelected(MenuItem item){
            switch (item.getItemId()) {
                case R.id.menu_btn1:
                    Toast.makeText(this, "This is Button 1 in the menu", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.menu_btn2:
                    Toast.makeText(this, "This is Button 2 in the menu", Toast.LENGTH_SHORT).show();
                    break;
                default:
            }
            return true;
            }
    }
