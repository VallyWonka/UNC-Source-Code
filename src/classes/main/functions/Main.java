package classes.main.functions;

public class Main {

    public int field1;

    public Main(int field1) {
        this.field1 = field1;
    }

    public Main(Main target){
        this.field1 = target.field1;
    }

    public void main(){

    }
}
