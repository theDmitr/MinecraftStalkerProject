package thedmitr.survivors.common;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import thedmitr.survivors.common.blocks.SurvivorsBlocks;
import thedmitr.survivors.common.item.SurvivorsItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        SurvivorsBlocks.register();
        SurvivorsItems.register();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
