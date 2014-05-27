package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_config_reference_0_0 extends Strategy 
{ 
  public static get_config_reference_0_0 instance = new get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_config_reference_0_0");
    Fail87782:
    { 
      TermReference i_17581 = new TermReference();
      TermReference j_17581 = new TermReference();
      IStrategoTerm m_17581 = null;
      IStrategoTerm o_17581 = null;
      IStrategoTerm p_17581 = null;
      if(j_17581.value == null)
        j_17581.value = term;
      else
        if(j_17581.value != term && !j_17581.value.match(term))
          break Fail87782;
      if(i_17581.value == null)
        i_17581.value = term;
      else
        if(i_17581.value != term && !i_17581.value.match(term))
          break Fail87782;
      o_17581 = term;
      m_17581 = trans.const17869;
      p_17581 = o_17581;
      term = dr_lookup_rule_0_2.instance.invoke(context, p_17581, m_17581, trans.constCons8528);
      if(term == null)
        break Fail87782;
      lifted24778 lifted247780 = new lifted24778();
      lifted247780.i_17581 = i_17581;
      lifted247780.j_17581 = j_17581;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted247780);
      if(term == null)
        break Fail87782;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}