/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import java.util.*;
import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ADclAstDeclaracoes extends PAstDeclaracoes
{
    private final LinkedList<PAstDeclconj> _astDeclconj_ = new LinkedList<PAstDeclconj>();

    public ADclAstDeclaracoes()
    {
        // Constructor
    }

    public ADclAstDeclaracoes(
        @SuppressWarnings("hiding") List<?> _astDeclconj_)
    {
        // Constructor
        setAstDeclconj(_astDeclconj_);

    }

    @Override
    public Object clone()
    {
        return new ADclAstDeclaracoes(
            cloneList(this._astDeclconj_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADclAstDeclaracoes(this);
    }

    public LinkedList<PAstDeclconj> getAstDeclconj()
    {
        return this._astDeclconj_;
    }

    public void setAstDeclconj(List<?> list)
    {
        for(PAstDeclconj e : this._astDeclconj_)
        {
            e.parent(null);
        }
        this._astDeclconj_.clear();

        for(Object obj_e : list)
        {
            PAstDeclconj e = (PAstDeclconj) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._astDeclconj_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._astDeclconj_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._astDeclconj_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PAstDeclconj> i = this._astDeclconj_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAstDeclconj) newChild);
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