package aplicacao_audio;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setNome("Getaway car");
        musica.setCantor("Taylor Swift");
        musica.setGenero("Pop");
        musica.setDuracao(3.50);
        musica.setCurtidas(150);
        musica.classificacao();
        musica.mostrar();
        System.out.println("**************************");
        Musica musica2 = new Musica();
        musica2.setNome("Idiota");
        musica2.setCantor("Jão");
        musica2.setGenero("MPB");
        musica2.setDuracao(3.20);
        musica2.setCurtidas(99);
        musica2.classificacao();
        musica2.mostrar();
        System.out.println("**************************");
        Podcast podcast = new Podcast();
        podcast.setNome("PodPah");
        podcast.setCriador("Igão");
        podcast.setTema("Entretenimento");
        podcast.setDuracao(47.30);
        podcast.setCurtidas(40);
        podcast.classificacao();
        podcast.mostrarPodcast();


    }


}
