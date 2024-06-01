package com.example.application;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class WordAdapterAnalogs extends RecyclerView.Adapter<WordAdapterAnalogs.ViewHolder> {
    List<WordAnalogs> wordsAnalogs;
    LayoutInflater inflater;
    TextToSpeech textToSpeech;
    private final OnWordAnalogsClickListener onWordAnalogsClickListener;

    interface OnWordAnalogsClickListener{
        void onWordAnalogsClick(WordAnalogs wordAnalogs, int position);
    }

    public WordAdapterAnalogs(Context context, List<WordAnalogs> WordsAnalogs, OnWordAnalogsClickListener onWordAnalogsClickListener) {
        this.inflater = LayoutInflater.from(context);
        this.wordsAnalogs = WordsAnalogs;
        this.onWordAnalogsClickListener = onWordAnalogsClickListener;
    }

    @NonNull
    @Override
    public WordAdapterAnalogs.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.word_analogs_list, parent, false);

        return new ViewHolder(view, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull WordAdapterAnalogs.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        WordAnalogs wordAnalogs = wordsAnalogs.get(position);

        holder.tvAnalogsAlt.setText(wordAnalogs.GetWordAnalogsAlt());
        holder.tvAnalogsRus.setText(wordAnalogs.GetWordAnalogsRus());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onWordAnalogsClickListener.onWordAnalogsClick(wordAnalogs, position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return wordsAnalogs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvAnalogsAlt, tvAnalogsRus;
        //ImageView bImageView;
        //MediaPlayer mediaPlayer;
        Context context;

        public ViewHolder(View itemView, Context context) {
            super(itemView);

            tvAnalogsAlt = itemView.findViewById(R.id.tvAnalogsAlt);
            tvAnalogsRus = itemView.findViewById(R.id.tvAnalogsRus);
            //tvAnalogs = view.findViewById(R.id.tvAnalogs);
            //tvAssociacWord = view.findViewById(R.id.tvAssociacWord);

            //bImageView = itemView.findViewById(R.id.imAudio);

            //mediaPlayer = new MediaPlayer();
            this.context = context;
        }
    }

}

