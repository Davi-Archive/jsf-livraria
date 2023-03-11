package com.livraria.bean;

public class Livro {

    public String titulo;
    public String isbn;
    public Double preco;
    public String data;

    public Livro() {
    }

    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public Double getPreco() {
	return preco;
    }

    public void setPreco(Double preco) {
	this.preco = preco;
    }

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

    @Override
    public String toString() {
	return "Livro [titulo=" + titulo + ", isbn=" + isbn
		+ ", preco=" + preco + ", data=" + data + "]";
    }

}