package com.example.application;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class VocabularyFragment extends Fragment {
    WordModel wordModel;
    TextView tvAlt, tvRus;
    EditText etWordOnAlt, etWordOnRus;
    ImageView imAudio;
    Button bAddWord;
    String strAlt, strRus, str;
    List<Word> words;
    RecyclerView recyclerView;
    WordAdapter wordAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vocabulary, container, false);

        bAddWord = view.findViewById(R.id.bAddWord);

        imAudio = view.findViewById(R.id.imAudio);

        tvAlt = view.findViewById(R.id.tvAlt);
        tvRus = view.findViewById(R.id.tvRus);

        etWordOnAlt = view.findViewById(R.id.etWordOnAlt);
        etWordOnRus = view.findViewById(R.id.etWordOnRus);

        recyclerView = view.findViewById(R.id.recycleView);

        wordModel = new WordModel(getContext());
        words = wordModel.GetAllWords();

        wordAdapter = new WordAdapter(requireContext(), words);
        recyclerView.setAdapter(wordAdapter);

        bAddWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Word word = new Word();
                String alt = etWordOnAlt.getText().toString();
                String rus = etWordOnRus.getText().toString();

                if (alt.equals("") || rus.equals("")) {
                    Toast.makeText(requireContext(), "Поля пустые!", Toast.LENGTH_SHORT).show();
                    return;
                }

                word.SetWordAlt(alt);
                word.SetWordRus(rus);

                wordModel.CreateWord(word);

                words = wordModel.GetAllWords();

                UpdateAdapter(requireContext(), words, recyclerView, wordAdapter);
            }
        });

        /*imAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameWordSoundOnRus();
            }
        });*/

        //tvAlt1.setText(str);

        return view;
    }

    private void UpdateAdapter(Context context, List<Word> words, RecyclerView recyclerView, WordAdapter wordAdapter){
        wordAdapter = new WordAdapter(context, words);
        recyclerView.setAdapter(wordAdapter);
    }
}