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
    Fail21529:
    { 
      IStrategoTerm o_4210 = null;
      IStrategoTerm p_4210 = null;
      IStrategoTerm q_4210 = null;
      IStrategoTerm r_4210 = null;
      IStrategoTerm x_4210 = null;
      IStrategoTerm z_4210 = null;
      IStrategoTerm d_4211 = null;
      IStrategoTerm t_4210 = null;
      IStrategoTerm e_4211 = null;
      IStrategoTerm f_4211 = null;
      IStrategoTerm h_4211 = null;
      IStrategoTerm i_4211 = null;
      IStrategoTerm j_4211 = null;
      o_4210 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21529;
      p_4210 = term.getSubterm(0);
      term = explode_string_0_0.instance.invoke(context, p_4210);
      if(term == null)
        break Fail21529;
      term = filter_1_0.instance.invoke(context, term, lifted6568.instance);
      if(term == null)
        break Fail21529;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21529;
      q_4210 = term;
      term = $Current$Dir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21529;
      x_4210 = term;
      term = explode_string_0_1.instance.invoke(context, x_4210, trans.const4341);
      if(term == null)
        break Fail21529;
      z_4210 = term;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21529;
      term = termFactory.makeTuple(term, q_4210);
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21529;
      term = take_0_1.instance.invoke(context, z_4210, term);
      if(term == null)
        break Fail21529;
      d_4211 = term;
      term = implode_string_0_1.instance.invoke(context, d_4211, trans.const4341);
      if(term == null)
        break Fail21529;
      r_4210 = term;
      term = r_4210;
      t_4210 = r_4210;
      h_4211 = term;
      e_4211 = trans.const4342;
      i_4211 = h_4211;
      f_4211 = trans.constCons1966;
      j_4211 = i_4211;
      term = termFactory.makeTuple(trans.const4343, t_4210);
      term = dr_set_rule_0_3.instance.invoke(context, j_4211, e_4211, f_4211, term);
      if(term == null)
        break Fail21529;
      term = o_4210;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}