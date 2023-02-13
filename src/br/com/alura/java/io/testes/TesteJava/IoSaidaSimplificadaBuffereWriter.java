package br.com.alura.java.io.testes.TesteJava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class IoSaidaSimplificadaBuffereWriter {


    public static void main(String[] args) throws Exception{

        // Outra forma de saida..


        BufferedWriter bw = new BufferedWriter( new FileWriter("atividade.txt"));
        bw.write("Jade lindo");
        bw.write(System.lineSeparator());
        bw.write(System.lineSeparator());
        bw.write("Jade é isso aeeeee");
        bw.write(System.lineSeparator());
        bw.write(System.lineSeparator());
        bw.write("Jade meu amorrr");




        bw.close();





    }
}
