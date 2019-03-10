package hebut.song.partybuilding;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestActivity extends AppCompatActivity {
   FragmentManager fm;
   FragmentTransaction ft;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        fm =getSupportFragmentManager();

        button = findViewById(R.id.test_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                switch (view.getId()){
//                    case R.id.test_button:
//
//                        break;
                Intent intent = new Intent(TestActivity.this,LearningActivity.class);
                startActivity(intent);
                }
//            }
        });
    }

}
