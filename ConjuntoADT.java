/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaestructuradedatosnum2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author ikero
 */
public class ConjuntoADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño de A:");
        int tA = leer.nextInt();
         System.out.println("Ingresa el tamaño de B:");
        int tB = leer.nextInt();
        
        int []A= new int [tA];
          int []B= new int [tB];
          System.out.println("Ingresa todos los elementos para el Conjunto A");
          for (int i = 0; i < A.length; i++) {
            System.out.print(i + " ");
            A[i]=leer.nextInt();
                        
        }
          System.out.println("Ingresa los elementos para el Conjunto B");
          for (int i = 0; i < B.length; i++) {
            System.out.print(i + " ");
            B[i]=leer.nextInt();
          
          }
          System.out.println("Los elementos que conforman la union son los siguientes: ");
          int[]U= UNION(A, B);
          int[]I=interseccion(A, B);
          for (int i = 0; i < U.length; i++) {
              System.out.println(U[i]);
        }
           System.out.println("Los elementos que conforman a la interseccion son:");
           for (int i = 0; i < I.length; i++) {
               System.out.println(I[i]);
        }
          
           
         
    }
  public static Boolean existe(int []conjunto,int elemento){
      Boolean existe = false;
      
      for (int i = 0; i < conjunto.length ; i++) 
      {
       if(conjunto[i]== elemento)
       {
           existe= true;
       }
      }
      return existe;
  }
  public static int[]UNION(int[]A,int[]B){
      int[]U = new int [A.length+B.length];
      
      int x = 0;
      int rep = 0;
      for (int i = 0; i < A.length; i++) {
          U[i]=A[i];
         
      }
      for (int i = 0; i <B.length; i++) {
          if(existe(U,B[i])==false){
              U[A.length+x]=B[i];
              x++;
          }else{
              rep++;
          }
      }
      int []Auxiliar = U;
      U = new int [Auxiliar.length-rep];
      for (int i = 0; i < U.length; i++) {
          U[i]=Auxiliar[i];
     
      }
      return U;
      
  }
  public void agregrar(){
      
  }
              
  public static int[] interseccion(int[]A,int[]B){
  int conta= 0;
  
      for (int i = 0; i < A.length; i++)
      {          if(A[i]==B[i])
          {
              System.out.println("Son subconjuntos");
          }
          else{
              System.out.println("No existe un Subconjunto");
          }
          if(existe(B, A[i])==true)   
          {
         conta++;
         
          }
          if(A[i]==B[i])
          {
              System.out.println("Son subconjuntos");
          }
          else{
              System.out.println("No existe un Subconjunto");
          }
      }
        
        
        int[]I=new int[conta];
        int x=0;
        for (int i = 0; i < A.length; i++) {
          if(existe(B, A[i])==true){
              I[x]=A[i];
              x++;
          }
        }
         return I; 
      }
    
    
      
  
         
     
      
    
      
          
          
      }

