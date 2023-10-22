class MobileShop {

    String mobileBrand;
    static String mobileColour; //Static Variable St 1

    public static void main(String[] args) {

        MobileShop.mobileColour =  "Black"; //Static Variable St 2

        //Create an Object 1
        MobileShop ms1 = new MobileShop();
        ms1.mobileBrand = "Apple";

        //Create an Object 2
        MobileShop ms2 = new MobileShop();
        ms2.mobileBrand = "Samsung";

        //Print
        ms1.display();
        System.out.println();
        ms2.display();

    }

    public void display(){
        System.out.println("Mobile Brand : " + this.mobileBrand);
        System.out.println("Mobile Colour : " + this.mobileColour); //Static Variable St 3
    }
}
