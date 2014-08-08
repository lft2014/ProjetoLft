/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import java.util.*;
import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class AAstCaso extends PAstCaso
{
    private PAstValor _astValor_;
    private final LinkedList<PConjComandos> _conjComandos_ = new LinkedList<PConjComandos>();

    public AAstCaso()
    {
        // Constructor
    }

    public AAstCaso(
        @SuppressWarnings("hiding") PAstValor _astValor_,
        @SuppressWarnings("hiding") List<?> _conjComandos_)
    {
        // Constructor
        setAstValor(_astValor_);

        setConjComandos(_conjComandos_);

    }

    @Override
    public Object clone()
    {
        return new AAstCaso(
            cloneNode(this._astValor_),
            cloneList(this._conjComandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAstCaso(this);
    }

    public PAstValor getAstValor()
    {
        return this._astValor_;
    }

    public void setAstValor(PAstValor node)
    {
        if(this._astValor_ != null)
        {
            this._astValor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astValor_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._astValor_)
            + toString(this._conjComandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._astValor_ == child)
        {
            this._astValor_ = null;
            return;
        }

        if(this._conjComandos_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._astValor_ == oldChild)
        {
            setAstValor((PAstValor) newChild);
            return;
        }

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

        throw new RuntimeException("Not a child.");
    }
}
