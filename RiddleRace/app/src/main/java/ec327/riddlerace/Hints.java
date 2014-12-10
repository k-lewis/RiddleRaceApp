package ec327.riddlerace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Hints extends Activity {

    View h2;
    View h21;

    View h3;
    View h31;

    View h4;
    View h41;

    View h5;
    View h51;

    View h6;
    View h61;

    View h7;
    View h71;

    View h8;
    View h81;

    View h9;
    View h91;

    View h10;
    View h101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hints);

        h2 = findViewById(R.id.hint2);
        h2.setVisibility(View.GONE);

        h21 = findViewById(R.id.hint2_1);
        h21.setVisibility(View.GONE);

        h3 = findViewById(R.id.hint3);
        h3.setVisibility(View.GONE);

        h31 = findViewById(R.id.hint3_1);
        h31.setVisibility(View.GONE);

        h4 = findViewById(R.id.hint4);
        h4.setVisibility(View.GONE);

        h41 = findViewById(R.id.hint4_1);
        h41.setVisibility(View.GONE);

        h5 = findViewById(R.id.hint5);
        h5.setVisibility(View.GONE);

        h51 = findViewById(R.id.hint5_1);
        h51.setVisibility(View.GONE);

        h6 = findViewById(R.id.hint6);
        h6.setVisibility(View.GONE);

        h61 = findViewById(R.id.hint6_1);
        h61.setVisibility(View.GONE);

        h7 = findViewById(R.id.hint7);
        h7.setVisibility(View.GONE);

        h71 = findViewById(R.id.hint7_1);
        h71.setVisibility(View.GONE);

        h8 = findViewById(R.id.hint8);
        h8.setVisibility(View.GONE);

        h81 = findViewById(R.id.hint8_1);
        h81.setVisibility(View.GONE);

        h9 = findViewById(R.id.hint9);
        h9.setVisibility(View.GONE);

        h91 = findViewById(R.id.hint9_1);
        h91.setVisibility(View.GONE);

        h10 = findViewById(R.id.hint10);
        h10.setVisibility(View.GONE);

        h101 = findViewById(R.id.hint10_1);
        h101.setVisibility(View.GONE);

        Button button = (Button) findViewById(R.id.continue1);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }

        });



    }

//

//    @Override
//    protected void onResume() {
//        super.onResume();
//        Intent mIntent = getIntent();
//        int intValue = mIntent.getIntExtra("intVariableName", 0);
//        switch (intValue)
//        {
////            case 0:
////                h2.setVisibility(View.VISIBLE);
////                h21.setVisibility(View.VISIBLE);
////                break;
////            case 1:
////                h3.setVisibility(View.VISIBLE);
////                h31.setVisibility(View.VISIBLE);
////                break;
//        }
//
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hints, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

//
//    button=(Button)findViewById(R.id.button1);
//    button.setOnClickListener(new View.OnClickListener() {
//
//        @Override
//        public void onClick(View v) {
//            // TODO Auto-generated method stub
//            Intent i = new Intent(getApplicationContext(),SendPhotos.class);
//            startActivity(i);
//        }

//    OnClickListener listener = new OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
//            startActivity(intent);
//
//
//        button.setOnClickListener(listener);


}