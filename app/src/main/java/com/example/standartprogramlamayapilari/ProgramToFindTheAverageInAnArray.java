package com.example.arrays;



public class ProgramToFindTheAverageInAnArray {

    public static void main(String args[]){
          int list[] = {12,3,45,43,12,25,77};
          double sum = 0.0;


          for (int i = 0; i < list.length; i++){
             sum += list[i];
          }
          double avarage = sum / list.length;
        System.out.println(avarage);
    }


}
