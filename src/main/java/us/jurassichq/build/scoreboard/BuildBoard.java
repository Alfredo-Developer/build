package us.jurassichq.build.scoreboard;

import io.github.thatkawaiisam.assemble.AssembleAdapter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import us.jurassichq.build.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class BuildBoard implements AssembleAdapter {


	public String getTitle(Player player) {
		return Utils.chat("&a&lJurassic &7(Build)");
	}

	public List<String> getLines(Player player) {
		List<String> lines = new ArrayList<String>();
		lines.add(Utils.chat("&7&m--------------------"));
		lines.add(Utils.chat("&a&lOnline&7: &f" + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers()));
		lines.add(Utils.chat("&e&lWorld&7: &f" + player.getWorld().getName()));
		lines.add(Utils.chat("&c&lPlot&7: &fNone"));
		lines.add(Utils.chat("&7&m--------------------"));
		return lines;
	}
}
