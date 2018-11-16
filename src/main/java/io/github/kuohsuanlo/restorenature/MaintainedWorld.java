package io.github.kuohsuanlo.restorenature;

import java.util.ArrayList;

class MaintainedWorld {
    public String world_name = "";
    public ArrayList<String> nature_factions;
    public int chunk_radius;

    public MaintainedWorld(String name, ArrayList<String> factions, int radius) {
        world_name = name;
        nature_factions = factions;
        chunk_radius = radius;
    }
}
