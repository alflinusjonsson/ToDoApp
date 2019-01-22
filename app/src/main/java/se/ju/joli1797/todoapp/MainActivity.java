package se.ju.joli1797.todoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    public static int SELECT = 1;
    public static int DELETE = 2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createButtonClicked(View view) {

        Intent intent = new Intent(this, CreateActivity.class);
        startActivity(intent);
    }

    public void selectButtonClicked(View view) {

        Intent intent = new Intent(this, PickTodoActivity.class);
        intent.putExtra("type",SELECT);
        startActivity(intent);
    }

    public void deleteButtonClicked(View view) {

        Intent intent = new Intent(this, PickTodoActivity.class);
        intent.putExtra("type",DELETE);
        startActivity(intent);
    }

}
