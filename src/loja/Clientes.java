/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Oliveira
 */
public class Clientes {
    private static int ultimo=0;

    /**
     * @return the ultimo
     */
    public static int getUltimo() {
        return ultimo;
    }

    /**
     * @param aUltimo the ultimo to set
     */
    public static void setUltimo(int aUltimo) {
        ultimo = aUltimo;
    }
    private int id;
    private String nome;
    private String morada;
    private int contacto;
    private int nif;
 
 public Clientes(String nome,int nif){
     this.nome=nome;
     this.nif=nif;
     morada="";
     contacto=0;
     ultimo++;
     id=ultimo;
 }   

   
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getMorada() {
        return morada;
    }

    
    public void setMorada(String morada) {
        this.morada = morada;
    }

    
    public int getContacto() {
        return contacto;
    }

    
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    
    public int getNif() {
        return nif;
    }

    
    public void setNif(int nif) {
        this.nif = nif;
    }
}
