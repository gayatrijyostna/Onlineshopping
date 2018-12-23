package com.example.mvdprasad.online_shopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

public class order extends AppCompatActivity {
    private RecyclerView recyclerView;
    String[] arr={"In process","completed","In process","In process"};
    String[] arr1={"Order Number 12","Order Number 13","Order Number 14","Order Number 15"};
    String[] arr2={"2017-4-4","2017-4-3","2017-4-4","2017-4-4"};
    private  Integer[] Images={R.drawable.order,R.drawable.order,R.drawable.order,R.drawable.order};
    private ArrayAdapter<String> adapter;
    private RecyclerAdapter_order recycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        recyclerView=findViewById(R.id.recycle1);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager staggeredGridLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(staggeredGridLayoutManager );
        recycler = new RecyclerAdapter_order(this,arr,Images,arr1,arr2);
        recyclerView.setAdapter(recycler);
        recycler.notifyDataSetChanged();
    }
    }

