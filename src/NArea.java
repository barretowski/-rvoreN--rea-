public class NArea implements Definicoes{
    private No raiz;
    public No getRaiz(){
        return this.raiz;
    }
    public void in_ordem(No raiz){
        if(raiz != null){
            for(int i=0; i<raiz.getTl(); i++){
                in_ordem(raiz.getvLig(i));
                System.out.println(raiz.getvInfo(i));
            }

            // Verificar se a última subárvore existe antes de chamar recursivamente
            if (raiz.getvLig(raiz.getTl()) != null) {
                in_ordem(raiz.getvLig(raiz.getTl()));
            }
        }
    }

    public void pos_ordem(No raiz) {
        if (raiz != null) {
            for (int i = 0; i < raiz.getTl(); i++) {
                pos_ordem(raiz.getvLig(i));
            }

            pos_ordem(raiz.getvLig(raiz.getTl()));  // Chamar recursivamente a última subárvore

            for (int i = 0; i < raiz.getTl(); i++) {
                System.out.println(raiz.getvInfo(i));
            }
        }
    }

    public void pre_ordem(No raiz) {
        if (raiz != null) {
            for (int i = 0; i < raiz.getTl(); i++) {
                System.out.println(raiz.getvInfo(i));
                pre_ordem(raiz.getvLig(i));
            }

            pre_ordem(raiz.getvLig(raiz.getTl()));  // Chamar recursivamente a última subárvore
        }
    }



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

    public void exibir(){
        in_ordem(getRaiz());
    }
}
