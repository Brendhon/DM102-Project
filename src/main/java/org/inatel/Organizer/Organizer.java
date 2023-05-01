package org.inatel.Organizer;

import org.inatel.Commentator.Commentator;

import java.util.ArrayList;

public class Organizer {
    // Attributes
    private String name;
    private String location;
    private String website;
    private ArrayList<Commentator> commentators;

    // Methods
    public Organizer(String name, String location, String website) {
        this.name = name;
        this.location = location;
        this.website = website;
        this.commentators = new ArrayList<Commentator>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getWebsite() {
        return website;
    }

    public void addCommentator(Commentator commentator) {
        this.commentators.add(commentator);
    }

    public String getCommentatorsName() {
        String commentators = "";
        for (Commentator commentator : this.commentators) {
            commentators += commentator.getName() + ", ";
        }
        return commentators;
    }

    public String getOrganizationsInfo() {
        String info = "";
        info += "Name: " + this.getName() + "\n";
        info += "Location: " + this.getLocation() + "\n";
        info += "Website: " + this.getWebsite() + "\n";
        info += "Commentators: " + this.getCommentatorsName();
        return info;
    }
}
