import java.util.Set;

public class Team {
	private int id;
	private String name;
	private Set players;
	public int getNumber() {
		return id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Set getPlayers() {
		return players;
	}
	public void setPlayers(Set players) {
		this.players = players;
	}
}
