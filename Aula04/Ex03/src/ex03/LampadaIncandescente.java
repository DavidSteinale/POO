package ex03;

public class LampadaIncandescente implements ILampada{

    @Override
    public void liga() {
        System.out.println("Lampada Incandescente Ligada");
    }

    @Override
    public void desliga() {
        System.out.println("Lampada Incandescente Desligada");

    }
    
}
