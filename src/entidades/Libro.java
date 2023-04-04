package entidades;

import java.util.Scanner;

public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int numPagina;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;

    }

    public void cargaDato() {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el Titulo");
        titulo = leer.nextLine();
        System.out.println(" ");
        System.out.println("Ingrese el Autor");
        autor = leer.nextLine();
        System.out.println("Ingrese el ISBN");
        ISBN = leer.nextInt();
        System.out.println("Ingrese el numero de paginas");
        numPagina = leer.nextInt();
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPagina=" + numPagina + '}';
    }
    
    
}
