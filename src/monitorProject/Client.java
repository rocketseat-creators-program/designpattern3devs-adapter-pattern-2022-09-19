package monitorProject;

import monitorProject.adapters.HDMIToOldMonitorAdapter;
import monitorProject.adapters.HDMIToVgaAdapter;
import monitorProject.devices.Monitor;
import monitorProject.devices.Notebook;
import monitorProject.devices.OldMonitor;

public class Client {

    public static void main(String[] args) {

        Notebook pc = new Notebook();
        Monitor monitor = new Monitor();
        pc.connectPort(monitor);
        pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("------ Monitor ----------");

        Notebook pc2 = new Notebook();
        OldMonitor oldMonitor = new OldMonitor();
        //pc2.connectPort(monitor.getConnector());  //Don't work! That's the reason why we create the adapter
        pc2.connectPort(new HDMIToVgaAdapter(oldMonitor));
        pc2.sendImageAndSound("Metal Band", "Iron Maiden");

        System.out.println("------ Monitor Class Adapter ----------");

        // rodar o client separado
        Notebook pc3 = new Notebook();
        HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
        pc3.connectPort(monitorAdaptee);
        pc2.sendImageAndSound("Metal Band", "Iron Maiden");
    }
}
