package one.digitalinnovation.gof.model;

public class Aereo extends Animal {

    private String tipoPlumagem;
    private float comprimentoAsa;
    private String tipoBico;

    public Aereo() {
        this.tipoPlumagem = "";
        this.comprimentoAsa = 0;
        this.tipoBico = "";
    }

    public Aereo(String tipoPlumagem, float comprimentoAsa, String tipoBico) {
        this.tipoPlumagem = "";
        this.comprimentoAsa = 0;
        this.tipoBico = "";
    }

    public String getTipoPlumagem() {
        return tipoPlumagem;
    }

    public float getComprimentoAsa() {
        return comprimentoAsa;
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoPlumagem(String tipoPlumagem) {
        this.tipoPlumagem = tipoPlumagem;
    }

    public void setComprimentoAsa(float comprimentoAsa) throws NumNegException {
        if (comprimentoAsa >= 0) {
            this.comprimentoAsa = comprimentoAsa;

        } else {
            throw new NumNegException();
        }
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
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
        porcentagem = 30.0f + (0.15f * 30.0f);
        System.out.println("\nPara ver o animal desejado, devera pagar: R$ " + porcentagem + " reais");

    }

}//fim da classe
