package com.example.application;

public class WordAnalogs {
    public int Id;
    public String WordAnalogsAlt;
    public String WordAnalogsRus;
    public String WordAnalogsImage;

    public WordAnalogs(int id, String wordAnalogsAlt, String wordAnalogsRus, String wordAnalogsImage){
        this.Id = id;
        this.WordAnalogsAlt = wordAnalogsAlt;
        this.WordAnalogsRus = wordAnalogsRus;
        this.WordAnalogsImage = wordAnalogsImage;
    }

    public int GetId(){
        return Id;
    }

    public void SetId(int id){
        this.Id = id;
    }

    public String GetWordAnalogsAlt(){
        return WordAnalogsAlt;
    }

    public void SetWordAnalogsAlt(String wordAnalogsAlt) {
        this.WordAnalogsAlt = wordAnalogsAlt;
    }

    public String GetWordAnalogsRus(){
        return WordAnalogsRus;
    }
    public void SetWordAnalogsRus(String wordAnalogsRus){
        this.WordAnalogsRus = wordAnalogsRus;
    }

    public String GetWordAnalogsImage(){
        return WordAnalogsImage;
    }

    public void SetWordAnalogsImage(String wordAnalogsImage){
        this.WordAnalogsImage =wordAnalogsImage;
    }
}
