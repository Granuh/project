package com.example.application;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestTwoFragment extends Fragment {

    ProgressBar progressBar;
    GridLayout gridLayout;
    TextView tvAnalogs, tvRus, tvAlt;
    ImageView ivIcon, ivAudio2;
    Button bAnalogs, bWordNext;
    private WordModel wordModel;
    private TestModel testModel;
    private MediaPlayer mediaPlayer;
    private List<Word> words;
    private  List<Test> tests;
    private int index = 21;
    boolean IsVisible = false;
    int errNums = 0;
    RadioButton rbVariant_1,  rbVariant_2,  rbVariant_3,  rbVariant_4,  rbVariant_5;
    RadioGroup radioGroup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test_two, container, false);

        //progressBar = view.findViewById(R.id.progress_bar);

        //gridLayout = view.findViewById(R.id.grid_layout);

        //bAnalogs = view.findViewById(R.id.bAnalogs);
        bWordNext = view.findViewById(R.id.bWordNext);

        tvAlt = view.findViewById(R.id.tvAlt);
        //tvAnalogs = view.findViewById(R.id.tvAnalogs);

        ivIcon = view.findViewById(R.id.ivIcon);
        ivAudio2 = view.findViewById(R.id.ivAudio2);

        radioGroup = view.findViewById(R.id.id_radioGroup);

        rbVariant_1 = view.findViewById(R.id.rbVariant_1);
        rbVariant_2 = view.findViewById(R.id.rbVariant_2);
        rbVariant_3 = view.findViewById(R.id.rbVariant_3);
        rbVariant_4 = view.findViewById(R.id.rbVariant_4);

        wordModel = new WordModel(requireContext());
        words = wordModel.GetAllWords();

        testModel = new TestModel(requireContext());
        tests = testModel.GetAllTests();

        List<String> array = new ArrayList<>();

        for(Test test : tests){
            array.add(test.GetVariantCorrect());
        }

        updateFragment();

        Word word = words.get(index);

        bWordNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Слово не выбрано!", Toast.LENGTH_SHORT).show();
                } else {
                    int id = radioGroup.getCheckedRadioButtonId();
                    RadioButton rb = getView().findViewById(id);
                    String variant = rb.getText().toString();

                    if (array.get(index).equals(variant)){
                        Toast.makeText(getContext(), "Правильно!", Toast.LENGTH_SHORT).show();

                        index = (index + 1) % words.size();
                        updateFragment();
                        radioGroup.clearCheck();
                    } else {
                        Toast.makeText(getContext(), "Не правильно!", Toast.LENGTH_SHORT).show();
                        errNums++;
                    }
                }
            }
        });

        ivAudio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameWordSoundOnAlt();
            }
        });

        /*
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
        });*/

        return view;
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

    private void updateFragment(){
        if (index == 42){
            DialogFragment dialog = Dialog.newInstance(errNums, 2);
            dialog.show(getParentFragmentManager(), "Dialog");

            index = 21;
        }
        Word word = words.get(index);
        Test test = tests.get(index);

        tvAlt.setText(word.GetWordAlt());

        rbVariant_1.setText(test.GetVariantOne());
        rbVariant_2.setText(test.GetVariantTwo());
        rbVariant_3.setText(test.GetVariantFree());
        rbVariant_4.setText(test.GetVariantFour());

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