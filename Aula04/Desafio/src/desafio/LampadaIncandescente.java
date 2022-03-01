package desafio;

public class LampadaIncandescente implements ILampada {

    public boolean statusLigado = false;
    public boolean statusDesligado = true;

    @Override
    public boolean liga() {
        if(statusDesligado){
            System.out.println("Lampada incandescente Ligada");
            statusLigado = true;
            return statusLigado;
        }else{
            System.out.println("Lampada não pode ser ligada, pois está acessa...");
            return statusDesligado = true;            
        }
        
    }

    @Override
    public boolean desliga() {
        if (statusLigado) {
            System.out.println("Lampada incandescente Desligada");
            statusDesligado = true;
            return statusDesligado;
        } else {
            System.out.println("Lampada não pode ser desligada, pois não está acessa...");
            return statusDesligado = true;
        }
    }

}

