package br.com.alura.java.io.testes.TesteJava;

import java.io.*;
import java.net.Socket;

public class IoSaidaEntradaJuntos {


    public static void main(String[] args) throws Exception {


        Socket s = new Socket();



        InputStream entrada = System.in;//s.getInputStream();
        Reader entrada2 = new InputStreamReader(entrada);
        BufferedReader entrada3 = new BufferedReader(entrada2);


        OutputStream saida = s.getOutputStream();
        Writer saida2 = new OutputStreamWriter(saida);
        BufferedWriter saida3 = new BufferedWriter(saida2);




        String linha = entrada3.readLine();


        while(linha != null && !linha.isEmpty()){


            saida3.write(linha);
            saida3.newLine();
            saida3.flush();
            linha = entrada3.readLine();
        }
        entrada3.close();
        saida3.close();

    }
}
