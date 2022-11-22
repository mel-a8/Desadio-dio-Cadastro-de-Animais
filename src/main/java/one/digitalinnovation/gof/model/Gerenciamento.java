package one.digitalinnovation.gof.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Gerenciamento {

    private Leitura l = new Leitura();
    private Animal an;
    Aquatico a1 = new Aquatico();
    Terrestre t1 = new Terrestre();
    Aereo v1 = new Aereo();
    private List<Animal> bdAn = new ArrayList<Animal>();


    public List<Animal> getBdAn() {
        return bdAn;
    }


    public Aquatico cadAq(Aquatico aq) {//O nome estava errado
        System.out.println(aq.getCodigo());//Ate aqui ta certo
        if (consAnCod(aq) == null) {
            System.out.println(aq.getCodigo());//Deu certo
            bdAn.add(aq);
            return aq;
        } else {
            return null;
        }
    }
    //===============================================================================================================

    public Terrestre cadTer(Terrestre tr) {
        if (consAnCod(tr) == null) {
            bdAn.add(tr);
            return tr;
        } else {
            return null;
        }
    }
    //===============================================================================================================

    public Aereo cadAer(Aereo ae) {
        if (consAnCod(ae) == null) {
            bdAn.add(ae);
            return ae;
        } else {
            return null;
        }
    }

    public Animal consAnCod(Animal an) {
        for (int i = 0; i < bdAn.size(); i++) {
            System.out.println(bdAn.get(i).getCodigo()+ " Codigos no BD \n");
            if (an.getCodigo() == bdAn.get(i).getCodigo()) {
                return bdAn.get(i);
            }
        }
        return null;
    }

    public Aquatico removeAq(Aquatico aq) {
        a1 = (Aquatico) consAnCod(a1);
        if (a1 != null) {
            bdAn.remove(a1);
            return a1;
        } else {
            return null;

        }
    }

    public Terrestre removeTr(Terrestre te) {
        t1 = (Terrestre) consAnCod(t1);
        if (t1 != null) {
            bdAn.remove(t1);
            return t1;
        } else {
            return null;

        }
    }

    public Aereo removeAer(Aereo vo) {
        v1 = (Aereo) consAnCod(v1);
        if (v1 != null) {
            bdAn.remove(v1);
            return v1;
        } else {
            return null;

        }
    }

    public Aquatico atualizaAq(Aquatico aq) throws NumNegException {
        for (int i = 0; i < bdAn.size(); i++) {
            if (a1.getCodigo() == bdAn.get(i).getCodigo()) {
                String especie = JOptionPane.showInputDialog(null, "Informe a Especie", "Autalização", JOptionPane.QUESTION_MESSAGE);
                a1.setEspecie(especie);
                String idade = JOptionPane.showInputDialog(null, "Informe a Idade", "Autalização", JOptionPane.QUESTION_MESSAGE);
                a1.setIdade(Integer.parseInt(idade));
                String sexo = JOptionPane.showInputDialog(null, "Informe o Sexo", "Autalização", JOptionPane.QUESTION_MESSAGE);
                a1.setSexo(sexo);
                String peso = JOptionPane.showInputDialog(null, "Informe o Peso", "Autalização", JOptionPane.QUESTION_MESSAGE);
                a1.setPeso(Float.parseFloat(peso));
                String tipoPele = JOptionPane.showInputDialog(null, "Informe o Tipo de Pele", "Autalização", JOptionPane.QUESTION_MESSAGE);
                a1.setTipoPele(tipoPele);
                String tipoBarbatana = JOptionPane.showInputDialog(null, "Informe o Tipo de Barbatana", "Autalização", JOptionPane.QUESTION_MESSAGE);
                a1.setTipoBarbatana(tipoBarbatana);
                String qtdBarbatana = JOptionPane.showInputDialog(null, "Informe Quantidade de Barbatana", "Autalização", JOptionPane.QUESTION_MESSAGE);
                a1.setQtdBarbatana(Integer.parseInt(qtdBarbatana));
                bdAn.set(i, a1);
                return (Aquatico) bdAn.get(i);
            }

        }
        return null;
    }

    public Terrestre atualizaT(Terrestre te) throws NumNegException {
        for (int i = 0; i < bdAn.size(); i++) {
            if (t1.getCodigo() == bdAn.get(i).getCodigo()) {
                String especie = JOptionPane.showInputDialog(null, "Informe a Especie", "Autalização", JOptionPane.QUESTION_MESSAGE);
                t1.setEspecie(especie);
                String idade = JOptionPane.showInputDialog(null, "Informe a Idade", "Autalização", JOptionPane.QUESTION_MESSAGE);
                t1.setIdade(Integer.parseInt(idade));
                String sexo = JOptionPane.showInputDialog(null, "Informe o Sexo", "Autalização", JOptionPane.QUESTION_MESSAGE);
                t1.setSexo(sexo);
                String peso = JOptionPane.showInputDialog(null, "Informe o Peso", "Autalização", JOptionPane.QUESTION_MESSAGE);
                t1.setPeso(Float.parseFloat(peso));
                String tipoPelagem = JOptionPane.showInputDialog(null, "Informe o Tipo de Pelagem", "Autalização", JOptionPane.QUESTION_MESSAGE);
                t1.setTipoPelagem(tipoPelagem);
                String modolocomocao = JOptionPane.showInputDialog(null, "Informe o Modo de Locomoção", "Autalização", JOptionPane.QUESTION_MESSAGE);
                t1.setModolocomocao(modolocomocao);
                String qtdPata = JOptionPane.showInputDialog(null, "Informe Quantidade de Patas", "Autalização", JOptionPane.QUESTION_MESSAGE);
                t1.setQtdPata(Integer.parseInt(qtdPata));
                bdAn.set(i, t1);
                return (Terrestre) bdAn.get(i);
            }

        }
        return null;
    }

    public Aereo atualizaAr(Aereo ae) throws NumNegException {
        for (int i = 0; i < bdAn.size(); i++) {
            if (v1.getCodigo() == bdAn.get(i).getCodigo()) {
                String especie = JOptionPane.showInputDialog(null, "Informe a Especie", "Autalização", JOptionPane.QUESTION_MESSAGE);
                v1.setEspecie(especie);
                String idade = JOptionPane.showInputDialog(null, "Informe a Idade", "Autalização", JOptionPane.QUESTION_MESSAGE);
                v1.setIdade(Integer.parseInt(idade));
                String sexo = JOptionPane.showInputDialog(null, "Informe o Sexo", "Autalização", JOptionPane.QUESTION_MESSAGE);
                v1.setSexo(sexo);
                String peso = JOptionPane.showInputDialog(null, "Informe o Peso", "Autalização", JOptionPane.QUESTION_MESSAGE);
                v1.setPeso(Float.parseFloat(peso));
                String tipoPlumagem = JOptionPane.showInputDialog(null, "Informe o Tipo de Plumagem", "Autalização", JOptionPane.QUESTION_MESSAGE);
                v1.setTipoPlumagem(tipoPlumagem);
                String comprimentoAsa = JOptionPane.showInputDialog(null, "Informe o Comprimento da Asa", "Autalização", JOptionPane.QUESTION_MESSAGE);
                v1.setComprimentoAsa(Float.parseFloat(comprimentoAsa));
                String tipoBico = JOptionPane.showInputDialog(null, "Informe o Tico de Bico", "Autalização", JOptionPane.QUESTION_MESSAGE);
                v1.setTipoBico(tipoBico);
                bdAn.set(i, t1);
                return (Aereo) bdAn.get(i);
            }

        }
        return null;
    }
}
