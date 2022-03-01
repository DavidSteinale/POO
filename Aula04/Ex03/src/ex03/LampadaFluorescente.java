package ex03;

public class LampadaFluorescente implements ILampada {

    @Override
    public void liga() {
        System.out.println("Lampada Fluorescente Ligada");
    }

    @Override
    public void desliga() {
        System.out.println("Lampada Fluorescente Desligada");

    }

}
