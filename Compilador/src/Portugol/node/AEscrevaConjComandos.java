/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import java.util.*;
import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class AEscrevaConjComandos extends PConjComandos
{
    private final LinkedList<PConjComandos> _conjComandos_ = new LinkedList<PConjComandos>();
    private PAstEscreva _astEscreva_;

    public AEscrevaConjComandos()
    {
        // Constructor
    }

    public AEscrevaConjComandos(
        @SuppressWarnings("hiding") List<?> _conjComandos_,
        @SuppressWarnings("hiding") PAstEscreva _astEscreva_)
    {
        // Constructor
        setConjComandos(_conjComandos_);

        setAstEscreva(_astEscreva_);

    }

    @Override
    public Object clone()
    {
        return new AEscrevaConjComandos(
            cloneList(this._conjComandos_),
            cloneNode(this._astEscreva_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEscrevaConjComandos(this);
    }

    public LinkedList<PConjComandos> getConjComandos()
    {
        return this._conjComandos_;
    }

    public void setConjComandos(List<?> list)
    {
        for(PConjComandos e : this._conjComandos_)
        {
            e.parent(null);
        }
        this._conjComandos_.clear();

        for(Object obj_e : list)
        {
            PConjComandos e = (PConjComandos) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._conjComandos_.add(e);
        }
    }

    public PAstEscreva getAstEscreva()
    {
        return this._astEscreva_;
    }

    public void setAstEscreva(PAstEscreva node)
    {
        if(this._astEscreva_ != null)
        {
            this._astEscreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astEscreva_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conjComandos_)
            + toString(this._astEscreva_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conjComandos_.remove(child))
        {
            return;
        }

        if(this._astEscreva_ == child)
        {
            this._astEscreva_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PConjComandos> i = this._conjComandos_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PConjComandos) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._astEscreva_ == oldChild)
        {
            setAstEscreva((PAstEscreva) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
