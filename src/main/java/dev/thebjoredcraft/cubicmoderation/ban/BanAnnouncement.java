package dev.thebjoredcraft.cubicmoderation.ban;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


public class BanAnnouncement {
    public Player player;
    public String reason;

    public BanAnnouncement(Player player, String reason){
        this.player = player;
        this.reason = reason;


    }

    public String getReason() {
        return reason;
    }

    public Player getPlayer() {
        return player;
    }
}
