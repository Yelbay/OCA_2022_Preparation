package Q116;
class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
public class C extends A {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1=new A();//b1 dedigimizde atanin metodlari cikar
        A b2=new C();//her cocuk atasiyla aynidir
        A b4=new B();
        B b5=(B)b4;
        b5.test();//B
        b1=(A)b2;//C
        b1.test();
        C m=new C();
        b2.test();//eski==>C
        b2=(A)b1;//yeni==>A b2 test dersek artik A yazar
        b2.test();//yeni==>A
        //A d=new A();
       //  C f=(C)d; //diyemeyiz cunku  d  tamamen A clasina ait cocugun esyalarini parent kullanamz
        b1.test();//A
       // A b3=(A) b2;//line2 CB b3=(B) b2; cannot be cast to Q116.B cocukjlar birbirine ulasamaz b2 yi (C) ye ve (A) ya cast yapabilirsin
       b1.test();
        ///b3.test();
    }
}
/*What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.
Answer: e

 */