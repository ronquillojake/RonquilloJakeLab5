package jake.ronquillo.com.ronquillojakelab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button) {
            i = new Intent(this, Main2Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.590231, 120.974931"));
            chooser = Intent.createChooser(i, "Choose App");
            startActivity(i);
        }
    }
}

