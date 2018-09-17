package if26.tp01.solution2;

import java.util.ArrayList;

/**
 *
 * @author adrian
 */
public class Cursus extends ArrayList<Element>
{
    public void affiche_cursus_categorie(String categorie)
    {
        this.stream().filter( (m) -> 
            (
                categorie == null ||
                m.getCategorie().equalsIgnoreCase(categorie)
            )
        )
        .forEachOrdered( (m) -> 
            {
                m.affiche();
            }
        );
    }
    
    public void affiche_cursus()
    {
        this.affiche_cursus_categorie(null);
    }
}
