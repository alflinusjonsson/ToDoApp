package se.ju.joli1797.todoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void createButtonClicked(View view) {

        EditText todo_input = (EditText) findViewById(R.id.enteredTitle);
        String new_todo = todo_input.getText().toString();

        Data.todos.add(new Data.ToDo(new_todo));
        finish();
    }
}