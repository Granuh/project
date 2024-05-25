package com.example.application;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import com.bumptech.glide.Glide;

public class Main2Fragment extends Fragment {

    ProgressBar progressBar;
    GridLayout gridLayout;
    TextView tvAnalogs, tvRus, tvAlt;
    ImageView ivIcon, ivAudio1, ivAudio2;
    Button bAnalogs, bWordNext;
    private WordModel wordModel;
    private MediaPlayer mediaPlayer;
    private List<Word> words;
    private int index = 0;
    boolean IsVisible = false;
    RecyclerView recyclerView;
    WordAdapter wordAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main2, container, false);

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_main2, container, false);

        progressBar = view.findViewById(R.id.progress_bar);

        gridLayout = view.findViewById(R.id.grid_layout);

        bAnalogs = view.findViewById(R.id.bAnalogs);
        bWordNext = view.findViewById(R.id.bWordNext);

        tvAlt = view.findViewById(R.id.tvAlt);
        tvRus = view.findViewById(R.id.tvRus);
        tvAnalogs = view.findViewById(R.id.tvAnalogs);

        ivIcon = view.findViewById(R.id.ivIcon);
        ivAudio1 = view.findViewById(R.id.ivAudio1);
        ivAudio2 = view.findViewById(R.id.ivAudio2);

        recyclerView = view.findViewById(R.id.recycleView);

        wordModel = new WordModel(requireContext());
        words = wordModel.GetAllWords();

        wordAdapter = new WordAdapter(requireContext(), words);
        recyclerView.setAdapter(wordAdapter);

        updateFragment();

        Word word = words.get(index);

        bWordNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = (index + 1) % words.size();
                updateFragment();
            }
        });

        ivAudio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameWordSoundOnRus();
            }
        });

        ivAudio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameWordSoundOnAlt();
            }
        });

        bAnalogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (IsVisible) {
                    gridLayout.setVisibility(View.GONE);
                    progressBar.setVisibility(View.GONE);
                    tvAnalogs.setVisibility(View.GONE);
                    IsVisible = false;
                }
                else {
                    gridLayout.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.VISIBLE);
                    tvAnalogs.setVisibility(View.VISIBLE);
                    tvAnalogs.setText("118/153 %");
                    IsVisible = true;
                }
            }
        });

        return  view;
    }

    private void GameWordSoundOnAlt() {
        Word word = words.get(index);
        if (word != null && !TextUtils.isEmpty(word.GetWordOnAlt())) {
            try {
                if (mediaPlayer == null) {
                    mediaPlayer = new MediaPlayer();
                } else {
                    mediaPlayer.reset();
                }

                int soundResource = getResources().getIdentifier(word.GetWordOnAlt(), "raw", requireContext().getPackageName());
                if (soundResource != 0) {
                    mediaPlayer.setDataSource(requireContext(), Uri.parse("android.resource://" + requireContext().getPackageName() + "/" + soundResource));
                } else {
                    Toast.makeText(getContext(), "Ошибка с воспроизведением audio2!", Toast.LENGTH_SHORT).show();
                    return;
                }

                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e) {
                Toast.makeText(getContext(), "Ошибка с воспроизведением audio2!", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }
    }

    private void GameWordSoundOnRus() {
        Word word = words.get(index);
        if (word != null && !TextUtils.isEmpty(word.GetWordOnRus())) {
            try {
                if (mediaPlayer == null) {
                    mediaPlayer = new MediaPlayer();
                } else {
                    mediaPlayer.reset();
                }

                int soundResource = getResources().getIdentifier(word.GetWordOnRus(), "raw", requireContext().getPackageName());
                if (soundResource != 0) {
                    mediaPlayer.setDataSource(requireContext(), Uri.parse("android.resource://" + requireContext().getPackageName() + "/" + soundResource));
                } else {
                    Toast.makeText(getContext(), "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                    return;
                }

                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e) {
                Toast.makeText(getContext(), "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }
    }

    private void updateFragment(){
        if (index == 21) {
            index = 0;
        }
        Word word = words.get(index);

        tvAlt.setText(word.GetWordAlt());
        tvRus.setText(word.GetWordRus());

        if (word.GetWordImage() != null && !word.GetWordImage().isEmpty()) {
            int resImage = getResources().getIdentifier(word.GetWordImage(), "drawable", requireContext().getPackageName());
            if (resImage != 0){
                Glide.with(this)
                        .load(resImage)
                        .into(ivIcon);
            } else {
                ivIcon.setImageResource(R.drawable.alert);
            }
        }
        else {
            ivIcon.setImageResource(R.drawable.alert);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}