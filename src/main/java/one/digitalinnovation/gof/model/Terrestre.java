package one.digitalinnovation.gof.model;

public class Terrestre extends Animal {

    private String tipoPelagem;
    private String modolocomocao; //se ele é bípede ou quadrúpede
    private int qtdPata;

    public Terrestre() {
        this.tipoPelagem = "";
        this.modolocomocao = "";
        this.qtdPata = 0;
    }

    public Terrestre(String tipoPelagem, String modolocomocao) {
        this.tipoPelagem = "";
        this.modolocomocao = "";
        this.qtdPata = 0;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public String getModolocomocao() {
        return modolocomocao;
    }

    public int getQtdPata() {
        return qtdPata;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public void setModolocomocao(String modolocomocao) {
        this.modolocomocao = modolocomocao;
    }

    public void setQtdPata(int qtdPata) throws NumNegException {
        if (qtdPata >= 0) {
            this.qtdPata = qtdPata;

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
        porcentagem = 30.0f + (0.20f * 30.0f);
        System.out.println("\nPara ver o animal desejado, devera pagar: R$ " + porcentagem + " reais");

    }

}//fim da classe
