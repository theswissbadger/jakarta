package com.example.buch;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@ManagedBean
@SessionScoped
public class Buch {
    @NotNull
    @Size(min = 2, max = 30, message = "Der Titel muss zwischen 2 und 30 Zeichen lang sein")
    private String title;
    @NotNull
    @Size(min = 2, message = "Der Name muss mindestens 2 Zeichen lang sein")
    private String autor;
    @NotNull
    private String verlag;
    @NotNull
    @DecimalMin(value = "0.05", message = "Der Preis muss mindestens 0.05 sein")
    @DecimalMax(value = "99.95", message = "Der Preis darf höchstens 99.95 sein")
    private double price;
    @NotNull
    private String isbn;

    public Buch() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
