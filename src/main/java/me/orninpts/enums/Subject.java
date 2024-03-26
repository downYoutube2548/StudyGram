package me.orninpts.enums;

public enum Subject {
    THAI("Thai"),
    MATH("Mathematic"),
    BIOLOGY("Biology"),
    CHEMISTRY("Chemistry"),
    PHYSIC("Physic"),
    SOCIAL("Social"),
    COMPUTER("Computer"),
    ENGLISH("English");

    private final String displayName;
    Subject(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
