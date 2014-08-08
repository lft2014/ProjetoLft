/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import java.util.*;
import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoConjComandos extends PConjComandos
{
    private final LinkedList<PConjComandos> _conjComandos_ = new LinkedList<PConjComandos>();
    private PAstComandoEnquanto _astComandoEnquanto_;

    public AEnquantoConjComandos()
    {
        // Constructor
    }

    public AEnquantoConjComandos(
        @SuppressWarnings("hiding") List<?> _conjComandos_,
        @SuppressWarnings("hiding") PAstComandoEnquanto _astComandoEnquanto_)
    {
        // Constructor
        setConjComandos(_conjComandos_);

        setAstComandoEnquanto(_astComandoEnquanto_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoConjComandos(
            cloneList(this._conjComandos_),
            cloneNode(this._astComandoEnquanto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoConjComandos(this);
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

    public PAstComandoEnquanto getAstComandoEnquanto()
    {
        return this._astComandoEnquanto_;
    }

    public void setAstComandoEnquanto(PAstComandoEnquanto node)
    {
        if(this._astComandoEnquanto_ != null)
        {
            this._astComandoEnquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astComandoEnquanto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conjComandos_)
            + toString(this._astComandoEnquanto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conjComandos_.remove(child))
        {
            return;
        }

        if(this._astComandoEnquanto_ == child)
        {
            this._astComandoEnquanto_ = null;
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

        if(this._astComandoEnquanto_ == oldChild)
        {
            setAstComandoEnquanto((PAstComandoEnquanto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
