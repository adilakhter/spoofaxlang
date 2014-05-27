package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class y_4250 extends Strategy 
{ 
  Strategy x_4250;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28848:
    { 
      IStrategoTerm term10211 = term;
      Success11383:
      { 
        Fail28849:
        { 
          IStrategoTerm t_4250 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail28849;
          t_4250 = ((IStrategoList)term).head();
          IStrategoTerm arg6178 = ((IStrategoList)term).tail();
          if(arg6178.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6178).isEmpty())
            break Fail28849;
          term = t_4250;
          if(true)
            break Success11383;
        }
        term = term10211;
        IStrategoTerm u_4250 = null;
        IStrategoTerm v_4250 = null;
        IStrategoTerm w_4250 = null;
        IStrategoTerm z_4250 = null;
        IStrategoTerm a_4251 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail28848;
        u_4250 = ((IStrategoList)term).head();
        IStrategoTerm arg6179 = ((IStrategoList)term).tail();
        if(arg6179.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6179).isEmpty())
          break Fail28848;
        v_4250 = ((IStrategoList)arg6179).head();
        w_4250 = ((IStrategoList)arg6179).tail();
        a_4251 = term;
        term = termFactory.makeTuple(u_4250, v_4250);
        term = x_4250.invoke(context, term);
        if(term == null)
          break Fail28848;
        z_4250 = term;
        term = a_4251;
        IStrategoList list386;
        list386 = checkListTail(w_4250);
        if(list386 == null)
          break Fail28848;
        term = (IStrategoTerm)termFactory.makeListCons(z_4250, list386);
        term = this.invoke(context, term);
        if(term == null)
          break Fail28848;
      }
      if(true)
        return term;
    }
    return null;
  }
}