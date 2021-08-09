package com.alpha.work1;

import java.util.Random;

public class Runner {
    public void Run(){



        Book1 Book1 = new Book1();

        Book1 Book2 = new Book1(34,"Pavel", "Aleks","Esko",1970,1526, 55);

        Book1 Book3[] = new Book1[SIZE_ARR];

   //     int tst;
        /*        , min, max;

        min=1;
        max=1000;
*/

        //getRandomNumber(1,1000);

        //System.out.println(getRandomNumber(1,1000));

        //Book1.setBook(34,"Pavel", "Aleks","Esko",1970,1526, 55);

        Book1.setId(34);
        Book1.setTitle("This");
        Book1.setPrice(55.9);
        Book1.setPublisher("NeverHood");
        Book1.setYear(2002);
        Book1.setCountPages(666);
        Book1.setAutor("Aleks");

        System.out.println(Book1.viewBook());
        System.out.println(Book2.viewBook());



        for(int i=0; i < SIZE_ARR; i++){
          //  System.out.println(i);
            String Title = getRandomTitle();
            String Autor = getRandomAutor();
            String Publ = getRandomPublisher();
            int year = getRandomNumber(1702,2021);
            int pages = getRandomNumber(100,2000);
            double pr = (double)getRandomNumber(500,1000)/100;
            Book3[i] = new Book1(i+1000,Title,Autor,Publ,year,
                    pages,pr);
        }
//(double)getRandomNumber(5000,100000)/100
        viewArrBook(SIZE_ARR,Book3);

        addPercent(Book3,10);

        viewArrBook(SIZE_ARR,Book3);
       // Book3[1] = new Book1(22,getRandomTitle(),getRandomAutor(),getRandomPublisher(),getRandomNumber(1702,2021),
         //       getRandomNumber(100,2000),(double)getRandomNumber(5000,100000)/100);
                //.setTitle(getRandomTitle());

        //System.out.println(Book3[1].);



    }

    public final int SIZE_ARR = 7;

    public void viewArrBook(int count, Book1[] arrBook){
        int i=0;
        for(i = 0; i<count;i++)
            System.out.println(arrBook[i].getId() + " " + arrBook[i].getTitle() + " " +
                    arrBook[i].getAutor() + " " + arrBook[i].getPublisher() + " " +
                    arrBook[i].getYear() + " " + arrBook[i].getCountPages() + arrBook[i].getPrice());

    }

            public String getRandomTitle(){

        String[] rTitle = {
                "Titel1",
                "Titele2",
                "Titele3",
                "Titele4",
                "Titele5",
                "Titele6",
                "Titele7"
        };
        return rTitle[getRandomNumber(0, rTitle.length)-1];

    }

    public String getRandomAutor(){

        String[] rTitle = {
                "Aleks",
                "Tom",
                "Pit",
                "Garrison",
                "Eva",
                "Ivan",
                "Tart"
        };
        return rTitle[getRandomNumber(0, rTitle.length)-1];

    }

    public String getRandomPublisher(){

        String[] rTitle = {
                "Publ1",
                "Publ2",
                "Publ3",
                "Publ4",
                "Exmo",
                "Publ5",
                "Publ6"
        };
        return rTitle[getRandomNumber(0, rTitle.length)-1];

    }


    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + 1);
    }

    public Book1[] addPercent(Book1[] books, int percent) {
        for (Book1 book : books) {
            Double newPrice = Math.ceil((book.getPrice() + book.getPrice() * percent) * 100) / 100;
            book.setPrice(newPrice);
        }
        return books;

    }
}
