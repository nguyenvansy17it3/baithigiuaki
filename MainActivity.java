package com.example.nguyenvansy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList;
    ArrayAdapter adapter;
    Button btn;
    TextView textView;
    ListView lvkq;
    TextView kqtv;
    EditText editnhap1;
    EditText editnhap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        textView = (TextView)findViewById (R.id.textView);
        kqtv =(TextView)findViewById (R.id.kqtv);
        btn = (Button) findViewById (R.id.btn);
        editnhap1 = (EditText) findViewById (R.id.editnhap1);
        editnhap2 = (EditText) findViewById (R.id.editnhap2);
        lvkq = (ListView) findViewById (R.id.lvkq);

        arrayList = new ArrayList<> ();
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
        btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                try {
                    double value1  = Double.parseDouble(String.valueOf(editnhap1.getText())) ;
                    double value2  = Double.parseDouble(String.valueOf(editnhap2.getText())) ;
                    double valuekq = value1 / value2 ;
                    kqtv.setText(value1 + "/" + value2 + "=" + valuekq);
                    arrayList.add (value1 + "/" + value2 + "=" + valuekq);

                }
                catch (Exception e) {
                    Toast.makeText (MainActivity.this, "Sai dinh dang moi ban nhap lai", Toast.LENGTH_SHORT).show ();
                }

            }
        });
    }
}
