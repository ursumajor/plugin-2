package com.gmail.ursumajor1.plugin_1;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;


public final class main extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
	@EventHandler
	public void vehiclespawn(VehicleCreateEvent v) {
		Vehicle vehicle = v.getVehicle();
		if(vehicle instanceof Boat) {
			vehicle.setGravity(false);
			
			//rip infinitly fast boats
			//((Boat) vehicle).setMaxSpeed(10);
		}
	}
}