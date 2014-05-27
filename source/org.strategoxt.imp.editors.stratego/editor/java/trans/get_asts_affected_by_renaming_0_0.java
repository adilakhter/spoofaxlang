package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_asts_affected_by_renaming_0_0 extends Strategy 
{ 
  public static get_asts_affected_by_renaming_0_0 instance = new get_asts_affected_by_renaming_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_asts_affected_by_renaming_0_0");
    Fail21391:
    { 
      IStrategoTerm j_4192 = null;
      TermReference k_4192 = new TermReference();
      IStrategoTerm l_4192 = null;
      IStrategoTerm m_4192 = null;
      IStrategoTerm n_4192 = null;
      IStrategoTerm o_4192 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21391;
      j_4192 = term.getSubterm(0);
      if(k_4192.value == null)
        k_4192.value = term.getSubterm(1);
      else
        if(k_4192.value != term.getSubterm(1) && !k_4192.value.match(term.getSubterm(1)))
          break Fail21391;
      m_4192 = term.getSubterm(2);
      Success11476:
      { 
        Fail21392:
        { 
          IStrategoTerm q_4192 = null;
          q_4192 = term;
          term = is_global_ref_0_0.instance.invoke(context, j_4192);
          if(term == null)
            break Fail21392;
          term = q_4192;
          { 
            lifted6526 lifted65260 = new lifted6526();
            lifted65260.k_4192 = k_4192;
            term = get_affected_stratego_asts_1_0.instance.invoke(context, term, lifted65260);
            if(term == null)
              break Fail21391;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail21391;
            l_4192 = term.getSubterm(0);
            o_4192 = term.getSubterm(1);
            term = analyze_names_0_0.instance.invoke(context, l_4192);
            if(term == null)
              break Fail21391;
            n_4192 = term;
            if(true)
              break Success11476;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(m_4192, (IStrategoList)trans.constNil3);
        n_4192 = term;
        term = trans.constNil3;
        o_4192 = trans.constNil3;
      }
      term = map_1_0.instance.invoke(context, o_4192, lifted6528.instance);
      if(term == null)
        break Fail21391;
      term = termFactory.makeTuple(n_4192, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}