public class WaterTankMonitor {

    /*
    Un WaterTankMonitor (un surveillant de réservoir d'eau) a pour objectif de surveiller l'accès à un
WaterTank (un réservoir d'eau).
Une instance de WaterTankMonitor est partagée par des threads concurrents, opérant à des périodes
de temps aléatoires et dans un ordre imprévisible.
Ces threads appartiennent à l'une de ces deux familles : les consommateurs (qui veulent vider le
réservoir d'eau) ou, les producteurs (qui veulent remplir le réservoir d'eau). Le problème consiste à
s'assurer que les producteurs n'essayeront pas de remplir le réservoir s'il est déjà rempli et que les
consommateurs n'essayeront pas de retirer de l'eau du réservoir s'il est vide.
Corriger WaterTankMonitor en implémentant une solution élégante.
     */

    private final WaterTank tank; // water tank monitored
    private int capacity;
    private int currentVolume = 0;

    WaterTankMonitor(WaterTank tank) {
        this.tank = tank;
    }

    public synchronized void empty() throws InterruptedException {
        // Attendre si le réservoir est déjà vide
        while (tank.isEmpty()) {
            wait();
        }

        // Vidanger le réservoir
        currentVolume = 0;
        tank.setEmpty(true);

        // Avertir les threads producteurs que le réservoir est vide
        notifyAll();
    }

    public synchronized void fill() throws InterruptedException {
        // Attendre si le réservoir est plein
        while (!tank.isEmpty() && currentVolume >= capacity) {
            wait();
        }

        // Remplir le réservoir
        currentVolume = capacity;
        tank.setEmpty(false);

        // Avertir les threads consommateurs que le réservoir est rempli
        notifyAll();
    }
}

class WaterTank {
    private boolean empty = true;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean isEmpty) {
        this.empty = isEmpty;
    }
}
