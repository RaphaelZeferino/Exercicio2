package ExercicioCartao;

public class DiaDosNamorados extends CartaoDePresente {

    public DiaDosNamorados(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }


    @Override
    public final String mostrarMensagem() {
        return "Feliz dia dos Namorados";

    }

    public String toString() {
        return mostrarMensagem();
    }
}
