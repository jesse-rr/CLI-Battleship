public class User {
    private Long id;
    private String username;
    private String password;
    private int energy;
    private int streak;

    public static void main(String[] args) {
    }

    public User(Long id, String username, String password, int energy, int streak) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.energy = energy;
        this.streak = streak;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEnergy() {
        return energy;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak() {
        this.streak = 0;
    }

    public void setEnergy() {
        this.energy = 0;
    }
}
