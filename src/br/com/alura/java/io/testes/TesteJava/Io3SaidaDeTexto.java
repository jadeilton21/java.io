package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Io3SaidaDeTexto {


    public static void main(String[] args) throws Exception {


        FileOutputStream out = new FileOutputStream("atividade.txt");
        Writer bite = new OutputStreamWriter(out);
        BufferedWriter saida = new BufferedWriter(bite);



        saida.write("Jade Gostoso...");
        saida.newLine();
        saida.write("Lindo..");
        saida.newLine();
        saida.write("Gostoso.");


        saida.close();


    }
}
