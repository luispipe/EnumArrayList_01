package com.example.enum_arraylist_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {

    //Un enum es un elemento que nos permite agrupar constantes
    enum Niveles{
        BASICO,
        INTERMEDIO,
        AVANZADO
    }

    //Listas son las etsructuras que nos permiten almacer
    // datos ilimitados

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear Lista
        ArrayList<String> nombres= new ArrayList<>();

        //Agregar datos
        nombres.add("Andres");
        nombres.add("Brayan");
        nombres.add("DIANA");
        nombres.add("Diana");
        nombres.add(0,"Diego");
        nombres.add("Luis");
        nombres.add("Diana");
        nombres.add("diana");

        //Conocer tamaño
        int size=nombres.size();

        System.out.println(size);

        //Buscar un elemento
        String name=nombres.get(2);
        System.out.println(name);

        System.out.println(nombres.toString());

        //Modificar un elemento de la lista
        nombres.set(1,"Sergio");
        System.out.println(nombres.get(1));

        //Generar copia de una lista
        ArrayList<String> copiaNombres= new ArrayList<>();
        copiaNombres.addAll(nombres);

        System.out.println(copiaNombres.toString());

        //Vaciar o limpiar una lista
        copiaNombres.clear();

        //Preguntar si la lista esta vacia
        boolean vacio= copiaNombres.isEmpty();
        System.out.println(vacio);

        //Saber si la lista contiene un elemento con nombre x
        boolean contiene=nombres.contains("Diana");
        System.out.println(contiene);

        //Eliminar un elemento de la lista por su posición
        nombres.remove(1);
        System.out.println(nombres.toString());

        //Eliminar un elemento de la lista por su valor
        nombres.remove("Luis");
        System.out.println(nombres.toString());

        //Averiguar la posición donde encuentra por primera vez un elemento
        int primero=nombres.indexOf("Diana");
        System.out.println(primero);

        //Averiguar la ultima posición donde se encuentra un valor
        int ultimo= nombres.lastIndexOf("Diana");
        System.out.println(ultimo);

        //Recorrer listas

        /*En un foreach el elemento iterador (i) recorre posición a posición
           dentro de la estructura y extrae el valor que hay en la posición
        * */
        for(String i:nombres){
            System.out.println(i);
        }

        //Ordenar una lista
        Collections.sort(nombres);

        System.out.println(nombres.toString());

        ArrayList<Producto>tienda= new ArrayList<>();
        Producto galletas= new Producto("Ducales",8000,100);
        Producto gaseosa= new Producto("Coca Cola", 4000,50);
        Producto arroz= new Producto("Arroz Diana", 10000,40);

        tienda.add(galletas);
        tienda.add(gaseosa);
        tienda.add(arroz);




    }

    /* Conceptos de JAVA requeridos para realizar el proyecto
    * 1. Definición y manejo de variables (instanciar,
    * modificar, castear o cambiar tipo de datos, definirla global
    * o local)
    * 2. Manejo de condicionales principalmente el IF y ELSE
    * 3. Manejo de ciclos For y While
    * 4. Definición de metodos
    * 5. Definición de clases y sus metodos constructor, getter an setters
    * 6. Crear y realizar operaciones con objetos
    * 7. Manejo de ArrayList
    * 8. Manejo de Arrays
    *
    * */



}