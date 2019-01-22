package se.ju.joli1797.todoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ViewTodoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        String text = getIntent().getStringExtra("todoIndex");
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(text);
        setContentView(textView);

    }
}