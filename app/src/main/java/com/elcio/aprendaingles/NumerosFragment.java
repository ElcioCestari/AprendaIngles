package com.elcio.aprendaingles;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NumerosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener {

    MediaPlayer mediaPlayer;
    ImageView imgUm, imgDois, imgTres, imgQuatro, imgCinco, imgSeis;

    public NumerosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_numeros, container, false);


        imgUm = view.findViewById(R.id.imgUm);
        imgDois = view.findViewById(R.id.imgDois);
        imgTres = view.findViewById(R.id.imgTres);
        imgQuatro = view.findViewById(R.id.imgQuatro);
        imgCinco = view.findViewById(R.id.imgCinco);
        imgSeis = view.findViewById(R.id.imgSeis);


        imgUm.setOnClickListener(this);
        imgDois.setOnClickListener(this);
        imgTres.setOnClickListener(this);
        imgQuatro.setOnClickListener(this);
        imgCinco.setOnClickListener(this);
        imgSeis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgUm:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                PlaySound();
                break;
            case R.id.imgDois:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                PlaySound();
                break;
            case R.id.imgTres:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                PlaySound();
                break;
            case R.id.imgQuatro:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                PlaySound();
                break;
            case R.id.imgCinco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                PlaySound();
                break;
            case R.id.imgSeis:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
                PlaySound();
                break;
        }
    }

    private void PlaySound() {
        if(mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }
}
