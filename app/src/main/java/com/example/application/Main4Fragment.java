package com.example.application;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.speech.tts.TextToSpeech;
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

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Main4Fragment extends Fragment {

    ProgressBar progressBar;
    GridLayout gridLayout;
    TextView tvAnalogsAlt, tvAnalogsRus, tvRus, tvAlt;
    ImageView ivIcon, ivAudio1, ivAudio2;
    Button bAnalogs, bWordNext;
    private WordModel wordModel;
    private WordAnalogsModel wordAnalogs;
    private List<WordAnalogs> wordsAnalogs;
    private Word word;
    private DataBaseBHelper dataBaseBHelper;
    private MediaPlayer mediaPlayer;
    private List<Word> words;
    private int index = 42;
    boolean IsVisible = false;
    private int WordAnalogsIndex = 126;
    RecyclerView recyclerView;
    WordAdapter wordAdapter;
    WordAdapterAnalogs wordAdapterAnalogs;
    TextToSpeech textToSpeech;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main4, container, false);

        progressBar = view.findViewById(R.id.progress_bar);

        bWordNext = view.findViewById(R.id.bWordNext);

        tvAlt = view.findViewById(R.id.tvAlt);
        tvRus = view.findViewById(R.id.tvRus);
        tvAnalogsAlt = view.findViewById(R.id.tvAnalogsAlt);
        tvAnalogsRus = view.findViewById(R.id.tvAnalogsRus);

        recyclerView = view.findViewById(R.id.recycleView_2);

        ivIcon = view.findViewById(R.id.ivIcon);
        ivAudio1 = view.findViewById(R.id.ivAudio1);
        ivAudio2 = view.findViewById(R.id.ivAudio2);

        wordModel = new WordModel(requireContext());
        words = wordModel.GetAllWords();

        wordAnalogs = new WordAnalogsModel(requireContext());
        wordsAnalogs = wordAnalogs.GetAllWordsAnalogsId(WordAnalogsIndex, 3);

        WordAdapterAnalogs.OnWordAnalogsClickListener wordAnalogsClickListener = new WordAdapterAnalogs.OnWordAnalogsClickListener() {
            @Override
            public void onWordAnalogsClick(WordAnalogs wordAnalogs, int position) {
                //Toast.makeText(requireContext(), "Было выбрано слово " + wordAnalogs.GetWordAnalogsAlt(), Toast.LENGTH_SHORT).show();
                updateFragmentWord(position);
            }
        };

        wordAdapterAnalogs = new WordAdapterAnalogs(requireContext(), wordsAnalogs, wordAnalogsClickListener);

        recyclerView.setAdapter(wordAdapterAnalogs);

        updateFragment();

        Word word = words.get(index);

        UpdateAdapter(requireContext(), wordsAnalogs, recyclerView, wordAnalogsClickListener);

        bWordNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = (index + 1) % words.size();
                WordAnalogsIndex = WordAnalogsIndex + 3;
                updateFragment();
                wordsAnalogs = wordAnalogs.GetAllWordsAnalogsId(WordAnalogsIndex, 3);
                UpdateAdapter(requireContext(), wordsAnalogs, recyclerView, wordAnalogsClickListener);
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

        return view;
    }

    private void updateFragmentWord(int postion) {
        WordAnalogs wordAnalogs = wordsAnalogs.get(postion);

        tvAlt.setText(wordAnalogs.GetWordAnalogsAlt());
        tvRus.setText(wordAnalogs.GetWordAnalogsRus());

        if (wordAnalogs.GetWordAnalogsImage() != null && !wordAnalogs.GetWordAnalogsImage().isEmpty()) {
            int resImage = getResources().getIdentifier(wordAnalogs.GetWordAnalogsImage(), "drawable", requireContext().getPackageName());
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

    private void UpdateAdapter(Context context, List<WordAnalogs> wordsAnalogs, RecyclerView recyclerView, WordAdapterAnalogs.OnWordAnalogsClickListener wordAnalogsClickListener){
        wordAdapterAnalogs = new WordAdapterAnalogs(context, wordsAnalogs, wordAnalogsClickListener);
        recyclerView.setAdapter(wordAdapterAnalogs);
    }

    private void GameWordSoundOnAlt() {
        Word word = words.get(index);
        String str = tvAlt.getText().toString();

        if (word != null && !TextUtils.isEmpty(word.GetWordOnAlt())) {
            try {
                if (mediaPlayer == null) {
                    mediaPlayer = new MediaPlayer();
                } else {
                    mediaPlayer.reset();
                }

                if (word.GetWordOnAlt() != null && word.GetWordOnAlt().equals(str)) {
                    int soundResource = getResources().getIdentifier(word.GetWordOnAlt(), "raw", requireContext().getPackageName());
                    if (soundResource != 0) {
                        mediaPlayer.setDataSource(requireContext(), Uri.parse("android.resource://" + requireContext().getPackageName() + "/" + soundResource));
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    } else {
                        //Toast.makeText(requireContext(), "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                        SpeakOnAlt(str);
                    }
                } else {
                    SpeakOnAlt(tvAlt.getText().toString());
                }
            } catch (IOException e) {
                Toast.makeText(requireContext(), "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }
    }

    private void GameWordSoundOnRus() {
        Word word = words.get(index);
        String str = tvAlt.getText().toString();

        if (word != null && !TextUtils.isEmpty(word.GetWordOnRus())) {
            try {
                if (mediaPlayer == null) {
                    mediaPlayer = new MediaPlayer();
                } else {
                    mediaPlayer.reset();
                }

                if (word.GetWordOnRus() != null && word.GetWordOnRus().equals(str)) {
                    int soundResource = getResources().getIdentifier(word.GetWordOnRus(), "raw", requireContext().getPackageName());
                    if (soundResource != 0) {
                        mediaPlayer.setDataSource(requireContext(), Uri.parse("android.resource://" + requireContext().getPackageName() + "/" + soundResource));
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    } else {
                        //Toast.makeText(requireContext(), "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                        SpeakOnAlt(str);
                    }
                } else {
                    SpeakOnRus(tvRus.getText().toString());
                }
            } catch (IOException e) {
                Toast.makeText(requireContext(), "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }
    }

    private void SpeakOnRus(String str) {
        textToSpeech = new TextToSpeech(requireContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(new Locale("ru-RU"));
                    textToSpeech.speak(str, TextToSpeech.QUEUE_FLUSH, null, null);
                }
            }
        });
    }

    private void SpeakOnAlt(String str) {
        textToSpeech = new TextToSpeech(requireContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(new Locale("ky-KY"));
                    textToSpeech.speak(str, TextToSpeech.QUEUE_FLUSH, null, null);
                }
            }
        });
    }

    private void updateFragment(){
        if (index == 63){
            index = 42;
        }  if (WordAnalogsIndex == 189) {
            WordAnalogsIndex = 126;
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