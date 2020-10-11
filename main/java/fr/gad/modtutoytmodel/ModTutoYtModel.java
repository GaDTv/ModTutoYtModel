package fr.gad.modtutoytmodel;

import fr.gad.modtutoytmodel.proxy.CommonProxy;
import fr.gad.modtutoytmodel.utils.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = References.modid, name = References.name, version = References.version)
public class ModTutoYtModel {

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(References.modid)
    public static ModTutoYtModel instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init();
    }
}
