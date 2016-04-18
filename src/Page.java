/**
 * Created by Magdalena Polak on 18.04.2016.
 */
public class Page {
    public int nr;
    public boolean parityBit;
    public Page(int nr, boolean parityBit)
    {
        this.nr = nr;
        this.parityBit = parityBit;
    }
    public Page(Page p )
    {
        this.nr = p.nr;
        this.parityBit = p.parityBit;
    }

    public String toString() {
        return nr + " ";
    }
}
