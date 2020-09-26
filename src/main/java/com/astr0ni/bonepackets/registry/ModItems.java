package com.astr0ni.bonepackets.registry;

import com.astr0ni.bonepackets.BonemealPackets;
import com.astr0ni.bonepackets.base.PacketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MINI_BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(7));
    public static final Item BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(63));
    public static final Item BIG_BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(511));
    public static final Item LARGE_BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(4095));
    public static final Item SMALL_BONEMEAL_CRATE = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(32767));
    public static final Item BONEMEAL_CRATE = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(261423));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "mini_bonemeal_packet"), MINI_BONEMEAL_PACKET);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "bonemeal_packet"), BONEMEAL_PACKET);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "big_bonemeal_packet"), BIG_BONEMEAL_PACKET);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "large_bonemeal_packet"), LARGE_BONEMEAL_PACKET);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "small_bonemeal_crate"), SMALL_BONEMEAL_CRATE);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "bonemeal_crate"), BONEMEAL_CRATE);
    }
}
