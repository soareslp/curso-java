package br.com.alura.leilao.acceptance.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class licSteps {
    public static String caminhoArquivo;

    @Dado("^o (.*)")
    public void localPublicacao(String caminho) {
        caminhoArquivo = caminho;
    }

    @E("^renomear o arquivo de licenciamento de (.*) com extensão (.*) para a extensão (.*)")
        public void renomearArquivo(String arquivo, String extensãoOriginal, String extensãoNova){
        licPage licPage = new licPage();
        licPage.alterarFormatoDoArquivo(caminhoArquivo, arquivo, extensãoOriginal, extensãoNova);
    }

}
