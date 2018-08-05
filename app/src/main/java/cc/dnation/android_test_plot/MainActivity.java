package cc.dnation.android_test_plot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit1;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Multi activity */
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Redirect to Activity2...", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });

        /* Phone intent */
        Button buttonDial = (Button) findViewById(R.id.button_dial);
        buttonDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:110"));
                startActivity(intent);
            }
        });

        /* Get String */
        edit1 = (EditText) findViewById(R.id.Edit1);
        Button buttonVerify = (Button) findViewById(R.id.producerVerify);
        buttonVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yes_no = edit1.getText().toString();
                Toast.makeText(MainActivity.this,"你"+yes_no+"普罗丢瑟！", Toast.LENGTH_LONG).show();
            }
        });

    }


        /* Menu */
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
