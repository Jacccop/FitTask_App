package com.example.fittask;

import androidx.appcompat.app.AppCompatActivity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Kód pre načítavanie hodnôt z accelerometra, neskôr sa presunie, zatiaľ bude tu
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference X = database.getReference("X");
        DatabaseReference Y = database.getReference("Y");
        DatabaseReference Z = database.getReference("Z");

        X.addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                Toast.makeText(MainActivity.this,""+value,Toast.LENGTH_LONG).show();
            }
            public void onCancelled(DatabaseError error) {
            }
        });

        Y.addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                Toast.makeText(MainActivity.this,""+value,Toast.LENGTH_LONG).show();
            }
            public void onCancelled(DatabaseError error) {
            }
        });

        Z.addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                Toast.makeText(MainActivity.this,""+value,Toast.LENGTH_LONG).show();
            }
            public void onCancelled(DatabaseError error) {
            }
        });
    }
    //****************************************************************************************************

}
