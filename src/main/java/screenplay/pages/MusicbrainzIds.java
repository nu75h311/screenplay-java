package screenplay.pages;

public enum MusicbrainzIds {
    NIRVANA("5b11f4ce-a62d-471e-81fc-a69a8278c7da"),
    RUSH("534ee493-bfac-4575-a44a-0ae41e2c3fe4");

    private String id = null;

    MusicbrainzIds(final String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
