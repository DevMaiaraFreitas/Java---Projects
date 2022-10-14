//Desenvolvido por: Maiara Cristina de Freitas

package entidades;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String login;
    private String password;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass()!= obj.getClass()) return false;
        User user = (User) obj;
        return login == user.login;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.login);
        hash = 23 * hash + Objects.hashCode(this.password);
        return hash;
    }
    
    
}
