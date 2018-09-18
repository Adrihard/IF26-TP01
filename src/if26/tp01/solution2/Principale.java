package if26.tp01.solution2;

import java.util.Arrays;

/**
 *
 * @author adrian
 */
public class Principale
{
    public static void main(String[] args)
    {
        Module lo07 = new Module("LO07", "CS", "TCB", 6);        
        Module gs11 = new Module("GS11", "TM", "FIL", 6);
        Module mtc01 = new Module("MTC01", "HT", "UTT", 4);
        Module jp00 = new Module("JP00", "EC", "UTT", 4);
        Stage st10 = new Stage("ST10", "FIL", 30);
        
        Element t[] = {lo07, gs11, mtc01, jp00, st10};
        
        Cursus c = new Cursus();
        
        c.addAll(Arrays.asList(t));
        
        c.affiche_cursus();
    }
}
