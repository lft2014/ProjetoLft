/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ANumerointExp extends PExp
{
    private TNInt _nInt_;

    public ANumerointExp()
    {
        // Constructor
    }

    public ANumerointExp(
        @SuppressWarnings("hiding") TNInt _nInt_)
    {
        // Constructor
        setNInt(_nInt_);

    }

    @Override
    public Object clone()
    {
        return new ANumerointExp(
            cloneNode(this._nInt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumerointExp(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._nInt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nInt_ == child)
        {
            this._nInt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nInt_ == oldChild)
        {
            setNInt((TNInt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
