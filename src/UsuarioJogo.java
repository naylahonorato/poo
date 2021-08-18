public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel = 1;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }
    public void aumentarPontuacao(int valor){
        this.pontuacao += valor;
    }
    public void subirNivel(){
        this.nivel++;
    }
    public void setbonus(int valor){
        this.pontuacao += valor;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }
}
