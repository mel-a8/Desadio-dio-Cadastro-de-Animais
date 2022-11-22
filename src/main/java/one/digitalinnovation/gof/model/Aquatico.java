package one.digitalinnovation.gof.model;

public class Aquatico extends Animal implements GerenciadorZoo {

    private String tipoPele;
    private String tipoBarbatana;
    private int qtdBarbatana;

    public Aquatico() {
        this.tipoPele = "";
        this.tipoBarbatana = "";
        this.qtdBarbatana = 0;
    }

    public Aquatico(String tipoPele, String tipoBarbatana, int qtdBarbatana) {
        this.tipoPele = tipoPele;
        this.tipoBarbatana = tipoBarbatana;
        this.qtdBarbatana = qtdBarbatana;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public String getTipoBarbatana() {
        return tipoBarbatana;
    }

    public int getQtdBarbatana() {
        return qtdBarbatana;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }

    public void setTipoBarbatana(String tipoBarbatana) {
        this.tipoBarbatana = tipoBarbatana;
    }

    public void setQtdBarbatana(int qtdBarbatana) throws NumNegException {
        if (qtdBarbatana >= 0) {
            this.qtdBarbatana = qtdBarbatana;

        } else {
            throw new NumNegException();
        }

    }

    //Método que sobrescreve o método abstrato da classe mãe
    public void verificaPeso() {

        if (peso > 60) {
            System.out.println("Sobrepeso");

        }
    }
    //Método da interface

    public void calcular() {
        float porcentagem;
        porcentagem = 30.0f + (0.10f * 30.0f);
        System.out.println("\nPara ver o animal desejado, devera pagar: R$" + porcentagem + "reais");

    }

}//fim da classe
