package edu.java.modulo1;
public class Class3 {
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    public static void main (String [] args){
        
        //variaveis
        String meuNome = "Eduardo";
        int anoFabricacao = 2022;
        boolean sim = true;

        anoFabricacao = 2018;

        //metodos
        String primeiroNome = "Eduardo";
        String segundoNome = "Salvador";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
}
