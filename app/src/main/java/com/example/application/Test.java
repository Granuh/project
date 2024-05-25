package com.example.application;

public class Test {
    public int Id;
    public String VariantOne;
    public String VariantTwo;
    public String VariantFree;
    public String VariantFour;
    public String VariantCorrect;

    public Test(){

    }

    public Test(int id, String var1, String var2, String var3, String var4, String varCor){
        this.Id = id;
        this.VariantOne = var1;
        this.VariantTwo = var2;
        this.VariantFree = var3;
        this.VariantFour = var4;
        this.VariantCorrect = varCor;
    }

    public int getId() {
        return Id;
    }

    public void SetId(int id){
        this.Id = id;
    }

    public String GetVariantOne(){
        return VariantOne;
    }

    public void SetVariantOne(String var1){
        this.VariantOne = var1;
    }

    public String GetVariantTwo(){
        return VariantTwo;
    }

    public void SetVariantTwo(String var2){
        this.VariantTwo = var2;
    }

    public String GetVariantFree(){
        return VariantFree;
    }

    public void SetVariantFree(String var3){
        this.VariantTwo = var3;
    }

    public String GetVariantFour(){
        return VariantFour;
    }

    public void SetVariantFour(String var4){
        this.VariantFour = var4;
    }

    public String GetVariantCorrect(){
        return VariantCorrect;
    }

    public void SetVariantCorrect(String varCor){
        this.VariantCorrect = varCor;
    }
}
