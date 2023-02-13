package br.com.alura.java.io.testes.TesteJava;


import java.io.*;

public class Io4SaidaDeTexto {


    public static void main(String[] args) throws Exception {


        FileOutputStream out = new FileOutputStream("atividade.txt");
        Writer bite = new OutputStreamWriter(out);
        BufferedWriter saida = new BufferedWriter(bite);




        saida.write("Jade faya..");
        saida.newLine();
        saida.write("Fayaaaa");
        saida.newLine();

        saida.close();






    }



}
