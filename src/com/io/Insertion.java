package com.io;


import com.action.Arquivo;
import com.action.ArquivoModoAntigo;
import com.action.ArquivoModoNovo;
import com.excecoes.ExcecaoDeArquivoInexistente;
import com.excecoes.ExcecaoDeEnderecoInvalido;
//import com.action.ArquivoModoAntigo;
import java.util.Scanner;

public class Insertion {

    public void entrada() throws ExcecaoDeEnderecoInvalido {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite Quantos arquivos deseja criar (Máximo 3 arquivos)");
        int timesRun = scan.nextInt();

        while (timesRun < 1 || timesRun > 3 ) {
            System.out.println("numero de arquivos muito grande, favor escolha um numero de 1 a 3");
            timesRun = scan.nextInt();
        }

        for (short i=0; i < timesRun; i++) {
            System.out.println("Digite o nome do arquivo");
            String nomeDoArquivo = scan.next();
            System.out.println("Digite o texto que vai ser escrito no arquivo = " + "'" + nomeDoArquivo + "'");
            String textoQueVaiSerEscrito = scan.next();

            Arquivo arquivo = new ArquivoModoNovo(nomeDoArquivo);
            arquivo.escreve(textoQueVaiSerEscrito);
        }

    }

    public void leitor() throws ExcecaoDeArquivoInexistente {
        Scanner scan = new Scanner(System.in);
        System.out.println("insira o nome do arquivo a ser lido");
        String enderecoArquivo = scan.next();

        //String textoDoArquivo = new ArquivoModoAntigo(enderecoArquivo).ler();

        Arquivo arquivo = new ArquivoModoNovo(enderecoArquivo);
        String textoDoArquivo2 = arquivo.ler();
    }


}
