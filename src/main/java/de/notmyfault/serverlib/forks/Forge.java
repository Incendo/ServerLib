package de.notmyfault.serverlib.forks;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Forge {

    private final static java.util.logging.Logger logger = Logger.getLogger(Forge.class.getName());

    private static boolean unsafeForge() {
        try {
            Class.forName("net.minecraftforge.common.MinecraftForge");
            return true;
        } catch (ClassNotFoundException ignored) {
        }
        return false;
    }

    public static void isForge() {
        if (unsafeForge()) {
            logger.log(Level.SEVERE, "************************************************************");
            logger.log(Level.SEVERE, "* You are running a server that does not properly support Bukkit plugins.");
            logger.log(Level.SEVERE, "*");
            logger.log(Level.SEVERE, "* Bukkit plugins should not be used with Forge/Fabric mods!");
            logger.log(Level.SEVERE, "* For Forge: Consider using ForgeEssentials, or SpongeForge + Nucleus.");
            logger.log(Level.SEVERE, "*");
            logger.log(Level.SEVERE, "* By continuing to use Forge you acknowledge you are running an unsupported server version.");
            logger.log(Level.SEVERE, "************************************************************");
        }
    }
}
