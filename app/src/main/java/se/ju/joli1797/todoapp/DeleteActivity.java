package se.ju.joli1797.todoapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class DeleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        TextView textView = (TextView) findViewById(R.id.textView2);
        String text = getIntent().getStringExtra("todoIndex");
        textView.setText(text);
    }

        public void deleteButtonPressed(View view) {

            new AlertDialog.Builder(this)
                .setTitle("Delete ToDo")
                .setMessage("Do you really want to delete it?")
                .setPositiveButton(
                        android.R.string.yes,
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int whichButton){

                                int index = getIntent().getIntExtra("index",0);

                                Data.todos.remove(index);
                                setResult(RESULT_OK);
                                finish();
                            }
                        }
                ).setNegativeButton(
                        android.R.string.no,
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int whichButton){
                                finish();
                            }
                        }
                ).show();

        }
}
