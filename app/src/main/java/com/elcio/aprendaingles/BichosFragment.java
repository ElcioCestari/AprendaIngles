package com.elcio.aprendaingles;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BichosFragment extends Fragment implements View.OnClickListener {

    MediaPlayer mediaPlayer;

    // this imageViews represents every animal that must be execute a sound.
    ImageView imgCao,
            imgGato,
            imgVaca,
            imgOvelha,
            imgMacaco,
            imgLeao;

    public BichosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        imgCao = view.findViewById(R.id.imgCao);
        imgGato = view.findViewById(R.id.imgGato);
        imgVaca = view.findViewById(R.id.imgVaca);
        imgOvelha = view.findViewById(R.id.imgOvelha);
        imgMacaco = view.findViewById(R.id.imgMacaco);
        imgLeao = view.findViewById(R.id.imgLeao);

        imgCao.setOnClickListener(this);
        imgGato.setOnClickListener(this);
        imgVaca.setOnClickListener(this);
        imgOvelha.setOnClickListener(this);
        imgMacaco.setOnClickListener(this);
        imgLeao.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgCao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                playSound();
                break;
            case R.id.imgGato:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                playSound();
                break;
            case R.id.imgLeao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                playSound();
                break;
            case R.id.imgVaca:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                playSound();
                break;
            case R.id.imgOvelha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                playSound();
                break;
            case R.id.imgMacaco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
                playSound();
                break;

        }

    }

    private void playSound() {
        if (mediaPlayer != null) {
            mediaPlayer.start();

            // quando o som terminar libera os recursos de midia player do android
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }
}
