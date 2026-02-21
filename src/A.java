class A {

    void run() {
        System.out.println("In class A");
    }
}

class B extends A {
    @Override
    void run() {
        System.out.println("In class B");
    }

}


class C extends A {

    @Override
    void run() {
        System.out.println("In class C");
    }

}