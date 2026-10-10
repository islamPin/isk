    package com.example.tty2;

    import android.os.Bundle;
    import androidx.recyclerview.widget.LinearLayoutManager;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
    private RecyclerView car_tv;
    private ArrayList<String>carList=new ArrayList<>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

            car_tv = findViewById(R.id.tv_car);

            loadData();

            CarAdapters carAdapters = new CarAdapters(carList);

            car_tv.setAdapter(carAdapters);


        }

        private void loadData() {
            carList.add("Тайота");
             carList.add("Лексус");
             carList.add("Ауди");
             carList.add("ВМБ");
             carList.add("Мерс");
            carList.add("Субару");
             carList.add("Голфь");
             carList.add("Нисан");
             carList.add("Тайота");
             carList.add("Тайота");
             carList.add("Тайота");
             carList.add("Тайота");
             carList.add("Тайота");
             carList.add("Тайота");
             carList.add("Тайота");
             carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");
    carList.add("Тайота");

        }
    }