import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Magdalena Polak on 18.04.2016.
 */
public class Algorithms {

    public int FRAME_SIZE;
    public int PagesNr;

    ArrayList<Page> PageReferences = new ArrayList<Page>();
    ArrayList<Page> Frame = new ArrayList<Page>();
    public int PF = 0;

    public Algorithms(int FRAME_SIZE, int PagesNr, int interval)
    {
        this.FRAME_SIZE = FRAME_SIZE;
        this.PagesNr = PagesNr;
        for(int a = 0; a< PagesNr; a++)
        {
           int r =(int)(Math.random()*interval);
            PageReferences.add(new Page(r, true));
        }
    }




    public int FIFO() {
        PF = 0;
        ArrayList<Page> Pages1 = new ArrayList<>();
        for(Page p :PageReferences)
        {
            Pages1.add(new Page(p));
        }
        Page n;
        for (int i = 0; i < Pages1.size(); i++) {
            n = Pages1.get(i);
            mainloop:
            if (Frame.size() < FRAME_SIZE) {
                for (Page p : Frame)
                {
                    if (p.nr == n.nr)
                    {
                        break mainloop;
                    }
                }
                Frame.add(n);
            }

            else
            {
                for (Page p : Frame)
                {
                    if (p.nr == n.nr)
                    {
                        break mainloop;
                    }
                }
                    Frame.remove(0);
                    Frame.add(n);
                    PF++;

            }
        }
        Frame.clear();
       return  PF;
    }
    public int RANDOM()    {
        PF = 0;
        ArrayList<Page> Pages2 = new ArrayList<>();
        for(Page p :PageReferences)
        {
            Pages2.add(new Page(p));
        }
        Page n;
        for (int i = 0; i < Pages2.size(); i++) {
            n = Pages2.get(i);
            mainloop:
            if (Frame.size() < FRAME_SIZE) {
                for (Page p : Frame)
                {
                    if (p.nr == n.nr)
                    {
                        break mainloop;
                    }
                }
                Frame.add(n);
            }

            else
            {
                for (Page p : Frame)
                {
                    if (p.nr == n.nr)
                    {
                        break mainloop;
                    }
                }
                int r =(int)(Math.random()*FRAME_SIZE);
                Frame.set(r, n);
                PF++;

            }
        }
        Frame.clear();
        return  PF;
    }
}