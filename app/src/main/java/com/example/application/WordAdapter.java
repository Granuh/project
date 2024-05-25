package com.example.application;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeechService;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import com.bumptech.glide.Glide;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder> {
    private List<Word> words;
    private LayoutInflater inflater;
    private TextToSpeech textToSpeech;

    public WordAdapter(Context context, List<Word> words) {
        this.inflater = LayoutInflater.from(context);
        this.words = words;
    }

    @NonNull
    @Override
    public WordAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.word_list, parent, false);

        return new ViewHolder(view, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull WordAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Word word = words.get(position);

        holder.tvAlt.setText(word.GetWordAlt());
        holder.tvRus.setText(word.GetWordRus());
        //holder.tvAssociacWord.setText(word.GetWordImage());

        holder.bImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Speak(holder.tvAlt.getText().toString());
                //Speak(holder.tvRus.getText().toString());

                try {
                    if (holder.mediaPlayer == null) {
                        holder.mediaPlayer = new MediaPlayer();
                    } else {
                        holder.mediaPlayer.reset();
                    }

                    int soundResource = holder.context.getResources().getIdentifier(word.GetWordOnRus(), "raw", holder.context.getPackageName());
                    if (soundResource != 0) {
                        holder.mediaPlayer.setDataSource(holder.context, Uri.parse("android.resource://" + holder.context.getPackageName() + "/" + soundResource));
                    } else {
                        Toast.makeText(holder.context, "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    holder.mediaPlayer.prepare();
                    holder.mediaPlayer.start();
                } catch (IOException e) {
                    Toast.makeText(holder.context, "Ошибка с воспроизведением audio!", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    private void Speak(String str) {
        textToSpeech = new TextToSpeech(inflater.getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(new Locale("ky-KY"));
                    textToSpeech.speak(str, TextToSpeech.QUEUE_FLUSH, null, null);
                }
            }
        });
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvAlt, tvRus;
        ImageView bImageView;
        MediaPlayer mediaPlayer;
        Context context;

        public ViewHolder(View itemView, Context context) {
            super(itemView);

            tvAlt = itemView.findViewById(R.id.tvAlt);
            tvRus = itemView.findViewById(R.id.tvRus);
            //tvAnalogs = view.findViewById(R.id.tvAnalogs);
            //tvAssociacWord = view.findViewById(R.id.tvAssociacWord);

            bImageView = itemView.findViewById(R.id.imAudio);

            mediaPlayer = new MediaPlayer();
            this.context = context;
        }
    }
}