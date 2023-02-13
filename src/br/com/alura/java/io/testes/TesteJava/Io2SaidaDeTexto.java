package br.com.alura.java.io.testes.TesteJava;

import java.io.*;

public class Io2SaidaDeTexto {


    public static void main(String[] args) throws Exception {


        OutputStream out = new FileOutputStream("atividade.txt");
        Writer bit = new OutputStreamWriter(out);
        BufferedWriter saida = new BufferedWriter(bit);

        saida.write(" Motivo\n" +
                "\n" +
                "Eu canto porque o instante existe\n" +
                "e a minha vida está completa.\n" +
                "Não sou alegre nem sou triste:\n" +
                "sou poeta.\n" +
                "\n" +
                "Irmão das coisas fugidias,\n" +
                "não sinto gozo nem tormento.\n" +
                "Atravesso noites e dias\n" +
                "no vento.\n" +
                "\n" +
                "Se desmorono ou se edifico,\n" +
                "se permaneço ou me desfaço,\n" +
                "— não sei, não sei. Não sei se fico\n" +
                "ou passo.\n" +
                "\n" +
                "Sei que canto. E a canção é tudo.\n" +
                "Tem sangue eterno a asa ritmada.\n" +
                "E um dia sei que estarei mudo:\n" +
                "— mais nada.");
        saida.newLine();
        saida.close();



    }
}
