package com.bukkit.dallen6.survivalgamesautomated;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SGPlayerListener implements Listener{
public Main plugin;
public SGPlayerListener(Main instance) {
	plugin = instance;
}

@EventHandler(priority = EventPriority.HIGHEST)
public void onPlayerJoin(PlayerJoinEvent event){
	event.getPlayer().sendMessage(ChatColor.GREEN + "This Server Is Running SurvivalGamesAutomated Alpha by dallen6 and skmike95!");
}
}




