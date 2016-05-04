package julia.barcodescanner;

/**
 * @author Julia Blackwell
 * @version 0.0
 * Thanks to zxing and www.github.com/journeyapps/zxing-android-embedded
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.google.zxing.integration.android.IntentIntegrator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final IntentIntegrator mIntegrator = new IntentIntegrator(this);

        Button mScanButton = (Button) findViewById(R.id.scan_button);
        mScanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mIntegrator.initiateScan(); //launch scanner

                //TODO: fix automatic orientation change upon launching scan

                //TODO: save contents of scan

            }
        });
    }
}
