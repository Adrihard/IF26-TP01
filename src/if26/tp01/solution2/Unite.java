package if26.tp01.solution2;

/**
 * Représente une unité d'enseignement (UE).
 * @author adrian
 * 
 */
public abstract class Unite
{
    private String      sigle;
    private Categorie   categorie;
    private Parcours    parcours;
    private int         credit;

    public void affiche()
    {
        System.out.println(this.toString());
    }

    public Unite(String sigle, Categorie categorie, Parcours parcours, int credit)
    {
        this.sigle = sigle;
        this.categorie = categorie;
        this.parcours = parcours;
        this.credit = credit;
        
        assert (sigle.length() <= 5);
        assert (credit > 0 && credit <= 30);
    }
    
    @Override
    public String toString()
    {
        return "Module{" + "sigle=" + sigle + ", categorie=" + categorie + ", parcours=" + parcours + ", credit=" + credit + '}';
    }

    public String getSigle()
    {
        return sigle;
    }
    
    public void setSigle(String sigle)
    {
        this.sigle = sigle;
    }
    
    public abstract boolean isCategorieSettable();
    
    public Categorie getCategorie()
    {
        return categorie;
    }

    public void setCategorie(Categorie categorie)
    {
        if (this.isCategorieSettable())
            this.categorie = categorie;
        else
            throw new UnsupportedOperationException("Not supported.");
    }

    public Parcours getParcours()
    {
        return parcours;
    }

    public void setParcours(Parcours parcours)
    {
        this.parcours = parcours;
    }

    public int getCredit()
    {
        return credit;
    }

    public void setCredit(int credit)
    {
        this.credit = credit;
    }
}
