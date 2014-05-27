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

@SuppressWarnings("all") public class inline_call_0_1 extends Strategy 
{ 
  public static inline_call_0_1 instance = new inline_call_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4726)
  { 
    context.push("inline_call_0_1");
    Fail22785:
    { 
      IStrategoTerm f_4726 = null;
      IStrategoTerm g_4726 = null;
      IStrategoTerm h_4726 = null;
      IStrategoTerm i_4726 = null;
      IStrategoTerm j_4726 = null;
      IStrategoTerm k_4726 = null;
      IStrategoTerm l_4726 = null;
      IStrategoTerm m_4726 = null;
      IStrategoTerm n_4726 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail22785;
      IStrategoTerm arg8094 = term.getSubterm(0);
      if(arg8094.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8094).getConstructor())
        break Fail22785;
      IStrategoTerm arg8095 = arg8094.getSubterm(0);
      f_4726 = arg8095;
      IStrategoList annos699 = arg8095.getAnnotations();
      if(annos699.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos699).isEmpty())
        break Fail22785;
      g_4726 = ((IStrategoList)annos699).head();
      IStrategoTerm arg8096 = ((IStrategoList)annos699).tail();
      if(arg8096.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8096).isEmpty())
        break Fail22785;
      k_4726 = term.getSubterm(1);
      m_4726 = term.getSubterm(2);
      term = e_4726;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail22785;
      IStrategoTerm arg8097 = term.getSubterm(0);
      if(arg8097 != f_4726 && !f_4726.match(arg8097))
        break Fail22785;
      IStrategoList annos700 = arg8097.getAnnotations();
      if(annos700.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos700).isEmpty())
        break Fail22785;
      if(((IStrategoList)annos700).head() != g_4726 && !g_4726.match(((IStrategoList)annos700).head()))
        break Fail22785;
      IStrategoTerm arg8098 = ((IStrategoList)annos700).tail();
      if(arg8098.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8098).isEmpty())
        break Fail22785;
      h_4726 = term.getSubterm(1);
      i_4726 = term.getSubterm(2);
      n_4726 = term.getSubterm(3);
      term = map_1_0.instance.invoke(context, h_4726, svardec_to_svaruse_0_0.instance);
      if(term == null)
        break Fail22785;
      j_4726 = term;
      term = map_1_0.instance.invoke(context, i_4726, tvardec_to_tvaruse_0_0.instance);
      if(term == null)
        break Fail22785;
      l_4726 = term;
      term = substitute_multiple_0_2.instance.invoke(context, n_4726, j_4726, k_4726);
      if(term == null)
        break Fail22785;
      term = substitute_multiple_0_2.instance.invoke(context, term, l_4726, m_4726);
      if(term == null)
        break Fail22785;
      term = try_1_0.instance.invoke(context, term, rule_to_lambda_rule_0_0.instance);
      if(term == null)
        break Fail22785;
      term = scope_free_vars_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22785;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}