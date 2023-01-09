package q159;

//public class q159 {}
class Book {
    int pages;
}

public class q159_App {
    int count;

    public void method(Book x, int k) {
        x.pages = 100;
        this.count =200;

    }

    public static void main(String[] args) {
        q159_App obj = new q159_App();
        Book objBook = new Book();

        System.out.println(objBook.pages + ":" + obj.count);//0:0
        obj.method(objBook, obj.count);
        System.out.println(objBook.pages + ":" + obj.count);// 100:200


    }
}
//	A. 0:0 100:0
//
//	B. null:0 100:0
//	C. 0:0 100:200
//	D. null:null 100:null

//	C. 0:0 //	C. 0:0 100:200 dogru cevap bu sekilde
//A
