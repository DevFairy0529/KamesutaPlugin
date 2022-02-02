/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devfairy0529.plugins.kamesutaplugin.kamesutaplugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Keens
 */
public class KamesutaPluginCore extends JavaPlugin{
    @Override
    public void onEnable(){
        getLogger().info("start Kamesuta plugin!");
    }
    @Override
    public void onDisable(){
        getLogger().info("stop Kamesuta plugin!");
    }
}
