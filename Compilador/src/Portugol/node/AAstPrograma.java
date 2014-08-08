/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import java.util.*;
import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class AAstPrograma extends PAstPrograma
{
    private TIdentificador _identificador_;
    private final LinkedList<PAstDeclaracoes> _astDeclaracoes_ = new LinkedList<PAstDeclaracoes>();
    private final LinkedList<PConjComandos> _conjComandos_ = new LinkedList<PConjComandos>();

    public AAstPrograma()
    {
        // Constructor
    }

    public AAstPrograma(
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") List<?> _astDeclaracoes_,
        @SuppressWarnings("hiding") List<?> _conjComandos_)
    {
        // Constructor
        setIdentificador(_identificador_);

        setAstDeclaracoes(_astDeclaracoes_);

        setConjComandos(_conjComandos_);

    }

    @Override
    public Object clone()
    {
        return new AAstPrograma(
            cloneNode(this._identificador_),
            cloneList(this._astDeclaracoes_),
            cloneList(this._conjComandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAstPrograma(this);
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public LinkedList<PAstDeclaracoes> getAstDeclaracoes()
    {
        return this._astDeclaracoes_;
    }

    public void setAstDeclaracoes(List<?> list)
    {
        for(PAstDeclaracoes e : this._astDeclaracoes_)
        {
            e.parent(null);
        }
        this._astDeclaracoes_.clear();

        for(Object obj_e : list)
        {
            PAstDeclaracoes e = (PAstDeclaracoes) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._astDeclaracoes_.add(e);
        }
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
            + toString(this._identificador_)
            + toString(this._astDeclaracoes_)
            + toString(this._conjComandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._astDeclaracoes_.remove(child))
        {
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
        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        for(ListIterator<PAstDeclaracoes> i = this._astDeclaracoes_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAstDeclaracoes) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
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