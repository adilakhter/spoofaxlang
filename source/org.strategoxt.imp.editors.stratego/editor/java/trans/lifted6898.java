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

@SuppressWarnings("all") final class lifted6898 extends Strategy 
{ 
  TermReference c_4802;

  TermReference d_4802;

  TermReference e_4802;

  TermReference f_4802;

  TermReference g_4802;

  TermReference h_4802;

  TermReference i_4802;

  TermReference j_4802;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail24008:
    { 
      IStrategoTerm n_4802 = null;
      IStrategoTerm o_4802 = null;
      o_4802 = term;
      term = redeclare_definition_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail24008;
      n_4802 = term;
      term = o_4802;
      if(c_4802.value == null)
        break Fail24008;
      term = termFactory.annotateTerm(c_4802.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(n_4802, (IStrategoList)trans.constNil4)));
      if(d_4802.value == null)
        d_4802.value = term;
      else
        if(d_4802.value != term && !d_4802.value.match(term))
          break Fail24008;
      if(e_4802.value == null)
        break Fail24008;
      term = map_1_0.instance.invoke(context, e_4802.value, declare_svar_0_0.instance);
      if(term == null)
        break Fail24008;
      if(f_4802.value == null)
        f_4802.value = term;
      else
        if(f_4802.value != term && !f_4802.value.match(term))
          break Fail24008;
      if(g_4802.value == null)
        break Fail24008;
      term = map_1_0.instance.invoke(context, g_4802.value, declare_tvar_0_0.instance);
      if(term == null)
        break Fail24008;
      if(h_4802.value == null)
        h_4802.value = term;
      else
        if(h_4802.value != term && !h_4802.value.match(term))
          break Fail24008;
      if(i_4802.value == null)
        break Fail24008;
      term = alltd_1_0.instance.invoke(context, i_4802.value, lifted6901.instance);
      if(term == null)
        break Fail24008;
      if(j_4802.value == null)
        j_4802.value = term;
      else
        if(j_4802.value != term && !j_4802.value.match(term))
          break Fail24008;
      if(true)
        return term;
    }
    return null;
  }
}