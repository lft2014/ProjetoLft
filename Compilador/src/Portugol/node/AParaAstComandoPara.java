/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import java.util.*;
import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class AParaAstComandoPara extends PAstComandoPara
{
    private PAstVarDef _astVarDef_;
    private TNInt _nInt_;
    private PAstComplemento1 _astComplemento1_;
    private final LinkedList<PConjComandos> _conjComandos_ = new LinkedList<PConjComandos>();

    public AParaAstComandoPara()
    {
        // Constructor
    }

    public AParaAstComandoPara(
        @SuppressWarnings("hiding") PAstVarDef _astVarDef_,
        @SuppressWarnings("hiding") TNInt _nInt_,
        @SuppressWarnings("hiding") PAstComplemento1 _astComplemento1_,
        @SuppressWarnings("hiding") List<?> _conjComandos_)
    {
        // Constructor
        setAstVarDef(_astVarDef_);

        setNInt(_nInt_);

        setAstComplemento1(_astComplemento1_);

        setConjComandos(_conjComandos_);

    }

    @Override
    public Object clone()
    {
        return new AParaAstComandoPara(
            cloneNode(this._astVarDef_),
            cloneNode(this._nInt_),
            cloneNode(this._astComplemento1_),
            cloneList(this._conjComandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaAstComandoPara(this);
    }

    public PAstVarDef getAstVarDef()
    {
        return this._astVarDef_;
    }

    public void setAstVarDef(PAstVarDef node)
    {
        if(this._astVarDef_ != null)
        {
            this._astVarDef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astVarDef_ = node;
    }

    public TNInt getNInt()
    {
        return this._nInt_;
    }

    public void setNInt(TNInt node)
    {
        if(this._nInt_ != null)
        {
            this._nInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nInt_ = node;
    }

    public PAstComplemento1 getAstComplemento1()
    {
        return this._astComplemento1_;
    }

    public void setAstComplemento1(PAstComplemento1 node)
    {
        if(this._astComplemento1_ != null)
        {
            this._astComplemento1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astComplemento1_ = node;
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
            + toString(this._astVarDef_)
            + toString(this._nInt_)
            + toString(this._astComplemento1_)
            + toString(this._conjComandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._astVarDef_ == child)
        {
            this._astVarDef_ = null;
            return;
        }

        if(this._nInt_ == child)
        {
            this._nInt_ = null;
            return;
        }

        if(this._astComplemento1_ == child)
        {
            this._astComplemento1_ = null;
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
        if(this._astVarDef_ == oldChild)
        {
            setAstVarDef((PAstVarDef) newChild);
            return;
        }

        if(this._nInt_ == oldChild)
        {
            setNInt((TNInt) newChild);
            return;
        }

        if(this._astComplemento1_ == oldChild)
        {
            setAstComplemento1((PAstComplemento1) newChild);
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