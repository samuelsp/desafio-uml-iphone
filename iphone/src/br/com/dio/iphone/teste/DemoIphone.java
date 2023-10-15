package br.com.dio.iphone.teste;

import br.com.dio.iphone.model.Iphone;

public class DemoIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
