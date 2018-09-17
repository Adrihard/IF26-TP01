package if26.tp01;

import if26.tp01.solution1.Module;

/**
 *
 * @author adrian
 */
public class Principale
{
    public static void main(String[] args)
    {
        Module lo07 = new Module();
        
        lo07.setSigle("LO07");
        lo07.setCategorie("CS");
        lo07.setParcours("TC Branche");
        lo07.setCredit(6);
        
        Module gs11 = new Module("GS11", "TM", "Filière", 6);
        Module mtc01 = new Module("MTC01", "HT", "UTT", 4);
        Module jp00 = new Module("JP00", "EC", "UTT", 4);
        
        Module t[] = {lo07, gs11, mtc01, jp00};
        
        for (Module m : t)
            m.affiche();
    }
}
