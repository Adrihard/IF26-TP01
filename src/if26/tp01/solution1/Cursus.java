package if26.tp01.solution1;

import java.util.ArrayList;

/**
 *
 * @author adrian
 */
public class Cursus extends ArrayList<Module>
{
    public void affiche_modules_categorie(String categorie)
    {
        for (Module m : this)
        {
            if (
                categorie == null || 
                m.getCategorie().equalsIgnoreCase(categorie)
            )
                m.affiche();
        }
    }
    
    public void affiche_modules()
    {
        this.affiche_modules_categorie(null);
    }
}
