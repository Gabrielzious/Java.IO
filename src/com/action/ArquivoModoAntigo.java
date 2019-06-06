package com.action;

import com.excecoes.ExcecaoDeArquivoInexistente;
import com.excecoes.ExcecaoDeEnderecoInvalido;
import com.io.Insertion;

import java.io.*;
import java.nio.*;


public class ArquivoModoAntigo implements Arquivo {

    private String nomeDoArquivo;

    public ArquivoModoAntigo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public void escreve(String texto) throws ExcecaoDeEnderecoInvalido {
        OutputStream gravador = null;
        try {
            gravador = new FileOutputStream(nomeDoArquivo + ".txt");

            gravador.write(texto.getBytes());
            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {
            throw new ExcecaoDeEnderecoInvalido("Nao foi possível localizar o endereço para criação do arquivo");
        } finally {
            try {
                gravador.close();
            } catch (IOException e) {
                throw new ExcecaoDeEnderecoInvalido("Nao foi possível localizar o endereço para criação do arquivo");
            }
        }
    }

    @Override
    public String ler() throws ExcecaoDeArquivoInexistente{

        // ler try-with-resources

        String texto = "";

        try (InputStream leitor = new FileInputStream(nomeDoArquivo + ".txt")) {

            int leitura = leitor.read();
            while (leitura != -1) {
                System.out.print((char) +leitura);

                texto += (char) +leitura;
                leitura = leitor.read();
            }

            System.out.println("\n");
        } catch (IOException e) {
            throw new ExcecaoDeArquivoInexistente("Não foi possível localizar o caminho selecionado");
        }

        return texto;


    }
}
