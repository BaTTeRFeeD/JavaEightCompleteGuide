package batterfeed.InstanceOf;

public class InstanceOf {
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        if(a instanceof A)
            System.out.println("a является экземпляром A");
        if(b instanceof B)
            System.out.println("b является экземпляром B");
        if(c instanceof C)
            System.out.println("c является экземпляром C");
        if(c instanceof A)
            System.out.println("c можно привести к типу A");
        
        if(a instanceof C)
            System.out.println("a можно привести к типу C");
        
        System.out.println();
        
        A ob;
        
        ob = d;
        
        System.out.println("ob теперь ссылается на d");
        if(ob instanceof D)
            System.out.println("ob является экземпляром D");
        
        System.out.println();
        
        ob = c;
        System.out.println("ob теперь ссылается на c");
        
        if(ob instanceof D)
            System.out.println("ob можно привести к типу D");
        else
            System.out.println("ob нельзя привести к типу D");
        
        if(ob instanceof A)
            System.out.println("ob можно привести к типу A");
        
        System.out.println();
        
        if(a instanceof Object)
            System.out.println("a можно привести к типу Object");
        if(b instanceof Object)
            System.out.println("b можно привести к типу Object");
        if(c instanceof Object)
            System.out.println("c можно привести к типу Object");
        if(d instanceof Object)
            System.out.println("d можно привести к типу Object");
        
    }
    
}