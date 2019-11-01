package gradle.cucumber.domain;

public class IsItFriday {

    public IsItFriday(String today) {
        this.today = today;
    }

    private String today;

    public String isItFriday() {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
