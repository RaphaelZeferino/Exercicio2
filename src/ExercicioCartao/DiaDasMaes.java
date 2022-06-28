package ExercicioCartao;

public class DiaDasMaes extends CartaoDePresente {

    public DiaDasMaes(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public final String mostrarMensagem() {
        return "Feliz dia das Mães";

    }

    public String toString() {
        return mostrarMensagem();
    }

}
