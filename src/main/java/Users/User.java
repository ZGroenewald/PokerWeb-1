package Users;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;



@Entity
public class User {

    @Id
    @Size(max = 12)
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<UserGame> games = new ArrayList<>();

    public User(){}

    public User(String _username, String _password)
    {
        username = _username;
        password = _password;
    }

    public void addGame(Game game){
        UserGame userGame = new UserGame();
        userGame.setUsername(this.getUsername());
        userGame.setGameName(game.getGameName());
        userGame.setUser(this);
        userGame.setGame(game);
        games.add(userGame);
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String user) { this.username = user; }
    public void setPassword(String pass) { this.password = pass; }



    /*private String userHand;

    public void setUserHand(String h){
        userHand = h;
    }

    public String getUserHand(){
        return userHand;
    }*/


}
