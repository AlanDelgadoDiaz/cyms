/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Qyo_J
 */
import java.util.Scanner;
public class Cesar
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    String str;
    String key;
    int keyLength;

    System.out.println("poner  mensaje:");
    str=sc.nextLine();
    System.out.println("poner llave de encriptacion :");
    key=sc.next();
    keyLength=key.length();
   
    for(;;)
    {
        System.out.println("1.encriptar\n2.decriptar\n3.salir...");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
           
                System.out.println("mensaje encriptado ..."+encrypt(str,keyLength));
                break;
            case 2:
           
                System.out.println("mensaje desencriptado..."+decrypt(encrypt(str,keyLength),keyLength));
                break;
            case 3:
               
                System.exit(0);
                break;
            default:
            System.out.println("option invalida..");
        }
    }
}
public static String encrypt(String str,int keyLength)
{
    String encrypted="";
    for(int i=0;i<str.length();i++)
    {
      
        int c=str.charAt(i);
       
        if(Character.isUpperCase(c))
        {
            c=c+(keyLength%26);
            
            if(c>'Z')
                c=c-26;
        }
        
        else if(Character.isLowerCase(c))
        {
            c=c+(keyLength%26);
          
            if(c>'z')
                c=c-26;
        }
      
        encrypted=encrypted+(char) c;
    }
    return encrypted;
}
public static String decrypt(String str,int keyLength)
{
    String decrypted="";
    for(int i=0;i<str.length();i++)
    {
       
        int c=str.charAt(i);
       
        if(Character.isUpperCase(c))
        {
            c=c-(keyLength%26);
           
            if(c<'A')
                c=c+26;
        }
       
        else if(Character.isLowerCase(c))
        {
            c=c-(keyLength%26);
         
            if(c<'a')
                c=c+26;
        }
      
        decrypted=decrypted+(char) c;
    }
    return decrypted;
}
}