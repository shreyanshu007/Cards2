package com.example.shreyanshushekhar.cards2;

public class Cards {
    private String title;
    private String secondary_text;
    private String description;
    private String btnText;

    public String getTitle() {
        return title;
    }

    public String getSecondary_text() {
        return secondary_text;
    }

    public String getDescription() {
        return description;
    }

    public String getBtnText() {
        return btnText;
    }

    public Cards(String title, String secondary_text, String description, String btnText) {

        this.title = title;
        this.secondary_text = secondary_text;
        this.description = description;
        this.btnText = btnText;
    }
}
