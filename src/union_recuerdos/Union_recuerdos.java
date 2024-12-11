package union_recuerdos;

import java.util.Scanner;


public class Union_recuerdos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] recuerdoSteven = new String[2];
        String[] recuerdoDamaris = new String[2];
        String[] recuerdosunidos = new String[2];
        String[] recuerdosunidos1 = new String[2];

        
        System.out.println("RECUERDOS DE STEVEN GUANO: ");
        for(int i = 0;i<2;i++){
            recuerdoSteven[i] = scanner.nextLine();
        }
        System.out.println();
        
        System.out.println("RECUERDOS DE DAMARIS: ");
        for(int i=0;i<2;i++){
            recuerdoDamaris[i] = scanner.nextLine();
        }
        System.out.println();
        
        for(int i=0; i<recuerdosunidos.length;i++){
            if(recuerdoSteven[i] != null && recuerdoDamaris[i] !=null){
                recuerdosunidos[i] = recuerdoSteven[i] + " + " + recuerdoDamaris[i];
            }else{
                recuerdosunidos[i] = " FALTA DATOS EN EL ERREGLO ";
            }
        }
        System.out.println("");
        
        for(int i=0; i<recuerdosunidos1.length;i++){
            if(recuerdoDamaris !=null && recuerdoSteven != null){
                recuerdosunidos1[i] = recuerdoDamaris[i] + " + " + recuerdoSteven[i];
            }else{
                recuerdosunidos1[i]="FALTA DATOS EN EL SEGUNDO ARREGLO";
                
            }
        }
            System.out.println(" RECUERDOS UNIDOS DE STEVEN A DAMARIS: ");
            for(String recuerdo : recuerdosunidos){
                System.out.println(recuerdo);

            }
        System.out.println("");
    
            System.out.println("RECUERDOS UNIDOS DE DAMARIS A STEVEN: ");
            for(String recuerdo1 : recuerdosunidos1){
                System.out.println(recuerdo1);
            }
        
    }
}
    
        
      
