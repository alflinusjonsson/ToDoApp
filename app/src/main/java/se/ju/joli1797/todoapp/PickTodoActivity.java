package se.ju.joli1797.todoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

public class PickTodoActivity extends AppCompatActivity {

    final static Integer DELETE = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pick_todo);

        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<Data.ToDo>(
                this,
                android.R.layout.simple_list_item_1,
                Data.todos

        ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int request = getIntent().getIntExtra("type",0);

                if(request == 1) // SELECT
                {
                    Intent intent = new Intent(PickTodoActivity.this, ViewTodoActivity.class);
                    intent.putExtra("todoIndex",Data.todos.get(position).toString());
                    startActivity(intent);
                }

                else if(request == 2) // DELETE
                {
                    Intent intent = new Intent(PickTodoActivity.this, DeleteActivity.class);
                    intent.putExtra("todoIndex",Data.todos.get(position).toString());
                    intent.putExtra("index",position);
                    startActivityForResult(intent, DELETE);
                }

            }
        });

    }

}


