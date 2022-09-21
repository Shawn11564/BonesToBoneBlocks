package dev.mrshawn.bonestoboneblocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class BonesToBoneBlocks extends JavaPlugin {

	private final NamespacedKey key = new NamespacedKey(this, "bones_to_bone_blocks");
	private final ShapelessRecipe recipe = new ShapelessRecipe(
			key,
			new ItemStack(Material.BONE_BLOCK, 3)
	).addIngredient(9, Material.BONE);

	@Override
	public void onEnable() {
		Bukkit.addRecipe(recipe);
	}

	@Override
	public void onDisable() {
		Bukkit.removeRecipe(key);
	}
}
