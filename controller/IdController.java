package controller;

import java.util.ArrayList;
import bean.User;

public class IdController {
    
    /*
     * @method generateId
     * @return int
     * Genera un numero aletatorio para generar una ide
     */
    public int generateId(){
        return((int)Math.floor(Math.random()*(100000000 - 1 + 1)+ 1));

    }

    /*
     * @method searchID
     * @param id                 identificador del usuario
     * @param userDB             base de datos con el usuario
     */
    public void searchID(int id, ArrayList<User> userDB){

    }
}
