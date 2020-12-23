package com.example.thecoffeehouse_main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView list1,list2,list3;
    List<MonAn> monAn1,monAn2,monAn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       list1=findViewById(R.id.list1);
        list2=findViewById(R.id.list2);
        list3=findViewById(R.id.list3);

        monAn1= new ArrayList<>();
        monAn2= new ArrayList<>();
        monAn3= new ArrayList<>();

        monAn1.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn1.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn1.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn1.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));

        monAn2.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn2.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn2.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn2.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));

        monAn3.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn3.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn3.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));
        monAn3.add(new MonAn("Mua 4 Tặng 2-Ăn Bánh","uống trà,kể chuyện Thanh...","Nhập THANHXUAN,Nhà mời","ngay ưu đãi Mua 4 Tặng  để,","cả team chúng mình thoải mái","Order Ngay",R.drawable.img1));


        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        list1.setLayoutManager(manager1);

        MonAnAdapter anAdapter1 = new MonAnAdapter(this,monAn1);
        list1.setAdapter(anAdapter1);

        LinearLayoutManager manager2 = new LinearLayoutManager(this);
        manager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        list2.setLayoutManager(manager2);

        MonAnAdapter anAdapter2 = new MonAnAdapter(this,monAn2);
        list2.setAdapter(anAdapter2);


        LinearLayoutManager manager3 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        list3.setLayoutManager(manager1);

        MonAnAdapter anAdapter3 = new MonAnAdapter(this,monAn3);
        list3.setAdapter(anAdapter3);

    }
}