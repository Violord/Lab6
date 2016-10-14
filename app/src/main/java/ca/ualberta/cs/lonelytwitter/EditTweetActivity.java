package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EditTweetActivity extends Activity {

    private TextView textout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("title");
        textout = (TextView) findViewById(R.id.textView);
        textout.setText(text);
    }
}
