public class No implements Definicoes {

    private int vInfo[];
    private No vLig[];
    private int tl;
    public No(){
        vInfo = new int[N];
        vLig = new No[N];
        tl = 0;
    }
    public No(int info){
        this();
        vInfo[0]=info;
        tl = 1;
    }

    public int getvInfo(int p) {
        return vInfo[p];
    }

    public void setvInfo(int p, int info) {
        this.vInfo[p] = info;
    }
    public No getvLig(int p) {
        return vLig[p];
    }

    public void setvLig(int p, No lig) {
        //this.vLig[p] = lig;
    }

    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }

    public int buscarPos(int info) {
        return info;
    }
}
