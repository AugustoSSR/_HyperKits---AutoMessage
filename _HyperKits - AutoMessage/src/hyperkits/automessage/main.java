package hyperkits.automessage;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {
		
	public static Plugin plugin;
	
	@Override
	public void onEnable() {
		
		plugin = this;
				
		getServer().getConsoleSender().sendMessage("");
		getServer().getConsoleSender().sendMessage("             §fPlugin sendo carregado!");
		getServer().getConsoleSender().sendMessage("        §fAs mensagens automaticas foram carregadas");
		getServer().getConsoleSender().sendMessage("             §aBy §fAugustoSR            ");
		getServer().getConsoleSender().sendMessage("");
		
		getServer().getPluginManager().registerEvents(this, this);
		
		start();
		
				
	}
	
	public static String Prefix = "§e[§7Anuncio§e] §7";
	
	public static void start() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			String[] msg = {
					"Use o §e/report §7para reportar um hacker",
					"Para ter a tag youtuber necessita de §e500§7 subs",
					"Sorteio de coins a toda hora, fique ligado",};
			public void run(){
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage(Prefix +  "" + this.msg[new java.util.Random().nextInt(this.msg.length)]);
				Bukkit.broadcastMessage("");
			}
		}, 0L, 90 * 20L);
	}
	
}