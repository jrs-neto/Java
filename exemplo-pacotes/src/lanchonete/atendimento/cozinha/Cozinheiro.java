package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural hamburguer no balcao");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcao");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburguer");
    }
    private void prepararVitamina() {
        System.out.println("Preparando suco");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }
    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionada fruta, leite e suco");
    }
    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina no liquidificador");
    }
    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e ovo para o hamburguer");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}
