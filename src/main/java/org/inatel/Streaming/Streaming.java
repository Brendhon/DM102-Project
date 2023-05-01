package org.inatel.Streaming;
import org.inatel.Spectator.Spectator;

import java.util.ArrayList;

public class Streaming {
    // Attributes
    private String name;
    private String platform;
    private int viewers;

    // Relationships
    private ArrayList<Spectator> spectators;

    // Methods
    public Streaming(String name, String platform, int viewers) {
        this.name = name;
        this.platform = platform;
        this.viewers = viewers;
        this.spectators = new ArrayList<Spectator>();
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public int getViewers() {
        return viewers;
    }

    public void addSpectator(Spectator spectator) {
        this.spectators.add(spectator);
    }

    public String getSpectatorsName() {
        String spectators = "";
        for (Spectator spectator : this.spectators) {
            spectators += spectator.getName() + ", ";
        }
        return spectators;
    }

    public String getWebsite() {
        return "https://www.twitch.tv/";
    }

    // Get streaming information
    public String getStreamingInfo() {
        String info = "";
        info += "Name: " + this.getName() + "\n";
        info += "Platform: " + this.getPlatform() + "\n";
        info += "Viewers: " + this.getViewers() + "\n";
        info += "Spectators: " + this.getSpectatorsName();
        return info;
    }


}

