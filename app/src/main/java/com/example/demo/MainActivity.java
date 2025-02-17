package com.example.demo;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private List<Pojo> samsungPojos;
    private List<Pojo> ApplePojos;
    private List<Pojo> oppoPojos;
    private ChipGroup chipGroup ;
    private Adapter adapter ;
    private String textName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       recyclerView = findViewById(R.id.main_rv) ;

       recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this) ;
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        chipGroup = findViewById(R.id.main_chips_group) ;
        chipGroup.setSingleSelection(true);
        samsung();
        apple();
        oppo();
        setUpChipGroup();

    }
    void setUpChipGroup(){
        for (int i = 0 ; i < chipGroup.getChildCount() ; i++){
            Chip chip =(Chip) chipGroup.getChildAt(i) ;
            chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        textName = chip.getText().toString() ;
                        Toast.makeText(MainActivity.this, textName, Toast.LENGTH_SHORT).show();
                        selectList(textName);
                    }
                }
            });
        }
    }

    void selectList(String name){
        switch (name){
            case "Samsung" : adapter = new Adapter(MainActivity.this , samsungPojos) ;
                             recyclerView.setAdapter(adapter);
                             break ;
            case "Apple" : adapter = new Adapter(MainActivity.this , ApplePojos) ;
                recyclerView.setAdapter(adapter);
                break ;
            case "Oppo" : adapter = new Adapter(MainActivity.this , oppoPojos) ;
                recyclerView.setAdapter(adapter);
                break ;
        }
    }

    void samsung(){
        samsungPojos = new ArrayList<>() ;
        samsungPojos.add(new Pojo("Galaxy A15" , "Smart Android phone ","G"));
        samsungPojos.add(new Pojo("A50" , "Smart Android phone ","A"));
        samsungPojos.add(new Pojo("Galaxy A15" , "Smart Android phone ","G"));
        samsungPojos.add(new Pojo("Galaxy A15" , "Smart Android phone ","G"));
        samsungPojos.add(new Pojo("Smart Galaxy  A15" , "Smart Android phone ","S"));
        samsungPojos.add(new Pojo("Galaxy A15" , "Smart Android phone ", "G"));
        samsungPojos.add(new Pojo("Galaxy A15" , "Smart Android phone " , "G"));
        samsungPojos.add(new Pojo("Galaxy A15" , "Smart Android phone " , "G"));
        samsungPojos.add(new Pojo("Galaxy A15" , "Smart Android phone " , "G"));
    }
    void apple(){
        ApplePojos = new ArrayList<>() ;
        ApplePojos.add(new Pojo("iphone 3" , "First Generation of iphone" , "i"));
        ApplePojos.add(new Pojo("iphone 4" , "More Features" , "i"));
        ApplePojos.add(new Pojo("iphone 5" , "the coolest guy" , "i"));
        ApplePojos.add(new Pojo("iphone 6" , "start to be rich" , "i"));
        ApplePojos.add(new Pojo("iphone 7" , "Much bigger" , "i"));

    }
    void oppo(){
        oppoPojos = new ArrayList<>() ;
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
        oppoPojos.add(new Pojo("Oppo Phone" , "new Oppo Phone ", "O"));
    }
}