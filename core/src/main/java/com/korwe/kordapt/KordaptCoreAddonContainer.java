package com.korwe.kordapt;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptCoreAddonContainer {
    List<KordaptCoreAddon> coreAddons;

    public List<KordaptCoreAddon> getCoreAddons() {
        if(coreAddons == null) coreAddons = new ArrayList<>();
        return coreAddons;
    }

    public void registerAddon(KordaptCoreAddon addon){
        getCoreAddons().add(addon);
    }
}
