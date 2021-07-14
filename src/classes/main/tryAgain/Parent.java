package classes.main.tryAgain;

public class Parent extends GrandParent{
    protected InnerParentClass innerParentClass;
    public Parent() {
        innerParentClass = new InnerParentClass(1);
    }

    public int parentFlag;

    public final void doParentLogic(){

    }


    @Override
    public String toString() {
        return "Parent{}";
    }

    static class InnerParentClass{
        public int innerClassFlag;

        public InnerParentClass(int innerClassFlag) {
            this.innerClassFlag = innerClassFlag;
        }

        public int getInnerClassFlag() {
            return innerClassFlag;
        }
    }
}
