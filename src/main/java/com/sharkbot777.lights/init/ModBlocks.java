package com.sharkbot777.lights.init;

import com.sharkbot777.lights.Reference;
import com.sharkbot777.lights.blocks.BlockBasic;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModBlocks {
	public static Block lightBlock;
	public static Block lightBlockGreen;
	public static Block lightBlockPurple;
	public static Block lightBlockOrange;
	public static Block lightBlockYellow;
	public static Block lightBlockRed;
	public static Block lightBlockBlue;

	static final CreativeTabs tabLightsMod = new CreativeTabs("Lights") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(lightBlock);
		}

		@Override
		public boolean hasSearchBar() {
			return true;
		}

	}.setBackgroundImageName("item_search.png");

	public static void init() {
		lightBlock = new BlockBasic("light_block", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlockGreen = new BlockBasic("light_block_green", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlockPurple = new BlockBasic("light_block_purple", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlockOrange = new BlockBasic("light_block_orange", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlockYellow = new BlockBasic("light_block_yellow", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlockRed = new BlockBasic("light_block_red", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlockBlue = new BlockBasic("light_block_blue", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlock = new BlockBasic("light_block", Material.ROCK).setHardness(1.5f).setCreativeTab(ModBlocks.tabLightsMod).setLightLevel(1.0f);
		lightBlock.setHarvestLevel("pickaxe", 2);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(lightBlock, lightBlockGreen, lightBlockPurple, lightBlockOrange, lightBlockYellow, lightBlockRed, lightBlockBlue);
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(lightBlock).setRegistryName(lightBlock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(lightBlockGreen).setRegistryName(lightBlockGreen.getRegistryName()));
		event.getRegistry().register(new ItemBlock(lightBlockPurple).setRegistryName(lightBlockPurple.getRegistryName()));
		event.getRegistry().register(new ItemBlock(lightBlockOrange).setRegistryName(lightBlockOrange.getRegistryName()));
		event.getRegistry().register(new ItemBlock(lightBlockYellow).setRegistryName(lightBlockYellow.getRegistryName()));
		event.getRegistry().register(new ItemBlock(lightBlockRed).setRegistryName(lightBlockRed.getRegistryName()));
		event.getRegistry().register(new ItemBlock(lightBlockBlue).setRegistryName(lightBlockBlue.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(lightBlock));
		registerRender(Item.getItemFromBlock(lightBlockGreen));
		registerRender(Item.getItemFromBlock(lightBlockPurple));
		registerRender(Item.getItemFromBlock(lightBlockOrange));
		registerRender(Item.getItemFromBlock(lightBlockYellow));
		registerRender(Item.getItemFromBlock(lightBlockRed));
		registerRender(Item.getItemFromBlock(lightBlockBlue));
	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}


}
