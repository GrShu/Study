package com.alpha.work1;

import java.util.concurrent.Flow;

public class Book1 {
    private int id;
    private String Title;
    private String Autor;
    private String Publisher;
    private int Year;
    private int CountPages;
    private double Price;

    public String  viewBook(){

        return id + " "
                + Title + " "
                + Autor + " "
                + Publisher + " "
                + Year + " "
                + CountPages + " "
                + Price;

    }

/*    public void setBook(int id, String Title, String Autor, String Publisher, int Year, int CountPages, float Price) {
        id = id;
        Title = Title;
        Autor = Autor;
        Flow.Publisher = Publisher;
        Year = Year;
        CountPages = CountPages;
        Price = Price;
    }*/

 /*   public void setBook(){

        System.out.write("Input ID: ");
        id = (int) System.in.read();

        System.out.write("Input Title: ");
        Title = (char) System.in.read();
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getCountPages() {
        return CountPages;
    }

    public void setCountPages(int countPages) {
        CountPages = countPages;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
