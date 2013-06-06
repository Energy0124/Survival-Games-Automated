package com.bukkit.dallen6.survivalgamesautomated;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.bukkit.selections.CuboidSelection;
import com.sk89q.worldedit.bukkit.selections.Selection;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

@SuppressWarnings("unused")
public class Main extends JavaPlugin{
	private SGPlayerListener PlayerListener = new SGPlayerListener(this);
	
	private static final Logger log = Logger.getLogger("Minecraft");
	static String maindirectory = "SurvivalGamesAutomated/"; 
	
	static File stats = new File(maindirectory + "Users.accounts");
@Override
public void onEnable(){
	new File(maindirectory).mkdir();
	if(!stats.exists()){
		try {
			stats.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		LoadSettings.loadMain();
	}
	PluginManager pm = getServer().getPluginManager();
	pm.registerEvents(this.PlayerListener, this);
	
	log.info("SurvivalGamesAutomated Enabled Sucessfully!");
}

@Override
public void onDisable(){
	log.info("SurvivalGamesAutomated Disabled!");
}




	public boolean onCommand(CommandSender sender, Command cmd, String []commandlabel, String[] args){
	
	
		Player player = (Player)sender;
		 
		if(cmd.getName().equalsIgnoreCase("sga")) {
			
			player.sendMessage("This is the main command for this plugin");
				
			
			
                     }
                 
		
		return true;
	

		}}







