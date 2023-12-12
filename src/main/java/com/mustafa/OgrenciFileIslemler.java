package com.mustafa;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OgrenciFileIslemler {
    Random random = new Random();
    List<String> list ;

    public OgrenciFileIslemler(){
        list = new ArrayList<>();
        verioku();
    }



    public void verioku(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FileSabitler.pathSinif));
            String deger = null;
            while ((deger=bufferedReader.readLine()) != null){
                list.add(deger);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void secileceklereYazdir(){
        BufferedWriter bufferedWriter = null;
        try {
             bufferedWriter=new BufferedWriter(new FileWriter(FileSabitler.pathSecilecekler));
            for(String ogrenci : list){
                bufferedWriter.write(ogrenci);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int randomOgrenciIndex(){
        return random.nextInt(list.size());
    }












}
