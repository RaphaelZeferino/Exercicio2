package ExercicioCartao;

public class Main {

    public static void main(String[] args){
  DiaDasMaes diaDasMaes = new DiaDasMaes("Pedro", "Ana");

        System.out.println("De: " + diaDasMaes.getNomeRemetente() + "\nPara: " + diaDasMaes.getNomeDestinatario() + "\n" + diaDasMaes.mostrarMensagem());

        DiaDosNamorados diaDosNamorados = new DiaDosNamorados("Luiza", "Paulo");

        System.out.println("\nDe: " + diaDosNamorados.getNomeRemetente() + "\nPara: " + diaDosNamorados.getNomeDestinatario() + "\n" + diaDosNamorados.mostrarMensagem());

        imprimeMensagem(diaDasMaes);
        imprimeMensagem(diaDosNamorados);
    }

    public static void imprimeMensagem(CartaoDePresente cartaoDePresente) {
        System.out.println("\n" + cartaoDePresente.mostrarMensagem());
    }
}