package com.send.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.userHolder> {
    MainActivity mainActivity;
    List<UserModel> userModelList;

    public UserAdapter(MainActivity mainActivity, List<UserModel> userModelList) {
        this.mainActivity = mainActivity;
        this.userModelList = userModelList;
    }

    @NonNull
    @Override
    public userHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new userHolder(LayoutInflater.from(mainActivity).inflate(R.layout.itemuser, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull userHolder holder, int position) {
        holder.text.setText(userModelList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    class userHolder extends RecyclerView.ViewHolder {
        TextView text;

        public userHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
        }
    }
}
