public class Main {
    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Leticia","letiX");
        UsuarioJogo usuario2 = new UsuarioJogo("Amanda","mandaBear");

        usuario1.aumentarPontuacao(500);
        usuario1.subirNivel();

        usuario2.aumentarPontuacao(1000);
        usuario2.subirNivel();

        System.out.printf("Nome do usuario: %s \n Nickname: %s \n Nivel: %s \n Pontuacao Total: %s \n", usuario1.getNome(),
                usuario1.getNickname(), usuario1.getNivel(), usuario1.getPontuacao());

        System.out.printf("Nome do usuario: %s \n Nickname: %s \n Nivel: %s \n Pontuacao Total: %s", usuario2.getNome(),
                usuario2.getNickname(),usuario2.getNivel(),usuario2.getPontuacao());


    }
}
