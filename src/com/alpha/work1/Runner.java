package com.alpha.work1;

public class Runner {
    public void Run(){
        Book1 Book1 = new Book1();

        //Book1.setBook(34,"Pavel", "Aleks","Esko",1970,1526, 55);

        Book1.setId(34);
        Book1.setTitle("This");
        Book1.setPrice(55.9);
        Book1.setPublisher("NeverHood");
        Book1.setYear(2002);
        Book1.setCountPages(666);
        Book1.setAutor("Aleks");

        System.out.println(Book1.viewBook());
    }

}
