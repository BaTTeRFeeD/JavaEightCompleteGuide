package batterfeed.JavaLangPackage.CloneDemo2;

public class TestClone implements Cloneable{
    int a;
    double b;

    @Override
    public Object clone(){
        try{
            return super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Клонирование невозможно.");
            return this;
        }
    }
}
