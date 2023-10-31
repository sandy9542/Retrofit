package com.send.retrofit;

import static androidx.constraintlayout.widget.ConstraintLayoutStates.TAG;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.send.retrofit.apis.ApiInterface;
import com.send.retrofit.model.Student;
import com.send.retrofit.model.UserModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static String api = "https://jsonplaceholder.typicode.com";
    List<UserModel> userModelList;

    RecyclerView rcvMain;

//    Button postBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvMain = findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new LinearLayoutManager(this));
//        postBtn = findViewById(R.id.postBtn);
//        postBtn.setOnClickListener(view -> postBtn());
        RetrofitInstance.getInstance().apiInterface.getUser().enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                userModelList = response.body();
                rcvMain.setAdapter(new UserAdapter(MainActivity.this, userModelList));
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                Log.e("api", "onFailure:" + t.getLocalizedMessage());
            }
        });

//        ApiInterface apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);
//        Call<List<Student>> studentCall = apiInterface.getData();
//        studentCall.enqueue(new Callback<List<Student>>() {
//            @Override
//            public void onResponse(Call<List<Student>> call, Response<List<Student>> response) {
//                Log.e(TAG, "on Response" + response.code());
//            }
//
//            @Override
//            public void onFailure(Call<List<Student>> call, Throwable t) {
//
//            }
//        });
    }

//    private void postBtn() {
//    }
}