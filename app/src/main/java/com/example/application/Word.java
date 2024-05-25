package com.example.application;

public class Word {
    public int Id;
    public String WordAlt;
    public String WordRus;
    public String WordSoundOnRus;
    public String WordSoundOnAlt;
    public String WordImage;
    //public List<String> analogsList;

    public Word(){

    }

    public Word(int id, String wordAlt, String wordRus, String wordSoundRus, String wordSoundOnAlt, String wordImage){
        this.Id = id;
        this.WordAlt = wordAlt;
        this.WordRus = wordRus;
        this.WordSoundOnRus = wordSoundRus;
        this.WordImage = wordImage;
        this.WordSoundOnAlt = wordSoundOnAlt;
    }

    public int GetId(){
        return Id;
    }

    public void SetId(int id){
        this.Id = id;
    }

    public String GetWordAlt(){
        return WordAlt;
    }

    public void SetWordAlt(String wordaAlt){
        this.WordAlt = wordaAlt;
    }

    public String GetWordRus(){
        return WordRus;
    }

    public void SetWordRus(String wordRus){
        this.WordRus = wordRus;
    }

    public String GetWordOnRus(){
        return WordSoundOnRus;
    }

    public void SetWordOnRus(String wordSoundOnRus){
        this.WordSoundOnRus = wordSoundOnRus;
    }

    public String GetWordImage(){
        return WordImage;
    }

    public void SetWordImage(String wordImage){
        this.WordImage = wordImage;
    }

    public String GetWordOnAlt(){
        return WordSoundOnAlt;
    }

    public void SetWordOnAlt(String wordOnAlt){
        this.WordSoundOnAlt = wordOnAlt;
    }
}
