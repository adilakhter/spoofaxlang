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

@SuppressWarnings("all") final class lifted9325 extends Strategy 
{ 
  public static final lifted9325 instance = new lifted9325();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28729:
    { 
      IStrategoTerm w_4283 = null;
      IStrategoTerm x_4283 = null;
      IStrategoTerm y_4283 = null;
      IStrategoTerm z_4283 = null;
      IStrategoTerm a_4284 = null;
      term = filter_1_0.instance.invoke(context, term, is_java_identifier_char_0_0.instance);
      if(term == null)
        break Fail28729;
      IStrategoTerm term10361 = term;
      Success11355:
      { 
        Fail28730:
        { 
          IStrategoTerm q_4283 = null;
          q_4283 = term;
          IStrategoTerm term10362 = term;
          Success11356:
          { 
            Fail28731:
            { 
              IStrategoTerm r_4283 = null;
              IStrategoTerm s_4283 = null;
              IStrategoTerm t_4283 = null;
              IStrategoTerm u_4283 = null;
              IStrategoTerm v_4283 = null;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail28731;
              r_4283 = ((IStrategoList)term).head();
              s_4283 = ((IStrategoList)term).tail();
              IStrategoList annos919 = term.getAnnotations();
              v_4283 = annos919;
              term = is_num_0_0.instance.invoke(context, r_4283);
              if(term == null)
                break Fail28731;
              t_4283 = term;
              term = s_4283;
              u_4283 = s_4283;
              IStrategoList list392;
              list392 = checkListTail(u_4283);
              if(list392 == null)
                break Fail28731;
              term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(t_4283, list392), checkListAnnos(termFactory, v_4283));
              if(true)
                break Success11356;
            }
            term = term10362;
            if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
              break Fail28730;
          }
          term = q_4283;
          { 
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7169, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            if(true)
              break Success11355;
          }
        }
        term = term10361;
      }
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail28729;
      w_4283 = ((IStrategoList)term).head();
      x_4283 = ((IStrategoList)term).tail();
      IStrategoList annos920 = term.getAnnotations();
      a_4284 = annos920;
      term = to_upper_0_0.instance.invoke(context, w_4283);
      if(term == null)
        break Fail28729;
      y_4283 = term;
      term = x_4283;
      z_4283 = x_4283;
      IStrategoList list393;
      list393 = checkListTail(z_4283);
      if(list393 == null)
        break Fail28729;
      term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(y_4283, list393), checkListAnnos(termFactory, a_4284));
      if(true)
        return term;
    }
    return null;
  }
}