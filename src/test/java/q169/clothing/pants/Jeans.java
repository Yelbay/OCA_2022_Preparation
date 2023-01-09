package q169.clothing.pants;

import q169.clothing.Shirt;

import static q169.clothing.Shirt.getColor;

public class Jeans {

        public void matchShirt() {
            //line n2
            String color=getColor();
           // String color= Shirt.getColor();bu ikiside olur yukarida metodu ve sinifi import ettigimizde direk assigne edebiliyoruz
            if(color.equals("Green")) {
                System.out.println("FIT");
            }
        }

        public static void main(String[] args) {
            Jeans trouser = new Jeans ();
            trouser.matchShirt();

        }
}
