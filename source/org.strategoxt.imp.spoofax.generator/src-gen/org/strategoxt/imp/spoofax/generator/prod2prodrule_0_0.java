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

@SuppressWarnings("all") public class prod2prodrule_0_0 extends Strategy 
{ 
  public static prod2prodrule_0_0 instance = new prod2prodrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prod2prodrule_0_0");
    Fail25615:
    { 
      IStrategoTerm k_4241 = null;
      IStrategoTerm l_4241 = null;
      IStrategoTerm m_4241 = null;
      IStrategoTerm n_4241 = null;
      IStrategoTerm o_4241 = null;
      IStrategoTerm p_4241 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25615;
      l_4241 = term.getSubterm(0);
      k_4241 = term.getSubterm(1);
      IStrategoTerm arg6040 = term.getSubterm(2);
      if(arg6040.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)arg6040).getConstructor())
        break Fail25615;
      m_4241 = arg6040.getSubterm(0);
      term = sym2nonterm_0_0.instance.invoke(context, k_4241);
      if(term == null)
        break Fail25615;
      n_4241 = term;
      term = syms2trees_0_0.instance.invoke(context, l_4241);
      if(term == null)
        break Fail25615;
      p_4241 = term;
      Success10104:
      { 
        Fail25616:
        { 
          IStrategoTerm r_4241 = null;
          r_4241 = term;
          term = get_cnstr_name_0_0.instance.invoke(context, m_4241);
          if(term == null)
            break Fail25616;
          o_4241 = term;
          term = r_4241;
          { 
            term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{n_4241, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consTerm_1, new IStrategoTerm[]{o_4241}), p_4241}), (IStrategoList)generator.constNil7)});
            if(true)
              break Success10104;
          }
        }
        term = generator.constNil7;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}