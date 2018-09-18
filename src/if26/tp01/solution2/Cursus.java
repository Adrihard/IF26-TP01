package if26.tp01.solution2;

import java.util.ArrayList;

/**
 *
 * @author adrian
 */
public class Cursus extends ArrayList<Unite>
{
    public void affiche_cursus_categorie(String categorie)
    {
        this.stream().filter( (m) -> 
            (
                categorie == null ||
                categorie.equals(m.getCategorie())
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
