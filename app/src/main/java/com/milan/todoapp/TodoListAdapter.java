package com.milan.todoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.TodoViewholder> {
//    List<Todo> todos;
//
//    public TodoListAdapter(List<Todo> todos) {
//        this.todos = todos;
//    }

    @NonNull
    @Override
    public TodoViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todo,parent,false);
        return new TodoViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewholder holder, int position) {
//        holder.bindView(todos.get(position));
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class TodoViewholder extends RecyclerView.ViewHolder{

        TextView tvTodoTitle;
        public TodoViewholder(@NonNull View itemView) {
            super(itemView);
            tvTodoTitle = itemView.findViewById(R.id.tv_todo_title);
        }

        public void bindView ( Todo todo) {
            tvTodoTitle.setText(todo.getTitle());
        }
    }
}
