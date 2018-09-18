package if26.tp01.solution1;

import java.util.Arrays;

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
        lo07.setParcours("TCB");
        lo07.setCredit(6);
        
        Module gs11 = new Module("GS11", "TM", "FIL", 6);
        Module mtc01 = new Module("MTC01", "HT", "UTT", 4);
        Module jp00 = new Module("JP00", "EC", "UTT", 4);
        Stage st10 = new Stage("ST10", "ST", "FIL", 30);
        
        Module t[] = {lo07, gs11, mtc01, jp00, st10.toModule()};
        
        Cursus c = new Cursus();
        
        c.addAll(Arrays.asList(t));
        
        c.affiche_modules();
    }
}
