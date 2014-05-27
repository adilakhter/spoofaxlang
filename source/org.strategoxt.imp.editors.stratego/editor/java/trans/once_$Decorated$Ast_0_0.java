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

@SuppressWarnings("all") public class once_$Decorated$Ast_0_0 extends Strategy 
{ 
  public static once_$Decorated$Ast_0_0 instance = new once_$Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_DecoratedAst_0_0");
    Fail22022:
    { 
      IStrategoTerm f_4295 = null;
      TermReference g_4295 = new TermReference();
      TermReference h_4295 = new TermReference();
      IStrategoTerm i_4295 = null;
      IStrategoTerm j_4295 = null;
      IStrategoTerm l_4295 = null;
      IStrategoTerm m_4295 = null;
      IStrategoTerm o_4295 = null;
      IStrategoTerm p_4295 = null;
      if(g_4295.value == null)
        g_4295.value = term;
      else
        if(g_4295.value != term && !g_4295.value.match(term))
          break Fail22022;
      l_4295 = term;
      o_4295 = term;
      m_4295 = trans.const4355;
      p_4295 = o_4295;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, p_4295, m_4295, trans.constCons1966);
      if(term == null)
        break Fail22022;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22022;
      f_4295 = term.getSubterm(0);
      j_4295 = term.getSubterm(1);
      i_4295 = term.getSubterm(2);
      term = f_4295;
      lifted6737 lifted67370 = new lifted6737();
      lifted67370.g_4295 = g_4295;
      lifted67370.h_4295 = h_4295;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67370);
      if(term == null)
        break Fail22022;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22022;
      term = hashtable_put_0_2.instance.invoke(context, i_4295, j_4295, term);
      if(term == null)
        break Fail22022;
      term = l_4295;
      if(h_4295.value == null)
        break Fail22022;
      term = h_4295.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}