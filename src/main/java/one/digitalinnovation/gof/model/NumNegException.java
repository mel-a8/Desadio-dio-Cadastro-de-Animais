package one.digitalinnovation.gof.model;

public class NumNegException extends Exception {

    Leitura l = new Leitura();

    public void impNumNeg() {
        System.out.println("\n\tO numero informado deve ser positivo!");
    }

    public Aquatico reparaNum(Aquatico a1) {
        try {
            a1.setIdade(Integer.parseInt(l.entDados("\nInforme uma idade valida: ")));
            a1.setPeso(Float.parseFloat(l.entDados("\nInforme um peso valido: ")));
            a1.setQtdBarbatana(Integer.parseInt(l.entDados("\nInforme uma quantidade valida: ")));

        } catch (NumNegException nne) {
            nne.impNumNeg();
            a1 = nne.reparaNum(a1);
        } catch (NumberFormatException nfe) {
            System.out.println("\nCPF deve ser um int");
        }

        return a1;
    }

}
