public class NArea implements Definicoes{
    private No raiz;
    public void in_ordem(No raiz){
        if(raiz!=null){
            for(int i=0; i<raiz.getTl();i++){
                in_ordem(raiz.getvLig(i));
                System.out.println(raiz.getvInfo(i));
            }
        }
        in_ordem(raiz.getvLig(raiz.getTl()));
    }
    public void in_ordem(){
        in_ordem(raiz);
    }
    /*public void pos_o(No raiz, Pilha pilha){
        if(raiz!=null){
            for(int i=raiz.getTl()-1; i>=0;i--){
                pilha.push(raiz.getvInfo(i));
                pos_o(raiz.getvInfo(i),pilha);
            }
        }
        pos_o(raiz.getvInfo(0,pilha);
    }
    public void pos_ordem(){
        Pilha pilha = new Pilha();
        pos_o(raiz, pilha);
    }*/
    public void inserir(int info){
        No p;
        int pos;
        Boolean flag = false;
        if(raiz==null)
            raiz = new No(info);
        else{
            p = raiz;
            while(!flag){
                pos = p.buscarPos(info);
                if(p.getTl() < N-1){
                    p.remanejar(pos);
                    p.setvInfo(pos,info);
                    p.setTl(p.getTl()+1);
                    flag = true;
                }
                else{
                    if(p.getvLig(pos)==null){
                        p.setvLig(pos, new No(info));
                        flag = true;
                    }
                    else
                        p = p.getvLig(pos);
                }
            }
        }
    }
}
