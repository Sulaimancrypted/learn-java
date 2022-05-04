/*Method Overriding demonstration through inheritance*/
class SuperClass {
    public void method1() {
        System.out.println("Method1 from Super class");
    }

    public void method2() {
        System.out.println("Method2 from Super class");
    }
}

class SubClass1 extends SuperClass {
    public void method2() {
        System.out.println("Method2 from SubClass1, overrides method2 from Super Class");
    }
}

class SubClass2 extends SuperClass {
    public void method2() {
        System.out.println("Method2 from SubClass2, overrides method2 from Super Class");
    }
}

class DynamicMethodDispatch {
    public static void main(String arg[]) {
        SuperClass refSuper;
        SuperClass objSuper = new SuperClass();
        SubClass1 objSub1 = new SubClass1();
        SubClass2 objSub2 = new SubClass2();
        System.out.println("Reference for Super Class is referring to object for SubClass1 : ");
        refSuper = objSub1;
        refSuper.method2();
        refSuper.method1();
        System.out.println("\nReference for Super Class is referring to object for SubClass2 : ");
        refSuper = objSub2;
        refSuper.method2();
        refSuper.method1();
        System.out.println("\nReference for Super Class is referring to object for SuperClass : ");
        refSuper = objSuper;
        refSuper.method2();
        refSuper.method1();
    }
}