package com.example.application;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialog extends AppCompatDialogFragment {
    int number = 0;
    static int n = 0;

    public static Dialog newInstance(int errNum, int num){
        Dialog dialog = new Dialog();
        Bundle args = new Bundle();
        args.putInt("errNum", errNum);
        args.putInt("1", num);
        n = num;
        dialog.setArguments(args);
        return dialog;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null){
            number = getArguments().getInt("errNum");
        }
    }

    public android.app.Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog, null);

        builder.setView(view)
                .setTitle("Ваш результат")
                .setMessage("Кол-во ошибок: " + number + "\nХотите ещё раз пройти тест?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if (n == 1) {
                            Intent intent = new Intent(requireContext(), test_1.class);
                            //intent.putExtra("login", login);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        } else if (n == 2) {
                            Intent intent = new Intent(requireContext(), test_2.class);
                            //intent.putExtra("login", login);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        } else if (n == 3) {
                            Intent intent = new Intent(requireContext(), test_3.class);
                            //intent.putExtra("login", login);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        } else if (n == 4) {
                            Intent intent = new Intent(requireContext(), test_4.class);
                            //intent.putExtra("login", login);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        } else if (n == 5) {
                            Intent intent = new Intent(requireContext(), test_5.class);
                            //intent.putExtra("login", login);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }
                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                        Intent intent = new Intent(requireContext(), activity_test.class);
                        //intent.putExtra("login", login);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                });
        return builder.create();
    }
}
