package monitorProject.devices;

import monitorProject.interfaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(String image) {
        System.out.println(">>> Heeeey video here: " + image);
    }
}
