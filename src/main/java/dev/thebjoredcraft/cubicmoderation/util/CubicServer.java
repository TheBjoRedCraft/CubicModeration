package dev.thebjoredcraft.cubicmoderation.util;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CubicServer {
    public static void broadcastOnlinePlayers(Component msg){
        for(Player player : Bukkit.getOnlinePlayers()){
            player.sendMessage(msg);
        }
    }
    public static void broadcastConsole(Component msg){
        Bukkit.getConsoleSender().sendMessage(msg);
    }
    public static void broadcast(Component msg){
        Bukkit.broadcast(msg);
    }
}
