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

@SuppressWarnings("all") public class get_source_base_dir_0_0 extends Strategy 
{ 
  public static get_source_base_dir_0_0 instance = new get_source_base_dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_source_base_dir_0_0");
    Fail23005:
    { 
      IStrategoTerm g_4764 = null;
      IStrategoTerm h_4764 = null;
      IStrategoTerm i_4764 = null;
      IStrategoTerm j_4764 = null;
      IStrategoTerm p_4764 = null;
      IStrategoTerm r_4764 = null;
      IStrategoTerm v_4764 = null;
      IStrategoTerm l_4764 = null;
      IStrategoTerm w_4764 = null;
      IStrategoTerm x_4764 = null;
      IStrategoTerm z_4764 = null;
      IStrategoTerm a_4765 = null;
      IStrategoTerm b_4765 = null;
      g_4764 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23005;
      h_4764 = term.getSubterm(0);
      term = explode_string_0_0.instance.invoke(context, h_4764);
      if(term == null)
        break Fail23005;
      term = filter_1_0.instance.invoke(context, term, lifted6839.instance);
      if(term == null)
        break Fail23005;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23005;
      i_4764 = term;
      term = $Current$Dir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23005;
      p_4764 = term;
      term = explode_string_0_1.instance.invoke(context, p_4764, trans.const4551);
      if(term == null)
        break Fail23005;
      r_4764 = term;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23005;
      term = termFactory.makeTuple(term, i_4764);
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23005;
      term = take_0_1.instance.invoke(context, r_4764, term);
      if(term == null)
        break Fail23005;
      v_4764 = term;
      term = implode_string_0_1.instance.invoke(context, v_4764, trans.const4551);
      if(term == null)
        break Fail23005;
      j_4764 = term;
      term = j_4764;
      l_4764 = j_4764;
      z_4764 = term;
      w_4764 = trans.const4552;
      a_4765 = z_4764;
      x_4764 = trans.constCons2047;
      b_4765 = a_4765;
      term = termFactory.makeTuple(trans.const4553, l_4764);
      term = dr_set_rule_0_3.instance.invoke(context, b_4765, w_4764, x_4764, term);
      if(term == null)
        break Fail23005;
      term = g_4764;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}