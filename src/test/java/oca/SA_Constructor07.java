package oca;
public class SA_Constructor07 {

    int a;
    int b;
    int c;

    SA_Constructor07(int a, int b){//3   x=a=3   y=b=5
        this(b);//6         b = 5       tek parametreli constrctr a git
        this.a=a;//20
        this.b=99;//21
        System.out.println("this.a 2 int = " + this.a);//22             3
        System.out.println("this.b 2 int= " + this.b);//23              99
        System.out.println("a with 2 int= " + a);//24                   3
        System.out.println("b with 2 int = " + b);//25                  5
        System.out.println("============");
    }

    SA_Constructor07(int a){//7     a= 5 olacak buraya    b ile gelmisti
        this();//  8                   parametresiz cnstrctr a git
        b=100;//15
        this.a=a;//16
        System.out.println("this.a 1 int= " + this.a);//17          5
        System.out.println("a with 1 int  = " + a);//18             5
        System.out.println("b with 1 int  = " + b);//19             100
        System.out.println("============");
    }

    SA_Constructor07(){//9
        this.a=1;//10
        this.b=11;//11
        System.out.println("this.a no prmtr= " + this.a);//12        1
        System.out.println("this.b no prmtr= " + this.b);//13       11
        System.out.println("a no prmtr= " + a);//14                 1

        System.out.println("============");
    }
static{
    System.out.println("static block");
}
    public static void main(String[] args) {//1

        SA_Constructor07 or = new SA_Constructor07(3,5);//2  x=3  y=5
        System.out.println("main method");

        or= new SA_Constructor07(9);
        System.out.println("or.a+ or.b +or.c = " + or.a + or.b +or.c);

        or= new SA_Constructor07();
        System.out.println("or.a2+ or.b2 +or.c2 = " + or.a + or.b +or.c);
        System.out.println("============");
    }



}