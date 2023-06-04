public class AplicacaoNArea {
    private NArea arv;

    public void executa(){
        arv = new NArea();
        arv.inserir(80);
        arv.inserir(100);
        arv.inserir(70);
        arv.inserir(150);
        arv.inserir(75);

        arv.exibir();
    }

    public static void main(String args[]){
        AplicacaoNArea app = new AplicacaoNArea();
        app.executa();
    }
}
