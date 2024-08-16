package loja;

import loja.aparelho.Iphone;

public class TestadorDeAparelho {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Never Gonna Give You Up");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("4002-8922");
        iphone.iniciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}