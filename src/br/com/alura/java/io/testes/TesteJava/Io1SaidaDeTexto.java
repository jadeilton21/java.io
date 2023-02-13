package br.com.alura.java.io.testes.TesteJava;

import java.io.*;

public class Io1SaidaDeTexto {


    public static void main(String[] args) throws Exception {

        // Saida de dados.

        OutputStream out = new FileOutputStream("atividade.txt");
        Writer bit = new OutputStreamWriter(out);
        BufferedWriter saida = new BufferedWriter(bit);


        saida.write("(NOT ((3 > 2) OR (4 >= 5)) AND (5 > 4) ) OR (9 > 0)");
        saida.newLine();
        saida.newLine();
        saida.write(" Jade gostoso.");

        saida.close();




    }
}
