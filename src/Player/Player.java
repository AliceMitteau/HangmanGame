package Player;

public class Player {
    private int life = 11;
    private String username;


    public Player() {
    }

    public Player(String username) {
        this.username = username;
    }

    public int getLife() {
        return life;
    }

    public String getUsername() {
        return username;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
