import java.util.Date;


public class Sandbox {

    public static void main(String[] args) {


        A b = new B();

        b.father();




    }

}


class A {

    public void father() {

        Boolean yes = this instanceof B;

        System.out.println(yes);
    }

}

class B extends A{

}