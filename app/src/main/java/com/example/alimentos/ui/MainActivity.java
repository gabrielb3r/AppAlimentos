package com.example.alimentos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.alimentos.adapter.FoodAdapter;
import com.example.alimentos.business.FoodBusiness;
import com.example.alimentos.entity.FoodEntity;
import com.example.alimentos.R;
import com.example.alimentos.repository.FoodRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FoodEntity> list = new FoodBusiness().getList();

        //Obter a recyclerview
        this.mViewHolder.mRecyclerFood = findViewById(R.id.recycler_food);

        //definir um adapter
        FoodAdapter adapter = new FoodAdapter();
        this.mViewHolder.mRecyclerFood.setAdapter(adapter);

        //definir um layout da linha
        this.mViewHolder.mRecyclerFood.setLayoutManager(new LinearLayoutManager(this));
    }

    private static class ViewHolder {
        RecyclerView mRecyclerFood;
    }
}