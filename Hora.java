package com.mycompany.tp03ex01;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Victor Crivoi Cesar Souza
 * Julia Lemos
 */


import java.util.Scanner;

public class Hora {
    private int hora; 
    private int min; 
    private int seg; 
    private Scanner scanner = new Scanner(System.in);

    public Hora(){
        hora = verficarValor("Horas");
        min = verficarValor("Minutos");
        seg = verficarValor("Segundos");
    }
    public Hora(int h, int m, int s){
        hora = h; 
        min = m;
        seg = s;
    }

    void setHor(int h){
        hora = h;
    }
     void setMin(int m){
        min = m;
    } 
     void setSeg(int s){
        seg = s;
    }
    void setHor(){
        hora = verficarValor("Horas");
    }
     void setMin(){
        min = verficarValor("Minutos");
    } 
     void setSeg(){
       seg = verficarValor("Segundos");
    }

    private int verficarValor(String msg){
       System.out.println("Digite "+ msg + "(valores inteiros, apenas):");
       int valor;
        while (true) {
            if (scanner.hasNextInt()) {
            valor = scanner.nextInt();
            if (valor >= 0) {
                break;
            }
            } else {
                 scanner.next();
                 System.out.println("Erro! \nDigite "+ msg + "(valores inteiros, apenas):");
            }
        }

        if(valor>60 && msg.equals("Minutos")){
            int horasExtras = valor / 60;
            hora += horasExtras;
            valor %= 60;
        }else if (msg.equals("Segundos") && valor >= 60) {
            int minutosExtras = valor / 60;
            if (minutosExtras >= 60) {
                int horasExtras = minutosExtras / 60;
                hora += horasExtras;
                minutosExtras %= 60;
            }
            min += minutosExtras;
            valor %= 60;

        }

        return valor; 
    }


    int getHor(){
        return hora; 
    }
     int getMin(){
        return min; 
    }
      int getSeg(){
        return seg; 
    }
    String getHora1(){
        return String.format("%02d:%02d:%02d", hora,min,seg); 
    }
     String getHora2(){
        if (hora > 24) {
        int dias = hora / 24;
        int horasExtras = hora % 24;
        return "\n\nMais de 24h. \n\nConvertendo as horas, minutos e segundos em: dias, hh:mm:ss: \n" +
               dias + " dias, " + String.format("%02d:%02d:%02d", horasExtras,min,seg);
        }

        String amPm = (hora >= 12) ? "PM" : "AM";
        int horaFormatada = (hora > 12) ? hora - 12 : hora;
        return String.format("%02d:%02d:%02d %s", horaFormatada, min, seg, amPm);
    }
}