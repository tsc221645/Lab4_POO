package controller;
import java.util.Scanner;
import bean.User;

public class RegisterController {

    Scanner scan;

    /*
     * @method RegisterController
     * Constructor de la clase
     */
    public RegisterController(){
        scan = new Scanner(System.in);
    }

    /*
     * @method registerNewUser
     */
    public void registerNewUser(){
        boolean correctData1 = false;
        boolean correctData2 = false;
        String newUserName = "";
        String newUserPassword = "";
        //registrar nombre de usuario
        do{
            System.out.println("Ingrese su nombre de usuario: ");
            newUserName = scan.nextLine();
            if(newUserName.trim().equals("")){
                System.out.println("El nombre no puede estar vacio");
                correctData1 = false;
            }
            else{
                correctData1 = true;
            }

        }while(correctData1 == false);

        //registrar contrasena
        do{
            System.out.println("Ingrese su contrasena: ");
            newUserPassword = scan.nextLine();
            if(newUserPassword.trim().equals("")){
                System.out.println("La contrasena no puede estar vacia");
                correctData2 = false;
            }
            else{
                correctData2 = true;
            }

        }while(correctData2 == false);
    }

    /*
     * @method loginNewUser
     */
    public void loginNewUser(){
        boolean correctData1 = false;
        boolean correctData2 = false;
        String existingUserName = "";
        String existingPassword = "";
        //Ingreso Usuario
        do{
            System.out.println("Ingrese su nombre de usuario: ");
            existingUserName = scan.nextLine();
            if(existingUserName.trim().equals("")){
                System.out.println("El nombre de usuario no puede estar vacio!");
            }
            else{
                correctData1 = true;
            }
            
        }while(correctData1 == false);

        //Ingreso Contrasena
        do{
            System.out.println("Ingrese su contrasena: ");
            existingPassword = scan.nextLine();
            if(existingPassword.trim().equals("")){
                System.out.println("El nombre de usuario no puede estar vacio!");
            }
            else{
                correctData2 = true;
            }
            
        }while(correctData2 == false);
    }
    
}
